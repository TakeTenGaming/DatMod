package taketengaming.datmod.block;

import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.block.Block;

/**
 * Created by Acid on 11/1/2016.
 */
public class BlockDiamondium extends Block
{
	public BlockDiamondium ()
	{
		super ( "Diamondium Block" );

		this.setCreativeTab ( CreativeTabs.blocks );
		this.setHardness ( 3.5f );
	}
}
