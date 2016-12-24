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
	public Block(Material materialIn, String name) {
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

	public Block(String name) {
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

	public ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	public ModelResourceLocation getModelResourceLocation(int metadata) {
		return new ModelResourceLocation(getRegistryName() + "_" + metadata, "inventory");
	}

	public ResourceLocation getResourceLocation() {
		return getRegistryName();
	}
}
