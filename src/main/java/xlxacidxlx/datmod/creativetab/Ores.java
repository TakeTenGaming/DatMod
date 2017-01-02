package xlxacidxlx.datmod.creativetab;

import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

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
		return Item.getItemFromBlock ( xlxacidxlx.datmod.register.Blocks.diamondiumOre );
	}
}
