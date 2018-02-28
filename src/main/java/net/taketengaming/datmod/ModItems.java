package net.taketengaming.datmod;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.taketengaming.datmod.item.ItemMagnet;
import net.taketengaming.datmod.item.armor.*;
import net.taketengaming.datmod.item.tool.*;
import net.taketengaming.datmod.util.ItemBase;

import java.util.ArrayList;

public class ModItems
{
	// Config Holders
	// Armors
	public static boolean enableAllArmors = ModConfig.Armors._general.enabled;
	public static boolean enableCoalArmors = ModConfig.Armors.coal.enabled;
	public static boolean enableDiamondiumArmors = ModConfig.Armors.diamondium.enabled;
	public static boolean enableEmeraldiArmors = ModConfig.Armors.emeraldi.enabled;
	public static boolean enableGoldiriteArmors = ModConfig.Armors.goldirite.enabled;
	public static boolean enableIroniumArmors = ModConfig.Armors.ironium.enabled;
	public static boolean enableLapisLazuliArmors = ModConfig.Armors.lapisLazuli.enabled;
	public static boolean enableNetherQuartzArmors = ModConfig.Armors.netherQuartz.enabled;
	public static boolean enableRedstoneArmors = ModConfig.Armors.redstone.enabled;

	// Tools
	public static boolean enableAllTools = ModConfig.Tools._general.enabled;
	public static boolean enableCoalTools = ModConfig.Tools.coal.enabled;
	public static boolean enableDiamondiumTools = ModConfig.Tools.diamondium.enabled;
	public static boolean enableEmeraldiTools = ModConfig.Tools.emeraldi.enabled;
	public static boolean enableGoldiriteTools = ModConfig.Tools.goldirite.enabled;
	public static boolean enableIroniumTools = ModConfig.Tools.ironium.enabled;
	public static boolean enableLapisLazuliTools = ModConfig.Tools.lapisLazuli.enabled;
	public static boolean enableMagnet = ModConfig.Magnet._general.enabled;
	public static boolean enableNetherQuartzTools = ModConfig.Tools.netherQuartz.enabled;
	public static boolean enableRedstoneTools = ModConfig.Tools.redstone.enabled;
	public static boolean enableUltimateTools = ModConfig.Tools.ultimate.enabled;

	// Items
	public static ToolCoalAxe coalAxe = new ToolCoalAxe ();
	public static ArmorCoalBoots coalBoots = new ArmorCoalBoots ();
	public static ArmorCoalChestplate coalChestplate = new ArmorCoalChestplate ();
	public static ArmorCoalHelmet coalHelmet = new ArmorCoalHelmet ();
	public static ToolCoalHoe coalHoe = new ToolCoalHoe ();
	public static ArmorCoalLeggings coalLeggings = new ArmorCoalLeggings ();
	public static ToolCoalPickaxe coalPickaxe = new ToolCoalPickaxe ();
	public static ToolCoalShovel coalShovel = new ToolCoalShovel ();
	public static ToolCoalSword coalSword = new ToolCoalSword ();

	public static ItemBase diamondium = new ItemBase ( "diamondium" );
	public static ToolDiamondiumAxe diamondiumAxe = new ToolDiamondiumAxe ();
	public static ArmorDiamondiumBoots diamondiumBoots = new ArmorDiamondiumBoots ();
	public static ArmorDiamondiumChestplate diamondiumChestplate = new ArmorDiamondiumChestplate ();
	public static ArmorDiamondiumHelmet diamondiumHelmet = new ArmorDiamondiumHelmet ();
	public static ToolDiamondiumHoe diamondiumHoe = new ToolDiamondiumHoe ();
	public static ArmorDiamondiumLeggings diamondiumLeggings = new ArmorDiamondiumLeggings ();
	public static ToolDiamondiumPickaxe diamondiumPickaxe = new ToolDiamondiumPickaxe ();
	public static ToolDiamondiumShovel diamondiumShovel = new ToolDiamondiumShovel ();
	public static ToolDiamondiumSword diamondiumSword = new ToolDiamondiumSword ();

