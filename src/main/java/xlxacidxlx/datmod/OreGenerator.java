package xlxacidxlx.datmod;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import xlxacidxlx.datmod.register.Blocks;

import java.util.Random;

/**
 * Created by Acid on 11/2/2016.
 */
public class OreGenerator implements IWorldGenerator {
	// Ore Holders
	private WorldGenMinable diamondiumEnd;
	private WorldGenMinable diamondiumNether;
	private WorldGenMinable diamondiumOverworld;

	private WorldGenMinable emeraldiEnd;
	private WorldGenMinable emeraldiNether;
	private WorldGenMinable emeraldiOverworld;

	private WorldGenMinable goldiriteEnd;
	private WorldGenMinable goldiriteNether;
	private WorldGenMinable goldiriteOverworld;

	private WorldGenMinable ironiumEnd;
	private WorldGenMinable ironiumNether;
	private WorldGenMinable ironiumOverworld;

	// Diamondium Settings
	private int oreDiamondiumChance = 8;
	private int oreDiamondiumMaxVein = 5;
	private int oreDiamondiumMaxY = 20;
	private int oreDiamondiumMinY = 2;

	// Emeraldi Settings
	private int oreEmeraldiChance = 6;
	private int oreEmeraldiMaxVein = 4;
	private int oreEmeraldiMaxY = 32;
	private int oreEmeraldiMinY = 2;

	// Goldirite Settings
	private int oreGoldiriteChance = 4;
	private int oreGoldiriteMaxVein = 4;
	private int oreGoldiriteMaxY = 18;
	private int oreGoldiriteMinY = 2;

	// Ironium Settings
	private int oreIroniumChance = 15;
	private int oreIroniumMaxVein = 8;
	private int oreIroniumMaxY = 63;
	private int oreIroniumMinY = 2;

