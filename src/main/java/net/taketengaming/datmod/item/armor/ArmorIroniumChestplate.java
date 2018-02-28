package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorIroniumChestplate extends ItemArmorBase
{
	public ArmorIroniumChestplate ()
	{
		super ( "Ironium Chestplate", ModMaterials.ironiumArmor, EntityEquipmentSlot.CHEST );
	}
}
