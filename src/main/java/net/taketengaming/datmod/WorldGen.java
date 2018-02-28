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
	// Default Block State Holders
	private IBlockState diamondiumOreBlockState = diamondiumOre.getDefaultState ();
	private IBlockState emeraldiOreBlockState = emeraldiOre.getDefaultState ();
	private IBlockState goldiriteOreBlockState = goldiriteOre.getDefaultState ();
	private IBlockState ironiumOreBlockState = ironiumOre.getDefaultState ();

	// Dimension Warnings Tracker
	private ArrayList< Integer > warnedDimensions = new ArrayList<> ();

	private void doOreGeneration ( IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances )
	{
		int deltaY = maxY - minY;

		DatMod.logger.debug ( "Attempting to generate: " + ore.getBlock ().getLocalizedName () );

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

		switch ( dimensionName )
		{
			case "overworld":
				generateOverworld ( random, chunkX, chunkZ, world, chunkGenerator, chunkProvider );
				break;

			// TODO: Add support for The End
			// TODO: Add support for The Nether

			default:
				if ( !this.warnedDimensions.contains ( dimensionId ) )
				{
					DatMod.logger.info ( "Unknown dimension: " + dimensionName + "(ID: " + dimensionId + ")" + System.lineSeparator () + "Report this on GitHub if you'd like support added for this dimension" );
					this.warnedDimensions.add ( dimensionId );
				}
				break;
		}
	}

	private void generateEnd ( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider )
	{
		this.doOreGeneration ( this.diamondiumOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
		this.doOreGeneration ( this.emeraldiOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
		this.doOreGeneration ( this.goldiriteOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
		this.doOreGeneration ( this.ironiumOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
	}

	private void generateNether ( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider )
	{
		this.doOreGeneration ( this.diamondiumOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
		this.doOreGeneration ( this.emeraldiOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
		this.doOreGeneration ( this.goldiriteOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
		this.doOreGeneration ( this.ironiumOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
	}

	private void generateOverworld ( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider )
	{
		this.doOreGeneration ( this.diamondiumOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
		this.doOreGeneration ( this.emeraldiOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
		this.doOreGeneration ( this.goldiriteOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
		this.doOreGeneration ( this.ironiumOreBlockState, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt ( 4 ), 6 );
	}
}
