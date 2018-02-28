package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorNetherQuartzChestplate extends ItemArmorBase
{
	public ArmorNetherQuartzChestplate ()
	{
		super ( "Nether Quartz Chestplate", ModMaterials.netherQuartzArmor, EntityEquipmentSlot.CHEST );
	}
}
