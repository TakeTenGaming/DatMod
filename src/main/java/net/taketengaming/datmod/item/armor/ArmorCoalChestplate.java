package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorCoalChestplate extends ItemArmorBase
{
	public ArmorCoalChestplate ()
	{
		super ( "Coal Chestplate", ModMaterials.coalArmor, EntityEquipmentSlot.CHEST );
	}
}
