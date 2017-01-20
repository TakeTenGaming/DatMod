package taketengaming.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class IroniumChestplate extends ItemArmor
{
	public IroniumChestplate ()
	{
		super ( Materials.ironiumArmor, EntityEquipmentSlot.CHEST, "Ironium Chestplate" );

		setCreativeTab ( CreativeTabs.armors );
	}
}
