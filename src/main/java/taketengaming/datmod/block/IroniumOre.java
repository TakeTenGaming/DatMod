package taketengaming.datmod.block;

import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.block.BlockOre;

/**
 * Created by Acid on 10/26/2016.
 */
public class IroniumOre extends BlockOre
{
	public IroniumOre ()
	{
		super ( "Ironium Ore" );

		setCreativeTab ( CreativeTabs.ores );
		setHarvestLevel ( "pickaxe", 1 );
	}
}
