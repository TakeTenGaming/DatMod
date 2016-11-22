package xlxacidxlx.datmod.base;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 10/26/2016.
 */
public class Block extends net.minecraft.block.Block {
	/**
	 * Constructs the Block class
	 *
	 * @param materialIn The type of material the block is made of
	 * @param name       The name of the block
	 */
	Block(Material materialIn, String name) {
		super(materialIn);

		setCreativeTab(CreativeTabs.blocks);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);

		setHardness(1.5f);
		setHarvestLevel("pickaxe", 2);
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
	}

	/**
	 * Constructs the BaseBlock class
	 *
	 * @param name The name of the block
	 */
	protected Block(String name) {
		super(Material.ROCK);

		setCreativeTab(CreativeTabs.blocks);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);

		setHardness(1.5f);
		setHarvestLevel("pickaxe", 2);
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosion) {
		return false;
	}

	/**
	 * Returns the model's resource location
	 */
	public ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	/**
	 * Gets the block's resource location
	 */
	public ResourceLocation getResourceLocation() {
		return getRegistryName();
	}

	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}
}
