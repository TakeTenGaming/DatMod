package xlxacidxlx.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class DiamondiumHelmet extends ItemArmor {
	/**
	 * Constructs the Diamondium Helmet
	 */
	public DiamondiumHelmet() {
		super(Materials.diamondiumArmor, EntityEquipmentSlot.HEAD, "Diamondium Helmet");
	}
}
