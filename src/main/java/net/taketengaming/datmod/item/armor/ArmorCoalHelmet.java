package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorCoalHelmet extends ItemArmorBase
{
	public ArmorCoalHelmet ()
	{
		super ( "Coal Helmet", ModMaterials.coalArmor, EntityEquipmentSlot.HEAD );
	}
}
