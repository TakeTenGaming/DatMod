package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 11/1/2016.
 */
public class GoldiriteSword extends ItemSword
{
	public GoldiriteSword ()
	{
		super ( Materials.goldirite, "Goldirite Sword" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
