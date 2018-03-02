package net.taketengaming.datmod;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
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

	// Default Block State Holders
	private IBlockState diamondiumOreBlockState = diamondiumOre.getDefaultState ();
	private IBlockState emeraldiOreBlockState = emeraldiOre.getDefaultState ();
	private IBlockState goldiriteOreBlockState = goldiriteOre.getDefaultState ();
	private IBlockState ironiumOreBlockState = ironiumOre.getDefaultState ();

	// Dimension Warnings Tracker
	private ArrayList< Integer > warnedDimensions = new ArrayList<> ();

	// Generation Settings Holder
	// Diamondium Settings
	private int diamondiumChance = 7;
	private int diamondiumMaxVein = 5;
	private int diamondiumMaxY = 20;
	private int diamondiumMinY = 2;

	// Emeraldi Settings
	private int emeraldiChance = 8;
	private int emeraldiMaxVein = 4;
	private int emeraldiMaxY = 32;
	private int emeraldiMinY = 2;

	// Goldirite Settings
	private int goldiriteChance = 6;
	private int goldiriteMaxVein = 4;
	private int goldiriteMaxY = 18;
	private int goldiriteMinY = 2;

	// Ironium Settings
	private int ironiumChance = 15;
	private int ironiumMaxVein = 8;
	private int ironiumMaxY = 63;
	private int ironiumMinY = 2;

	private void doOreGeneration ( IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances )
	{
		int deltaY = maxY - minY;

		for ( int i = 0; i < chances; i++ )
		{
			BlockPos pos = new BlockPos ( x + random.nextInt ( 16 ), minY + random.nextInt ( deltaY ), z + random.nextInt ( 16 ) );
			WorldGenMinable generator = new WorldGenMinable ( ore, size );
			generator.generate ( world, random, pos );
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
		if ( this._enabled )
		{
			return;
		}

		chunkX = chunkX * 16;
		chunkZ = chunkZ * 16;

		if ( this.diamondiumEnabled )
		{
			this.doOreGeneration ( this.diamondiumOreBlockState, world, random, chunkX, chunkZ, this.diamondiumMinY, this.diamondiumMaxY, this.diamondiumMaxVein, this.diamondiumChance );
		}

		if ( this.emeraldiEnabled )
		{
			this.doOreGeneration ( this.emeraldiOreBlockState, world, random, chunkX, chunkZ, this.emeraldiMinY, this.emeraldiMaxY, this.emeraldiMaxVein, this.emeraldiChance );
		}

		if ( this.goldiriteEnabled )
		{
			this.doOreGeneration ( this.goldiriteOreBlockState, world, random, chunkX, chunkZ, this.goldiriteMinY, this.goldiriteMaxY, this.goldiriteMaxVein, this.goldiriteChance );
		}

		if ( this.ironiumEnabled )
		{
			this.doOreGeneration ( this.ironiumOreBlockState, world, random, chunkX, chunkZ, this.ironiumMinY, this.ironiumMaxY, this.ironiumMaxVein, this.ironiumChance );
		}
	}

	private void generateNether ( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider )
	{
		if ( this._enabled )
		{
			return;
		}

		chunkX = chunkX * 16;
		chunkZ = chunkZ * 16;

		if ( this.diamondiumEnabled )
		{
			this.doOreGeneration ( this.diamondiumOreBlockState, world, random, chunkX, chunkZ, this.diamondiumMinY, this.diamondiumMaxY, this.diamondiumMaxVein, this.diamondiumChance );
		}

		if ( this.emeraldiEnabled )
		{
			this.doOreGeneration ( this.emeraldiOreBlockState, world, random, chunkX, chunkZ, this.emeraldiMinY, this.emeraldiMaxY, this.emeraldiMaxVein, this.emeraldiChance );
		}

		if ( this.goldiriteEnabled )
		{
			this.doOreGeneration ( this.goldiriteOreBlockState, world, random, chunkX, chunkZ, this.goldiriteMinY, this.goldiriteMaxY, this.goldiriteMaxVein, this.goldiriteChance );
		}

		if ( this.ironiumEnabled )
		{
			this.doOreGeneration ( this.ironiumOreBlockState, world, random, chunkX, chunkZ, this.ironiumMinY, this.ironiumMaxY, this.ironiumMaxVein, this.ironiumChance );
		}
	}

	private void generateOverworld ( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider )
	{
		if ( this._enabled )
		{
			return;
		}

		chunkX = chunkX * 16;
		chunkZ = chunkZ * 16;

		if ( this.diamondiumEnabled )
		{
			this.doOreGeneration ( this.diamondiumOreBlockState, world, random, chunkX, chunkZ, this.diamondiumMinY, this.diamondiumMaxY, this.diamondiumMaxVein, this.diamondiumChance );
		}

		if ( this.emeraldiEnabled )
		{
			this.doOreGeneration ( this.emeraldiOreBlockState, world, random, chunkX, chunkZ, this.emeraldiMinY, this.emeraldiMaxY, this.emeraldiMaxVein, this.emeraldiChance );
		}

		if ( this.goldiriteEnabled )
		{
			this.doOreGeneration ( this.goldiriteOreBlockState, world, random, chunkX, chunkZ, this.goldiriteMinY, this.goldiriteMaxY, this.goldiriteMaxVein, this.goldiriteChance );
		}

		if ( this.ironiumEnabled )
		{
			this.doOreGeneration ( this.ironiumOreBlockState, world, random, chunkX, chunkZ, this.ironiumMinY, this.ironiumMaxY, this.ironiumMaxVein, this.ironiumChance );
		}
	}
}
