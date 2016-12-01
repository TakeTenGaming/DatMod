package xlxacidxlx.datmod.register;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.base.*;
import xlxacidxlx.datmod.item.*;

/**
 * Created by Acid on 10/26/2016.
 */
public class Items {
	public static Diamondium diamondium;
	public static DiamondiumAxe diamondiumAxe;
	public static DiamondiumBoots diamondiumBoots;
	public static DiamondiumChestplate diamondiumChestplate;
	public static DiamondiumHelmet diamondiumHelmet;
	public static DiamondiumHoe diamondiumHoe;
	public static DiamondiumLeggings diamondiumLeggings;
	public static DiamondiumPickaxe diamondiumPickaxe;
	public static DiamondiumShovel diamondiumShovel;
	public static DiamondiumSword diamondiumSword;

	public static Emeraldi emeraldi;
	public static EmeraldiAxe emeraldiAxe;
	public static EmeraldiBoots emeraldiBoots;
	public static EmeraldiChestplate emeraldiChestplate;
	public static EmeraldiHelmet emeraldiHelmet;
	public static EmeraldiHoe emeraldiHoe;
	public static EmeraldiLeggings emeraldiLeggings;
	public static EmeraldiPickaxe emeraldiPickaxe;
	public static EmeraldiShovel emeraldiShovel;
	public static EmeraldiSword emeraldiSword;

	public static GoldiriteAxe goldiriteAxe;
	public static GoldiriteBoots goldiriteBoots;
	public static GoldiriteChestplate goldiriteChestplate;
	public static GoldiriteDust goldiriteDust;
	public static GoldiriteHelmet goldiriteHelmet;
	public static GoldiriteHoe goldiriteHoe;
	public static GoldiriteIngot goldiriteIngot;
	public static GoldiriteLeggings goldiriteLeggings;
	public static GoldiritePickaxe goldiritePickaxe;
	public static GoldiriteShovel goldiriteShovel;
	public static GoldiriteSword goldiriteSword;

	public static IroniumAxe ironiumAxe;
	public static IroniumBoots ironiumBoots;
	public static IroniumChestplate ironiumChestplate;
	public static IroniumDust ironiumDust;
	public static IroniumHelmet ironiumHelmet;
	public static IroniumHoe ironiumHoe;
	public static IroniumIngot ironiumIngot;
	public static IroniumLeggings ironiumLeggings;
	public static IroniumPickaxe ironiumPickaxe;
	public static IroniumShovel ironiumShovel;
	public static IroniumSword ironiumSword;

	public static LapisLazuliAxe lapisLazuliAxe;
	public static LapisLazuliBoots lapisLazuliBoots;
	public static LapisLazuliChestplate lapisLazuliChestplate;
	public static LapisLazuliHelmet lapisLazuliHelmet;
	public static LapisLazuliHoe lapisLazuliHoe;
	public static LapisLazuliLeggings lapisLazuliLeggings;
	public static LapisLazuliPickaxe lapisLazuliPickaxe;
	public static LapisLazuliShovel lapisLazuliShovel;
	public static LapisLazuliSword lapisLazuliSword;

	public static RedstoneAxe redstoneAxe;
	public static RedstoneBoots redstoneBoots;
	public static RedstoneChestplate redstoneChestplate;
	public static RedstoneHelmet redstoneHelmet;
	public static RedstoneHoe redstoneHoe;
	public static RedstoneLeggings redstoneLeggings;
	public static RedstonePickaxe redstonePickaxe;
	public static RedstoneShovel redstoneShovel;
	public static RedstoneSword redstoneSword;

	public static Magnet magnetItem;

