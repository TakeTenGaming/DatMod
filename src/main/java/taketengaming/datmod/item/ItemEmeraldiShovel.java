package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemEmeraldiShovel extends ItemShovel
{
	public ItemEmeraldiShovel ()
	{
		super ( Materials.emeraldi, "Emeraldi Shovel" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
