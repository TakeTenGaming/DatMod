package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemShovel;

/**
 * Created by Acid on 10/26/2016.
 */
public class DiamondiumShovel extends ItemShovel
{
	public DiamondiumShovel ()
	{
		super ( Materials.diamondium, "Diamondium Shovel" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
