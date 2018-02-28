package net.taketengaming.datmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.taketengaming.datmod.util.BlockBase;
import net.taketengaming.datmod.util.BlockOreBase;

import java.util.ArrayList;

public class ModBlocks
{
	// Config Holders
	// Tools
	public static boolean enableAllTools = ModConfig.Tools._general.enabled;
	public static boolean enableCoalTools = ModConfig.Tools.coal.enabled;
	public static boolean enableDiamondiumTools = ModConfig.Tools.diamondium.enabled;
	public static boolean enableEmeraldiTools = ModConfig.Tools.emeraldi.enabled;
	public static boolean enableGoldiriteTools = ModConfig.Tools.goldirite.enabled;
	public static boolean enableIroniumTools = ModConfig.Tools.ironium.enabled;
	public static boolean enableLapisLazuliTools = ModConfig.Tools.lapisLazuli.enabled;
	public static boolean enableNetherQuartzTools = ModConfig.Tools.netherQuartz.enabled;
	public static boolean enableRedstoneTools = ModConfig.Tools.redstone.enabled;

	// Blocks
	public static BlockBase diamondiumBlock = new BlockBase ( Material.ROCK, "diamondium_block" );
	public static BlockOreBase diamondiumOre = new BlockOreBase ( "diamondium_ore" );
	public static BlockBase emeraldiBlock = new BlockBase ( Material.ROCK, "emeraldi_block" );
	public static BlockOreBase emeraldiOre = new BlockOreBase ( "emeraldi_ore" );
	public static BlockBase goldiriteBlock = new BlockBase ( Material.ROCK, "goldirite_block" );
	public static BlockOreBase goldiriteOre = new BlockOreBase ( "goldirite_ore" );
	public static BlockBase ironiumBlock = new BlockBase ( Material.ROCK, "ironium_block" );
	public static BlockOreBase ironiumOre = new BlockOreBase ( "ironium_ore" );

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
