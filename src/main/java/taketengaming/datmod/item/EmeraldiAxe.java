package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemAxe;

/**
 * Created by Acid on 11/1/2016.
 */
public class EmeraldiAxe extends ItemAxe
{
	public EmeraldiAxe ()
	{
		super ( Materials.emeraldi, "Emeraldi Axe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
