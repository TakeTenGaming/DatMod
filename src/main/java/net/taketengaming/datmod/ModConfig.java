package net.taketengaming.datmod;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.RangeInt;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.taketengaming.datmod.DatMod.*;

@Mod.EventBusSubscriber( modid = MODID )
public class ModConfig
{
	public static void sync ()
	{
		ConfigManager.sync ( MODID, Config.Type.INSTANCE );
	}

	@SubscribeEvent
	public static void onConfigChanged ( ConfigChangedEvent.OnConfigChangedEvent event )
	{
		if ( event.getModID ().equals ( MODID ) )
		{
			sync ();
		}
	}

	@Config( modid = MODID, name = MODID + "/config", category = "" )
	public static class Main
	{
		public static final _General _general = new _General ();

		public static class _General
		{
			@Comment( { "The version of " + NAME + " used to generate this config" } )
			public String version = VERSION;
		}
	}

	@Config( modid = MODID, name = MODID + "/armors", category = "" )
	public static class Armors
	{
		public static final _General _general = new _General ();
		public static final Coal coal = new Coal ();
		public static final Diamondium diamondium = new Diamondium ();
		public static final Emeraldi emeraldi = new Emeraldi ();
		public static final Goldirite goldirite = new Goldirite ();
		public static final Ironium ironium = new Ironium ();
		public static final LapisLazuli lapisLazuli = new LapisLazuli ();
		public static final NetherQuartz netherQuartz = new NetherQuartz ();
		public static final Redstone redstone = new Redstone ();

		public static class _General
		{
			@Comment( { "Enable all armors?" } )
			public boolean enabled = true;
		}

		public static class Coal
		{
			@Comment( { "Enable Coal armors?" } )
			public boolean enabled = true;
		}

		public static class Diamondium
		{
			@Comment( { "Enable Diamondium armors?" } )
			public boolean enabled = true;
		}

		public static class Emeraldi
		{
			@Comment( { "Enable Emeraldi armors?" } )
			public boolean enabled = true;
		}

		public static class Goldirite
		{
			@Comment( { "Enable Goldirite armors?" } )
			public boolean enabled = true;
		}

		public static class Ironium
		{
			@Comment( { "Enable Ironium armors?" } )
			public boolean enabled = true;
		}

		public static class LapisLazuli
		{
			@Comment( { "Enable Lapis Lazuli armors?" } )
			public boolean enabled = true;
		}

		public static class NetherQuartz
		{
			@Comment( { "Enable Nether Quartz armors?" } )
			public boolean enabled = true;
		}

		public static class Redstone
		{
			@Comment( { "Enable Redstone armors?" } )
			public boolean enabled = true;
		}
	}

	@Config( modid = MODID, name = MODID + "/magnet", category = "" )
	public static class Magnet
	{
		public static final _General _general = new _General ();
		public static final Range range = new Range ();

		public static class _General
		{
			@Comment( { "Enable Magnet?" } )
			public boolean enabled = true;
		}

		public static class Range
		{
			@Comment( { "The range the magnet should try to pick up items" } )
			@RangeInt( min = 10, max = 20 )
			public int range = 10;
		}
	}

	@Config( modid = MODID, name = MODID + "/tools", category = "" )
	public static class Tools
	{
		public static final _General _general = new _General ();
		public static final Coal coal = new Coal ();
		public static final Diamondium diamondium = new Diamondium ();
		public static final Emeraldi emeraldi = new Emeraldi ();
		public static final Goldirite goldirite = new Goldirite ();
		public static final Ironium ironium = new Ironium ();
		public static final LapisLazuli lapisLazuli = new LapisLazuli ();
		public static final NetherQuartz netherQuartz = new NetherQuartz ();
		public static final Redstone redstone = new Redstone ();
		public static final Ultimate ultimate = new Ultimate ();

		public static class _General
		{
			@Comment( { "Enable all tools?" } )
			public boolean enabled = true;
		}

		public static class Coal
		{
			@Comment( { "Enable Coal tools?" } )
			public boolean enabled = true;
		}

		public static class Diamondium
		{
			@Comment( { "Enable Diamondium tools?" } )
			public boolean enabled = true;
		}

		public static class Emeraldi
		{
			@Comment( { "Enable Emeraldi tools?" } )
			public boolean enabled = true;
		}

		public static class Goldirite
		{
			@Comment( { "Enable Goldirite tools?" } )
			public boolean enabled = true;
		}

		public static class Ironium
		{
			@Comment( { "Enable Ironium tools?" } )
			public boolean enabled = true;
		}

		public static class LapisLazuli
		{
			@Comment( { "Enable Lapis Lazuli tools?" } )
			public boolean enabled = true;
		}

		public static class NetherQuartz
		{
			@Comment( { "Enable Nether Quartz tools?" } )
			public boolean enabled = true;
		}

		public static class Redstone
		{
			@Comment( { "Enable Redstone tools?" } )
			public boolean enabled = true;
		}

		public static class Ultimate
		{
			@Comment( { "Enable Ultimate tools?" } )
			public boolean enabled = true;
		}
	}

	@Config( modid = MODID, name = MODID + "/worldgen", category = "" )
	public static class Worldgen
	{
		public static final _General _general = new _General ();
		public static final Oregen Oregen = new Oregen ();

		public static class _General
		{
			@Comment( { "Enable all World Generation?" } )
			public boolean enabled = true;
		}

		public static class Oregen
		{
			@Comment( { "Enable Diamondium Generation?" } )
			public boolean enableDiamondiumWorldgen = true;

			@Comment( { "Enable Emeraldi Generation?" } )
			public boolean enableEmeraldiWorldgen = true;

			@Comment( { "Enable Goldirite Generation?" } )
			public boolean enableGoldiriteWorldgen = true;

			@Comment( { "Enable Ironium Generation?" } )
			public boolean enableIroniumWorldgen = true;
		}
	}
}
