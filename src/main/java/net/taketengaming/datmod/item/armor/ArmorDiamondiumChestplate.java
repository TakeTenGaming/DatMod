package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorDiamondiumChestplate extends ItemArmorBase
{
	public ArmorDiamondiumChestplate ()
	{
		super ( "Diamondium Chestplate", ModMaterials.diamondiumArmor, EntityEquipmentSlot.CHEST );
	}
}
