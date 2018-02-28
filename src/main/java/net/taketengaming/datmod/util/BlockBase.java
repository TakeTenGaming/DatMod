package net.taketengaming.datmod.util;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.oredict.OreDictionary;
import net.taketengaming.datmod.DatMod;

public class BlockBase extends Block
{
	protected String name;

	public BlockBase ( Material material, String name )
	{
		super ( material );

		this.setName ( name );
		this.setCreativeTab ();
	}

	public Item createItemBlock ()
	{
		return new ItemBlock ( this ).setRegistryName ( getRegistryName () );
	}

	public String getName ()
	{
		return this.name;
	}

	public void initOreDict ()
	{
		OreDictionary.registerOre ( this.getName (), this );
	}

	public void registerItemModel ( Item itemBlock )
	{
		DatMod.proxy.registerItemRenderer ( itemBlock, 0, this.getName () );
	}

	protected BlockBase setCreativeTab ()
	{
		super.setCreativeTab ( DatMod.creativeTab );
		return this;
	}

	protected void setName ( String name )
	{
		this.name = name.toLowerCase ().replace ( " ", "_" );
		this.setRegistryName ( this.name );
		this.setUnlocalizedName ( this.name );
	}
}
