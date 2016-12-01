package xlxacidxlx.datmod.proxy;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.base.Item;
import xlxacidxlx.datmod.register.Blocks;
import xlxacidxlx.datmod.register.Items;

/**
 * Created by Acid on 10/26/2016.
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		OBJLoader.INSTANCE.addDomain(DatMod.MODID);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Items.registerRenders();
		Blocks.registerRenders();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
	}

	public void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, item.getModelResourceLocation());
	}

	public void registerModel(Item item, int metadata) {
		ModelLoader.setCustomModelResourceLocation(item, metadata, item.getModelResourceLocation(metadata));
	}
}