	public static ItemBase emeraldi = new ItemBase ( "emeraldi" );
	public static ToolEmeraldiAxe emeraldiAxe = new ToolEmeraldiAxe ();
	public static ArmorEmeraldiBoots emeraldiBoots = new ArmorEmeraldiBoots ();
	public static ArmorEmeraldiChestplate emeraldiChestplate = new ArmorEmeraldiChestplate ();
	public static ArmorEmeraldiHelmet emeraldiHelmet = new ArmorEmeraldiHelmet ();
	public static ToolEmeraldiHoe emeraldiHoe = new ToolEmeraldiHoe ();
	public static ArmorEmeraldiLeggings emeraldiLeggings = new ArmorEmeraldiLeggings ();
	public static ToolEmeraldiPickaxe emeraldiPickaxe = new ToolEmeraldiPickaxe ();
	public static ToolEmeraldiShovel emeraldiShovel = new ToolEmeraldiShovel ();
	public static ToolEmeraldiSword emeraldiSword = new ToolEmeraldiSword ();

	public static ToolGoldiriteAxe goldiriteAxe = new ToolGoldiriteAxe ();
	public static ArmorGoldiriteBoots goldiriteBoots = new ArmorGoldiriteBoots ();
	public static ArmorGoldiriteChestplate goldiriteChestplate = new ArmorGoldiriteChestplate ();
	public static ArmorGoldiriteHelmet goldiriteHelmet = new ArmorGoldiriteHelmet ();
	public static ToolGoldiriteHoe goldiriteHoe = new ToolGoldiriteHoe ();
	public static ItemBase goldiriteIngot = new ItemBase ( "goldirite_ingot" );
	public static ArmorGoldiriteLeggings goldiriteLeggings = new ArmorGoldiriteLeggings ();
	public static ToolGoldiritePickaxe goldiritePickaxe = new ToolGoldiritePickaxe ();
	public static ToolGoldiriteShovel goldiriteShovel = new ToolGoldiriteShovel ();
	public static ToolGoldiriteSword goldiriteSword = new ToolGoldiriteSword ();

	public static ToolIroniumAxe ironiumAxe = new ToolIroniumAxe ();
	public static ArmorIroniumBoots ironiumBoots = new ArmorIroniumBoots ();
	public static ArmorIroniumChestplate ironiumChestplate = new ArmorIroniumChestplate ();
	public static ArmorIroniumHelmet ironiumHelmet = new ArmorIroniumHelmet ();
	public static ToolIroniumHoe ironiumHoe = new ToolIroniumHoe ();
	public static ItemBase ironiumIngot = new ItemBase ( "ironium_ingot" );
	public static ArmorIroniumLeggings ironiumLeggings = new ArmorIroniumLeggings ();
	public static ToolIroniumShovel ironiumShovel = new ToolIroniumShovel ();
	public static ToolIroniumPickaxe ironiumPickaxe = new ToolIroniumPickaxe ();
	public static ToolIroniumSword ironiumSword = new ToolIroniumSword ();

	public static ToolLapisLazuliAxe lapisLazuliAxe = new ToolLapisLazuliAxe ();
	public static ArmorLapisLazuliBoots lapisLazuliBoots = new ArmorLapisLazuliBoots ();
	public static ArmorLapisLazuliChestplate lapisLazuliChestplate = new ArmorLapisLazuliChestplate ();
	public static ArmorLapisLazuliHelmet lapisLazuliHelmet = new ArmorLapisLazuliHelmet ();
	public static ToolLapisLazuliHoe lapisLazuliHoe = new ToolLapisLazuliHoe ();
	public static ArmorLapisLazuliLeggings lapisLazuliLeggings = new ArmorLapisLazuliLeggings ();
	public static ToolLapisLazuliPickaxe lapisLazuliPickaxe = new ToolLapisLazuliPickaxe ();
	public static ToolLapisLazuliShovel lapisLazuliShovel = new ToolLapisLazuliShovel ();
	public static ToolLapisLazuliSword lapisLazuliSword = new ToolLapisLazuliSword ();

