package xlxacidxlx.datmod.creativetab;

import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.register.Items;

/**
 * Created by Acid on 10/26/2016.
 */
public class Dusts extends net.minecraft.creativetab.CreativeTabs {
	/**
	 * Constructs the Dusts Creative Tab
	 */
	public Dusts() {
		super(getNextID(), DatMod.MODID + "_dusts");
	}

	@Override
	public Item getTabIconItem() {
		return Items.ironiumDust;
	}
}
