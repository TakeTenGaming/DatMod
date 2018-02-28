package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorIroniumBoots extends ItemArmorBase
{
	public ArmorIroniumBoots ()
	{
		super ( "Ironium Boots", ModMaterials.ironiumArmor, EntityEquipmentSlot.FEET );
	}
}
