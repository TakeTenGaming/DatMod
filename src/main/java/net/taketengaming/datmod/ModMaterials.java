package net.taketengaming.datmod;

import net.minecraft.util.SoundEvent;

import static net.minecraft.init.SoundEvents.*;
import static net.minecraft.item.Item.ToolMaterial;
import static net.minecraft.item.ItemArmor.ArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addToolMaterial;

public class ModMaterials
{
	// Equip Sound Placeholders
	private static SoundEvent equipChain = ITEM_ARMOR_EQUIP_CHAIN;
	private static SoundEvent equipDiamond = ITEM_ARMOR_EQUIP_DIAMOND;
	private static SoundEvent equipGeneric = ITEM_ARMOR_EQUIP_GENERIC;
	private static SoundEvent equipGold = ITEM_ARMOR_EQUIP_GOLD;
	private static SoundEvent equipIron = ITEM_ARMOR_EQUIP_IRON;
	private static SoundEvent equipLeather = ITEM_ARMOR_EQUIP_LEATHER;

	private static SoundEvent equipCoal = equipIron;
	private static SoundEvent equipDiamondium = equipDiamond;
	private static SoundEvent equipEmeraldi = equipIron;
	private static SoundEvent equipGoldirite = equipGold;
	private static SoundEvent equipIronium = equipIron;
	private static SoundEvent equipLapisLazuli = equipIron;
	private static SoundEvent equipNetherQuartz = equipIron;
	private static SoundEvent equipRedstone = equipIron;
	private static SoundEvent equipUltimate = equipDiamondium;

	// Armor Materials
	public static ArmorMaterial coalArmor = addArmorMaterial ( "coal", getTextureName ( "coal" ), 2000, new int[] { 4, 7, 9, 4 }, 14, equipDiamondium, 2.5F );
	public static ArmorMaterial diamondiumArmor = addArmorMaterial ( "diamondium", getTextureName ( "diamondium" ), 2000, new int[] { 4, 7, 9, 4 }, 14, equipDiamondium, 2.5F );
	public static ArmorMaterial emeraldiArmor = addArmorMaterial ( "emeraldi", getTextureName ( "emeraldi" ), 800, new int[] { 2, 7, 5, 3 }, 20, equipEmeraldi, 1.0F );
	public static ArmorMaterial goldiriteArmor = addArmorMaterial ( "goldirite", getTextureName ( "goldirite" ), 125, new int[] { 2, 4, 6, 3 }, 24, equipGoldirite, 0.0F );
	public static ArmorMaterial ironiumArmor = addArmorMaterial ( "ironium", getTextureName ( "ironium" ), 500, new int[] { 3, 6, 7, 3 }, 18, equipIronium, 0.0F );
	public static ArmorMaterial lapisLazuliArmor = addArmorMaterial ( "lapisLazuli", getTextureName ( "lapislazuli" ), 500, new int[] { 2, 3, 5, 3 }, 18, equipLapisLazuli, 1.0F );
	public static ArmorMaterial netherQuartzArmor = addArmorMaterial ( "netherQuartz", getTextureName ( "netherquartz" ), 660, new int[] { 2, 3, 5, 3 }, 18, equipNetherQuartz, 1.0F );
	public static ArmorMaterial redstoneArmor = addArmorMaterial ( "redstone", getTextureName ( "redstone" ), 500, new int[] { 2, 7, 5, 3 }, 18, equipRedstone, 1.0F );
	public static ArmorMaterial ultimateArmor = addArmorMaterial ( "ultimate", getTextureName ( "ultimate" ), 10000, new int[] { 5, 8, 10, 5 }, 20, equipUltimate, 3.5F );

	// Tool Materials
	public static ToolMaterial coal = addToolMaterial ( "coal", 2, 500, 8.0F, 4.0F, 18 );
	public static ToolMaterial diamondium = addToolMaterial ( "diamondium", 5, 2000, 10.5F, 4.0F, 14 );
	public static ToolMaterial emeraldi = addToolMaterial ( "emeraldi", 4, 800, 11.0F, 3.5F, 20 );
	public static ToolMaterial goldirite = addToolMaterial ( "goldirite", 2, 250, 13.0F, 1.0F, 24 );
	public static ToolMaterial ironium = addToolMaterial ( "ironium", 4, 500, 10.0F, 4.0F, 18 );
	public static ToolMaterial lapisLazuli = addToolMaterial ( "lapisLazuli", 2, 500, 7.0F, 4.0F, 18 );
	public static ToolMaterial netherQuartz = addToolMaterial ( "netherQuartz", 3, 700, 8.0F, 4.0F, 18 );
	public static ToolMaterial redstone = addToolMaterial ( "redstone", 2, 400, 10.5F, 4.0F, 18 );
	public static ToolMaterial ultimate = addToolMaterial ( "ultimate", 6, 64000, 15.0F, 20.0F, 28 );

	private static String getTextureName ( String name )
	{
		return DatMod.MODID + ":" + name;
	}
}
