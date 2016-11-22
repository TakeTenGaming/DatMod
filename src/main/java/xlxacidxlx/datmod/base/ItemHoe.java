package xlxacidxlx.datmod.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemHoe extends net.minecraft.item.ItemHoe {
	/**
	 * Constructs the ItemHoe
	 *
	 * @param material The material the hoe is made of
	 * @param name     The name of the hoe
	 */
	public ItemHoe(ToolMaterial material, String name) {
		super(material);

		setCreativeTab(CreativeTabs.tools);

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
}
