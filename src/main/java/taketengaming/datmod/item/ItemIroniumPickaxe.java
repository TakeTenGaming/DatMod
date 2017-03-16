package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemPickaxe;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemIroniumPickaxe extends ItemPickaxe
{
	public ItemIroniumPickaxe ()
	{
		super ( Materials.ironium, "Ironium Pickaxe" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
