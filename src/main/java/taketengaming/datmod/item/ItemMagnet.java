package taketengaming.datmod.item;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import taketengaming.datmod.ConfigHandler;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.Item;
import taketengaming.tencore.util.Energy;

import java.util.List;

/**
 * Created by Acid on 10/26/2016.
 */
public class ItemMagnet extends Item
{
	private boolean requiresEnergy = ConfigHandler.magnetRequiresEnergy;

	public ItemMagnet ()
	{
		super ( "Magnet" );

		this.setCreativeTab ( CreativeTabs.items );

		if ( this.requiresEnergy () )
		{
			this.setMaxDamage ( Energy.CAPACITY );
		}
		else
		{
			this.setMaxDamage ( 0 );
		}

		this.setMaxStackSize ( 1 );
	}

	@Override
	@SideOnly( Side.CLIENT )
	public void addInformation ( ItemStack stack, EntityPlayer playerIn, List< String > tooltip, boolean advanced )
	{
		tooltip.add ( "It's very.. attractive" );

		if ( this.requiresEnergy () && stack.getTagCompound () != null )
		{
			if ( !stack.getTagCompound ().hasKey ( "energyStored" ) )
			{
				stack.getTagCompound ().setInteger ( "energyStored", 0 );
			}

			ChatFormatting color = ChatFormatting.DARK_GRAY;
			ChatFormatting energyColor;

			int energyStored = stack.getTagCompound ().getInteger ( "energyStored" );
			if ( energyStored == 0 )
			{
				energyColor = ChatFormatting.RED;
			}
			else if ( energyStored <= ( Energy.CAPACITY / 2 ) )
			{
				energyColor = ChatFormatting.YELLOW;
			}
			else
			{
				energyColor = ChatFormatting.GREEN;
			}

			tooltip.add ( color + "Requires " + Energy.REQUIREMENT + "RF/operation" );
			tooltip.add ( color + "Energy: " + energyColor + energyStored + color + "/" + Energy.CAPACITY );
		}

		super.addInformation ( stack, playerIn, tooltip, advanced );
	}

	private boolean hasEnergy ( ItemStack itemStack )
	{
		return ( itemStack.getTagCompound () != null && itemStack.getTagCompound ().getInteger ( "energyStored" ) > 0 );
	}

	private boolean isActive ( ItemStack stack )
	{
		NBTTagCompound tags = stack.getTagCompound ();
		if ( tags == null )
		{
			NBTTagCompound compound = new NBTTagCompound ();
			compound.setBoolean ( "active", false );
			compound.setInteger ( "energyStored", 0 );

			stack.setTagCompound ( new NBTTagCompound () );
			tags = stack.getTagCompound ();
		}

		boolean activeNbt = tags.getBoolean ( "active" );
		int energyStoredNbt = tags.getInteger ( "energyStored" );
		boolean isActive = false;

		if ( activeNbt )
		{
			if ( this.requiresEnergy () && energyStoredNbt > 0 )
			{
				isActive = true;
			}
			else
			{
				isActive = true;
			}
		}

		return isActive;
	}

	@Override
	public boolean isDamageable ()
	{
		return this.requiresEnergy ();
	}

	/**
	 * Called when the equipped item is right clicked.
	 *
	 * @param worldIn
	 * @param playerIn
	 * @param handIn
	 */
	@Override
	public ActionResult< ItemStack > onItemRightClick ( World worldIn, EntityPlayer playerIn, EnumHand handIn )
	{
		ItemStack itemStackIn = playerIn.getHeldItem ( handIn );
		if ( worldIn.isRemote )
		{
			return ActionResult.newResult ( EnumActionResult.FAIL, itemStackIn );
		}

		if ( !playerIn.isSneaking () )
		{
			playerIn.sendStatusMessage ( new TextComponentString ( "You must be sneaking to toggle the magnet!" ), true );
			return ActionResult.newResult ( EnumActionResult.FAIL, itemStackIn );
		}

		this.toggle ( this.isActive ( itemStackIn ), itemStackIn, playerIn );
		return super.onItemRightClick ( worldIn, playerIn, handIn );
	}

	@Override
	public void onUpdate ( ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected )
	{
		if ( entityIn instanceof EntityPlayer && entityIn.isSneaking () || !this.isActive ( stack ) )
		{
			return;
		}

		if ( this.requiresEnergy () )
		{
			if ( !this.hasEnergy ( stack ) || stack.getTagCompound ().getInteger ( "energyStored" ) < Energy.REQUIREMENT )
			{
				return;
			}
		}

		double radius = ConfigHandler.magnetRadius;
		List< EntityItem > items = entityIn.getEntityWorld ().getEntitiesWithinAABB ( EntityItem.class, entityIn.getEntityBoundingBox ().expand ( radius, radius, radius ) );
		List< EntityXPOrb > xps = entityIn.getEntityWorld ().getEntitiesWithinAABB ( EntityXPOrb.class, entityIn.getEntityBoundingBox ().expand ( radius, radius, radius ) );

		for ( EntityItem item : items )
		{
			this.teleportToPlayer ( stack, item, ( EntityPlayer ) entityIn );
		}

		for ( EntityXPOrb xp : xps )
		{
			this.teleportToPlayer ( stack, xp, ( EntityPlayer ) entityIn );
		}
	}

	@Override
	public boolean hasEffect ( ItemStack stack )
	{
		return this.isActive ( stack );
	}

	private boolean requiresEnergy ()
	{
		return this.requiresEnergy;
	}

	private void teleportToPlayer ( ItemStack itemStack, Entity item, EntityPlayer player )
	{
		double x = player.posX;
		double y = player.posY;
		double z = player.posZ;
		double factor = 1;

		InventoryPlayer playerInventory = player.inventory;
		int inventorySize = playerInventory.getSizeInventory ();
		int fullSlots = 0;
		for ( int i = 0; i < inventorySize; i++ )
		{
			if ( !playerInventory.getStackInSlot ( i ).isEmpty () )
			{
				fullSlots++;
			}
		}

		if ( fullSlots < inventorySize )
		{
			int energyStored = itemStack.getTagCompound ().getInteger ( "energyStored" );
			itemStack.getTagCompound ().setInteger ( "energyStored", ( energyStored - Energy.REQUIREMENT ) );
		}

		item.addVelocity ( ( x - item.posX ) * factor, ( y - item.posY ) * factor, ( z - item.posZ ) * factor );
	}

	private void toggle ( boolean active, ItemStack itemStackIn, EntityPlayer playerIn )
	{
		boolean state = false;
		NBTTagCompound itemTagCompound = itemStackIn.getTagCompound ();
		if ( !active )
		{
			state = true;
		}

		itemTagCompound.setBoolean ( "active", state );
		playerIn.sendStatusMessage ( new TextComponentString ( "Magnet has been " + ( ( !active ) ? "activated" : "deactivated" ) ), true );
	}
}
