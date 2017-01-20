package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemSword;

/**
 * Created by Acid on 11/1/2016.
 */
public class EmeraldiSword extends ItemSword
{
	public EmeraldiSword ()
	{
		super ( Materials.emeraldi, "Emeraldi Sword" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
