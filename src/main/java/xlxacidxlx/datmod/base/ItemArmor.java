package xlxacidxlx.datmod.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemArmor extends net.minecraft.item.ItemArmor {
	/**
	 * Constructs the ItemArmor
	 *
	 * @param materialIn      The material the armor is made of
	 * @param equipmentSlotIn Which slot the armor piece goes in
	 * @param name            The name of the armor piece
	 */
	public ItemArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String name) {
		super(materialIn, -1, equipmentSlotIn);

		setCreativeTab(CreativeTabs.armors);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);
	}

	/**
	 * Returns the model's resource location
	 */
	public ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	/**
	 * Gets the block's resource location
	 */
	public ResourceLocation getResourceLocation() {
		return getRegistryName();
	}

	@Override
	public boolean hasOverlay(ItemStack stack) {
		return false;
	}
}
