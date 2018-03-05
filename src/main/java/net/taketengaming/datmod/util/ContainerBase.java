package net.taketengaming.datmod.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.taketengaming.datmod.DatMod;

public class ContainerBase extends Container
{
	protected IInventory playerInventory;
	protected TileEntityBase tileEntity;

	public int guiBaseHeight = 84;

	public ContainerBase ( IInventory playerInventory, TileEntityBase tileEntityBase )
	{
		this.playerInventory = playerInventory;
		this.tileEntity = tileEntityBase;
	}

	public void addOwnSlot ( int index, int x, int y )
	{
		if ( !this.tileEntity.hasCapability ( CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null ) )
		{
			DatMod.logger.error ( this.getTileEntity ().getClass () + " has no Item Handler Capability.." );
			return;
		}

		IItemHandler itemHandler = this.tileEntity.getCapability ( CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null );
		this.addSlotToContainer ( new SlotItemHandler ( itemHandler, index, x, y ) );
	}

	public void addOwnSlots ( int[][] slots )
	{
		if ( !this.tileEntity.hasCapability ( CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null ) )
		{
			DatMod.logger.error ( this.getTileEntity ().getClass () + " has no Item Handler Capability.." );
			return;
		}

		for ( int i = 0; i < slots.length; i++ )
		{
			this.addOwnSlot ( i, slots[ i ][ 0 ], slots[ i ][ 1 ] );
		}
	}

	protected void addPlayerSlots ( IInventory inventory )
	{
		// Main Inventory
		for ( int row = 0; row < 3; row++ )
		{
			for ( int col = 0; col < 9; col++ )
			{
				this.addSlotToContainer ( new Slot ( inventory, col + row * 9 + 9, 8 + col * 18, this.guiBaseHeight + row * 18 ) );
			}
		}

		// Hotbar
		for ( int row = 0; row < 9; row++ )
		{
			this.addSlotToContainer ( new Slot ( inventory, row, 8 + row * 18, this.guiBaseHeight + 58 ) );
		}
	}

	protected int getGuiBaseHeight ()
	{
		return this.guiBaseHeight;
	}

	public TileEntityBase getTileEntity ()
	{
		return this.tileEntity;
	}

	@Override
	public ItemStack transferStackInSlot ( EntityPlayer player, int index )
	{
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = inventorySlots.get ( index );

		if ( slot != null && slot.getHasStack () )
		{
			ItemStack itemstack1 = slot.getStack ();
			itemstack = itemstack1.copy ();

			int containerSlots = inventorySlots.size () - player.inventory.mainInventory.size ();

			if ( index < containerSlots )
			{
				if ( !this.mergeItemStack ( itemstack1, containerSlots, inventorySlots.size (), true ) )
				{
					return ItemStack.EMPTY;
				}
			}
			else if ( !this.mergeItemStack ( itemstack1, 0, containerSlots, false ) )
			{
				return ItemStack.EMPTY;
			}

			if ( itemstack1.getCount () == 0 )
			{
				slot.putStack ( ItemStack.EMPTY );
			}
			else
			{
				slot.onSlotChanged ();
			}

			if ( itemstack1.getCount () == itemstack.getCount () )
			{
				return ItemStack.EMPTY;
			}

			slot.onTake ( player, itemstack1 );
		}

		return itemstack;
	}

	@Override
	public boolean canInteractWith ( EntityPlayer entityPlayer )
	{
		return this.tileEntity.canInteractWith ( entityPlayer );
	}
}
