package net.taketengaming.datmod.util;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.taketengaming.datmod.DatMod;

public class ItemArmorBase extends ItemArmor
{
	private String name;

	public ItemArmorBase ( String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn )
	{
		super ( materialIn, 0, equipmentSlotIn );
		this.setName ( name );
		this.setCreativeTab ();
	}

	public ItemArmorBase ( String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn )
	{
		super ( materialIn, renderIndexIn, equipmentSlotIn );
		this.setName ( name );
		this.setCreativeTab ();
	}

	public String getName ()
	{
		return this.name;
	}

	public void registerItemModel ()
	{
		DatMod.proxy.registerItemRenderer ( this, 0, this.getName () );
	}

	private ItemArmorBase setCreativeTab ()
	{
		super.setCreativeTab ( DatMod.creativeTab );
		return this;
	}

	protected void setName ( String name )
	{
		this.name = name.replace ( " ", "_" ).toLowerCase ();
		this.setRegistryName ( this.name );
		this.setUnlocalizedName ( this.name );
	}
}
