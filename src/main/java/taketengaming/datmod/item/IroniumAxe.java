package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemAxe;

/**
 * Created by Acid on 11/1/2016.
 */
public class IroniumAxe extends ItemAxe
{
	public IroniumAxe ()
	{
		super ( Materials.ironium, "Ironium Axe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}