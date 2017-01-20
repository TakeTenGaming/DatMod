package taketengaming.datmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

import static net.minecraft.init.SoundEvents.*;

/**
 * Created by Acid on 10/26/2016.
 */
public class Materials
{
	private static SoundEvent equipDiamond = ITEM_ARMOR_EQUIP_DIAMOND;
	private static SoundEvent equipGold = ITEM_ARMOR_EQUIP_GOLD;
	private static SoundEvent equipIron = ITEM_ARMOR_EQUIP_IRON;

	public static Item.ToolMaterial diamondium = EnumHelper.addToolMaterial ( "diamondium", 3, 2000, 10.5F, 4.0F, 14 );
	public static ItemArmor.ArmorMaterial diamondiumArmor = EnumHelper.addArmorMaterial ( "diamondium", DatMod.MODID + ":diamondium", 2000, new int[] { 2, 7, 5, 3 }, 14,
			equipDiamond, 2.0F );

	public static Item.ToolMaterial emeraldi = EnumHelper.addToolMaterial ( "emeraldi", 3, 800, 11.0F, 3.5F, 20 );
	public static ItemArmor.ArmorMaterial emeraldiArmor = EnumHelper.addArmorMaterial ( "emeraldi", DatMod.MODID + ":emeraldi", 800, new int[] { 2, 7, 5, 3 }, 20, equipIron, 1.0F );

	public static Item.ToolMaterial goldirite = EnumHelper.addToolMaterial ( "goldirite", 3, 125, 15.0F, 1.0F, 24 );
	public static ItemArmor.ArmorMaterial goldiriteArmor = EnumHelper.addArmorMaterial ( "goldirite", DatMod.MODID + ":goldirite", 125, new int[] { 2, 7, 5, 3 }, 24, equipGold, 0.0F );

	public static Item.ToolMaterial ironium = EnumHelper.addToolMaterial ( "ironium", 3, 500, 8.0F, 4.0F, 18 );
	public static ItemArmor.ArmorMaterial ironiumArmor = EnumHelper.addArmorMaterial ( "ironium", DatMod.MODID + ":ironium", 500, new int[] { 2, 7, 5, 3 }, 18, equipIron, 0.0F );

	public static Item.ToolMaterial lapisLazuli = EnumHelper.addToolMaterial ( "lapisLazuli", 3, 500, 7.0F, 4.0F, 18 );
	public static ItemArmor.ArmorMaterial lapisLazuliArmor = EnumHelper.addArmorMaterial ( "lapisLazuli", DatMod.MODID + ":lapislazuli", 500, new int[] { 2, 7, 5, 3 }, 18,
			equipDiamond, 1.0F );

	public static Item.ToolMaterial redstone = EnumHelper.addToolMaterial ( "redstone", 3, 500, 8.5F, 4.0F, 18 );
	public static ItemArmor.ArmorMaterial redstoneArmor = EnumHelper.addArmorMaterial ( "redstone", DatMod.MODID + ":redstone", 500, new int[] { 2, 7, 5, 3 }, 18,
			equipDiamond, 1.0F );
}