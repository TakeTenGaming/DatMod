package xlxacidxlx.datmod.base;

import net.minecraft.block.material.Material;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 10/28/2016.
 */
public class BlockOre extends Block
{
	public BlockOre ( Material material, String name )
	{
		super ( material, name );

		setCreativeTab ( CreativeTabs.ores );

		setHardness ( 2.5f );
		setHarvestLevel ( "pickaxe", 4 );
	}

	public BlockOre ( String name )
	{
		super ( name );

		setCreativeTab ( CreativeTabs.ores );

		setHardness ( 2.5f );
		setHarvestLevel ( "pickaxe", 4 );
	}
}
