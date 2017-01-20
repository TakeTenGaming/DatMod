package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 11/1/2016.
 */
public class IroniumSword extends ItemSword
{
	public IroniumSword ()
	{
		super ( Materials.ironium, "Ironium Sword" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
