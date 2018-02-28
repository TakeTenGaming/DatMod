package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorNetherQuartzHelmet extends ItemArmorBase
{
	public ArmorNetherQuartzHelmet ()
	{
		super ( "Nether Quartz Helmet", ModMaterials.netherQuartzArmor, EntityEquipmentSlot.HEAD );
	}
}
