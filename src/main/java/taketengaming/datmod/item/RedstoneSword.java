package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 11/20/2016.
 */
public class RedstoneSword extends ItemSword
{
	public RedstoneSword ()
	{
		super ( Materials.redstone, "Redstone Sword" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
