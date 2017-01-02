package xlxacidxlx.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class IroniumChestplate extends ItemArmor
{
	public IroniumChestplate ()
	{
		super ( Materials.ironiumArmor, EntityEquipmentSlot.CHEST, "Ironium Chestplate" );
	}
}
