package taketengaming.datmod.machine.furnace;

import net.minecraft.inventory.IInventory;
import taketengaming.tencore.inventory.Container;

/**
 * Created by Acid on 1/23/2017.
 */
public class ContainerFurnace extends Container
{
	public ContainerFurnace ( IInventory playerInventory, TileEntityFurnace tileEntityFurnace )
	{
		super ( tileEntityFurnace );

		this.addOwnSlots ( new int[][] { { 56, 35 }, { 116, 35 } } );
		this.addPlayerSlots ( playerInventory );
	}
}
