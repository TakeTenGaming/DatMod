package xlxacidxlx.datmod.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemAxe extends net.minecraft.item.ItemAxe {
	/**
	 * Constructs the ItemAxe
	 *
	 * @param material The material the axe is made of
	 * @param name     The name of the axe
	 */
	public ItemAxe(ToolMaterial material, String name) {
		super(material, material.getDamageVsEntity(), material.getEfficiencyOnProperMaterial());

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
