package taketengaming.datmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import taketengaming.datmod.machine.furnace.ContainerFurnace;
import taketengaming.datmod.machine.furnace.GuiFurnace;
import taketengaming.datmod.machine.furnace.TileEntityFurnace;
import taketengaming.datmod.machine.generator.ContainerGenerator;
import taketengaming.datmod.machine.generator.GuiGenerator;
import taketengaming.datmod.machine.generator.TileEntityGenerator;
import taketengaming.datmod.machine.powerbank.ContainerPowerBank;
import taketengaming.datmod.machine.powerbank.GuiPowerBank;
import taketengaming.datmod.machine.powerbank.TileEntityPowerBank;
import taketengaming.datmod.machine.pulverizer.ContainerPulverizer;
import taketengaming.datmod.machine.pulverizer.GuiPulverizer;
import taketengaming.datmod.machine.pulverizer.TileEntityPulverizer;

/**
 * Created by Acid on 12/4/2016.
 */
public class GuiHandler implements IGuiHandler
{
	public static final int CONDUIT = 1;
	public static final int ENERGIZED_FURNACE = 2;
	public static final int ENERGIZED_PULVERIZER = 3;
	public static final int GENERATOR = 4;
	public static final int POWER_BANK = 5;

	@Override
	public Object getServerGuiElement ( int ID, EntityPlayer player, World world, int x, int y, int z )
	{
		InventoryPlayer playerInventory = player.inventory;
		TileEntity tileEntity = world.getTileEntity ( new BlockPos ( x, y, z ) );

		if ( tileEntity == null )
		{
			return null;
		}

		switch ( ID )
		{
			case ENERGIZED_FURNACE:
				return new ContainerFurnace ( playerInventory, ( TileEntityFurnace ) tileEntity );

			case ENERGIZED_PULVERIZER:
				return new ContainerPulverizer ( playerInventory, ( TileEntityPulverizer ) tileEntity );

			case GENERATOR:
				return new ContainerGenerator ( playerInventory, ( TileEntityGenerator ) tileEntity );

			case POWER_BANK:
				return new ContainerPowerBank ( playerInventory, ( TileEntityPowerBank ) tileEntity );

			default:
				return null;
		}
	}

	@Override
	@SideOnly( Side.CLIENT )
	public Object getClientGuiElement ( int ID, EntityPlayer player, World world, int x, int y, int z )
	{
		InventoryPlayer playerInventory = player.inventory;
		TileEntity tileEntity = world.getTileEntity ( new BlockPos ( x, y, z ) );

		if ( tileEntity == null )
		{
			return null;
		}

		switch ( ID )
		{
			case ENERGIZED_FURNACE:
				return new GuiFurnace ( ( TileEntityFurnace ) tileEntity, new ContainerFurnace ( playerInventory, ( TileEntityFurnace ) tileEntity ) );

			case ENERGIZED_PULVERIZER:
				return new GuiPulverizer ( ( TileEntityPulverizer ) tileEntity, new ContainerPulverizer ( playerInventory, ( TileEntityPulverizer ) tileEntity ) );

			case GENERATOR:
				return new GuiGenerator ( ( TileEntityGenerator ) tileEntity, new ContainerGenerator ( playerInventory, ( TileEntityGenerator ) tileEntity ) );

			case POWER_BANK:
				return new GuiPowerBank ( ( TileEntityPowerBank ) tileEntity, new ContainerPowerBank ( playerInventory, ( TileEntityPowerBank ) tileEntity ) );

			default:
				return null;
		}
	}
}
