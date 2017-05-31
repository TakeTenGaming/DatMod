package taketengaming.datmod.machine.generator;

import net.minecraft.inventory.IInventory;
import taketengaming.tencore.inventory.Container;

/**
 * Created by Acid on 2/26/2017.
 */
public class ContainerGenerator extends Container
{
	public ContainerGenerator ( IInventory playerInventory, TileEntityGenerator tileEntityGenerator )
	{
		super ( tileEntityGenerator );

		this.addOwnSlots ( new int[][] { { 83, 21 } } );
		this.addPlayerSlots ( playerInventory );
	}
}