	public static void preInit() {
		diamondium = new Diamondium();
		diamondiumAxe = new DiamondiumAxe();
		diamondiumBoots = new DiamondiumBoots();
		diamondiumChestplate = new DiamondiumChestplate();
		diamondiumHelmet = new DiamondiumHelmet();
		diamondiumHoe = new DiamondiumHoe();
		diamondiumLeggings = new DiamondiumLeggings();
		diamondiumPickaxe = new DiamondiumPickaxe();
		diamondiumShovel = new DiamondiumShovel();
		diamondiumSword = new DiamondiumSword();

		emeraldi = new Emeraldi();
		emeraldiAxe = new EmeraldiAxe();
		emeraldiBoots = new EmeraldiBoots();
		emeraldiChestplate = new EmeraldiChestplate();
		emeraldiHelmet = new EmeraldiHelmet();
		emeraldiHoe = new EmeraldiHoe();
		emeraldiLeggings = new EmeraldiLeggings();
		emeraldiPickaxe = new EmeraldiPickaxe();
		emeraldiShovel = new EmeraldiShovel();
		emeraldiSword = new EmeraldiSword();

		goldiriteAxe = new GoldiriteAxe();
		goldiriteBoots = new GoldiriteBoots();
		goldiriteChestplate = new GoldiriteChestplate();
		goldiriteDust = new GoldiriteDust();
		goldiriteHelmet = new GoldiriteHelmet();
		goldiriteHoe = new GoldiriteHoe();
		goldiriteIngot = new GoldiriteIngot();
		goldiriteLeggings = new GoldiriteLeggings();
		goldiritePickaxe = new GoldiritePickaxe();
		goldiriteShovel = new GoldiriteShovel();
		goldiriteSword = new GoldiriteSword();

		ironiumAxe = new IroniumAxe();
		ironiumBoots = new IroniumBoots();
		ironiumChestplate = new IroniumChestplate();
		ironiumDust = new IroniumDust();
		ironiumHelmet = new IroniumHelmet();
		ironiumHoe = new IroniumHoe();
		ironiumIngot = new IroniumIngot();
		ironiumLeggings = new IroniumLeggings();
		ironiumPickaxe = new IroniumPickaxe();
		ironiumShovel = new IroniumShovel();
		ironiumSword = new IroniumSword();

		lapisLazuliAxe = new LapisLazuliAxe();
		lapisLazuliBoots = new LapisLazuliBoots();
		lapisLazuliChestplate = new LapisLazuliChestplate();
		lapisLazuliHelmet = new LapisLazuliHelmet();
		lapisLazuliHoe = new LapisLazuliHoe();
		lapisLazuliLeggings = new LapisLazuliLeggings();
		lapisLazuliPickaxe = new LapisLazuliPickaxe();
		lapisLazuliShovel = new LapisLazuliShovel();
		lapisLazuliSword = new LapisLazuliSword();

		redstoneAxe = new RedstoneAxe();
		redstoneBoots = new RedstoneBoots();
		redstoneChestplate = new RedstoneChestplate();
		redstoneHelmet = new RedstoneHelmet();
		redstoneHoe = new RedstoneHoe();
		redstoneLeggings = new RedstoneLeggings();
		redstonePickaxe = new RedstonePickaxe();
		redstoneShovel = new RedstoneShovel();
		redstoneSword = new RedstoneSword();

		magnetItem = new Magnet();

		registerItems();
	}

