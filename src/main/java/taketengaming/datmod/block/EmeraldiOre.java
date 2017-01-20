package taketengaming.datmod.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.datmod.register.Items;
import taketengaming.tencore.block.BlockOre;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by Acid on 11/2/2016.
 */
public class EmeraldiOre extends BlockOre
{
	public EmeraldiOre ()
	{
		super ( "Emeraldi Ore" );

		setCreativeTab ( CreativeTabs.ores );
		setHarvestLevel ( "pickaxe", 2 );
	}

	@Nullable
	@Override
	public Item getItemDropped ( IBlockState state, Random rand, int fortune )
	{
		return Items.emeraldi;
	}
}
