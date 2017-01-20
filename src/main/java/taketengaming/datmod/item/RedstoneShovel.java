package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 11/20/2016.
 */
public class RedstoneShovel extends ItemShovel
{
	public RedstoneShovel ()
	{
		super ( Materials.redstone, "Redstone Shovel" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
