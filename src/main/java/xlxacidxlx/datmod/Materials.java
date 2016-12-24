package xlxacidxlx.datmod;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Acid on 10/26/2016.
 */
public class Materials {
	public static Item.ToolMaterial diamondium = EnumHelper.addToolMaterial("diamondium", 3, 2000, 10.0F, 4.0F, 14);
	public static ItemArmor.ArmorMaterial diamondiumArmor = EnumHelper.addArmorMaterial("diamondium", DatMod.MODID + ":diamondium", 2000, new int[]{2, 7, 5, 3}, 14, SoundEvents
			.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static Item.ToolMaterial emeraldi = EnumHelper.addToolMaterial("emeraldi", 3, 800, 11.0F, 3.5F, 20);
	public static ItemArmor.ArmorMaterial emeraldiArmor = EnumHelper.addArmorMaterial("emeraldi", DatMod.MODID + ":emeraldi", 800, new int[]{2, 7, 5, 3}, 20, SoundEvents
			.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	public static Item.ToolMaterial goldirite = EnumHelper.addToolMaterial("goldirite", 3, 125, 14.0F, 1.0F, 24);
	public static ItemArmor.ArmorMaterial goldiriteArmor = EnumHelper.addArmorMaterial("goldirite", DatMod.MODID + ":goldirite", 125, new int[]{2, 7, 5, 3}, 24, SoundEvents
			.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static Item.ToolMaterial ironium = EnumHelper.addToolMaterial("ironium", 3, 500, 7.0F, 4.0F, 18);
	public static ItemArmor.ArmorMaterial ironiumArmor = EnumHelper.addArmorMaterial("ironium", DatMod.MODID + ":ironium", 500, new int[]{2, 7, 5, 3}, 18, SoundEvents
			.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	// TODO: Adjust these values somehow..
	public static Item.ToolMaterial lapisLazuli = EnumHelper.addToolMaterial("lapisLazuli", 3, 500, 7.0F, 4.0F, 18);
	public static ItemArmor.ArmorMaterial lapisLazuliArmor = EnumHelper.addArmorMaterial("lapisLazuli", DatMod.MODID + ":lapislazuli", 500, new int[]{2, 7, 5, 3}, 18, SoundEvents
			.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static Item.ToolMaterial redstone = EnumHelper.addToolMaterial("redstone", 3, 500, 7.0F, 4.0F, 18);
	public static ItemArmor.ArmorMaterial redstoneArmor = EnumHelper.addArmorMaterial("redstone", DatMod.MODID + ":redstone", 500, new int[]{2, 7, 5, 3}, 18, SoundEvents
			.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);

	public static Item.ToolMaterial getDiamondium() {
		return diamondium;
	}

	public static ItemArmor.ArmorMaterial getDiamondiumArmor() {
		return diamondiumArmor;
	}

	public static Item.ToolMaterial getEmeraldi() {
		return emeraldi;
	}

	public static ItemArmor.ArmorMaterial getEmeraldiArmor() {
		return emeraldiArmor;
	}

	public static Item.ToolMaterial getGoldirite() {
		return goldirite;
	}

	public static ItemArmor.ArmorMaterial getGoldiriteArmor() {
		return goldiriteArmor;
	}

	public static Item.ToolMaterial getIronium() {
		return ironium;
	}

	public static ItemArmor.ArmorMaterial getIroniumArmor() {
		return ironiumArmor;
	}

	public static Item.ToolMaterial getLapisLazuli() {
		return lapisLazuli;
	}

	public static ItemArmor.ArmorMaterial getLapisLazuliArmor() {
		return lapisLazuliArmor;
	}

	public static Item.ToolMaterial getRedstone() {
		return redstone;
	}

	public static ItemArmor.ArmorMaterial getRedstoneArmor() {
		return redstoneArmor;
	}
}
