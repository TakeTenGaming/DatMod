package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorRedstoneChestplate extends ItemArmorBase
{
	public ArmorRedstoneChestplate ()
	{
		super ( "Redstone Chestplate", ModMaterials.redstoneArmor, EntityEquipmentSlot.CHEST );
	}
}
