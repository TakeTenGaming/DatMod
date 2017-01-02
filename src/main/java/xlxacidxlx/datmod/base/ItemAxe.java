package xlxacidxlx.datmod.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemAxe extends net.minecraft.item.ItemAxe
{
	public ItemAxe ( ToolMaterial material, String name )
	{
		super ( material, material.getDamageVsEntity (), material.getEfficiencyOnProperMaterial () );

		setCreativeTab ( CreativeTabs.tools );

		name = name.toLowerCase ().replace ( " ", "" );
		setRegistryName ( DatMod.MODID, name );
		setUnlocalizedName ( name );
	}

	public ModelResourceLocation getModelResourceLocation ()
	{
		return new ModelResourceLocation ( getRegistryName (), "inventory" );
	}

	public ModelResourceLocation getModelResourceLocation ( int metadata )
	{
		return new ModelResourceLocation ( getRegistryName () + "_" + metadata, "inventory" );
	}
}
