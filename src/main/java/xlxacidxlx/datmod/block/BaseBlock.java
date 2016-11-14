package xlxacidxlx.datmod.block;

import net.minecraft.block.Block;
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

public class BaseBlock extends Block {
	public BaseBlock(Material materialIn, String name) {
		super(materialIn);

		setCreativeTab(CreativeTabs.blocks);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);

		setHardness(1.5f);
		setHarvestLevel("pickaxe", 2); // TODO: This may need to be changed..
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
	}

	public BaseBlock(String name) {
		super(Material.ROCK);

		setCreativeTab(CreativeTabs.blocks);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);

		setHardness(1.5f);
		setHarvestLevel("pickaxe", 2); // TODO: This may need to be changed..
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosion) {
		// TODO: Possibly change this for certain blocks..
		return false;
	}

	public ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	public ResourceLocation getResourceLocation() {
		return getRegistryName();
	}

	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}
}
