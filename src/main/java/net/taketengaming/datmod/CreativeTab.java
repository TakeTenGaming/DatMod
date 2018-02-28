package net.taketengaming.datmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs
{
	public CreativeTab ()
	{
		super ( DatMod.MODID );
	}

	@Override
	public ItemStack getTabIconItem ()
	{
		return new ItemStack ( ModItems.diamondium );
	}

	@Override
	public boolean hasSearchBar ()
	{
		return true;
	}
}
