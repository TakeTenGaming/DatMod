package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemAxe;

/**
 * Created by Acid on 11/1/2016.
 */
public class GoldiriteAxe extends ItemAxe
{
	public GoldiriteAxe ()
	{
		super ( Materials.goldirite, "Goldirite Axe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}