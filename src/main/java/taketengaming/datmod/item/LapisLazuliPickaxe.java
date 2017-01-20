package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemPickaxe;

/**
 * Created by Acid on 11/20/2016.
 */
public class LapisLazuliPickaxe extends ItemPickaxe
{
	public LapisLazuliPickaxe ()
	{
		super ( Materials.lapisLazuli, "Lapis Lazuli Pickaxe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
