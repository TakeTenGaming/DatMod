package xlxacidxlx.datmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.OreGenerator;

/**
 * Created by Acid on 10/26/2016.
 */
public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
	}

	public void init(FMLInitializationEvent event) {
		if (ConfigHandler.enableOreGeneration) {
			GameRegistry.registerWorldGenerator(new OreGenerator(), 0);
		}
	}

	public void postInit(FMLPostInitializationEvent event) {
	}
}
