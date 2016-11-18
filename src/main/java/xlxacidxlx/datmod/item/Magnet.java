package xlxacidxlx.datmod.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.base.Item;

import java.util.List;

/**
 * Created by Acid on 10/26/2016.
 */
public class Magnet extends Item {
	/**
	 * Whether the magnet is active or not
	 */
	private static boolean active;

	/**
	 * Constructs the Magnet
	 */
	public Magnet() {
		super("Magnet");

		setImplemented(true);
		setMaxDamage(0);
		setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("It's very... attractive!");
		super.addInformation(stack, playerIn, tooltip, advanced);
	}

	/**
	 * Checks if the magnet is active or not
	 *
	 * @param itemStack The ItemStack to check against
	 *
	 * @return boolean
	 */
	private static boolean isActive(ItemStack itemStack) {
		NBTTagCompound tags = itemStack.getTagCompound();

		if (!tags.hasKey("active")) {
			tags.setBoolean("active", false);
		}

		boolean activeNbt = tags.getBoolean("active");
		if (activeNbt && !active) {
			active = true;
		}

		if (active && activeNbt) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isDamageable() {
		return false;
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		if (stack.getTagCompound() == null) {
			stack.setTagCompound(new NBTTagCompound());
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if (!worldIn.isRemote) {
			if (!playerIn.isSneaking()) {
				playerIn.addChatComponentMessage(new TextComponentString("You must be sneaking to toggle the magnet!"));
				return ActionResult.newResult(EnumActionResult.FAIL, itemStackIn);
			}

			String message = "Magnet has been %s";
			NBTTagCompound itemTagCompound = itemStackIn.getTagCompound();
			if (isActive(itemStackIn)) {
				message = String.format(message, "deactivated");
				active = false;
				itemTagCompound.setBoolean("active", false);
				itemTagCompound.removeTag("ench");
			} else {
				message = String.format(message, "activated");
				active = true;
				itemTagCompound.setBoolean("active", true);
				itemStackIn.addEnchantment(Enchantments.EFFICIENCY, 1);
			}

			DatMod.logger.info(message);
			playerIn.addChatComponentMessage(new TextComponentString(message));
		}

		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (isActive(stack)) {
			double radius = ConfigHandler.magnetRadius;

			List<EntityItem> items = entityIn.worldObj.getEntitiesWithinAABB(EntityItem.class, entityIn.getEntityBoundingBox().expand(radius, radius, radius));
			List<EntityXPOrb> xps = entityIn.worldObj.getEntitiesWithinAABB(EntityXPOrb.class, entityIn.getEntityBoundingBox().expand(radius, radius, radius));

			for (EntityItem item : items) {
				teleportToPlayer(item, (EntityPlayer) entityIn);
			}

			for (EntityXPOrb xp : xps) {
				teleportToPlayer(xp, (EntityPlayer) entityIn);
			}
		}
	}

	/**
	 * Pulls the specified item towards the specified player
	 *
	 * @param item   The item to move
	 * @param player The player to move the item towards
	 */
	private static void teleportToPlayer(Entity item, EntityPlayer player) {
		double x = player.posX;
		double y = player.posY;
		double z = player.posZ;
		double factor = 1;

		item.addVelocity((x - item.posX) * factor, (y - item.posY) * factor, (z - item.posZ) * factor);
	}
}
