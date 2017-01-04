package xlxacidxlx.datmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xlxacidxlx.datmod.compat.CompatHandler;
import xlxacidxlx.datmod.creativetab.CreativeTabs;
import xlxacidxlx.datmod.proxy.CommonProxy;
import xlxacidxlx.datmod.register.*;

import java.io.File;

/**
 * Created by Acid on 10/20/2016.
 */
@Mod( acceptedMinecraftVersions = "[1.9.4,1.10.2,1.11]", modid = DatMod.MODID, name = DatMod.NAME, updateJSON = "http://raw.githubusercontent.com/xlxAciDxlx/DatMod/VERSION.md", version = DatMod.VERSION )
public class DatMod
{
	private static CreativeTabs creativeTabs;

	@SidedProxy( clientSide = "xlxacidxlx.datmod.proxy.ClientProxy", serverSide = "xlxacidxlx.datmod.proxy.CommonProxy" )
	private static CommonProxy proxy;

	@Mod.Instance
	public static DatMod instance;

	public static final String MODID = "datmod";
	public static final String NAME = "DatMod";
	public static Logger logger = LogManager.getLogger ( DatMod.NAME );
	public static final String VERSION = "1.5.1";

	@EventHandler
	public void init ( FMLInitializationEvent event )
	{
		proxy.init ( event );
		Events.init ();
		Recipes.init ();
		OreGen.init ( event );
		Achievements.init ();
		CompatHandler.init ();
	}

	@EventHandler
	public void postInit ( FMLPostInitializationEvent event )
	{
		proxy.postInit ( event );
	}

	@EventHandler
	public void preInit ( FMLPreInitializationEvent event )
	{
		File configDir = new File ( event.getModConfigurationDirectory () + "/" + DatMod.NAME );
		configDir.mkdirs ();
		ConfigHandler.init ( new File ( configDir.getPath (), DatMod.NAME + ".cfg" ) );

		creativeTabs = new CreativeTabs ();

		Items.preInit ();
		Blocks.preInit ();
		TileEntities.preInit ();
		OreDictionary.preInit ();
		proxy.preInit ( event );

		NetworkRegistry.INSTANCE.registerGuiHandler ( DatMod.instance, new GuiHandler () );
	}

	@EventHandler
	public void serverStarting ( FMLServerStartingEvent event )
	{
		Commands.serverStarting ( event );
	}
}