	public OreGenerator() {
		diamondiumOverworld = new WorldGenMinable(Blocks.diamondiumOre.getDefaultState(), oreDiamondiumMaxVein);
		diamondiumNether = new WorldGenMinable(Blocks.diamondiumOre.getDefaultState(), oreDiamondiumMaxVein, BlockMatcher.forBlock(net.minecraft.init.Blocks.NETHERRACK));
		diamondiumEnd = new WorldGenMinable(Blocks.diamondiumOre.getDefaultState(), oreDiamondiumMaxVein, BlockMatcher.forBlock(net.minecraft.init.Blocks.END_STONE));

		emeraldiOverworld = new WorldGenMinable(Blocks.emeraldiOre.getDefaultState(), oreEmeraldiMaxVein);
		emeraldiNether = new WorldGenMinable(Blocks.emeraldiOre.getDefaultState(), oreEmeraldiMaxVein, BlockMatcher.forBlock(net.minecraft.init.Blocks.NETHERRACK));
		emeraldiEnd = new WorldGenMinable(Blocks.emeraldiOre.getDefaultState(), oreEmeraldiMaxVein, BlockMatcher.forBlock(net.minecraft.init.Blocks.END_STONE));

		goldiriteOverworld = new WorldGenMinable(Blocks.goldiriteOre.getDefaultState(), oreGoldiriteMaxVein);
		goldiriteNether = new WorldGenMinable(Blocks.goldiriteOre.getDefaultState(), oreGoldiriteMaxVein, BlockMatcher.forBlock(net.minecraft.init.Blocks.NETHERRACK));
		goldiriteEnd = new WorldGenMinable(Blocks.goldiriteOre.getDefaultState(), oreGoldiriteMaxVein, BlockMatcher.forBlock(net.minecraft.init.Blocks.END_STONE));

		ironiumOverworld = new WorldGenMinable(Blocks.ironiumOre.getDefaultState(), oreIroniumMaxVein);
		ironiumNether = new WorldGenMinable(Blocks.ironiumOre.getDefaultState(), oreIroniumMaxVein, BlockMatcher.forBlock(net.minecraft.init.Blocks.NETHERRACK));
		ironiumEnd = new WorldGenMinable(Blocks.ironiumOre.getDefaultState(), oreIroniumMaxVein, BlockMatcher.forBlock(net.minecraft.init.Blocks.END_STONE));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
			case -1:
				generateNether(world, random, chunkX, chunkZ);
				break;

			case 0:
				generateOverworld(world, random, chunkX, chunkZ);
				break;

			case 1:
				generateEnd(world, random, chunkX, chunkZ);
				break;
		}
	}

	private void generateEnd(World world, Random rand, int x, int z) {
		if (ConfigHandler.enableOreGenerationDiamondium) {
			generateOre(diamondiumEnd, world, rand, x, z, oreDiamondiumChance, oreDiamondiumMinY, oreDiamondiumMaxY);
		}

		if (ConfigHandler.enableOreGenerationEmeraldi) {
			generateOre(emeraldiEnd, world, rand, x, z, oreEmeraldiChance, oreEmeraldiMinY, oreEmeraldiMaxY);
		}

		if (ConfigHandler.enableOreGenerationGoldirite) {
			generateOre(goldiriteEnd, world, rand, x, z, oreGoldiriteChance, oreGoldiriteMinY, oreGoldiriteMaxY);
		}

		if (ConfigHandler.enableOreGenerationIronium) {
			generateOre(ironiumEnd, world, rand, x, z, oreIroniumChance, oreIroniumMinY, oreIroniumMaxY);
		}
	}

	private void generateNether(World world, Random rand, int x, int z) {
		if (ConfigHandler.enableOreGenerationDiamondium) {
			generateOre(diamondiumNether, world, rand, x, z, oreDiamondiumChance, oreDiamondiumMinY, oreDiamondiumMaxY);
		}

		if (ConfigHandler.enableOreGenerationEmeraldi) {
			generateOre(emeraldiNether, world, rand, x, z, oreEmeraldiChance, oreEmeraldiMinY, oreEmeraldiMaxY);
		}

		if (ConfigHandler.enableOreGenerationGoldirite) {
			generateOre(goldiriteNether, world, rand, x, z, oreGoldiriteChance, oreGoldiriteMinY, oreGoldiriteMaxY);
		}

		if (ConfigHandler.enableOreGenerationIronium) {
			generateOre(ironiumNether, world, rand, x, z, oreIroniumChance, oreIroniumMinY, oreIroniumMaxY);
		}
	}

	private void generateOre(WorldGenerator generator, World world, Random rand, int x, int z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight <= 0) {
			throw new IllegalArgumentException("Height can't be 0");
		}

		if (minHeight > maxHeight) {
			throw new IllegalArgumentException("Minimum ore height may not be greater than maximum ore height");
		}

		if (maxHeight > 256) {
			throw new IllegalArgumentException("Ore height may not be greater than world height!");
		}

		int difference = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int xValue = x * 16 + rand.nextInt(16);
			int yValue = minHeight + rand.nextInt(difference);
			int zValue = z * 16 + rand.nextInt(16);
			BlockPos position = new BlockPos(xValue, yValue, zValue);

			generator.generate(world, rand, position);
		}
	}

	private void generateOverworld(World world, Random rand, int x, int z) {
		if (ConfigHandler.enableOreGenerationDiamondium) {
			generateOre(diamondiumOverworld, world, rand, x, z, oreDiamondiumChance, oreDiamondiumMinY, oreDiamondiumMaxY);
		}

		if (ConfigHandler.enableOreGenerationEmeraldi) {
			generateOre(emeraldiOverworld, world, rand, x, z, oreEmeraldiChance, oreEmeraldiMinY, oreEmeraldiMaxY);
		}

		if (ConfigHandler.enableOreGenerationGoldirite) {
			generateOre(goldiriteOverworld, world, rand, x, z, oreGoldiriteChance, oreGoldiriteMinY, oreGoldiriteMaxY);
		}

		if (ConfigHandler.enableOreGenerationIronium) {
			generateOre(ironiumOverworld, world, rand, x, z, oreIroniumChance, oreIroniumMinY, oreIroniumMaxY);
		}
	}
}