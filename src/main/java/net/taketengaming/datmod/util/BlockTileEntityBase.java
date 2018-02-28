package net.taketengaming.datmod.util;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class BlockTileEntityBase< TE extends TileEntityBase > extends BlockBase
{
	public BlockTileEntityBase ( Material material, String name )
	{
		super ( material, name );
	}

	@Nullable
	@Override
	public abstract TE createTileEntity ( World world, IBlockState state );

	@SuppressWarnings( "unchecked" ) // TODO: Look into this later to ensure it's not going to break everything
	public TE getTileEntity ( IBlockAccess world, BlockPos pos )
	{
		return ( TE ) world.getTileEntity ( pos );
	}

	public abstract Class< TE > getTileEntityClass ();

	@Override
	public boolean hasTileEntity ( IBlockState state )
	{
		return true;
	}
}
