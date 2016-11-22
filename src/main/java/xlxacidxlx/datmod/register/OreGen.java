package xlxacidxlx.datmod.register;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.OreGenerator;

/**
 * Created by Acid on 11/18/2016.
 */
public class OreGen {
	public static void init(FMLInitializationEvent event) {
		if (!ConfigHandler.enableOreGeneration) {
			DatMod.logger.info("Ore Generation disabled");
			return;
		}

		GameRegistry.registerWorldGenerator(new OreGenerator(), 1);
	}
}
