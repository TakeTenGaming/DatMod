package net.taketengaming.datmod.item.shield;

import net.minecraft.item.ItemStack;
import net.taketengaming.datmod.ModItems;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemShieldBase;

public class ShieldDiamondium extends ItemShieldBase
{
	public ShieldDiamondium ()
	{
		super ( "Diamondium Shield", ModMaterials.diamondium );
	}

	public boolean getIsRepairable ( ItemStack toRepair, ItemStack repair )
	{
		return ( repair.getItem () == ModItems.diamondium );
	}
}
