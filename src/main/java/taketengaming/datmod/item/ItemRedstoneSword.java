package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemRedstoneSword extends ItemSword
{
	public ItemRedstoneSword ()
	{
		super ( Materials.redstone, "Redstone Sword" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
