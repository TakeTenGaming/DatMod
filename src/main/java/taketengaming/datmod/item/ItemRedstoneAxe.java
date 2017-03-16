package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemAxe;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemRedstoneAxe extends ItemAxe
{
	public ItemRedstoneAxe ()
	{
		super ( Materials.redstone, "Redstone Axe" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
