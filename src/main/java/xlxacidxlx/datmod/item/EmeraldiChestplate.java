package xlxacidxlx.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class EmeraldiChestplate extends ItemArmor {
	/**
	 * Constructs the Emeraldi Chestplate
	 */
	public EmeraldiChestplate() {
		super(Materials.emeraldiArmor, EntityEquipmentSlot.CHEST, "Emeraldi Chestplate");
	}
}
