package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 11/1/2016.
 */
public class IroniumShovel extends ItemShovel
{
	public IroniumShovel ()
	{
		super ( Materials.ironium, "Ironium Shovel" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
