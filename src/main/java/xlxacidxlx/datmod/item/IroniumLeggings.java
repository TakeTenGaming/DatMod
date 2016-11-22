package xlxacidxlx.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class IroniumLeggings extends ItemArmor {
	/**
	 * Constructs the Ironium Leggings
	 */
	public IroniumLeggings() {
		super(Materials.ironiumArmor, EntityEquipmentSlot.LEGS, "Ironium Leggings");
	}
}
