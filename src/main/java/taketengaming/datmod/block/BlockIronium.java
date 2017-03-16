package taketengaming.datmod.block;

import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.block.Block;

/**
 * Created by Acid on 10/26/2016.
 */
public class BlockIronium extends Block
{
	public BlockIronium ()
	{
		super ( "Ironium Block" );

		this.setCreativeTab ( CreativeTabs.blocks );
		this.setHardness ( 3.5f );
	}
}
