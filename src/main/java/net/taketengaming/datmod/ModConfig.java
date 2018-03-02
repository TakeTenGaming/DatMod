package net.taketengaming.datmod;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.minecraftforge.common.config.Config.RangeDouble;
import static net.minecraftforge.common.config.Config.RangeInt;
import static net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import static net.taketengaming.datmod.DatMod.*;

@EventBusSubscriber( modid = MODID )
public class ModConfig
{
	public static void sync ()
	{
		ConfigManager.sync ( MODID, Config.Type.INSTANCE );
	}

	@SubscribeEvent
	public static void onConfigChanged ( OnConfigChangedEvent event )
	{
		if ( event.getModID ().equals ( MODID ) )
		{
			sync ();
		}
	}

	@Config( modid = MODID, name = MODID + "/config", category = "" )
	public static class General
	{
		public static final Global global = new Global ();

		public static class Global
		{
			@Comment( "The version of " + NAME + " used to generate this config" )
			public String version = VERSION;
		}
	}

	@Config( category = "", modid = MODID, name = MODID + "/armors" )
	public static class Armors
	{
		public static final Global global = new Global ();

		public static class Global
		{
			@Comment( "Enable all Armors?" )
			public boolean enableAll = true;

			@Comment( "Enable Coal Armor?" )
			public boolean enableCoal = true;

			@Comment( "Enable Diamondium Armor?" )
			public boolean enableDiamondium = true;

			@Comment( "Enable Emeraldi Armor?" )
			public boolean enableEmeraldi = true;

			@Comment( "Enable Goldirite Armor?" )
			public boolean enableGoldirite = true;

			@Comment( "Enable Ironium Armor?" )
			public boolean enableIronium = true;

			@Comment( "Enable Lapis Lazuli Armor?" )
			public boolean enableLapisLazuli = true;

			@Comment( "Enable Nether Quartz Armor?" )
			public boolean enableNetherQuartz = true;

			@Comment( "Enable Redstone Armor?" )
			public boolean enableRedstone = true;

			@Comment( "Enable Ultimate Armor?" )
			public boolean enableUltimate = true;
		}
	}

	@Config( category = "", modid = MODID, name = MODID + "/magnet" )
	public static class Magnet
	{
		public static final Global global = new Global ();

		public static class Global
		{
			@Comment( "Enable Magnet?" )
			public boolean enabled = true;

			@Comment( { "Should the Magnet pull items/XP into the player?", "Disable this if you like seeing items/XP move across the ground" } )
			public boolean pullToInventory = true;

			@Comment( { "How far away should the Magnet try to pickup items/XP from?", "Default: 12" } )
			@RangeInt( min = 5, max = 30 )
			public int range = 12;

			@Comment( { "How fast should the Magnet pull items/XP towards the player?", "Default: 0.03" } )
			@RangeDouble( min = 0.03, max = 0.08 )
			public double speed = 0.03;
		}
	}

	@Config( category = "", modid = MODID, name = MODID + "/oregen" )
	public static class Oregen
	{
		public static final Dimensions dimensions = new Dimensions ();
		public static final Global global = new Global ();

		public static class Dimensions
		{
			@Comment( "Enable The End generation?" )
			public boolean enableEnd = true;

			@Comment( "Enable Nether generation?" )
			public boolean enableNether = true;

			@Comment( "Enable Overworld generation?" )
			public boolean enableOverworld = true;
		}

		public static class Global
		{
			@Comment( "Enable all Ore Generation?" )
			public boolean enableAll = true;

			@Comment( "Enable Diamondium Generation?" )
			public boolean enableDiamondium = true;

			@Comment( "Enable Emeraldi Generation?" )
			public boolean enableEmeraldi = true;

			@Comment( "Enable Goldirite Generation?" )
			public boolean enableGoldirite = true;

			@Comment( "Enable Ironium Generation?" )
			public boolean enableIronium = true;
		}
	}

	@Config( category = "", modid = MODID, name = MODID + "/tools" )
	public static class Tools
	{
		public static final Global global = new Global ();

		public static class Global
		{
			@Comment( "Enable all Tools?" )
			public boolean enableAll = true;

			@Comment( "Enable Coal Tools?" )
			public boolean enableCoal = true;

			@Comment( "Enable Diamondium Tools?" )
			public boolean enableDiamondium = true;

			@Comment( "Enable Emeraldi Tools?" )
			public boolean enableEmeraldi = true;

			@Comment( "Enable Goldirite Tools?" )
			public boolean enableGoldirite = true;

			@Comment( "Enable Ironium Tools?" )
			public boolean enableIronium = true;

			@Comment( "Enable Lapis Lazuli Tools?" )
			public boolean enableLapisLazuli = true;

			@Comment( "Enable Nether Quartz Tools?" )
			public boolean enableNetherQuartz = true;

			@Comment( "Enable Redstone Tools?" )
			public boolean enableRedstone = true;

			@Comment( "Enable Ultimate Tools?" )
			public boolean enableUltimate = true;
		}
	}
}

