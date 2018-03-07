package net.taketengaming.datmod.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.taketengaming.datmod.ModConfig;
import net.taketengaming.datmod.util.ItemBase;

import javax.annotation.Nullable;
import java.util.List;

public class ItemMagnet extends ItemBase
{
	private boolean pullToInventory = ModConfig.Magnet.global.pullToInventory;
	private double range = ModConfig.Magnet.global.range;
	private double speed = ModConfig.Magnet.global.speed;

	public ItemMagnet ()
	{
		super ( "Magnet" );

		setMaxStackSize ( 1 );
	}

	private boolean isActive ( ItemStack stack )
	{
		NBTTagCompound tags = stack.getTagCompound ();
		if ( tags == null )
		{
			NBTTagCompound compound = new NBTTagCompound ();
			compound.setBoolean ( "active", false );

			stack.setTagCompound ( new NBTTagCompound () );
			tags = stack.getTagCompound ();
		}

		boolean active = tags.getBoolean ( "active" );
		boolean isActive = false;

		if ( active )
		{
			isActive = true;
		}

		return isActive;
	}

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
	public boolean isDamageable ()
	{
		return false;
	}

	@SuppressWarnings( "ConstantConditions" )
	@Override
	public void onUpdate ( ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected )
	{
		if ( entityIn instanceof EntityPlayer && entityIn.isSneaking () || !this.isActive ( stack ) )
		{
			return;
		}

		if ( worldIn.isRemote )
		{
			return;
		}

		EntityPlayer player = ( EntityPlayer ) entityIn;
		AxisAlignedBB axisAlignedBB = new AxisAlignedBB ( player.posX - this.range, player.posY - this.range, player.posZ - this.range, player.posX + this.range, player.posY + this.range, player.posZ + this.range );
		World entityWorld = entityIn.getEntityWorld ();
		List< EntityItem > items = worldIn.getEntitiesWithinAABB ( EntityItem.class, axisAlignedBB );
		for ( EntityItem item : items )
		{
			if ( item.equals ( Blocks.AIR ) )
			{
				continue;
			}

			this.teleportToPlayer ( item, player );
		}

		List< EntityXPOrb > xps = entityWorld.getEntitiesWithinAABB ( EntityXPOrb.class, axisAlignedBB );
		for ( EntityXPOrb xp : xps )
		{
			this.teleportToPlayer ( xp, player );
		}
	}

	@Override
	@SideOnly( Side.CLIENT )
	public void addInformation ( ItemStack stack, @Nullable World worldIn, List< String > tooltip, ITooltipFlag flagIn )
	{
		tooltip.add ( "It's very.. attractive" );
		tooltip.add ( TextFormatting.YELLOW + "Pulls in items and experience" + TextFormatting.RESET );

		super.addInformation ( stack, worldIn, tooltip, flagIn );
	}

	@Override
	public boolean hasEffect ( ItemStack stack )
	{
		return this.isActive ( stack );
	}

	@Override
	public boolean onDroppedByPlayer ( ItemStack item, EntityPlayer player )
	{
		this.toggle ( false, item, player );
		return super.onDroppedByPlayer ( item, player );
	}

	private void teleportToPlayer ( Entity item, EntityPlayer player )
	{
		if ( item.getEntityData ().getBoolean ( "PreventRemoteMovement" ) || item.isDead )
		{
			return;
		}

		boolean hasEmptySlot = false;
		for ( int i = 0; i < player.inventory.mainInventory.size (); i++ )
		{
			if ( hasEmptySlot )
			{
				continue;
			}

			ItemStack inventoryStack = player.inventory.mainInventory.get ( i );
			if ( inventoryStack.getItem ().equals ( Items.AIR ) )
			{
				hasEmptySlot = true;
			}
		}

		if ( this.pullToInventory )
		{
			World entityWorld = player.getEntityWorld ();

			if ( item instanceof EntityXPOrb )
			{
				player.addExperience ( ( ( EntityXPOrb ) item ).getXpValue () );
				entityWorld.removeEntity ( item );
			}
			else if ( item instanceof EntityItem )
			{
				EntityItem entityItem = ( EntityItem ) item;
				Item entityItemItem = entityItem.getItem ().getItem ();
				boolean foundMatchingItem = false;

				for ( int i = 0; i < player.inventory.mainInventory.size (); i++ )
				{
					ItemStack inventorySlot = player.inventory.mainInventory.get ( i );
					Item inventorySlotItem = inventorySlot.getItem ();

					if ( inventorySlot.getItem ().equals ( Items.AIR ) )
					{
						continue;
					}

					if ( inventorySlotItem.equals ( entityItemItem ) )
					{
						int stackSize = inventorySlot.getCount ();
						int maxStackSize = inventorySlot.getMaxStackSize ();

						if ( stackSize < maxStackSize )
						{
							foundMatchingItem = true;

							int itemStackSize = entityItem.getItem ().getCount ();

							if ( ( stackSize + itemStackSize ) > maxStackSize )
							{
								foundMatchingItem = false;
								continue;
							}

							entityItem.getItem ().setCount ( itemStackSize - itemStackSize );
							inventorySlot.setCount ( stackSize + itemStackSize );

							if ( itemStackSize == 0 )
							{
								entityWorld.removeEntity ( entityItem );
							}
						}
					}
				}

				if ( hasEmptySlot && !foundMatchingItem )
				{
					player.inventory.addItemStackToInventory ( entityItem.getItem () );
					entityWorld.removeEntity ( entityItem );
				}
			}
		}
		else
		{
			if ( item instanceof EntityItem && !hasEmptySlot )
			{
				return;
			}

			double x = player.posX;
			double y = player.posY;
			double z = player.posZ;
			double speed = this.speed;

			if ( item instanceof EntityItem && ( ( EntityItem ) item ).cannotPickup () )
			{
				return;
			}

			item.addVelocity ( ( x - item.posX ) * speed, ( y - item.posY ) * speed, ( z - item.posZ ) * speed );
			item.onCollideWithPlayer ( player );
		}
	}

	private void toggle ( boolean active, ItemStack itemStackIn, EntityPlayer playerIn )
	{
		boolean state = false;
		NBTTagCompound itemTagCompound = itemStackIn.getTagCompound ();
		if ( !active )
		{
			state = true;
		}

		if ( itemTagCompound == null )
		{
			NBTTagCompound nbtCompound = new NBTTagCompound ();
			nbtCompound.setBoolean ( "active", false );
			itemStackIn.setTagCompound ( nbtCompound );
			return;
		}

		itemTagCompound.setBoolean ( "active", state );
		playerIn.sendStatusMessage ( new TextComponentString ( "Magnet has been " + ( ( !active ) ? "activated" : "deactivated" ) ), true );
	}
}
