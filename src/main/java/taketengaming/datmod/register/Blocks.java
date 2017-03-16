package taketengaming.datmod.register;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import taketengaming.datmod.ConfigHandler;
import taketengaming.datmod.block.*;
import taketengaming.datmod.machine.furnace.BlockFurnace;
import taketengaming.datmod.machine.generator.BlockGenerator;
import taketengaming.datmod.machine.powerbank.BlockPowerBank;
import taketengaming.datmod.machine.pulverizer.BlockPulverizer;
import taketengaming.tencore.block.Block;
import taketengaming.tencore.block.BlockOre;

/**
 * Created by Acid on 10/26/2016.
 */
public class Blocks
{
	public static BlockDiamondium diamondium;
	public static BlockDiamondiumOre diamondiumOre;

	public static BlockEmeraldi emeraldi;
	public static BlockEmeraldiOre emeraldiOre;

	public static BlockFurnace furnace;

	public static BlockGenerator generator;

	public static BlockGoldirite goldirite;

	public static BlockGoldiriteOre goldiriteOre;
	public static BlockIronium ironium;

	public static BlockIroniumOre ironiumOre;

	public static BlockPowerBank powerBank;

	public static BlockPulverizer pulverizer;

	public static void preInit ()
	{
		diamondium = new BlockDiamondium ();
		diamondiumOre = new BlockDiamondiumOre ();

		emeraldi = new BlockEmeraldi ();
		emeraldiOre = new BlockEmeraldiOre ();

		furnace = new BlockFurnace ();

		generator = new BlockGenerator ();

		goldirite = new BlockGoldirite ();
		goldiriteOre = new BlockGoldiriteOre ();

		ironium = new BlockIronium ();
		ironiumOre = new BlockIroniumOre ();

		powerBank = new BlockPowerBank ();

		pulverizer = new BlockPulverizer ();

		registerBlocks ();
	}

	private static void registerBlock ( Block block )
	{
		GameRegistry.register ( block );
		GameRegistry.register ( new ItemBlock ( block ), block.getResourceLocation () );
	}

	private static void registerBlock ( Block block, int metadata )
	{
		GameRegistry.register ( block );
		GameRegistry.register ( new ItemBlock ( block ), block.getModelResourceLocation ( metadata ) );
	}

	private static void registerBlock ( BlockOre block )
	{
		GameRegistry.register ( block );
		GameRegistry.register ( new ItemBlock ( block ), block.getResourceLocation () );
	}

	private static void registerBlock ( BlockOre block, int metadata )
	{
		GameRegistry.register ( block );
		GameRegistry.register ( new ItemBlock ( block ), block.getModelResourceLocation ( metadata ) );
	}

	private static void registerBlocks ()
	{
		if ( ConfigHandler.enableOreGenerationDiamondium )
		{
			registerBlock ( diamondium );
			registerBlock ( diamondiumOre );
		}

		if ( ConfigHandler.enableOreGenerationEmeraldi )
		{
			registerBlock ( emeraldi );
			registerBlock ( emeraldiOre );
		}

		registerBlock ( furnace );

		registerBlock ( generator );

		if ( ConfigHandler.enableOreGenerationGoldirite )
		{
			registerBlock ( goldirite );
			registerBlock ( goldiriteOre );
		}


		if ( ConfigHandler.enableOreGenerationIronium )
		{
			registerBlock ( ironium );
			registerBlock ( ironiumOre );
		}

		registerBlock ( powerBank );
		registerBlock ( pulverizer );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( Block block )
	{
		Item item = Item.getItemFromBlock ( block );
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ();
		itemModelMesher.register ( item, 0, block.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( Block block, int metadata )
	{
		Item item = Item.getItemFromBlock ( block );
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ();
		itemModelMesher.register ( item, metadata, block.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( BlockOre block )
	{
		Item item = Item.getItemFromBlock ( block );
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ();
		itemModelMesher.register ( item, 0, block.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	private static void registerRender ( BlockOre block, int metadata )
	{
		Item item = Item.getItemFromBlock ( block );
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft ().getRenderItem ().getItemModelMesher ();
		itemModelMesher.register ( item, metadata, block.getModelResourceLocation () );
	}

	@SideOnly( Side.CLIENT )
	public static void registerRenders ()
	{
		registerRender ( diamondium );
		registerRender ( diamondiumOre );

		registerRender ( emeraldi );
		registerRender ( emeraldiOre );

		registerRender ( furnace );

		registerRender ( generator );

		registerRender ( goldirite );
		registerRender ( goldiriteOre );

		registerRender ( ironium );
		registerRender ( ironiumOre );

		registerRender ( powerBank );

		registerRender ( pulverizer );
	}
}