	public static ItemMagnet magnet = new ItemMagnet ();

	public static ToolNetherQuartzAxe netherQuartzAxe = new ToolNetherQuartzAxe ();
	public static ArmorNetherQuartzBoots netherQuartzBoots = new ArmorNetherQuartzBoots ();
	public static ArmorNetherQuartzChestplate netherQuartzChestplate = new ArmorNetherQuartzChestplate ();
	public static ArmorNetherQuartzHelmet netherQuartzHelmet = new ArmorNetherQuartzHelmet ();
	public static ToolNetherQuartzHoe netherQuartzHoe = new ToolNetherQuartzHoe ();
	public static ArmorNetherQuartzLeggings netherQuartzLeggings = new ArmorNetherQuartzLeggings ();
	public static ToolNetherQuartzPickaxe netherQuartzPickaxe = new ToolNetherQuartzPickaxe ();
	public static ToolNetherQuartzShovel netherQuartzShovel = new ToolNetherQuartzShovel ();
	public static ToolNetherQuartzSword netherQuartzSword = new ToolNetherQuartzSword ();

	public static ToolRedstoneAxe redstoneAxe = new ToolRedstoneAxe ();
	public static ArmorRedstoneBoots redstoneBoots = new ArmorRedstoneBoots ();
	public static ArmorRedstoneChestplate redstoneChestplate = new ArmorRedstoneChestplate ();
	public static ArmorRedstoneHelmet redstoneHelmet = new ArmorRedstoneHelmet ();
	public static ToolRedstoneHoe redstoneHoe = new ToolRedstoneHoe ();
	public static ArmorRedstoneLeggings redstoneLeggings = new ArmorRedstoneLeggings ();
	public static ToolRedstonePickaxe redstonePickaxe = new ToolRedstonePickaxe ();
	public static ToolRedstoneShovel redstoneShovel = new ToolRedstoneShovel ();
	public static ToolRedstoneSword redstoneSword = new ToolRedstoneSword ();

	public static ToolUltimatePickaxe ultimatePickaxe = new ToolUltimatePickaxe ();

	public static void initOreDict ()
	{
		if ( enableAllArmors && enableAllTools )
		{
			diamondium.initOreDict ();
			emeraldi.initOreDict ();
			goldiriteIngot.initOreDict ();
			ironiumIngot.initOreDict ();
		}
		else
		{
			if ( enableDiamondiumTools )
			{
				diamondium.initOreDict ();
			}

			if ( enableEmeraldiTools )
			{
				emeraldi.initOreDict ();
			}

			if ( enableGoldiriteTools )
			{
				goldiriteIngot.initOreDict ();
			}

			if ( enableIroniumTools )
			{
				ironiumIngot.initOreDict ();
			}
		}
	}

