package taketengaming.datmod.machine.furnace;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import taketengaming.datmod.DatMod;
import taketengaming.datmod.GuiHandler;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.block.BlockFacable;

import javax.annotation.Nullable;

/**
 * Created by Acid on 1/23/2017.
 */
public class BlockFurnace extends BlockFacable implements ITileEntityProvider
{
	private static final int GUI_ID = GuiHandler.ENERGIZED_FURNACE;

	public BlockFurnace ()
	{
		super ( Material.ROCK, "Furnace" );

		this.setCreativeTab ( CreativeTabs.blocks );
	}

	// TODO: Make the block drop it's contents when broken..

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing the block.
	 *
	 * @param worldIn
	 * @param meta
	 */
	@Override
	public TileEntity createNewTileEntity ( World worldIn, int meta )
	{
		return new TileEntityFurnace ();
	}

	@Override
	public boolean onBlockActivated ( World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ )
	{
		if ( worldIn.isRemote )
		{
			return true;
		}

		TileEntity te = worldIn.getTileEntity ( pos );
		if ( !( te instanceof TileEntityFurnace ) )
		{
			return false;
		}

		playerIn.openGui ( DatMod.instance, GUI_ID, worldIn, pos.getX (), pos.getY (), pos.getZ () );
		return true;
	}

	/*@Override
	public void randomDisplayTick ( IBlockState stateIn, World worldIn, BlockPos pos, Random rand )
	{
		if ( this.isProcessing )
		{
			EnumFacing facing = stateIn.getValue ( FACING );
			double d0 = ( double ) pos.getX () + 0.5D;
			double d1 = ( double ) pos.getY () + rand.nextDouble () * 6.0D / 16.0D;
			double d2 = ( double ) pos.getZ () + 0.5D;
			double d3 = 0.52D;
			double d4 = rand.nextDouble () * 0.6D - 0.3D;

			if ( rand.nextDouble () < 0.1D )
			{
				worldIn.playSound ( ( double ) pos.getX () + 0.5D, ( double ) pos.getY (), ( double ) pos.getZ () + 0.5D, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false );
			}

			switch ( facing )
			{
				case WEST:
					worldIn.spawnParticle ( EnumParticleTypes.SMOKE_NORMAL, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[ 0 ] );
					worldIn.spawnParticle ( EnumParticleTypes.FLAME, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[ 0 ] );
					break;

				case EAST:
					worldIn.spawnParticle ( EnumParticleTypes.SMOKE_NORMAL, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[ 0 ] );
					worldIn.spawnParticle ( EnumParticleTypes.FLAME, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[ 0 ] );
					break;

				case NORTH:
					worldIn.spawnParticle ( EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D, new int[ 0 ] );
					worldIn.spawnParticle ( EnumParticleTypes.FLAME, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D, new int[ 0 ] );
					break;

				case SOUTH:
					worldIn.spawnParticle ( EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D, new int[ 0 ] );
					worldIn.spawnParticle ( EnumParticleTypes.FLAME, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D, new int[ 0 ] );
			}
		}
	}*/
}
