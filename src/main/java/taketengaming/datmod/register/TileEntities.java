package taketengaming.datmod.register;

import net.minecraftforge.fml.common.registry.GameRegistry;
import taketengaming.datmod.DatMod;
import taketengaming.datmod.machine.furnace.TileEntityFurnace;
import taketengaming.datmod.machine.generator.TileEntityGenerator;
import taketengaming.datmod.machine.powerbank.TileEntityPowerBank;
import taketengaming.datmod.machine.pulverizer.TileEntityPulverizer;

/**
 * Created by Acid on 12/2/2016.
 */
public class TileEntities
{
	public static void preInit ()
	{
		GameRegistry.registerTileEntity ( TileEntityFurnace.class, DatMod.MODID + "furnace" );
		GameRegistry.registerTileEntity ( TileEntityPulverizer.class, DatMod.MODID + "pulverizer" );
		GameRegistry.registerTileEntity ( TileEntityGenerator.class, DatMod.MODID + "generator" );
		GameRegistry.registerTileEntity ( TileEntityPowerBank.class, DatMod.MODID + "powerbank" );
	}
}
