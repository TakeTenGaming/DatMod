package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 11/20/2016.
 */
public class LapisLazuliSword extends ItemSword
{
	public LapisLazuliSword ()
	{
		super ( Materials.lapisLazuli, "Lapis Lazuli Sword" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
