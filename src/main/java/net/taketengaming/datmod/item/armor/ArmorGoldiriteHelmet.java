package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorGoldiriteHelmet extends ItemArmorBase
{
	public ArmorGoldiriteHelmet ()
	{
		super ( "Goldirite Helmet", ModMaterials.goldiriteArmor, EntityEquipmentSlot.HEAD );
	}
}