	public static void register ( IForgeRegistry< Item > registry )
	{
		if ( enableAllArmors && enableAllTools )
		{
			registry.registerAll (
					coalAxe,
					coalBoots,
					coalChestplate,
					coalHelmet,
					coalHoe,
					coalLeggings,
					coalPickaxe,
					coalShovel,
					coalSword,

					diamondium,
					diamondiumAxe,
					diamondiumBoots,
					diamondiumChestplate,
					diamondiumHelmet,
					diamondiumHoe,
					diamondiumLeggings,
					diamondiumPickaxe,
					diamondiumShovel,
					diamondiumSword,

					emeraldi,
					emeraldiAxe,
					emeraldiBoots,
					emeraldiChestplate,
					emeraldiHelmet,
					emeraldiHoe,
					emeraldiLeggings,
					emeraldiPickaxe,
					emeraldiShovel,
					emeraldiSword,

					goldiriteAxe,
					goldiriteBoots,
					goldiriteChestplate,
					goldiriteHelmet,
					goldiriteHoe,
					goldiriteIngot,
					goldiriteLeggings,
					goldiritePickaxe,
					goldiriteShovel,
					goldiriteSword,

					ironiumAxe,
					ironiumBoots,
					ironiumChestplate,
					ironiumHelmet,
					ironiumHoe,
					ironiumIngot,
					ironiumLeggings,
					ironiumPickaxe,
					ironiumShovel,
					ironiumSword,

					lapisLazuliAxe,
					lapisLazuliBoots,
					lapisLazuliChestplate,
					lapisLazuliHelmet,
					lapisLazuliHoe,
					lapisLazuliLeggings,
					lapisLazuliPickaxe,
					lapisLazuliShovel,
					lapisLazuliSword,

					magnet,

					netherQuartzAxe,
					netherQuartzBoots,
					netherQuartzChestplate,
					netherQuartzHelmet,
					netherQuartzHoe,
					netherQuartzLeggings,
					netherQuartzPickaxe,
					netherQuartzShovel,
					netherQuartzSword,

					redstoneAxe,
					redstoneBoots,
					redstoneChestplate,
					redstoneHelmet,
					redstoneHoe,
					redstoneLeggings,
					redstonePickaxe,
					redstoneShovel,
					redstoneSword,

					ultimatePickaxe
			);
		}
		else
		{
			ArrayList< Item > registerableItems = new ArrayList<> ();

			// Coal
			if ( enableCoalArmors )
			{
				registerableItems.add ( coalBoots );
				registerableItems.add ( coalChestplate );
				registerableItems.add ( coalHelmet );
				registerableItems.add ( coalLeggings );
			}

			if ( enableCoalTools )
			{
				registerableItems.add ( coalAxe );
				registerableItems.add ( coalHoe );
				registerableItems.add ( coalPickaxe );
				registerableItems.add ( coalShovel );
				registerableItems.add ( coalSword );
			}

			// Diamondium
			if ( enableDiamondiumArmors || enableDiamondiumTools )
			{
				registerableItems.add ( diamondium );
			}

			if ( enableDiamondiumArmors )
			{
				registerableItems.add ( diamondiumBoots );
				registerableItems.add ( diamondiumChestplate );
				registerableItems.add ( diamondiumHelmet );
				registerableItems.add ( diamondiumLeggings );
			}

			if ( enableDiamondiumTools )
			{
				registerableItems.add ( diamondiumAxe );
				registerableItems.add ( diamondiumHoe );
				registerableItems.add ( diamondiumPickaxe );
				registerableItems.add ( diamondiumShovel );
				registerableItems.add ( diamondiumSword );
			}

			// Emeraldi
			if ( enableEmeraldiArmors || enableEmeraldiTools )
			{
				registerableItems.add ( emeraldi );
			}

			if ( enableEmeraldiArmors )
			{
				registerableItems.add ( emeraldiBoots );
				registerableItems.add ( emeraldiChestplate );
				registerableItems.add ( emeraldiHelmet );
				registerableItems.add ( emeraldiLeggings );
			}

			if ( enableDiamondiumTools )
			{
				registerableItems.add ( emeraldiAxe );
				registerableItems.add ( emeraldiHoe );
				registerableItems.add ( emeraldiPickaxe );
				registerableItems.add ( emeraldiShovel );
				registerableItems.add ( emeraldiSword );
			}

			// Goldirite
			if ( enableGoldiriteArmors || enableGoldiriteTools )
			{
				registerableItems.add ( goldiriteIngot );
			}

			if ( enableGoldiriteArmors )
			{
				registerableItems.add ( goldiriteBoots );
				registerableItems.add ( goldiriteChestplate );
				registerableItems.add ( goldiriteHelmet );
				registerableItems.add ( goldiriteLeggings );
			}

			if ( enableGoldiriteTools )
			{
				registerableItems.add ( goldiriteAxe );
				registerableItems.add ( goldiriteHoe );
				registerableItems.add ( goldiritePickaxe );
				registerableItems.add ( goldiriteShovel );
				registerableItems.add ( goldiriteSword );
			}

			// Lapis Lazuli
			if ( enableLapisLazuliArmors )
			{
				registerableItems.add ( lapisLazuliBoots );
				registerableItems.add ( lapisLazuliChestplate );
				registerableItems.add ( lapisLazuliHelmet );
				registerableItems.add ( lapisLazuliLeggings );
			}

			if ( enableLapisLazuliTools )
			{
				registerableItems.add ( lapisLazuliAxe );
				registerableItems.add ( lapisLazuliHoe );
				registerableItems.add ( lapisLazuliPickaxe );
				registerableItems.add ( lapisLazuliShovel );
				registerableItems.add ( lapisLazuliSword );
			}

			// Magnet
			if ( enableMagnet && enableIroniumTools )
			{
				registerableItems.add ( magnet );
			}

			// Nether Quartz
			if ( enableNetherQuartzArmors )
			{
				registerableItems.add ( netherQuartzBoots );
				registerableItems.add ( netherQuartzChestplate );
				registerableItems.add ( netherQuartzHelmet );
				registerableItems.add ( netherQuartzLeggings );
			}

			if ( enableNetherQuartzTools )
			{
				registerableItems.add ( netherQuartzAxe );
				registerableItems.add ( netherQuartzHoe );
				registerableItems.add ( netherQuartzPickaxe );
				registerableItems.add ( netherQuartzShovel );
				registerableItems.add ( netherQuartzSword );
			}

			// Redstone
			if ( enableRedstoneArmors )
			{
				registerableItems.add ( redstoneBoots );
				registerableItems.add ( redstoneChestplate );
				registerableItems.add ( redstoneHelmet );
				registerableItems.add ( redstoneLeggings );
			}

			if ( enableRedstoneTools )
			{
				registerableItems.add ( redstoneAxe );
				registerableItems.add ( redstoneHoe );
				registerableItems.add ( redstonePickaxe );
				registerableItems.add ( redstoneShovel );
				registerableItems.add ( redstoneSword );
			}

			// Ultimate
			if ( ( enableDiamondiumTools && enableEmeraldiTools && enableIroniumTools ) && enableUltimateTools )
			{
				registerableItems.add ( ultimatePickaxe );
			}

			for ( Item item : registerableItems )
			{
				registry.register ( item );
			}
		}
	}

