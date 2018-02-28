package net.taketengaming.datmod.util;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import net.taketengaming.datmod.DatMod;

public class ItemBase extends Item
{
	private String name;

	public ItemBase ( String name )
	{
		this.setName ( name );
		this.setCreativeTab ();
	}

	public String getName ()
	{
		return this.name;
	}

	public void initOreDict ()
	{
		OreDictionary.registerOre ( this.getName (), this );
	}

	public void registerItemModel ()
	{
		DatMod.proxy.registerItemRenderer ( this, 0, this.getName () );
	}

	private ItemBase setCreativeTab ()
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
