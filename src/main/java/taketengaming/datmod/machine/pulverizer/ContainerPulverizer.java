package taketengaming.datmod.machine.pulverizer;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import taketengaming.datmod.machine.furnace.TileEntityFurnace;

import javax.annotation.Nullable;

/**
 * Created by Acid on 1/31/2017.
 */
public class ContainerPulverizer extends Container
{
	private final TileEntityPulverizer tileEntityPulverizer;

	public ContainerPulverizer ( IInventory playerInventory, TileEntityPulverizer tileEntityPulverizer )
	{
		this.tileEntityPulverizer = tileEntityPulverizer;

		this.addOwnSlots ();
		this.addPlayerSlots ( playerInventory );
	}

	private void addOwnSlots ()
	{
		IItemHandler itemHandler = this.tileEntityPulverizer.getCapability ( CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null );
		int x = 0;
		int y = 0;

		// Add our own slots
		for ( int i = 0; i < itemHandler.getSlots (); i++ )
		{
			switch ( i )
			{
				case 0:
					x = 56;
					y = 35;
					break;

				case 1:
					x = 116;
					y = 35;
					break;
			}

			addSlotToContainer ( new SlotItemHandler ( itemHandler, i, x, y ) );
		}
	}

	private void addPlayerSlots ( IInventory playerInventory )
	{
		// Slots for the main inventory
		for ( int row = 0; row < 3; ++row )
		{
			for ( int col = 0; col < 9; ++col )
			{
				int x = 8 + col * 18;
				int y = 14 + row * 18 + 70;

				this.addSlotToContainer ( new Slot ( playerInventory, ( col + ( ( row * 9 ) + 10 ) ), x, y ) );
			}
		}

		// Slots for the hotbar
		for ( int row = 0; row < 9; ++row )
		{
			int x = 8 + ( row * 18 );
			int y = 142;

			this.addSlotToContainer ( new Slot ( playerInventory, row, x, y ) );
		}
	}

	/**
	 * Determines whether supplied player can use this container
	 *
	 * @param playerIn
	 */
	@Override
	public boolean canInteractWith ( EntityPlayer playerIn )
	{
		return this.tileEntityPulverizer.canInteractWith ( playerIn );
	}

	/**
	 * Take a stack from the specified inventory slot.
	 *
	 * @param playerIn
	 * @param index
	 */
	@Nullable
	@Override
	public ItemStack transferStackInSlot ( EntityPlayer playerIn, int index )
	{
		ItemStack itemstack = null;
		Slot slot = this.inventorySlots.get ( index );

		if ( slot != null && slot.getHasStack () )
		{
			ItemStack itemstack1 = slot.getStack ();
			itemstack = itemstack1.copy ();

			if ( index < TileEntityFurnace.SIZE )
			{
				if ( !this.mergeItemStack ( itemstack1, TileEntityFurnace.SIZE, this.inventorySlots.size (), true ) )
				{
					return null;
				}
			}
			else if ( !this.mergeItemStack ( itemstack1, 0, TileEntityFurnace.SIZE, false ) )
			{
				return null;
			}

			if ( itemstack1.stackSize == 0 )
			{
				slot.putStack ( null );
			}
			else
			{
				slot.onSlotChanged ();
			}
		}

		return itemstack;
	}
}