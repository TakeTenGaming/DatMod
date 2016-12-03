package xlxacidxlx.datmod.register;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.base.Block;
import xlxacidxlx.datmod.block.*;

/**
 * Created by Acid on 10/26/2016.
 */
public class Blocks {
	public static Diamondium diamondium;
	public static DiamondiumOre diamondiumOre;

	public static Emeraldi emeraldi;
	public static EmeraldiOre emeraldiOre;

	public static Goldirite goldirite;
	public static GoldiriteOre goldiriteOre;

	public static Ironium ironium;
	public static IroniumOre ironiumOre;

	public static void preInit() {
		diamondium = new Diamondium();
		diamondiumOre = new DiamondiumOre();

		emeraldi = new Emeraldi();
		emeraldiOre = new EmeraldiOre();

		goldirite = new Goldirite();
		goldiriteOre = new GoldiriteOre();

		ironium = new Ironium();
		ironiumOre = new IroniumOre();

		registerBlocks();
	}

	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block), block.getResourceLocation());
	}

	private static void registerBlock(Block block, int metadata) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block), block.getModelResourceLocation(metadata));
	}

	private static void registerBlocks() {
		if (!ConfigHandler.enableOreGeneration) {
			return;
		}

		if (ConfigHandler.enableOreGenerationDiamondium) {
			registerBlock(diamondium);
			registerBlock(diamondiumOre);
		}

		if (ConfigHandler.enableOreGenerationEmeraldi) {
			registerBlock(emeraldi);
			registerBlock(emeraldiOre);
		}

		if (ConfigHandler.enableOreGenerationGoldirite) {
			registerBlock(goldirite);
			registerBlock(goldiriteOre);
		}

		if (ConfigHandler.enableOreGenerationIronium) {
			registerBlock(ironium);
			registerBlock(ironiumOre);
		}
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		itemModelMesher.register(item, 0, block.getModelResourceLocation());
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block, int metadata) {
		Item item = Item.getItemFromBlock(block);
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		itemModelMesher.register(item, metadata, block.getModelResourceLocation());
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(diamondium);
		registerRender(diamondiumOre);

		registerRender(emeraldi);
		registerRender(emeraldiOre);

		registerRender(goldirite);
		registerRender(goldiriteOre);

		registerRender(ironium);
		registerRender(ironiumOre);
	}
}
