package taketengaming.datmod.creativetab;

import net.minecraft.item.Item;
import taketengaming.datmod.DatMod;
import taketengaming.datmod.register.Items;

/**
 * Created by Acid on 10/26/2016.
 */
public class Dusts extends net.minecraft.creativetab.CreativeTabs
{
	public Dusts ()
	{
		super ( getNextID (), DatMod.MODID + "_dusts" );
	}

	@Override
	public Item getTabIconItem ()
	{
		return Items.ironiumDust;
	}
}
