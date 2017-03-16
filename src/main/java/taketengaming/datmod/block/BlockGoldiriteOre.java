package taketengaming.datmod.block;

import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.block.BlockOre;

/**
 * Created by Acid on 10/26/2016.
 */
public class BlockGoldiriteOre extends BlockOre
{
	public BlockGoldiriteOre ()
	{
		super ( "Goldirite Ore" );

		this.setCreativeTab ( CreativeTabs.ores );
		this.setHarvestLevel ( "pickaxe", 2 );
	}
}
