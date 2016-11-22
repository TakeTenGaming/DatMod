package xlxacidxlx.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class DiamondiumLeggings extends ItemArmor {
	/**
	 * Constructs the Diamondium Leggings
	 */
	public DiamondiumLeggings() {
		super(Materials.diamondiumArmor, EntityEquipmentSlot.LEGS, "Diamondium Leggings");
	}
}
