package taketengaming.datmod.register;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import taketengaming.datmod.ConfigHandler;
import taketengaming.datmod.item.*;
import taketengaming.tencore.item.*;

/**
 * Created by Acid on 10/26/2016.
 */
public class Items
{
	public static ItemDiamondium diamondium;
	public static ItemDiamondiumAxe diamondiumAxe;
	public static ItemDiamondiumBoots diamondiumBoots;
	public static ItemDiamondiumChestplate diamondiumChestplate;
	public static ItemDiamondiumHelmet diamondiumHelmet;
	public static ItemDiamondiumHoe diamondiumHoe;
	public static ItemDiamondiumLeggings diamondiumLeggings;
	public static ItemDiamondiumPickaxe diamondiumPickaxe;
	public static ItemDiamondiumShovel diamondiumShovel;
	public static ItemDiamondiumSword diamondiumSword;

	public static ItemEmeraldi emeraldi;
	public static ItemEmeraldiAxe emeraldiAxe;
	public static ItemEmeraldiBoots emeraldiBoots;
	public static ItemEmeraldiChestplate emeraldiChestplate;
	public static ItemEmeraldiHelmet emeraldiHelmet;
	public static ItemEmeraldiHoe emeraldiHoe;
	public static ItemEmeraldiLeggings emeraldiLeggings;
	public static ItemEmeraldiPickaxe emeraldiPickaxe;
	public static ItemEmeraldiShovel emeraldiShovel;
	public static ItemEmeraldiSword emeraldiSword;

	public static ItemGoldiriteAxe goldiriteAxe;
	public static ItemGoldiriteBoots goldiriteBoots;
	public static ItemGoldiriteChestplate goldiriteChestplate;
	public static ItemGoldiriteDust goldiriteDust;
	public static ItemGoldiriteHelmet goldiriteHelmet;
	public static ItemGoldiriteHoe goldiriteHoe;
	public static ItemGoldiriteIngot goldiriteIngot;
	public static ItemGoldiriteLeggings goldiriteLeggings;
	public static ItemGoldiritePickaxe goldiritePickaxe;
	public static ItemGoldiriteShovel goldiriteShovel;
	public static ItemGoldiriteSword goldiriteSword;

	public static ItemIroniumAxe ironiumAxe;
	public static ItemIroniumBoots ironiumBoots;
	public static ItemIroniumChestplate ironiumChestplate;
	public static ItemIroniumDust ironiumDust;
	public static ItemIroniumHelmet ironiumHelmet;
	public static ItemIroniumHoe ironiumHoe;
	public static ItemIroniumIngot ironiumIngot;
	public static ItemIroniumLeggings ironiumLeggings;
	public static ItemIroniumPickaxe ironiumPickaxe;
	public static ItemIroniumShovel ironiumShovel;
	public static ItemIroniumSword ironiumSword;

	public static ItemLapisLazuliAxe lapisLazuliAxe;
	public static ItemLapisLazuliBoots lapisLazuliBoots;
	public static ItemLapisLazuliChestplate lapisLazuliChestplate;
	public static ItemLapisLazuliHelmet lapisLazuliHelmet;
	public static ItemLapisLazuliHoe lapisLazuliHoe;
	public static ItemLapisLazuliLeggings lapisLazuliLeggings;
	public static ItemLapisLazuliPickaxe lapisLazuliPickaxe;
	public static ItemLapisLazuliShovel lapisLazuliShovel;
	public static ItemLapisLazuliSword lapisLazuliSword;

	public static ItemMagnet magnetItem;

	public static ItemRedstoneAxe redstoneAxe;
	public static ItemRedstoneBoots redstoneBoots;
	public static ItemRedstoneChestplate redstoneChestplate;
	public static ItemRedstoneHelmet redstoneHelmet;
	public static ItemRedstoneHoe redstoneHoe;
	public static ItemRedstoneLeggings redstoneLeggings;
	public static ItemRedstonePickaxe redstonePickaxe;
	public static ItemRedstoneShovel redstoneShovel;
	public static ItemRedstoneSword redstoneSword;

