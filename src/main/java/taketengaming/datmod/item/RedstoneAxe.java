package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemAxe;

/**
 * Created by Acid on 11/20/2016.
 */
public class RedstoneAxe extends ItemAxe
{
	public RedstoneAxe ()
	{
		super ( Materials.redstone, "Redstone Axe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
