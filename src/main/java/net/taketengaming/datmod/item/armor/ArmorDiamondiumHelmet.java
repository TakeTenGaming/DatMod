package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorDiamondiumHelmet extends ItemArmorBase
{
	public ArmorDiamondiumHelmet ()
	{
		super ( "Diamondium Helmet", ModMaterials.diamondiumArmor, EntityEquipmentSlot.HEAD );
	}
}
