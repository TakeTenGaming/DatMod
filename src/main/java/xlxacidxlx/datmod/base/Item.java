package xlxacidxlx.datmod.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 11/1/2016.
 */
public class Item extends net.minecraft.item.Item
{
	public Item ( String name )
	{
		setCreativeTab ( CreativeTabs.items );

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

	public String getName ()
	{
		return this.toString ().toLowerCase ();
	}
}
