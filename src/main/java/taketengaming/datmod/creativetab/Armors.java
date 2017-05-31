package taketengaming.datmod.creativetab;

import net.minecraft.item.ItemStack;
import taketengaming.datmod.DatMod;
import taketengaming.datmod.register.Items;

/**
 * Created by Acid on 11/20/2016.
 */
public class Armors extends net.minecraft.creativetab.CreativeTabs
{
	public Armors ()
	{
		super ( getNextID (), DatMod.MODID + "_armors" );
	}

	@Override
	public ItemStack getTabIconItem ()
	{
		return new ItemStack ( Items.diamondiumHelmet );
	}
}