	private static void registerItems() {
		if (ConfigHandler.enableOreGeneration) {
			if (ConfigHandler.enableOreGenerationDiamondium && ConfigHandler.enableDiamondiumTools) {
				GameRegistry.register(diamondium);
				GameRegistry.register(diamondiumAxe);
				GameRegistry.register(diamondiumBoots);
				GameRegistry.register(diamondiumChestplate);
				GameRegistry.register(diamondiumHelmet);
				GameRegistry.register(diamondiumHoe);
				GameRegistry.register(diamondiumLeggings);
				GameRegistry.register(diamondiumPickaxe);
				GameRegistry.register(diamondiumShovel);
				GameRegistry.register(diamondiumSword);
			}

			if (ConfigHandler.enableOreGenerationEmeraldi && ConfigHandler.enableEmeraldiTools) {
				GameRegistry.register(emeraldi);
				GameRegistry.register(emeraldiAxe);
				GameRegistry.register(emeraldiBoots);
				GameRegistry.register(emeraldiChestplate);
				GameRegistry.register(emeraldiHelmet);
				GameRegistry.register(emeraldiHoe);
				GameRegistry.register(emeraldiLeggings);
				GameRegistry.register(emeraldiPickaxe);
				GameRegistry.register(emeraldiShovel);
				GameRegistry.register(emeraldiSword);
			}

			if (ConfigHandler.enableOreGenerationGoldirite && ConfigHandler.enableGoldiriteTools) {
				GameRegistry.register(goldiriteAxe);
				GameRegistry.register(goldiriteBoots);
				GameRegistry.register(goldiriteChestplate);
				GameRegistry.register(goldiriteDust);
				GameRegistry.register(goldiriteHelmet);
				GameRegistry.register(goldiriteHoe);
				GameRegistry.register(goldiriteIngot);
				GameRegistry.register(goldiriteLeggings);
				GameRegistry.register(goldiritePickaxe);
				GameRegistry.register(goldiriteShovel);
				GameRegistry.register(goldiriteSword);
			}

			if (ConfigHandler.enableOreGenerationIronium && ConfigHandler.enableIroniumTools) {
				GameRegistry.register(ironiumAxe);
				GameRegistry.register(ironiumBoots);
				GameRegistry.register(ironiumChestplate);
				GameRegistry.register(ironiumDust);
				GameRegistry.register(ironiumHelmet);
				GameRegistry.register(ironiumHoe);
				GameRegistry.register(ironiumIngot);
				GameRegistry.register(ironiumLeggings);
				GameRegistry.register(ironiumPickaxe);
				GameRegistry.register(ironiumShovel);
				GameRegistry.register(ironiumSword);
			}

			if (ConfigHandler.enableLapisLazuliTools) {
				GameRegistry.register(lapisLazuliAxe);
				GameRegistry.register(lapisLazuliBoots);
				GameRegistry.register(lapisLazuliChestplate);
				GameRegistry.register(lapisLazuliHelmet);
				GameRegistry.register(lapisLazuliHoe);
				GameRegistry.register(lapisLazuliLeggings);
				GameRegistry.register(lapisLazuliPickaxe);
				GameRegistry.register(lapisLazuliShovel);
				GameRegistry.register(lapisLazuliSword);
			}

			if (ConfigHandler.enableRedstoneTools) {
				GameRegistry.register(redstoneAxe);
				GameRegistry.register(redstoneBoots);
				GameRegistry.register(redstoneChestplate);
				GameRegistry.register(redstoneHelmet);
				GameRegistry.register(redstoneHoe);
				GameRegistry.register(redstoneLeggings);
				GameRegistry.register(redstonePickaxe);
				GameRegistry.register(redstoneShovel);
				GameRegistry.register(redstoneSword);
			}
		}

		GameRegistry.register(magnetItem);
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item, int metadata) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, item.getModelResourceLocation
				(metadata));
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemArmor item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemArmor item, int metadata) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, item.getModelResourceLocation(metadata));
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemAxe item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemAxe item, int metadata) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, item.getModelResourceLocation(metadata));
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemHoe item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemHoe item, int metadata) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, item.getModelResourceLocation(metadata));
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemPickaxe item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemPickaxe item, int metadata) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, item.getModelResourceLocation(metadata));
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemShovel item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemShovel item, int metadata) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, item.getModelResourceLocation(metadata));
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemSword item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(ItemSword item, int metadata) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, item.getModelResourceLocation(metadata));
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(diamondium);
		registerRender(diamondiumAxe);
		registerRender(diamondiumBoots);
		registerRender(diamondiumChestplate);
		registerRender(diamondiumHelmet);
		registerRender(diamondiumHoe);
		registerRender(diamondiumLeggings);
		registerRender(diamondiumPickaxe);
		registerRender(diamondiumShovel);
		registerRender(diamondiumSword);

		registerRender(emeraldi);
		registerRender(emeraldiAxe);
		registerRender(emeraldiBoots);
		registerRender(emeraldiChestplate);
		registerRender(emeraldiHelmet);
		registerRender(emeraldiHoe);
		registerRender(emeraldiLeggings);
		registerRender(emeraldiPickaxe);
		registerRender(emeraldiShovel);
		registerRender(emeraldiSword);

		registerRender(goldiriteAxe);
		registerRender(goldiriteBoots);
		registerRender(goldiriteChestplate);
		registerRender(goldiriteDust);
		registerRender(goldiriteHelmet);
		registerRender(goldiriteHoe);
		registerRender(goldiriteIngot);
		registerRender(goldiriteLeggings);
		registerRender(goldiritePickaxe);
		registerRender(goldiriteShovel);
		registerRender(goldiriteSword);

		registerRender(ironiumAxe);
		registerRender(ironiumBoots);
		registerRender(ironiumChestplate);
		registerRender(ironiumDust);
		registerRender(ironiumHelmet);
		registerRender(ironiumHoe);
		registerRender(ironiumIngot);
		registerRender(ironiumLeggings);
		registerRender(ironiumPickaxe);
		registerRender(ironiumShovel);
		registerRender(ironiumSword);

		registerRender(lapisLazuliAxe);
		registerRender(lapisLazuliBoots);
		registerRender(lapisLazuliChestplate);
		registerRender(lapisLazuliHelmet);
		registerRender(lapisLazuliHoe);
		registerRender(lapisLazuliLeggings);
		registerRender(lapisLazuliPickaxe);
		registerRender(lapisLazuliShovel);
		registerRender(lapisLazuliSword);

		registerRender(redstoneAxe);
		registerRender(redstoneBoots);
		registerRender(redstoneChestplate);
		registerRender(redstoneHelmet);
		registerRender(redstoneHoe);
		registerRender(redstoneLeggings);
		registerRender(redstonePickaxe);
		registerRender(redstoneShovel);
		registerRender(redstoneSword);

		registerRender(magnetItem);
	}
}
