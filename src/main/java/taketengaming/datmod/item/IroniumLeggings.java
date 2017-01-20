package taketengaming.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class IroniumLeggings extends ItemArmor
{
	public IroniumLeggings ()
	{
		super ( Materials.ironiumArmor, EntityEquipmentSlot.LEGS, "Ironium Leggings" );

		setCreativeTab ( CreativeTabs.armors );
	}
}
