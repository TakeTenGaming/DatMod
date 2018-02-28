package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorIroniumLeggings extends ItemArmorBase
{
	public ArmorIroniumLeggings ()
	{
		super ( "Ironium Leggings", ModMaterials.ironiumArmor, EntityEquipmentSlot.LEGS );
	}
}
