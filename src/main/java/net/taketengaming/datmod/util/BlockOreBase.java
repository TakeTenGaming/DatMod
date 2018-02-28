package net.taketengaming.datmod.util;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.taketengaming.datmod.ModItems;

import java.util.Random;

public class BlockOreBase extends BlockBase
{
	public BlockOreBase ( String name )
	{
		super ( Material.ROCK, name );

		this.setCreativeTab ();

		if ( name.toLowerCase ().contains ( "diamondium" ) )
		{
			this.setHardness ( 5.0f );
			this.setHarvestLevel ( "pickaxe", 4 );
		}
		else if ( name.toLowerCase ().contains ( "emeraldi" ) )
		{
			this.setHardness ( 6.0f );
			this.setHarvestLevel ( "pickaxe", 3 );
		}
		else if ( name.toLowerCase ().contains ( "goldirite" ) )
		{
			this.setHardness ( 4.0f );
			this.setHarvestLevel ( "pickaxe", 2 );
		}
		else if ( name.toLowerCase ().contains ( "ironium" ) )
		{
			this.setHardness ( 3.0f );
			this.setHarvestLevel ( "pickaxe", 2 );
		}

		this.setResistance ( 5f );
	}

	@Override
	public Item getItemDropped ( IBlockState state, Random rand, int fortune )
	{
		String localizedName = state.getBlock ().getLocalizedName ();

		if ( localizedName.toLowerCase ().contains ( "diamondium" ) )
		{
			return ModItems.diamondium;
		}
		else if ( localizedName.toLowerCase ().contains ( "emeraldi" ) )
		{
			return ModItems.emeraldi;
		}
		else
		{
			return super.getItemDropped ( state, rand, fortune );
		}
	}

	@Override
	public int quantityDropped ( IBlockState state, int fortune, Random random )
	{
		String localizedName = state.getBlock ().getLocalizedName ();

		if ( localizedName.toLowerCase ().contains ( "goldirite" ) || localizedName.toLowerCase ().contains ( "ironium" ) )
		{
			return super.quantityDropped ( state, fortune, random );
		}
		else
		{
			return super.quantityDroppedWithBonus ( fortune, random );
		}
	}
}
