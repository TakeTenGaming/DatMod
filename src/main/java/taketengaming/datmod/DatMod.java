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
import taketengaming.datmod.recipes.FurnaceRecipes;
import taketengaming.datmod.recipes.PulverizerRecipes;
import taketengaming.datmod.register.*;
import taketengaming.tencore.Logger;
import taketengaming.tencore.TenCore;

import java.io.File;

/**
 * Created by Acid on 10/20/2016.
 */
@Mod( acceptedMinecraftVersions = "[1.10,]", modid = DatMod.MODID, dependencies = "required-after:" + TenCore.MODID, name = DatMod.NAME, updateJSON = DatMod.UPDATEURL, version = DatMod
		.VERSION )
public class DatMod
{
	public static final String MODID = "datmod";
	public static final String NAME = "DatMod";
	public static final String UPDATEURL = "https://raw.githubusercontent.com/TakeTenGaming/DatMod/master/versions.json";
	public static final String VERSION = "2.0.0";

	@Mod.Instance
	public static DatMod instance;

	public static Logger logger = new Logger ( DatMod.NAME );

	@SidedProxy( clientSide = "taketengaming.datmod.proxy.ClientProxy", serverSide = "taketengaming.datmod.proxy.CommonProxy" )
	public static CommonProxy proxy;

	private static CreativeTabs creativeTabs;

	@EventHandler
	public void preInit ( FMLPreInitializationEvent event )
	{
		// TODO: Move this to the TenCore Config handler once it's ready
		File configDir = new File ( event.getModConfigurationDirectory () + "/" + DatMod.NAME );
		configDir.mkdirs ();
		ConfigHandler.init ( new File ( configDir.getPath (), DatMod.NAME + ".cfg" ) );

		creativeTabs = new CreativeTabs ();

		proxy.preInit ( event );

		Items.preInit ();
		Blocks.preInit ();
		TileEntities.preInit ();
		OreDictionary.preInit ();

		NetworkRegistry.INSTANCE.registerGuiHandler ( DatMod.instance, new GuiHandler () );
	}

	@EventHandler
	public void init ( FMLInitializationEvent event )
	{
		Events.init ();
		Recipes.init ();
		FurnaceRecipes.init ();
		PulverizerRecipes.init ();
		proxy.init ( event );
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
	public void serverStarting ( FMLServerStartingEvent event )
	{
		Commands.serverStarting ( event );
	}
}