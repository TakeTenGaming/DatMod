package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemHoe;

/**
 * Created by Acid on 11/20/2016.
 */
public class GoldiriteHoe extends ItemHoe
{
	public GoldiriteHoe ()
	{
		super ( Materials.goldirite, "Goldirite Hoe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
