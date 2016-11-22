package xlxacidxlx.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class IroniumBoots extends ItemArmor {
	/**
	 * Constructs the Ironium Boots
	 */
	public IroniumBoots() {
		super(Materials.ironiumArmor, EntityEquipmentSlot.FEET, "Ironium Boots");
	}
}
