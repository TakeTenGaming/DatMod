package xlxacidxlx.datmod.base;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

/**
 * Created by Acid on 11/19/2016.
 */
abstract public class Inventory implements IInventory {
	private final ItemStack invItem;
	private ItemStack[] inventory;
	private EntityPlayer player;

	public Inventory(EntityPlayer player, ItemStack stack) {
		invItem = stack;
		this.player = player;
		// TODO: Set the inventory to the chest bag's inventory..
	}

	@Override
	public void clear() { // TODO: Clear the inventory..?
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		// TODO: Sync the inventory..
	}

	@Nullable
	@Override
	public ItemStack decrStackSize(int index, int count) {
		ItemStack stack = getStackInSlot(index);

		if (stack != null) {
			if (stack.stackSize > count) {
				stack = stack.splitStack(count);
				markDirty();
			} else {
				setInventorySlotContents(index, null);
			}
		}

		return stack;
	}

	@Override
	public int getField(int id) {
		return 0;
	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Nullable
	@Override
	public ItemStack getStackInSlot(int index) {
		return inventory[index];
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack) {
		return true;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return true;
	}

	@Override
	public void markDirty() {
		for (int i = 0; i < 104; ++i) {
			if (getStackInSlot(i) != null && getStackInSlot(i).stackSize == 0) {
				inventory[i] = null;
			}
		}
	}

	@Override
	public void openInventory(EntityPlayer player) {
	}

	@Nullable
	@Override
	public ItemStack removeStackFromSlot(int index) {
		// TODO: Work on this
		return inventory[index];
	}

	@Override
	public void setField(int id, int value) {
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		inventory[slot] = stack;

		if (stack != null && stack.stackSize > getInventoryStackLimit()) {
			stack.stackSize = this.getInventoryStackLimit();
		}

		markDirty();
	}
}
