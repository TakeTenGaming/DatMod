package taketengaming.datmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import taketengaming.datmod.compat.CompatHandler;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.datmod.proxy.CommonProxy;
import taketengaming.datmod.register.*;
import taketengaming.tencore.Logger;
import taketengaming.tencore.TenCore;
import taketengaming.tencore.VersionChecker;

import java.io.File;

/**
 * Created by Acid on 10/20/2016.
 */
@Mod( modid = DatMod.MODID, dependencies = "after:TenCore", name = DatMod.NAME, version = DatMod.VERSION )
public class DatMod
{
	public static final String MODID = "datmod";
	public static final String NAME = "DatMod";
	public static final String UPDATEURL = "https://raw.githubusercontent.com/TakeTenGaming/DatMod/master/VERSION.md";
	public static final String VERSION = "1.6.0";

	@Mod.Instance
	public static DatMod instance;

	public static Logger logger = new Logger ( DatMod.NAME );

	@SidedProxy( clientSide = "taketengaming.datmod.proxy.ClientProxy", serverSide = "taketengaming.datmod.proxy.CommonProxy" )
	private static CommonProxy proxy;

	private static CreativeTabs creativeTabs;

	@EventHandler
	public void preInit ( FMLPreInitializationEvent event )
	{
		// TODO: Move this to the TenCore Config handler once it's ready
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

		TenCore.addVersionChecker ( new VersionChecker ( DatMod.NAME, DatMod.VERSION, DatMod.UPDATEURL ) );
	}

	@EventHandler
	public void init ( FMLInitializationEvent event )
	{
		proxy.init ( event );
		Events.init ();
		Recipes.init ();
		OreGen.init ( event );
		Achievements.init ();
		CompatHandler.init ();

		logger.info ( "Hellooooo Minecraft!" );
	}

	@EventHandler
	public void postInit ( FMLPostInitializationEvent event )
	{
		proxy.postInit ( event );
	}

	@EventHandler
	public void serverStarting ( FMLServerStartingEvent event )
	{
		Commands.serverStarting ( event );
	}
}