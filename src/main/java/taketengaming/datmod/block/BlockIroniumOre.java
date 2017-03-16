package taketengaming.datmod.block;

import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.block.BlockOre;

/**
 * Created by Acid on 10/26/2016.
 */
public class BlockIroniumOre extends BlockOre
{
	public BlockIroniumOre ()
	{
		super ( "Ironium Ore" );

		this.setCreativeTab ( CreativeTabs.ores );
		this.setHarvestLevel ( "pickaxe", 1 );
	}
}
