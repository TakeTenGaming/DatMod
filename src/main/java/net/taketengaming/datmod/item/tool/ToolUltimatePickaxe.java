package net.taketengaming.datmod.item.tool;

import net.minecraft.item.ItemStack;
import net.taketengaming.datmod.ModMaterials;
import net.taketengaming.datmod.util.ItemPickaxeBase;

public class ToolUltimatePickaxe extends ItemPickaxeBase
{
	public ToolUltimatePickaxe ()
	{
		super ( "Ultimate Pickaxe", ModMaterials.ultimate );
	}

	@Override
	public boolean hasEffect ( ItemStack stack )
	{
		return true;
	}
}
