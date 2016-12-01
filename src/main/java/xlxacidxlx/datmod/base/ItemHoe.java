package xlxacidxlx.datmod.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemHoe extends net.minecraft.item.ItemHoe {
	public ItemHoe(ToolMaterial material, String name) {
		super(material);

		setCreativeTab(CreativeTabs.tools);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);
	}

	public ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	public ModelResourceLocation getModelResourceLocation(int metadata) {
		return new ModelResourceLocation(getRegistryName() + "_" + metadata, "inventory");
	}
}
