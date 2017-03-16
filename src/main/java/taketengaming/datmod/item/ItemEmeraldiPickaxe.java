package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemPickaxe;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemEmeraldiPickaxe extends ItemPickaxe
{
	public ItemEmeraldiPickaxe ()
	{
		super ( Materials.emeraldi, "Emeraldi Pickaxe" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
