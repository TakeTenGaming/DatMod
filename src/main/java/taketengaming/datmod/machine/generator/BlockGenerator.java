package taketengaming.datmod.machine.generator;

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

import java.util.List;

/**
 * Created by Acid on 2/26/2017.
 */
public class BlockGenerator extends BlockFacable implements ITileEntityProvider
{
	private static final int GUI_ID = GuiHandler.GENERATOR;

	public BlockGenerator ()
	{
		super ( Material.ROCK, "Generator" );

		this.setCreativeTab ( CreativeTabs.blocks );
	}

	@Override
	public void addInformation ( ItemStack stack, EntityPlayer player, List< String > tooltip, boolean advanced )
	{
		tooltip.add ( "Generates power" );
	}

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing the block.
	 *
	 * @param worldIn
	 * @param meta
	 */
	@Override
	public TileEntity createNewTileEntity ( World worldIn, int meta )
	{
		return new TileEntityGenerator ();
	}

	/**
	 * Called when the block is right clicked by a player.
	 *
	 * @param worldIn
	 * @param pos
	 * @param state
	 * @param playerIn
	 * @param hand
	 * @param facing
	 * @param hitX
	 * @param hitY
	 * @param hitZ
	 */
	@Override
	public boolean onBlockActivated ( World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ )
	{
		if ( worldIn.isRemote )
		{
			return true;
		}

		TileEntity te = worldIn.getTileEntity ( pos );
		if ( !( te instanceof TileEntityGenerator ) )
		{
			return false;
		}

		playerIn.openGui ( DatMod.instance, GUI_ID, worldIn, pos.getX (), pos.getY (), pos.getZ () );
		return true;
	}
}
