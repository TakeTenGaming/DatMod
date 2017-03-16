package taketengaming.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemLapisLazuliBoots extends ItemArmor
{
	public ItemLapisLazuliBoots ()
	{
		super ( Materials.lapisLazuliArmor, EntityEquipmentSlot.FEET, "Lapis Lazuli Boots" );

		this.setCreativeTab ( CreativeTabs.armors );
	}
}
