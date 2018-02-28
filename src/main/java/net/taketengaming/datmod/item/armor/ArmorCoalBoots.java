package net.taketengaming.datmod.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemArmorBase;

public class ArmorCoalBoots extends ItemArmorBase
{
	public ArmorCoalBoots ()
	{
		super ( "Coal Boots", ModMaterials.coalArmor, EntityEquipmentSlot.FEET );
	}
}
