package taketengaming.datmod.item;

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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import taketengaming.datmod.ConfigHandler;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.Item;

import java.util.List;

/**
 * Created by Acid on 10/26/2016.
 */
public class Magnet extends Item
{
	private static boolean active;

	public Magnet ()
	{
		super ( "Magnet" );

		setCreativeTab ( CreativeTabs.items );

		setMaxDamage ( 0 );
		setMaxStackSize ( 1 );
	}

	@Override
	public ActionResult< ItemStack > onItemRightClick ( ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand )
	{
		if ( !worldIn.isRemote )
		{
			if ( !playerIn.isSneaking () )
			{
				playerIn.addChatComponentMessage ( new TextComponentString ( "You must be sneaking to toggle the magnet!" ) );
				return ActionResult.newResult ( EnumActionResult.FAIL, itemStackIn );
			}

			NBTTagCompound itemTagCompound = itemStackIn.getTagCompound ();
			if ( isActive ( itemStackIn ) )
			{
				active = false;
				itemTagCompound.removeTag ( "ench" );
			}
			else
			{
				active = true;
				itemStackIn.addEnchantment ( Enchantments.EFFICIENCY, 1 );
			}

			itemTagCompound.setBoolean ( "active", active );

			Style chatStyle = new Style ().setColor ( TextFormatting.GRAY );
			Style statusStyle = new Style ().setColor ( TextFormatting.WHITE );
			ITextComponent message = new TextComponentString ( "Magnet has been" ).setStyle ( chatStyle );
			ITextComponent replacement = new TextComponentString ( ( active ) ? " activated" : " deactivated" ).setStyle ( statusStyle );
			playerIn.addChatMessage ( message.appendSibling ( replacement ) );
		}

		return super.onItemRightClick ( itemStackIn, worldIn, playerIn, hand );
	}

	@Override
	public boolean isDamageable ()
	{
		return false;
	}

	@Override
	public void onUpdate ( ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected )
	{
		if ( isActive ( stack ) )
		{
			double radius = ConfigHandler.magnetRadius;

			List< EntityItem > items = entityIn.worldObj.getEntitiesWithinAABB ( EntityItem.class, entityIn.getEntityBoundingBox ().expand ( radius, radius, radius ) );
			List< EntityXPOrb > xps = entityIn.worldObj.getEntitiesWithinAABB ( EntityXPOrb.class, entityIn.getEntityBoundingBox ().expand ( radius, radius, radius ) );

			for ( EntityItem item : items )
			{
				teleportToPlayer ( item, ( EntityPlayer ) entityIn );
			}

			for ( EntityXPOrb xp : xps )
			{
				teleportToPlayer ( xp, ( EntityPlayer ) entityIn );
			}
		}
	}

	@Override
	@SideOnly( Side.CLIENT )
	public void addInformation ( ItemStack stack, EntityPlayer playerIn, List< String > tooltip, boolean advanced )
	{
		tooltip.add ( "It's very... attractive!" );
		super.addInformation ( stack, playerIn, tooltip, advanced );
	}

	private static boolean isActive ( ItemStack itemStack )
	{
		if ( itemStack.getTagCompound () == null )
		{
			itemStack.setTagCompound ( new NBTTagCompound () );
		}

		NBTTagCompound tags = itemStack.getTagCompound ();
		if ( !tags.hasKey ( "active" ) )
		{
			tags.setBoolean ( "active", false );
		}

		boolean activeNbt = tags.getBoolean ( "active" );
		if ( activeNbt && !active )
		{
			active = true;
		}

		if ( active && activeNbt )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static void teleportToPlayer ( Entity item, EntityPlayer player )
	{
		double x = player.posX;
		double y = player.posY;
		double z = player.posZ;
		double factor = 1;

		item.addVelocity ( ( x - item.posX ) * factor, ( y - item.posY ) * factor, ( z - item.posZ ) * factor );
	}
}
