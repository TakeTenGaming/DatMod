package xlxacidxlx.datmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xlxacidxlx.datmod.proxy.CommonProxy;
import xlxacidxlx.datmod.register.*;

import java.io.File;

/**
 * Created by Acid on 10/20/2016.
 */
@Mod(modid = DatMod.MODID, version = DatMod.VERSION, name = DatMod.NAME, updateJSON = "http://raw.githubusercontent.com/xlxAciDxlx/DatMod/VERSION.md")
public class DatMod {
	public static final String MODID = "datmod";
	public static final String VERSION = "1.4.0";
	public static final String NAME = "DatMod";
	@Mod.Instance
	public static DatMod instance;
	public static Logger logger = LogManager.getLogger(DatMod.NAME);
	@SidedProxy(clientSide = "xlxacidxlx.datmod.proxy.ClientProxy", serverSide = "xlxacidxlx.datmod.proxy.CommonProxy")
	private static CommonProxy proxy;
	private static xlxacidxlx.datmod.creativetab.CreativeTabs creativeTabs;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		File configDir = new File(event.getModConfigurationDirectory() + "/" + DatMod.NAME);
		configDir.mkdirs();
		ConfigHandler.init(new File(configDir.getPath(), DatMod.NAME + ".cfg"));

		creativeTabs = new xlxacidxlx.datmod.creativetab.CreativeTabs();

		Items.preInit();
		Blocks.preInit();
		proxy.preInit(event);
		//NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		Events.init();
		Recipes.init();
		OreGen.init(event);
		Achievements.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		Commands.serverStarting(event);
	}
}
