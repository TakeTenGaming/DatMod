package taketengaming.datmod.creativetab;

import net.minecraft.item.Item;
import taketengaming.datmod.DatMod;
import taketengaming.datmod.register.Blocks;

/**
 * Created by Acid on 10/26/2016.
 */
public class Ores extends net.minecraft.creativetab.CreativeTabs
{
	public Ores ()
	{
		super ( getNextID (), DatMod.MODID + "_ores" );
	}

	@Override
	public Item getTabIconItem ()
	{
		return Item.getItemFromBlock ( Blocks.diamondiumOre );
	}
}
