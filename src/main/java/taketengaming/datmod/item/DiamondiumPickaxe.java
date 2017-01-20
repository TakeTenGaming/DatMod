package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemPickaxe;

/**
 * Created by Acid on 10/26/2016.
 */
public class DiamondiumPickaxe extends ItemPickaxe
{
	public DiamondiumPickaxe ()
	{
		super ( Materials.diamondium, "Diamondium Pickaxe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