	public static void preInit ()
	{
		diamondium = new ItemDiamondium ();
		diamondiumAxe = new ItemDiamondiumAxe ();
		diamondiumBoots = new ItemDiamondiumBoots ();
		diamondiumChestplate = new ItemDiamondiumChestplate ();
		diamondiumHelmet = new ItemDiamondiumHelmet ();
		diamondiumHoe = new ItemDiamondiumHoe ();
		diamondiumLeggings = new ItemDiamondiumLeggings ();
		diamondiumPickaxe = new ItemDiamondiumPickaxe ();
		diamondiumShovel = new ItemDiamondiumShovel ();
		diamondiumSword = new ItemDiamondiumSword ();

		emeraldi = new ItemEmeraldi ();
		emeraldiAxe = new ItemEmeraldiAxe ();
		emeraldiBoots = new ItemEmeraldiBoots ();
		emeraldiChestplate = new ItemEmeraldiChestplate ();
		emeraldiHelmet = new ItemEmeraldiHelmet ();
		emeraldiHoe = new ItemEmeraldiHoe ();
		emeraldiLeggings = new ItemEmeraldiLeggings ();
		emeraldiPickaxe = new ItemEmeraldiPickaxe ();
		emeraldiShovel = new ItemEmeraldiShovel ();
		emeraldiSword = new ItemEmeraldiSword ();

		goldiriteAxe = new ItemGoldiriteAxe ();
		goldiriteBoots = new ItemGoldiriteBoots ();
		goldiriteChestplate = new ItemGoldiriteChestplate ();
		goldiriteDust = new ItemGoldiriteDust ();
		goldiriteHelmet = new ItemGoldiriteHelmet ();
		goldiriteHoe = new ItemGoldiriteHoe ();
		goldiriteIngot = new ItemGoldiriteIngot ();
		goldiriteLeggings = new ItemGoldiriteLeggings ();
		goldiritePickaxe = new ItemGoldiritePickaxe ();
		goldiriteShovel = new ItemGoldiriteShovel ();
		goldiriteSword = new ItemGoldiriteSword ();

		ironiumAxe = new ItemIroniumAxe ();
		ironiumBoots = new ItemIroniumBoots ();
		ironiumChestplate = new ItemIroniumChestplate ();
		ironiumDust = new ItemIroniumDust ();
		ironiumHelmet = new ItemIroniumHelmet ();
		ironiumHoe = new ItemIroniumHoe ();
		ironiumIngot = new ItemIroniumIngot ();
		ironiumLeggings = new ItemIroniumLeggings ();
		ironiumPickaxe = new ItemIroniumPickaxe ();
		ironiumShovel = new ItemIroniumShovel ();
		ironiumSword = new ItemIroniumSword ();

		lapisLazuliAxe = new ItemLapisLazuliAxe ();
		lapisLazuliBoots = new ItemLapisLazuliBoots ();
		lapisLazuliChestplate = new ItemLapisLazuliChestplate ();
		lapisLazuliHelmet = new ItemLapisLazuliHelmet ();
		lapisLazuliHoe = new ItemLapisLazuliHoe ();
		lapisLazuliLeggings = new ItemLapisLazuliLeggings ();
		lapisLazuliPickaxe = new ItemLapisLazuliPickaxe ();
		lapisLazuliShovel = new ItemLapisLazuliShovel ();
		lapisLazuliSword = new ItemLapisLazuliSword ();

		magnetItem = new ItemMagnet ();

		redstoneAxe = new ItemRedstoneAxe ();
		redstoneBoots = new ItemRedstoneBoots ();
		redstoneChestplate = new ItemRedstoneChestplate ();
		redstoneHelmet = new ItemRedstoneHelmet ();
		redstoneHoe = new ItemRedstoneHoe ();
		redstoneLeggings = new ItemRedstoneLeggings ();
		redstonePickaxe = new ItemRedstonePickaxe ();
		redstoneShovel = new ItemRedstoneShovel ();
		redstoneSword = new ItemRedstoneSword ();

		registerItems ();
	}

