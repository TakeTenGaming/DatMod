package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemGoldiriteShovel extends ItemShovel
{
	public ItemGoldiriteShovel ()
	{
		super ( Materials.goldirite, "Goldirite Shovel" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
