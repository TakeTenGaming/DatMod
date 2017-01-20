package taketengaming.datmod.block;

import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.block.BlockOre;

/**
 * Created by Acid on 10/26/2016.
 */
public class GoldiriteOre extends BlockOre
{
	public GoldiriteOre ()
	{
		super ( "Goldirite Ore" );

		setCreativeTab ( CreativeTabs.ores );
		setHarvestLevel ( "pickaxe", 2 );
	}
}
