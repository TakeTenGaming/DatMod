package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemHoe;

/**
 * Created by Acid on 11/20/2016.
 */
public class RedstoneHoe extends ItemHoe
{
	public RedstoneHoe ()
	{
		super ( Materials.redstone, "Redstone Hoe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
