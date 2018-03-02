package net.taketengaming.datmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.taketengaming.datmod.block.*;
import net.taketengaming.datmod.util.BlockBase;

import java.util.ArrayList;

public class ModBlocks
{
	// Config Holders
	// Tools
	public static boolean enableAllTools = ModConfig.Tools.global.enableAll;
	public static boolean enableDiamondiumTools = ModConfig.Tools.global.enableDiamondium;
	public static boolean enableEmeraldiTools = ModConfig.Tools.global.enableEmeraldi;
	public static boolean enableGoldiriteTools = ModConfig.Tools.global.enableGoldirite;
	public static boolean enableIroniumTools = ModConfig.Tools.global.enableIronium;

	// Blocks
	public static BlockDiamondiumBlock diamondiumBlock = new BlockDiamondiumBlock ();
	public static BlockDiamondiumOre diamondiumOre = new BlockDiamondiumOre ();
	public static BlockEmeraldiBlock emeraldiBlock = new BlockEmeraldiBlock ();
	public static BlockEmeraldiOre emeraldiOre = new BlockEmeraldiOre ();
	public static BlockGoldiriteBlock goldiriteBlock = new BlockGoldiriteBlock ();
	public static BlockGoldiriteOre goldiriteOre = new BlockGoldiriteOre ();
	public static BlockIroniumBlock ironiumBlock = new BlockIroniumBlock ();
	public static BlockIroniumOre ironiumOre = new BlockIroniumOre ();

	public static void initOreDict ()
	{
		if ( enableAllTools )
		{
			diamondiumBlock.initOreDict ();
			diamondiumOre.initOreDict ();
			emeraldiBlock.initOreDict ();
			emeraldiOre.initOreDict ();
			goldiriteBlock.initOreDict ();
			goldiriteOre.initOreDict ();
			ironiumBlock.initOreDict ();
			ironiumOre.initOreDict ();
		}
		else
		{
			if ( enableDiamondiumTools )
			{
				diamondiumBlock.initOreDict ();
				diamondiumOre.initOreDict ();
			}

			if ( enableEmeraldiTools )
			{
				emeraldiBlock.initOreDict ();
				emeraldiOre.initOreDict ();
			}

			if ( enableGoldiriteTools )
			{
				goldiriteBlock.initOreDict ();
				goldiriteOre.initOreDict ();
			}

			if ( enableIroniumTools )
			{
				ironiumBlock.initOreDict ();
				ironiumOre.initOreDict ();
			}
		}
	}

	public static void register ( IForgeRegistry< Block > registry )
	{
		DatMod.logEventStart ( "registry" );

		// Blocks
		DatMod.logger.info ( "Registering Blocks.." );
		if ( enableAllTools )
		{
			registry.registerAll (
					diamondiumBlock,
					diamondiumOre,
					emeraldiBlock,
					emeraldiOre,
					goldiriteBlock,
					goldiriteOre,
					ironiumBlock,
					ironiumOre
			);
		}
		else
		{
			ArrayList< BlockBase > registerableBlocks = new ArrayList<> ();

			if ( enableDiamondiumTools )
			{
				registerableBlocks.add ( diamondiumBlock );
				registerableBlocks.add ( diamondiumOre );
			}

			if ( enableEmeraldiTools )
			{
				registerableBlocks.add ( emeraldiBlock );
				registerableBlocks.add ( emeraldiOre );
			}

			if ( enableGoldiriteTools )
			{
				registerableBlocks.add ( goldiriteBlock );
				registerableBlocks.add ( goldiriteOre );
			}

			if ( enableIroniumTools )
			{
				registerableBlocks.add ( ironiumBlock );
				registerableBlocks.add ( ironiumOre );
			}

			for ( BlockBase block : registerableBlocks )
			{
				registry.register ( block );
			}
		}

		// Tile Entities
		DatMod.logger.info ( "Registering TileEntity's..." );

		DatMod.logEventEnd ( "registry" );
	}

	public static void registerItemBlocks ( IForgeRegistry< Item > registry )
	{
		if ( enableAllTools )
		{
			registry.registerAll (
					diamondiumBlock.createItemBlock (),
					diamondiumOre.createItemBlock (),
					emeraldiBlock.createItemBlock (),
					emeraldiOre.createItemBlock (),
					goldiriteBlock.createItemBlock (),
					goldiriteOre.createItemBlock (),
					ironiumBlock.createItemBlock (),
					ironiumOre.createItemBlock ()
			);
		}
		else
		{
			ArrayList< BlockBase > registerBlocks = new ArrayList<> ();

			if ( enableDiamondiumTools )
			{
				registerBlocks.add ( diamondiumBlock );
				registerBlocks.add ( diamondiumOre );
			}

			if ( enableEmeraldiTools )
			{
				registerBlocks.add ( emeraldiBlock );
				registerBlocks.add ( emeraldiOre );
			}

			if ( enableGoldiriteTools )
			{
				registerBlocks.add ( goldiriteBlock );
				registerBlocks.add ( goldiriteOre );
			}

			if ( enableIroniumTools )
			{
				registerBlocks.add ( ironiumBlock );
				registerBlocks.add ( ironiumOre );
			}

			for ( BlockBase block : registerBlocks )
			{
				registry.register ( Item.getItemFromBlock ( block ) );
			}
		}
	}

	public static void registerModels ()
	{
		if ( enableAllTools )
		{
			diamondiumBlock.registerItemModel ( Item.getItemFromBlock ( diamondiumBlock ) );
			diamondiumOre.registerItemModel ( Item.getItemFromBlock ( diamondiumOre ) );
			emeraldiBlock.registerItemModel ( Item.getItemFromBlock ( emeraldiBlock ) );
			emeraldiOre.registerItemModel ( Item.getItemFromBlock ( emeraldiOre ) );
			goldiriteBlock.registerItemModel ( Item.getItemFromBlock ( goldiriteBlock ) );
			goldiriteOre.registerItemModel ( Item.getItemFromBlock ( goldiriteOre ) );
			ironiumBlock.registerItemModel ( Item.getItemFromBlock ( ironiumBlock ) );
			ironiumOre.registerItemModel ( Item.getItemFromBlock ( ironiumOre ) );
		}
		else
		{
			ArrayList< BlockBase > registerBlocks = new ArrayList<> ();

			if ( enableDiamondiumTools )
			{
				registerBlocks.add ( diamondiumBlock );
				registerBlocks.add ( diamondiumOre );
			}

			if ( enableEmeraldiTools )
			{
				registerBlocks.add ( emeraldiBlock );
				registerBlocks.add ( emeraldiOre );
			}

			if ( enableGoldiriteTools )
			{
				registerBlocks.add ( goldiriteBlock );
				registerBlocks.add ( goldiriteOre );
			}

			if ( enableIroniumTools )
			{
				registerBlocks.add ( ironiumBlock );
				registerBlocks.add ( ironiumOre );
			}

			for ( BlockBase block : registerBlocks )
			{
				block.registerItemModel ( Item.getItemFromBlock ( block ) );
			}
		}
	}
}
