package xlxacidxlx.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class RedstoneChestplate extends ItemArmor {
	public RedstoneChestplate() {
		super(Materials.redstoneArmor, EntityEquipmentSlot.CHEST, "Redstone Chestplate");
	}
}