package taketengaming.datmod;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Acid on 10/26/2016.
 */
public class ConfigHandler
{
	private static Configuration config;

	public static boolean enableDiamondiumTools;
	public static boolean enableEmeraldiTools;
	public static boolean enableGoldiriteTools;
	public static boolean enableIroniumTools;
	public static boolean enableLapisLazuliTools;

	public static boolean enableOreGeneration;
	public static boolean enableOreGenerationDiamondium;
	public static boolean enableOreGenerationEmeraldi;
	public static boolean enableOreGenerationGoldirite;
	public static boolean enableOreGenerationIronium;

	public static boolean enableRedstoneTools;
	public static boolean enableRottenFleshToLeatherRecipe;
	public static boolean enableTools;
	public static boolean enableWelcomeMessage;
	public static boolean enableWelcomeMessageFirstJoinOnly;

	public static boolean giveMagnet;
	public static boolean giveMagnetFirstJoinOnly;

	public static int magnetRadius;
	public static boolean magnetRequiresEnergy;

	public static boolean mobsDropBones;

	public static void init ( File file )
	{
		config = new Configuration ( file );
		syncConfig ();
	}

	private static void syncConfig ()
	{
		String category;

		category = "General";
		config.addCustomCategoryComment ( category, "Settings that don't fit into a particular group." );
		enableWelcomeMessage = config.getBoolean ( "enableWelcomeMessage", category, true, "Should the \"welcome\" message be displayed on world join?" );
		enableWelcomeMessageFirstJoinOnly = config.getBoolean ( "enableWelcomeMessageFirstJoinOnly", category, true, "Should the \"welcome\" message only be shown once?" );
		giveMagnet = config.getBoolean ( "giveMagnet", category, false, "Should the magnet be given to players?" );
		giveMagnetFirstJoinOnly = config.getBoolean ( "giveMagnetFirstJoinOnly", category, true, "Should the magnet only be given on first join?" );
		mobsDropBones = config.getBoolean ( "mobsDropBones", category, true, "Should mobs drop 1-4 bones upon death?" );

		category = "Magnet";
		config.addCustomCategoryComment ( category, "Settings related to the magnet." );
		magnetRadius = config.getInt ( "magnetRadius", category, 8, 2, 16, "Sets the radius the magnet will pull items/XP from" );
		magnetRequiresEnergy = config.getBoolean ( "magnetRequiresEnergy", category, false, "Toggles the magnet requiring energy to function" );

		category = "Ores";
		config.addCustomCategoryComment ( category, "Settings related to ore generation." );
		enableOreGeneration = config.getBoolean ( "enableOreGeneration", category, true, "Toggles ore generation" );
		enableOreGenerationDiamondium = config.getBoolean ( "enableOreGenerationDiamondium", category, true, "Toggles Diamondium generation" );
		enableOreGenerationEmeraldi = config.getBoolean ( "enableOreGenerationEmeraldi", category, true, "Toggles Emeraldi generation" );
		enableOreGenerationGoldirite = config.getBoolean ( "enableOreGenerationGoldirite", category, true, "Toggles Goldirite generation" );
		enableOreGenerationIronium = config.getBoolean ( "enableOreGenerationIronium", category, true, "Toggles Ironium generation" );

		category = "Recipes";
		config.addCustomCategoryComment ( category, "Settings related to recipes." );
		enableRottenFleshToLeatherRecipe = config.getBoolean ( "enableRottenFleshToLeatherRecipe", category, true, "Toggles rotten flesh->leather smelting recipe" );

		category = "Tools";
		config.addCustomCategoryComment ( category, "Settings related to tools." );
		enableTools = config.getBoolean ( "enableTools", category, true, "Toggles all tools" );
		enableDiamondiumTools = config.getBoolean ( "enableDiamondiumTools", category, true, "Toggles Diamondium tools" );
		enableEmeraldiTools = config.getBoolean ( "enableEmeraldiTools", category, true, "Toggles Emeraldi tools" );
		enableGoldiriteTools = config.getBoolean ( "enableGoldiriteTools", category, true, "Toggles Goldirite tools" );
		enableIroniumTools = config.getBoolean ( "enableIroniumTools", category, true, "Toggles Ironium tools" );
		enableLapisLazuliTools = config.getBoolean ( "enableLapisLazuliTools", category, true, "Toggles Lapis Lazuli tools" );
		enableRedstoneTools = config.getBoolean ( "enableRedstoneTools", category, true, "Toggles Redstone tools" );

		config.save ();
	}
}