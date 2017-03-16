package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemPickaxe;

/**
 * Created by Acid on 10/26/2016.
 */
public class ItemDiamondiumPickaxe extends ItemPickaxe
{
	public ItemDiamondiumPickaxe ()
	{
		super ( Materials.diamondium, "Diamondium Pickaxe" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
