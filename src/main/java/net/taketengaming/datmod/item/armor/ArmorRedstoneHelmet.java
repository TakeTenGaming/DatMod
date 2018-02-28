package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorRedstoneHelmet extends ItemArmorBase
{
	public ArmorRedstoneHelmet ()
	{
		super ( "Redstone Helmet", ModMaterials.redstoneArmor, EntityEquipmentSlot.HEAD );
	}
}
