package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemLapisLazuliShovel extends ItemShovel
{
	public ItemLapisLazuliShovel ()
	{
		super ( Materials.lapisLazuli, "Lapis Lazuli Shovel" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
