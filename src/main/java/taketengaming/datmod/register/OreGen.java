package taketengaming.datmod.register;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import taketengaming.datmod.ConfigHandler;
import taketengaming.datmod.DatMod;
import taketengaming.datmod.OreGenerator;

/**
 * Created by Acid on 11/18/2016.
 */
public class OreGen
{
	public static void init ( FMLInitializationEvent event )
	{
		if ( !ConfigHandler.enableOreGeneration )
		{
			DatMod.logger.info ( "Ore Generation disabled" );
			return;
		}

		GameRegistry.registerWorldGenerator ( new OreGenerator (), 1 );
	}
}
