package taketengaming.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemLapisLazuliChestplate extends ItemArmor
{
	public ItemLapisLazuliChestplate ()
	{
		super ( Materials.lapisLazuliArmor, EntityEquipmentSlot.CHEST, "Lapis Lazuli Chestplate" );

		this.setCreativeTab ( CreativeTabs.armors );
	}
}
