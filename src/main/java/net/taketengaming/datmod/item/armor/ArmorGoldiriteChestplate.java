package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorGoldiriteChestplate extends ItemArmorBase
{
	public ArmorGoldiriteChestplate ()
	{
		super ( "Goldirite Chestplate", ModMaterials.goldiriteArmor, EntityEquipmentSlot.CHEST );
	}
}
