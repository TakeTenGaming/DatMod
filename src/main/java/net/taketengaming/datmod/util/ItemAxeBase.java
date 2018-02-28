package net.taketengaming.datmod.util;

import net.minecraft.item.ItemAxe;
import net.taketengaming.datmod.DatMod;

public class ItemAxeBase extends ItemAxe
{
	private String name;

	public ItemAxeBase ( String name, ToolMaterial material )
	{
		super ( material, material.getAttackDamage (), material.getEfficiency () );

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

	private ItemAxeBase setCreativeTab ()
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