	private static void registerItems ()
	{
		if ( ConfigHandler.enableOreGeneration )
		{
			if ( ConfigHandler.enableOreGenerationDiamondium && ConfigHandler.enableDiamondiumTools )
			{
				GameRegistry.register ( diamondium );
				GameRegistry.register ( diamondiumAxe );
				GameRegistry.register ( diamondiumBoots );
				GameRegistry.register ( diamondiumChestplate );
				GameRegistry.register ( diamondiumHelmet );
				GameRegistry.register ( diamondiumHoe );
				GameRegistry.register ( diamondiumLeggings );
				GameRegistry.register ( diamondiumPickaxe );
				GameRegistry.register ( diamondiumShovel );
				GameRegistry.register ( diamondiumSword );
			}

			if ( ConfigHandler.enableOreGenerationEmeraldi && ConfigHandler.enableEmeraldiTools )
			{
				GameRegistry.register ( emeraldi );
				GameRegistry.register ( emeraldiAxe );
				GameRegistry.register ( emeraldiBoots );
				GameRegistry.register ( emeraldiChestplate );
				GameRegistry.register ( emeraldiHelmet );
				GameRegistry.register ( emeraldiHoe );
				GameRegistry.register ( emeraldiLeggings );
				GameRegistry.register ( emeraldiPickaxe );
				GameRegistry.register ( emeraldiShovel );
				GameRegistry.register ( emeraldiSword );
			}

			if ( ConfigHandler.enableOreGenerationGoldirite && ConfigHandler.enableGoldiriteTools )
			{
				GameRegistry.register ( goldiriteAxe );
				GameRegistry.register ( goldiriteBoots );
				GameRegistry.register ( goldiriteChestplate );
				GameRegistry.register ( goldiriteDust );
				GameRegistry.register ( goldiriteHelmet );
				GameRegistry.register ( goldiriteHoe );
				GameRegistry.register ( goldiriteIngot );
				GameRegistry.register ( goldiriteLeggings );
				GameRegistry.register ( goldiritePickaxe );
				GameRegistry.register ( goldiriteShovel );
				GameRegistry.register ( goldiriteSword );
			}

			if ( ConfigHandler.enableOreGenerationIronium && ConfigHandler.enableIroniumTools )
			{
				GameRegistry.register ( ironiumAxe );
				GameRegistry.register ( ironiumBoots );
				GameRegistry.register ( ironiumChestplate );
				GameRegistry.register ( ironiumDust );
				GameRegistry.register ( ironiumHelmet );
				GameRegistry.register ( ironiumHoe );
				GameRegistry.register ( ironiumIngot );
				GameRegistry.register ( ironiumLeggings );
				GameRegistry.register ( ironiumPickaxe );
				GameRegistry.register ( ironiumShovel );
				GameRegistry.register ( ironiumSword );
			}

			if ( ConfigHandler.enableLapisLazuliTools )
			{
				GameRegistry.register ( lapisLazuliAxe );
				GameRegistry.register ( lapisLazuliBoots );
				GameRegistry.register ( lapisLazuliChestplate );
				GameRegistry.register ( lapisLazuliHelmet );
				GameRegistry.register ( lapisLazuliHoe );
				GameRegistry.register ( lapisLazuliLeggings );
				GameRegistry.register ( lapisLazuliPickaxe );
				GameRegistry.register ( lapisLazuliShovel );
				GameRegistry.register ( lapisLazuliSword );
			}

			GameRegistry.register ( magnetItem );

			if ( ConfigHandler.enableRedstoneTools )
			{
				GameRegistry.register ( redstoneAxe );
				GameRegistry.register ( redstoneBoots );
				GameRegistry.register ( redstoneChestplate );
				GameRegistry.register ( redstoneHelmet );
				GameRegistry.register ( redstoneHoe );
				GameRegistry.register ( redstoneLeggings );
				GameRegistry.register ( redstonePickaxe );
				GameRegistry.register ( redstoneShovel );
				GameRegistry.register ( redstoneSword );
			}
		}
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( Item item )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, 0, item.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( Item item, int metadata )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, metadata, item.getModelResourceLocation
				( metadata ) );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemArmor item )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, 0, item.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemArmor item, int metadata )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, metadata, item.getModelResourceLocation ( metadata ) );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemAxe item )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, 0, item.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemAxe item, int metadata )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, metadata, item.getModelResourceLocation ( metadata ) );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemHoe item )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, 0, item.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemHoe item, int metadata )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, metadata, item.getModelResourceLocation ( metadata ) );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemPickaxe item )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, 0, item.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemPickaxe item, int metadata )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, metadata, item.getModelResourceLocation ( metadata ) );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemShovel item )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, 0, item.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemShovel item, int metadata )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, metadata, item.getModelResourceLocation ( metadata ) );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemSword item )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, 0, item.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( ItemSword item, int metadata )
	{
		Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ().register ( item, metadata, item.getModelResourceLocation ( metadata ) );
	}

	@SideOnly( Side.CLIENT )
	public static void registerRenders ()
	{
		registerRender ( diamondium );
		registerRender ( diamondiumAxe );
		registerRender ( diamondiumBoots );
		registerRender ( diamondiumChestplate );
		registerRender ( diamondiumHelmet );
		registerRender ( diamondiumHoe );
		registerRender ( diamondiumLeggings );
		registerRender ( diamondiumPickaxe );
		registerRender ( diamondiumShovel );
		registerRender ( diamondiumSword );

		registerRender ( emeraldi );
		registerRender ( emeraldiAxe );
		registerRender ( emeraldiBoots );
		registerRender ( emeraldiChestplate );
		registerRender ( emeraldiHelmet );
		registerRender ( emeraldiHoe );
		registerRender ( emeraldiLeggings );
		registerRender ( emeraldiPickaxe );
		registerRender ( emeraldiShovel );
		registerRender ( emeraldiSword );

		registerRender ( goldiriteAxe );
		registerRender ( goldiriteBoots );
		registerRender ( goldiriteChestplate );
		registerRender ( goldiriteDust );
		registerRender ( goldiriteHelmet );
		registerRender ( goldiriteHoe );
		registerRender ( goldiriteIngot );
		registerRender ( goldiriteLeggings );
		registerRender ( goldiritePickaxe );
		registerRender ( goldiriteShovel );
		registerRender ( goldiriteSword );

		registerRender ( ironiumAxe );
		registerRender ( ironiumBoots );
		registerRender ( ironiumChestplate );
		registerRender ( ironiumDust );
		registerRender ( ironiumHelmet );
		registerRender ( ironiumHoe );
		registerRender ( ironiumIngot );
		registerRender ( ironiumLeggings );
		registerRender ( ironiumPickaxe );
		registerRender ( ironiumShovel );
		registerRender ( ironiumSword );

		registerRender ( lapisLazuliAxe );
		registerRender ( lapisLazuliBoots );
		registerRender ( lapisLazuliChestplate );
		registerRender ( lapisLazuliHelmet );
		registerRender ( lapisLazuliHoe );
		registerRender ( lapisLazuliLeggings );
		registerRender ( lapisLazuliPickaxe );
		registerRender ( lapisLazuliShovel );
		registerRender ( lapisLazuliSword );

		registerRender ( redstoneAxe );
		registerRender ( redstoneBoots );
		registerRender ( redstoneChestplate );
		registerRender ( redstoneHelmet );
		registerRender ( redstoneHoe );
		registerRender ( redstoneLeggings );
		registerRender ( redstonePickaxe );
		registerRender ( redstoneShovel );
		registerRender ( redstoneSword );

		registerRender ( magnetItem );
	}
}
