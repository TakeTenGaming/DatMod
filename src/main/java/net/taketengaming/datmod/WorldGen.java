package net.taketengaming.datmod;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.ArrayList;
import java.util.Random;

import static net.taketengaming.datmod.ModBlocks.*;

public class WorldGen implements IWorldGenerator
{
	// Config Value Holders
	// Dimensions
	private boolean dimensionEndEnabled = ModConfig.Oregen.dimensions.enableEnd;
	private boolean dimensionNetherEnabled = ModConfig.Oregen.dimensions.enableNether;
	private boolean dimensionOverworldEnabled = ModConfig.Oregen.dimensions.enableOverworld;

	// Ores
	private boolean _enabled = ModConfig.Oregen.global.enableAll;
	private boolean diamondiumEnabled = ModConfig.Oregen.global.enableDiamondium;
	private boolean emeraldiEnabled = ModConfig.Oregen.global.enableEmeraldi;
	private boolean goldiriteEnabled = ModConfig.Oregen.global.enableGoldirite;
	private boolean ironiumEnabled = ModConfig.Oregen.global.enableIronium;

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

	// Dimension Warnings Tracker
	private ArrayList< Integer > warnedDimensions = new ArrayList<> ();

	// Generation Settings Holder
	// Diamondium Settings
	private int diamondiumChance = 2;
	private int diamondiumMaxVein = 4;
	private int diamondiumMaxY = 28;
	private int diamondiumMinY = 2;

	// Emeraldi Settings
	private int emeraldiChance = 3;
	private int emeraldiMaxVein = 3;
	private int emeraldiMaxY = 26;
	private int emeraldiMinY = 2;

	// Goldirite Settings
	private int goldiriteChance = 6;
	private int goldiriteMaxVein = 3;
	private int goldiriteMaxY = 32;
	private int goldiriteMinY = 2;

	// Ironium Settings
	private int ironiumChance = 15;
	private int ironiumMaxVein = 8;
	private int ironiumMaxY = 63;
	private int ironiumMinY = 2;

	public WorldGen ()
	{
		this.diamondiumOverworld = new WorldGenMinable ( diamondiumOre.getDefaultState (), this.diamondiumMaxVein );
		this.diamondiumNether = new WorldGenMinable ( diamondiumOre.getDefaultState (), this.diamondiumMaxVein, BlockMatcher.forBlock ( Blocks.NETHERRACK ) );
		this.diamondiumEnd = new WorldGenMinable ( diamondiumOre.getDefaultState (), this.diamondiumMaxVein, BlockMatcher.forBlock ( Blocks.END_STONE ) );

		this.emeraldiOverworld = new WorldGenMinable ( emeraldiOre.getDefaultState (), this.emeraldiMaxVein );
		this.emeraldiNether = new WorldGenMinable ( emeraldiOre.getDefaultState (), this.emeraldiMaxVein, BlockMatcher.forBlock ( Blocks.NETHERRACK ) );
		this.emeraldiEnd = new WorldGenMinable ( emeraldiOre.getDefaultState (), this.emeraldiMaxVein, BlockMatcher.forBlock ( Blocks.END_STONE ) );

		this.goldiriteOverworld = new WorldGenMinable ( goldiriteOre.getDefaultState (), this.goldiriteMaxVein );
		this.goldiriteNether = new WorldGenMinable ( goldiriteOre.getDefaultState (), this.goldiriteMaxVein, BlockMatcher.forBlock ( Blocks.NETHERRACK ) );
		this.goldiriteEnd = new WorldGenMinable ( goldiriteOre.getDefaultState (), this.goldiriteMaxVein, BlockMatcher.forBlock ( Blocks.END_STONE ) );

		this.ironiumOverworld = new WorldGenMinable ( ironiumOre.getDefaultState (), this.ironiumMaxVein );
		this.ironiumNether = new WorldGenMinable ( ironiumOre.getDefaultState (), this.ironiumMaxVein, BlockMatcher.forBlock ( Blocks.NETHERRACK ) );
		this.ironiumEnd = new WorldGenMinable ( ironiumOre.getDefaultState (), this.ironiumMaxVein, BlockMatcher.forBlock ( Blocks.END_STONE ) );
	}

	private void doOreGeneration ( WorldGenerator worldGenerator, World world, Random random, int chunkX, int chunkZ, int minHeight, int maxHeight, int size, int chances )
	{
		if ( minHeight > maxHeight || minHeight < 0 || maxHeight > 256 )
		{
			throw new IllegalArgumentException ( "Ore Generated Out of Bounds" );
		}

		int heightDiff = maxHeight - minHeight + 1;
		for ( int i = 0; i < chances; i++ )
		{
			int x = chunkX * 16 + random.nextInt ( 16 );
			int y = minHeight + random.nextInt ( heightDiff );
			int z = chunkZ * 16 + random.nextInt ( 16 );

			BlockPos position = new BlockPos ( x, y, z );
			worldGenerator.generate ( world, random, position );
		}
	}

	@Override
	public void generate ( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider )
	{
		DimensionType dimensionType = world.provider.getDimensionType ();
		int dimensionId = dimensionType.getId ();
		String dimensionName = dimensionType.getName ();

		switch ( dimensionId )
		{
			case -1: // The Nether
				if ( this.dimensionNetherEnabled )
				{
					generateNether ( random, chunkX, chunkZ, world, chunkGenerator, chunkProvider );
				}
				break;

			case 0: // Overworld
				if ( this.dimensionOverworldEnabled )
				{
					generateOverworld ( random, chunkX, chunkZ, world, chunkGenerator, chunkProvider );
				}
				break;

			case 1: // The End
				if ( this.dimensionEndEnabled )
				{
					generateEnd ( random, chunkX, chunkZ, world, chunkGenerator, chunkProvider );
				}
				break;

			default:
				if ( !this.warnedDimensions.contains ( dimensionId ) )
				{
					DatMod.logger.info ( "Unknown dimension: " + dimensionName + " (ID: " + dimensionId + ")" + System.lineSeparator () + "Report this on GitHub if you'd like support added for this dimension" );
					this.warnedDimensions.add ( dimensionId );
				}
				break;
		}
	}

