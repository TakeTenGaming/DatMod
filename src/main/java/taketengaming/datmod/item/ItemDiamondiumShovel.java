package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 10/26/2016.
 */
public class ItemDiamondiumShovel extends ItemShovel
{
	public ItemDiamondiumShovel ()
	{
		super ( Materials.diamondium, "Diamondium Shovel" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
