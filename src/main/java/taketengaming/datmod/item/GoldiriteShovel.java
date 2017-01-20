package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 11/1/2016.
 */
public class GoldiriteShovel extends ItemShovel
{
	public GoldiriteShovel ()
	{
		super ( Materials.goldirite, "Goldirite Shovel" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