	private void generateEnd ( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider )
	{
		if ( !this._enabled )
		{
			return;
		}

		if ( this.diamondiumEnabled )
		{
			int diamondiumSize = random.nextInt ( this.diamondiumMaxVein );

			if ( diamondiumSize > 0 )
			{
				this.doOreGeneration ( this.diamondiumEnd, world, random, chunkX, chunkZ, this.diamondiumMinY, this.diamondiumMaxY, diamondiumSize, this.diamondiumChance );
			}
		}

		if ( this.emeraldiEnabled )
		{
			int emeraldiSize = random.nextInt ( this.emeraldiMaxVein );

			if ( emeraldiSize > 0 )
			{
				this.doOreGeneration ( this.emeraldiEnd, world, random, chunkX, chunkZ, this.emeraldiMinY, this.emeraldiMaxY, emeraldiSize, this.emeraldiChance );
			}
		}

		if ( this.goldiriteEnabled )
		{
			int goldiriteSize = random.nextInt ( this.goldiriteMaxVein );

			if ( goldiriteSize > 0 )
			{
				this.doOreGeneration ( this.goldiriteEnd, world, random, chunkX, chunkZ, this.goldiriteMinY, this.goldiriteMaxY, goldiriteSize, this.goldiriteChance );
			}
		}

		if ( this.ironiumEnabled )
		{
			int ironiumSize = random.nextInt ( this.ironiumMaxVein );

			if ( ironiumSize > 0 )
			{
				this.doOreGeneration ( this.ironiumEnd, world, random, chunkX, chunkZ, this.ironiumMinY, this.ironiumMaxY, ironiumSize, this.ironiumChance );
			}
		}
	}

	private void generateNether ( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider )
	{
		if ( !this._enabled )
		{
			return;
		}

		if ( this.diamondiumEnabled )
		{
			int diamondiumSize = random.nextInt ( this.diamondiumMaxVein );

			if ( diamondiumSize > 0 )
			{
				this.doOreGeneration ( this.diamondiumNether, world, random, chunkX, chunkZ, this.diamondiumMinY, this.diamondiumMaxY, diamondiumSize, this.diamondiumChance );
			}
		}

		if ( this.emeraldiEnabled )
		{
			int emeraldiSize = random.nextInt ( this.emeraldiMaxVein );

			if ( emeraldiSize > 0 )
			{
				this.doOreGeneration ( this.emeraldiNether, world, random, chunkX, chunkZ, this.emeraldiMinY, this.emeraldiMaxY, emeraldiSize, this.emeraldiChance );
			}
		}

		if ( this.goldiriteEnabled )
		{
			int goldiriteSize = random.nextInt ( this.goldiriteMaxVein );

			if ( goldiriteSize > 0 )
			{
				this.doOreGeneration ( this.goldiriteNether, world, random, chunkX, chunkZ, this.goldiriteMinY, this.goldiriteMaxY, goldiriteSize, this.goldiriteChance );
			}
		}

		if ( this.ironiumEnabled )
		{
			int ironiumSize = random.nextInt ( this.ironiumMaxVein );

			if ( ironiumSize > 0 )
			{
				this.doOreGeneration ( this.ironiumNether, world, random, chunkX, chunkZ, this.ironiumMinY, this.ironiumMaxY, ironiumSize, this.ironiumChance );
			}
		}
	}

	private void generateOverworld ( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider )
	{
		if ( !this._enabled )
		{
			return;
		}

		if ( this.diamondiumEnabled )
		{
			int diamondiumSize = random.nextInt ( this.diamondiumMaxVein );

			if ( diamondiumSize > 0 )
			{
				this.doOreGeneration ( this.diamondiumOverworld, world, random, chunkX, chunkZ, this.diamondiumMinY, this.diamondiumMaxY, diamondiumSize, this.diamondiumChance );
			}
		}

		if ( this.emeraldiEnabled )
		{
			int emeraldiSize = random.nextInt ( this.emeraldiMaxVein );

			if ( emeraldiSize > 0 )
			{
				this.doOreGeneration ( this.emeraldiOverworld, world, random, chunkX, chunkZ, this.emeraldiMinY, this.emeraldiMaxY, emeraldiSize, this.emeraldiChance );
			}
		}

		if ( this.goldiriteEnabled )
		{
			int goldiriteSize = random.nextInt ( this.goldiriteMaxVein );

			if ( goldiriteSize > 0 )
			{
				this.doOreGeneration ( this.goldiriteOverworld, world, random, chunkX, chunkZ, this.goldiriteMinY, this.goldiriteMaxY, goldiriteSize, this.goldiriteChance );
			}
		}

		if ( this.ironiumEnabled )
		{
			int ironiumSize = random.nextInt ( this.ironiumMaxVein );

			if ( ironiumSize > 0 )
			{
				this.doOreGeneration ( this.ironiumOverworld, world, random, chunkX, chunkZ, this.ironiumMinY, this.ironiumMaxY, ironiumSize, this.ironiumChance );
			}
		}
	}
}
