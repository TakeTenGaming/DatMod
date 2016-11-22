package xlxacidxlx.datmod.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import xlxacidxlx.datmod.base.BlockOre;
import xlxacidxlx.datmod.register.Items;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by Acid on 11/1/2016.
 */
public class DiamondiumOre extends BlockOre {
	/**
	 * Constructs the Diamondium Ore block
	 */
	public DiamondiumOre() {
		super("Diamondium Ore");

		setHarvestLevel("pickaxe", 2);
	}

	@Nullable
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.diamondium;
	}
}
