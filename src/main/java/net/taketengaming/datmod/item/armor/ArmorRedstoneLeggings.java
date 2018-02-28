package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorRedstoneLeggings extends ItemArmorBase
{
	public ArmorRedstoneLeggings ()
	{
		super ( "Redstone Leggings", ModMaterials.redstoneArmor, EntityEquipmentSlot.LEGS );
	}
}
