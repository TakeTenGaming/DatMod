package taketengaming.datmod.machine.pulverizer;

import net.minecraft.inventory.IInventory;
import taketengaming.tencore.inventory.Container;

/**
 * Created by Acid on 1/31/2017.
 */
public class ContainerPulverizer extends Container
{
	public ContainerPulverizer ( IInventory playerInventory, TileEntityPulverizer tileEntityPulverizer )
	{
		super ( tileEntityPulverizer );

		this.addOwnSlots ( new int[][] { { 56, 35 }, { 116, 35 } } );
		this.addPlayerSlots ( playerInventory );
	}
}
