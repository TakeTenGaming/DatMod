package xlxacidxlx.datmod.register;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.base.Item;

/**
 * Created by Acid on 11/10/2016.
 */
public class Recipes {
	/**
	 * Registers all the recipes during Forge's initialization event
	 */
	public static void init() {
		registerRecipes();
		registerShapelessRecipes();
		registerSmeltingRecipes();
	}

	/**
	 * Registers the specified recipe
	 *
	 * @param output    The item to receive from crafting
	 * @param lineOne   The first line's recipe
	 * @param lineTwo   The second line's recipe
	 * @param lineThree The third line's recipe
	 * @param input     Items that go into crafting the item
	 */
	public static void registerRecipe(ItemStack output, String lineOne, String lineTwo, String lineThree, ItemStack input) {
		GameRegistry.addRecipe(output, lineOne, lineTwo, lineThree, input);
	}

	/**
	 * Registers the specified recipe
	 *
	 * @param output The item to get from crafting
	 * @param params An object of crafting lines and ingredients
	 */
	public static void registerRecipe(ItemStack output, Object... params) {
		GameRegistry.addRecipe(output, params);
	}

	/**
	 * Registers the recipes
	 */
	private static void registerRecipes() {
		Item diamondium = Items.diamondium;
		Item emeraldi = Items.emeraldi;
		Item goldiriteIngot = Items.goldiriteIngot;
		Item ironiumIngot = Items.ironiumIngot;

		ItemStack lapis = new ItemStack(net.minecraft.init.Items.DYE, 1, 2);
		net.minecraft.item.Item stick = net.minecraft.init.Items.STICK;
		net.minecraft.item.Item redstone = net.minecraft.init.Items.REDSTONE;

		// Axes
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumAxe), new Object[]{
				" DD",
				" SD",
				" S ",
				'D', diamondium,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiAxe), new Object[]{
				" EE",
				" SE",
				" S ",
				'E', emeraldi,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteAxe), new Object[]{
				" GG",
				" SG",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumAxe), new Object[]{
				" II",
				" SI",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.lapisLazuliAxe), new Object[]{
				" LL",
				" SL",
				" S ",
				'L', lapis,
				'S', stick
		});

		// Blocks
		GameRegistry.addRecipe(new ItemStack(Blocks.diamondium), new Object[]{
				"DDD",
				"DDD",
				"DDD",
				'D', diamondium
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.emeraldi), new Object[]{
				"EEE",
				"EEE",
				"EEE",
				'E', emeraldi
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.goldirite), new Object[]{
				"GGG",
				"GGG",
				"GGG",
				'G', goldiriteIngot
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.ironium), new Object[]{
				"III",
				"III",
				"III",
				'I', ironiumIngot
		});

		// Boots
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumBoots), new Object[]{
				"D D",
				"D D",
				"   ",
				'D', diamondium
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiBoots), new Object[]{
				"E E",
				"E E",
				"   ",
				'E', emeraldi
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteBoots), new Object[]{
				"G G",
				"G G",
				"   ",
				'G', goldiriteIngot
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumBoots), new Object[]{
				"I I",
				"I I",
				"   ",
				'I', ironiumIngot
		});
		GameRegistry.addRecipe(new ItemStack(Items.lapisLazuliBoots), new Object[]{
				"L L",
				"L L",
				"   ",
				'L', lapis
		});
		GameRegistry.addRecipe(new ItemStack(Items.redstoneBoots), new Object[]{
				"R R",
				"R R",
				"   ",
				'R', redstone
		});

		// Chestplates
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumChestplate), new Object[]{
				"D D",
				"DDD",
				"DDD",
				'D', diamondium
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiChestplate), new Object[]{
				"E E",
				"EEE",
				"EEE",
				'E', emeraldi
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteChestplate), new Object[]{
				"G G",
				"GGG",
				"GGG",
				'G', goldiriteIngot
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumChestplate), new Object[]{
				"I I",
				"III",
				"III",
				'I', ironiumIngot
		});
		GameRegistry.addRecipe(new ItemStack(Items.lapisLazuliChestplate), new Object[]{
				"L L",
				"LLL",
				"LLL",
				'L', lapis
		});
		GameRegistry.addRecipe(new ItemStack(Items.redstoneChestplate), new Object[]{
				"R R",
				"RRR",
				"RRR",
				'R', redstone
		});

		// Helmets
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumHelmet), new Object[]{
				"DDD",
				"D D",
				"   ",
				'D', diamondium
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiHelmet), new Object[]{
				"EEE",
				"E E",
				"   ",
				'E', emeraldi
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteHelmet), new Object[]{
				"GGG",
				"G G",
				"   ",
				'G', goldiriteIngot
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumHelmet), new Object[]{
				"III",
				"I I",
				"   ",
				'I', ironiumIngot
		});
		GameRegistry.addRecipe(new ItemStack(Items.lapisLazuliHelmet), new Object[]{
				"LLL",
				"L L",
				"   ",
				'L', lapis
		});
		GameRegistry.addRecipe(new ItemStack(Items.redstoneHelmet), new Object[]{
				"RRR",
				"R R",
				"   ",
				'R', redstone
		});

		// Hoes
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumHoe), new Object[]{
				" DD",
				" S ",
				" S ",
				'D', diamondium,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiHoe), new Object[]{
				" EE",
				" S ",
				" S ",
				'E', emeraldi,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteHoe), new Object[]{
				" GG",
				" S ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumHoe), new Object[]{
				" II",
				" S ",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.lapisLazuliHoe), new Object[]{
				" LL",
				" S ",
				" S ",
				'L', lapis,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.redstoneHoe), new Object[]{
				" RR",
				" S ",
				" S ",
				'R', redstone,
				'S', stick
		});

		// Leggings
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumLeggings), new Object[]{
				"DDD",
				"D D",
				"D D",
				'D', diamondium
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiLeggings), new Object[]{
				"EEE",
				"E E",
				"E E",
				'E', emeraldi
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteLeggings), new Object[]{
				"GGG",
				"G G",
				"G G",
				'G', goldiriteIngot
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumLeggings), new Object[]{
				"III",
				"I I",
				"I I",
				'I', ironiumIngot
		});
		GameRegistry.addRecipe(new ItemStack(Items.lapisLazuliLeggings), new Object[]{
				"LLL",
				"L L",
				"L L",
				'L', lapis
		});
		GameRegistry.addRecipe(new ItemStack(Items.redstoneLeggings), new Object[]{
				"RRR",
				"R R",
				"R R",
				'R', redstone
		});

		// Magnet
		GameRegistry.addRecipe(new ItemStack(Items.magnetItem), new Object[]{
				"III",
				"IRI",
				"I I",
				'I', ironiumIngot,
				'R', redstone
		});

		// Pickaxes
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumPickaxe), new Object[]{
				"DDD",
				" S ",
				" S ",
				'D', diamondium,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiPickaxe), new Object[]{
				"EEE",
				" S ",
				" S ",
				'E', emeraldi,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiritePickaxe), new Object[]{
				"GGG",
				" S ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumPickaxe), new Object[]{
				"III",
				" S ",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.lapisLazuliPickaxe), new Object[]{
				"LLL",
				" S ",
				" S ",
				'L', lapis,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.redstonePickaxe), new Object[]{
				"RRR",
				" S ",
				" S ",
				'R', redstone,
				'S', stick
		});

		// Shovels
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumShovel), new Object[]{
				" D ",
				" S ",
				" S ",
				'D', diamondium,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiShovel), new Object[]{
				" E ",
				" S ",
				" S ",
				'E', emeraldi,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteShovel), new Object[]{
				" G ",
				" S ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumShovel), new Object[]{
				" I ",
				" S ",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.lapisLazuliShovel), new Object[]{
				" L ",
				" S ",
				" S ",
				'L', lapis,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.redstoneShovel), new Object[]{
				" R ",
				" S ",
				" S ",
				'R', redstone,
				'S', stick
		});

		// Swords
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumSword), new Object[]{
				" D ",
				" D ",
				" S ",
				'D', diamondium,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiSword), new Object[]{
				" E ",
				" E ",
				" S ",
				'E', emeraldi,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteSword), new Object[]{
				" G ",
				" G ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumSword), new Object[]{
				" I ",
				" I ",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.lapisLazuliSword), new Object[]{
				" L ",
				" L ",
				" S ",
				'L', lapis,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.redstoneSword), new Object[]{
				" R ",
				" R ",
				" S ",
				'R', redstone,
				'S', stick
		});
	}

	/**
	 * Registers a shapeless recipe
	 *
	 * @param output The item to receive from crafting
	 * @param input  The item to put in for crafting
	 */
	public static void registerShapelessRecipe(ItemStack output, ItemStack input) {
		GameRegistry.addShapelessRecipe(output, input);
	}

	/**
	 * Registers all shapeless recipes
	 */
	private static void registerShapelessRecipes() {
	}

	/**
	 * Registers a smelting recipe
	 *
	 * @param input  The item to put in to smelt
	 * @param output The item received from smelting
	 * @param xp     The amount of XP gained from smelting the item
	 */
	private static void registerSmeltingRecipe(ItemStack input, ItemStack output, float xp) {
		GameRegistry.addSmelting(input, output, xp);
	}

	/**
	 * Registers all smelting recipes
	 */
	private static void registerSmeltingRecipes() {
		float xp = 0.5f;
		float xpDiamondium = 1.5f;
		float xpEmeraldi = 0.8f;
		float xpGoldirite = 0.6f;
		float xpIronium = xp;
		float xpLeather = 0.1f;

		registerSmeltingRecipe(new ItemStack(Blocks.diamondiumOre), new ItemStack(Items.diamondium), xpDiamondium);
		registerSmeltingRecipe(new ItemStack(Blocks.emeraldiOre), new ItemStack(Items.emeraldi), xpEmeraldi);
		registerSmeltingRecipe(new ItemStack(Blocks.goldiriteOre), new ItemStack(Items.goldiriteIngot), xpGoldirite);
		registerSmeltingRecipe(new ItemStack(Blocks.ironiumOre), new ItemStack(Items.ironiumIngot), xpIronium);

		if (ConfigHandler.enableRottenFleshToLeatherRecipe) {
			registerSmeltingRecipe(new ItemStack(net.minecraft.init.Items.ROTTEN_FLESH), new ItemStack(net.minecraft.init.Items.LEATHER), xpLeather);
		}
	}
}