	public static void registerModels ()
	{
		if ( enableAllArmors && enableAllTools )
		{
			coalAxe.registerItemModel ();
			coalBoots.registerItemModel ();
			coalChestplate.registerItemModel ();
			coalHelmet.registerItemModel ();
			coalHoe.registerItemModel ();
			coalLeggings.registerItemModel ();
			coalPickaxe.registerItemModel ();
			coalShovel.registerItemModel ();
			coalSword.registerItemModel ();

			diamondium.registerItemModel ();
			diamondiumAxe.registerItemModel ();
			diamondiumBoots.registerItemModel ();
			diamondiumChestplate.registerItemModel ();
			diamondiumHelmet.registerItemModel ();
			diamondiumHoe.registerItemModel ();
			diamondiumLeggings.registerItemModel ();
			diamondiumPickaxe.registerItemModel ();
			diamondiumShovel.registerItemModel ();
			diamondiumSword.registerItemModel ();

			emeraldi.registerItemModel ();
			emeraldiAxe.registerItemModel ();
			emeraldiBoots.registerItemModel ();
			emeraldiChestplate.registerItemModel ();
			emeraldiHelmet.registerItemModel ();
			emeraldiHoe.registerItemModel ();
			emeraldiLeggings.registerItemModel ();
			emeraldiPickaxe.registerItemModel ();
			emeraldiShovel.registerItemModel ();
			emeraldiSword.registerItemModel ();

			goldiriteAxe.registerItemModel ();
			goldiriteBoots.registerItemModel ();
			goldiriteChestplate.registerItemModel ();
			goldiriteHelmet.registerItemModel ();
			goldiriteHoe.registerItemModel ();
			goldiriteIngot.registerItemModel ();
			goldiriteLeggings.registerItemModel ();
			goldiritePickaxe.registerItemModel ();
			goldiriteShovel.registerItemModel ();
			goldiriteSword.registerItemModel ();

			ironiumAxe.registerItemModel ();
			ironiumBoots.registerItemModel ();
			ironiumChestplate.registerItemModel ();
			ironiumHelmet.registerItemModel ();
			ironiumHoe.registerItemModel ();
			ironiumIngot.registerItemModel ();
			ironiumLeggings.registerItemModel ();
			ironiumPickaxe.registerItemModel ();
			ironiumShovel.registerItemModel ();
			ironiumSword.registerItemModel ();

			lapisLazuliAxe.registerItemModel ();
			lapisLazuliBoots.registerItemModel ();
			lapisLazuliChestplate.registerItemModel ();
			lapisLazuliHelmet.registerItemModel ();
			lapisLazuliHoe.registerItemModel ();
			lapisLazuliLeggings.registerItemModel ();
			lapisLazuliPickaxe.registerItemModel ();
			lapisLazuliShovel.registerItemModel ();
			lapisLazuliSword.registerItemModel ();

			magnet.registerItemModel ();

			netherQuartzAxe.registerItemModel ();
			netherQuartzBoots.registerItemModel ();
			netherQuartzChestplate.registerItemModel ();
			netherQuartzHelmet.registerItemModel ();
			netherQuartzHoe.registerItemModel ();
			netherQuartzLeggings.registerItemModel ();
			netherQuartzPickaxe.registerItemModel ();
			netherQuartzShovel.registerItemModel ();
			netherQuartzSword.registerItemModel ();

			redstoneAxe.registerItemModel ();
			redstoneBoots.registerItemModel ();
			redstoneChestplate.registerItemModel ();
			redstoneHelmet.registerItemModel ();
			redstoneHoe.registerItemModel ();
			redstoneLeggings.registerItemModel ();
			redstonePickaxe.registerItemModel ();
			redstoneShovel.registerItemModel ();
			redstoneSword.registerItemModel ();

			ultimatePickaxe.registerItemModel ();
		}
		else
		{
			// Coal
			if ( enableCoalArmors )
			{
				coalBoots.registerItemModel ();
				coalChestplate.registerItemModel ();
				coalHelmet.registerItemModel ();
				coalLeggings.registerItemModel ();
			}

			if ( enableCoalTools )
			{
				coalAxe.registerItemModel ();
				coalHoe.registerItemModel ();
				coalPickaxe.registerItemModel ();
				coalShovel.registerItemModel ();
				coalSword.registerItemModel ();
			}

			// Diamondium
			if ( enableDiamondiumArmors || enableDiamondiumTools )
			{
				diamondium.registerItemModel ();
			}

			if ( enableDiamondiumArmors )
			{
				diamondiumBoots.registerItemModel ();
				diamondiumChestplate.registerItemModel ();
				diamondiumHelmet.registerItemModel ();
				diamondiumHoe.registerItemModel ();
				diamondiumLeggings.registerItemModel ();
			}

			if ( enableDiamondiumTools )
			{
				diamondiumAxe.registerItemModel ();
				diamondiumPickaxe.registerItemModel ();
				diamondiumShovel.registerItemModel ();
				diamondiumSword.registerItemModel ();
			}

			// Emeraldi
			if ( enableEmeraldiArmors || enableGoldiriteTools )
			{
				emeraldi.registerItemModel ();
			}

			if ( enableEmeraldiArmors )
			{
				emeraldiBoots.registerItemModel ();
				emeraldiChestplate.registerItemModel ();
				emeraldiHelmet.registerItemModel ();
				emeraldiLeggings.registerItemModel ();
			}

			if ( enableEmeraldiTools )
			{
				emeraldiAxe.registerItemModel ();
				emeraldiHoe.registerItemModel ();
				emeraldiPickaxe.registerItemModel ();
				emeraldiShovel.registerItemModel ();
				emeraldiSword.registerItemModel ();
			}


			// Goldirite
			if ( enableGoldiriteArmors || enableGoldiriteTools )
			{
				goldiriteIngot.registerItemModel ();
			}

			if ( enableGoldiriteArmors )
			{
				goldiriteBoots.registerItemModel ();
				goldiriteChestplate.registerItemModel ();
				goldiriteHelmet.registerItemModel ();
				goldiriteLeggings.registerItemModel ();
			}

			if ( enableGoldiriteTools )
			{
				goldiriteAxe.registerItemModel ();
				goldiriteHoe.registerItemModel ();
				goldiritePickaxe.registerItemModel ();
				goldiriteShovel.registerItemModel ();
				goldiriteSword.registerItemModel ();
			}

			// Ironium
			if ( enableIroniumArmors || enableIroniumTools )
			{
				ironiumIngot.registerItemModel ();
			}

			if ( enableIroniumArmors )
			{
				ironiumBoots.registerItemModel ();
				ironiumChestplate.registerItemModel ();
				ironiumHelmet.registerItemModel ();
				ironiumLeggings.registerItemModel ();
			}

			if ( enableIroniumTools )
			{
				ironiumAxe.registerItemModel ();
				ironiumHoe.registerItemModel ();
				ironiumPickaxe.registerItemModel ();
				ironiumShovel.registerItemModel ();
				ironiumSword.registerItemModel ();
			}

			// Lapis Lazuli
			if ( enableLapisLazuliArmors )
			{
				lapisLazuliBoots.registerItemModel ();
				lapisLazuliChestplate.registerItemModel ();
				lapisLazuliHelmet.registerItemModel ();
				lapisLazuliLeggings.registerItemModel ();
			}

			if ( enableLapisLazuliTools )
			{
				lapisLazuliAxe.registerItemModel ();
				lapisLazuliHoe.registerItemModel ();
				lapisLazuliPickaxe.registerItemModel ();
				lapisLazuliShovel.registerItemModel ();
				lapisLazuliSword.registerItemModel ();
			}

			// Nether Quartz
			if ( enableNetherQuartzArmors )
			{
				netherQuartzBoots.registerItemModel ();
				netherQuartzChestplate.registerItemModel ();
				netherQuartzHelmet.registerItemModel ();
				netherQuartzLeggings.registerItemModel ();
			}

			if ( enableNetherQuartzTools )
			{
				netherQuartzAxe.registerItemModel ();
				netherQuartzHoe.registerItemModel ();
				netherQuartzPickaxe.registerItemModel ();
				netherQuartzShovel.registerItemModel ();
				netherQuartzSword.registerItemModel ();
			}

			// Redstone
			if ( enableRedstoneArmors )
			{
				redstoneBoots.registerItemModel ();
				redstoneChestplate.registerItemModel ();
				redstoneHelmet.registerItemModel ();
				redstoneLeggings.registerItemModel ();
			}

			if ( enableRedstoneTools )
			{
				redstoneAxe.registerItemModel ();
				redstoneHoe.registerItemModel ();
				redstonePickaxe.registerItemModel ();
				redstoneShovel.registerItemModel ();
				redstoneSword.registerItemModel ();
			}

			// Ultimate
			if ( enableUltimateTools )
			{
				ultimatePickaxe.registerItemModel ();
			}
		}
	}
}
