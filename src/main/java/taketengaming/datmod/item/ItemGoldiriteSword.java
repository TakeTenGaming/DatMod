package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemGoldiriteSword extends ItemSword
{
	public ItemGoldiriteSword ()
	{
		super ( Materials.goldirite, "Goldirite Sword" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
