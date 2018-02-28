package net.taketengaming.datmod.util;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public abstract class GuiContainerBase extends GuiContainer
{
	protected IInventory playerInventory;
	protected TileEntityBase tileEntity;

	public GuiContainerBase ( ContainerBase container, InventoryPlayer playerInv )
	{
		super ( container );

		this.playerInventory = playerInv;
		this.tileEntity = container.getTileEntity ();
	}
}
