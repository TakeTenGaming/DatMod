package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 11/20/2016.
 */
public class LapisLazuliShovel extends ItemShovel
{
	public LapisLazuliShovel ()
	{
		super ( Materials.lapisLazuli, "Lapis Lazuli Shovel" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
