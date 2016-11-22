package xlxacidxlx.datmod.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSpade;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemShovel extends ItemSpade {
	/**
	 * Constructs the ItemShovel
	 *
	 * @param material The material the shovel is made of
	 * @param name     The name of the shovel
	 */
	public ItemShovel(ToolMaterial material, String name) {
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
