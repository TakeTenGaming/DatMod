package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemIroniumSword extends ItemSword
{
	public ItemIroniumSword ()
	{
		super ( Materials.ironium, "Ironium Sword" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
