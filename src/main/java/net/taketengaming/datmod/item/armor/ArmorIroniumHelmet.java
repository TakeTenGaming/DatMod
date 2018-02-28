package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorIroniumHelmet extends ItemArmorBase
{
	public ArmorIroniumHelmet ()
	{
		super ( "Ironium Helmet", ModMaterials.ironiumArmor, EntityEquipmentSlot.HEAD );
	}
}
