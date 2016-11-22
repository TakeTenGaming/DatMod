package xlxacidxlx.datmod.base;

import net.minecraft.block.material.Material;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 10/28/2016.
 */
public class BlockOre extends Block {
	/**
	 * Constructs the BlockOre class
	 *
	 * @param material The type of material the ore is made of
	 * @param name     The name of the ore
	 */
	public BlockOre(Material material, String name) {
		super(material, name);

		setCreativeTab(CreativeTabs.ores);

		setHardness(2.5f);
		setHarvestLevel("pickaxe", 4);
	}

	/**
	 * Constructs the BaseBlockOre class
	 *
	 * @param name The name of the block
	 */
	public BlockOre(String name) {
		super(name);

		setCreativeTab(CreativeTabs.ores);

		setHardness(2.5f);
		setHarvestLevel("pickaxe", 4);
	}
}
