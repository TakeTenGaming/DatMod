package xlxacidxlx.datmod.creativetab;

import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.register.Items;

/**
 * Created by Acid on 10/26/2016.
 */
public class Ingots extends net.minecraft.creativetab.CreativeTabs {
	/**
	 * Constructs the Ingots Creative Tab
	 */
	public Ingots() {
		super(getNextID(), DatMod.MODID + "_ingots");
	}

	@Override
	public Item getTabIconItem() {
		return Items.diamondium;
	}
}
