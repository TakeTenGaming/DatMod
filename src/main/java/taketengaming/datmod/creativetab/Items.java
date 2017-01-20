package taketengaming.datmod.creativetab;

import net.minecraft.item.Item;
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
	public Item getTabIconItem ()
	{
		return taketengaming.datmod.register.Items.magnetItem;
	}
}
