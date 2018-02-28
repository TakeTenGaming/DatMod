package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorCoalLeggings extends ItemArmorBase
{
	public ArmorCoalLeggings ()
	{
		super ( "Coal Leggings", ModMaterials.coalArmor, EntityEquipmentSlot.LEGS );
	}
}
