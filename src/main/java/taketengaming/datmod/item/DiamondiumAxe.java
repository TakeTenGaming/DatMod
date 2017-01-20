package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemAxe;

/**
 * Created by Acid on 11/1/2016.
 */
public class DiamondiumAxe extends ItemAxe
{
	public DiamondiumAxe ()
	{
		super ( Materials.diamondium, "Diamondium Axe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}