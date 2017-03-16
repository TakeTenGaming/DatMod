package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemRedstoneShovel extends ItemShovel
{
	public ItemRedstoneShovel ()
	{
		super ( Materials.redstone, "Redstone Shovel" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
