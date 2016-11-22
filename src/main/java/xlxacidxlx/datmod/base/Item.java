package xlxacidxlx.datmod.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 11/1/2016.
 */
public class Item extends net.minecraft.item.Item {
	/**
	 * Constructs the Item
	 *
	 * @param name The name of the item
	 */
	public Item(String name) {
		setCreativeTab(CreativeTabs.items);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);
	}

	/**
	 * Gets the items model location
	 *
	 * @return ModelResourceLocation
	 */
	public ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	/**
	 * Gets the item's name
	 *
	 * @return String
	 */
	public String getName() {
		return this.toString().toLowerCase();
	}
}
