package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemPickaxe;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemRedstonePickaxe extends ItemPickaxe
{
	public ItemRedstonePickaxe ()
	{
		super ( Materials.redstone, "Redstone Pickaxe" );

		this.setCreativeTab ( CreativeTabs.tools );
	}
}
