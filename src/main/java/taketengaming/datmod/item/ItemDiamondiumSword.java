package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 10/26/2016.
 */
public class ItemDiamondiumSword extends ItemSword
{
	public ItemDiamondiumSword ()
	{
		super ( Materials.diamondium, "Diamondium Sword" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
