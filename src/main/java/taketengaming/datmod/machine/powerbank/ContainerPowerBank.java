package taketengaming.datmod.machine.powerbank;

import net.minecraft.inventory.IInventory;
import taketengaming.tencore.inventory.Container;

/**
 * Created by Acid on 1/31/2017.
 */
public class ContainerPowerBank extends Container
{
	public ContainerPowerBank ( IInventory playerInventory, TileEntityPowerBank tileEntityPowerBank )
	{
		super ( tileEntityPowerBank );

		this.addOwnSlots ( new int[][] { { 33, 9 }, { 33, 56 } } );
		this.addPlayerSlots ( playerInventory );
	}
}
