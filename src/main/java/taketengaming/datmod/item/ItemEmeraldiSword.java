package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemEmeraldiSword extends ItemSword
{
	public ItemEmeraldiSword ()
	{
		super ( Materials.emeraldi, "Emeraldi Sword" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
