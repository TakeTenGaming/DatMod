package net.taketengaming.datmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLModDisabledEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.taketengaming.datmod.command.CommandProfiler;
import net.taketengaming.datmod.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod( modid = DatMod.MODID, name = DatMod.NAME, version = DatMod.VERSION )
public class DatMod
{
	public static final String MODID = "datmod";
	public static final String NAME = "DatMod";
	public static final String PROXY_CLIENT = "net.taketengaming.datmod.proxy.ClientProxy";
	public static final String PROXY_SERVER = "net.taketengaming.datmod.proxy.ServerProxy";
	public static final String VERSION = "3.0.3";

	@Mod.Instance
	public static DatMod instance;

	@SidedProxy( serverSide = PROXY_SERVER, clientSide = PROXY_CLIENT )
	public static CommonProxy proxy;

	public static final CreativeTab creativeTab = new CreativeTab ();
	public static Logger logger = LogManager.getLogger ( NAME );

	@EventHandler
	public void disabled ( FMLModDisabledEvent event )
	{
		logEventStart ( "disabled" );
		logger.info ( "Mod is disabled, nothing to see here.. Move along!" );
		logEventEnd ( "disabled" );
	}

	@EventHandler
	public void preInit ( FMLPreInitializationEvent event )
	{
		logEventStart ( "preInit" );

		logger.info ( "Register World Generator.." );
		GameRegistry.registerWorldGenerator ( new WorldGen (), 3 );

		logger.info ( "Registering GUI Handler.." );
		//NetworkRegistry.INSTANCE.registerGuiHandler ( this, new GuiHandler () );

		logger.info ( "Registering renderers.." );
		proxy.registerRenderers ();

		logEventEnd ( "preInit" );
	}

	@EventHandler
	public void init ( FMLInitializationEvent event )
	{
		logEventStart ( "init" );

		logger.info ( "Initializing recipes.." );
		ModRecipes.init ();

		logEventEnd ( "init" );
	}

	public static void logEventStart ( String event )
	{
		logger.info ( "============[ " + event + " ]============" );
	}

	public static void logEventEnd ( String event )
	{
		logger.info ( "============[ /" + event + " ]============" );
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler
	{
		@SubscribeEvent
		public static void registerItems ( RegistryEvent.Register< Item > event )
		{
			ModItems.register ( event.getRegistry () );
			ModBlocks.registerItemBlocks ( event.getRegistry () );
		}

		@SubscribeEvent
		public static void registerBlocks ( RegistryEvent.Register< Block > event )
		{
			ModBlocks.register ( event.getRegistry () );
		}

		@SubscribeEvent
		public static void registerModels ( ModelRegistryEvent event )
		{
			ModItems.registerModels ();
			ModBlocks.registerModels ();
		}
	}

	@EventHandler
	public void serverStarting ( FMLServerStartingEvent event )
	{
		logEventStart ( "serverStarting" );

		logger.info ( "Registering commands.." );
		event.registerServerCommand ( new CommandProfiler () );

		logEventEnd ( "serverStarting" );
	}
}
