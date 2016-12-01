package xlxacidxlx.datmod.creativetab;

import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

/**
 * Created by Acid on 11/20/2016.
 */
public class Armors extends net.minecraft.creativetab.CreativeTabs {
	public Armors() {
		super(getNextID(), DatMod.MODID + "_armors");
	}

	@Override
	public Item getTabIconItem() {
		return xlxacidxlx.datmod.register.Items.diamondiumHelmet;
	}
}
