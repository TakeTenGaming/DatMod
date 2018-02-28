package net.taketengaming.datmod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.taketengaming.datmod.DatMod;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerItemRenderer ( Item item, int meta, String id )
	{
		ModelLoader.setCustomModelResourceLocation ( item, meta, new ModelResourceLocation ( DatMod.MODID + ":" + id, "inventory" ) );
	}

	@Override
	public void registerRenderers ()
	{
		// TODO: Register TileEntitySpecialRenderer's here
	}
}
