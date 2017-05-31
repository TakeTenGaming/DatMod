package taketengaming.datmod.creativetab;

import net.minecraft.item.ItemStack;
import taketengaming.datmod.DatMod;

/**
 * Created by Acid on 10/26/2016.
 */
public class Items extends net.minecraft.creativetab.CreativeTabs
{
	public Items ()
	{
		super ( getNextID (), DatMod.MODID + "_items" );
	}

	@Override
	public ItemStack getTabIconItem ()
	{
		return new ItemStack ( taketengaming.datmod.register.Items.magnetItem );
	}
}
