package taketengaming.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class LapisLazuliBoots extends ItemArmor
{
	public LapisLazuliBoots ()
	{
		super ( Materials.lapisLazuliArmor, EntityEquipmentSlot.FEET, "Lapis Lazuli Boots" );

		setCreativeTab ( CreativeTabs.armors );
	}
}
