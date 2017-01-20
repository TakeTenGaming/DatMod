package taketengaming.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class GoldiriteHelmet extends ItemArmor
{
	public GoldiriteHelmet ()
	{
		super ( Materials.goldiriteArmor, EntityEquipmentSlot.HEAD, "Goldirite Helmet" );

		setCreativeTab ( CreativeTabs.armors );
	}
}
