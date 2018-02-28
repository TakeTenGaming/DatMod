package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorRedstoneBoots extends ItemArmorBase
{
	public ArmorRedstoneBoots ()
	{
		super ( "Redstone Boots", ModMaterials.redstoneArmor, EntityEquipmentSlot.FEET );
	}
}
