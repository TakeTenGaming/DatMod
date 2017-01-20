package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 10/26/2016.
 */
public class DiamondiumSword extends ItemSword
{
	public DiamondiumSword ()
	{
		super ( Materials.diamondium, "Diamondium Sword" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
