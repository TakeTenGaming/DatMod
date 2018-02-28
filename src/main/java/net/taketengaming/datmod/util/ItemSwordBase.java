package net.taketengaming.datmod.util;

import net.minecraft.item.ItemSword;
import net.taketengaming.datmod.DatMod;

public class ItemSwordBase extends ItemSword
{
	private String name;

	public ItemSwordBase ( String name, ToolMaterial material )
	{
		super ( material );
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

	private ItemSwordBase setCreativeTab ()
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
