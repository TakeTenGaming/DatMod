package taketengaming.datmod.creativetab;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import taketengaming.datmod.DatMod;

/**
 * Created by Acid on 10/26/2016.
 */
public class Blocks extends net.minecraft.creativetab.CreativeTabs
{
	public Blocks ()
	{
		super ( getNextID (), DatMod.MODID + "_blocks" );
	}

	@Override
	public ItemStack getTabIconItem ()
	{
		return new ItemStack ( Item.getItemFromBlock ( taketengaming.datmod.register.Blocks.diamondium ) );
	}
}
