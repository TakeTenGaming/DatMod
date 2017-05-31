package taketengaming.datmod.register;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import taketengaming.datmod.ConfigHandler;

/**
 * Created by Acid on 11/10/2016.
 */
public class Recipes
{
	public static void init ()
	{
		registerRecipes ();
		registerSmeltingRecipes ();
	}

	private static void registerRecipes ()
	{
		Item diamondium = Items.diamondium;
		Item emeraldi = Items.emeraldi;
		Item goldiriteIngot = Items.goldiriteIngot;
		Item ironiumIngot = Items.ironiumIngot;

		Item ironIngot = net.minecraft.init.Items.IRON_INGOT;
		ItemStack lapis = new ItemStack ( net.minecraft.init.Items.DYE, 1, 4 );
		net.minecraft.item.Item stick = net.minecraft.init.Items.STICK;
		net.minecraft.item.Item redstone = net.minecraft.init.Items.REDSTONE;

		// Axes
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.diamondiumAxe ), " DD", " SD", " S ", 'D', diamondium, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.emeraldiAxe ), " EE", " SE", " S ", 'E', emeraldi, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.goldiriteAxe ), " GG", " SG", " S ", 'G', goldiriteIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.ironiumAxe ), " II", " SI", " S ", 'I', ironiumIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.lapisLazuliAxe ), " LL", " SL", " S ", 'L', lapis, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.redstoneAxe ), " RR", " SR", " S ", 'R', redstone, 'S', stick );

		// Blocks
		GameRegistry.addShapedRecipe ( new ItemStack ( Blocks.diamondium ), "DDD", "DDD", "DDD", 'D', diamondium );
		GameRegistry.addShapedRecipe ( new ItemStack ( Blocks.emeraldi ), "EEE", "EEE", "EEE", 'E', emeraldi );
		GameRegistry.addShapedRecipe ( new ItemStack ( Blocks.goldirite ), "GGG", "GGG", "GGG", 'G', goldiriteIngot );
		GameRegistry.addShapedRecipe ( new ItemStack ( Blocks.ironium ), "III", "III", "III", 'I', ironiumIngot );

		// Blocks > Gems/Ingots
		GameRegistry.addShapelessRecipe ( new ItemStack ( diamondium, 9 ), Blocks.diamondium );
		GameRegistry.addShapelessRecipe ( new ItemStack ( emeraldi, 9 ), Blocks.emeraldi );
		GameRegistry.addShapelessRecipe ( new ItemStack ( goldiriteIngot, 9 ), Blocks.goldirite );
		GameRegistry.addShapelessRecipe ( new ItemStack ( ironiumIngot, 9 ), Blocks.ironium );

		// Boots
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.diamondiumBoots ), "D D", "D D", "   ", 'D', diamondium );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.emeraldiBoots ), "E E", "E E", "   ", 'E', emeraldi );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.goldiriteBoots ), "G G", "G G", "   ", 'G', goldiriteIngot );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.ironiumBoots ), "I I", "I I", "   ", 'I', ironiumIngot );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.lapisLazuliBoots ), "L L", "L L", "   ", 'L', lapis );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.redstoneBoots ), "R R", "R R", "   ", 'R', redstone );

		// Chestplates
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.diamondiumChestplate ), "D D", "DDD", "DDD", 'D', diamondium );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.emeraldiChestplate ), "E E", "EEE", "EEE", 'E', emeraldi );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.goldiriteChestplate ), "G G", "GGG", "GGG", 'G', goldiriteIngot );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.ironiumChestplate ), "I I", "III", "III", 'I', ironiumIngot );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.lapisLazuliChestplate ), "L L", "LLL", "LLL", 'L', lapis );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.redstoneChestplate ), "R R", "RRR", "RRR", 'R', redstone );

		// Furnace
		GameRegistry.addRecipe ( new ItemStack ( Blocks.furnace ), "III", "I I", "III", 'I', ironiumIngot );

		// Generator
		GameRegistry.addRecipe ( new ItemStack ( Blocks.generator ), "III", "ICI", "III", 'C', net.minecraft.init.Items.COAL, 'I', ironiumIngot );

		// Helmets
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.diamondiumHelmet ), "DDD", "D D", "   ", 'D', diamondium );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.emeraldiHelmet ),
				"EEE", "E E", "   ", 'E', emeraldi );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.goldiriteHelmet ), "GGG", "G G", "   ", 'G', goldiriteIngot );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.ironiumHelmet ), "III", "I I", "   ", 'I', ironiumIngot );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.lapisLazuliHelmet ), "LLL", "L L", "   ", 'L', lapis );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.redstoneHelmet ), "RRR", "R R", "   ", 'R', redstone );

		// Hoes
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.diamondiumHoe ), " DD", " S ", " S ", 'D', diamondium, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.emeraldiHoe ), " EE", " S ", " S ", 'E', emeraldi, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.goldiriteHoe ), " GG", " S ", " S ", 'G', goldiriteIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.ironiumHoe ), " II", " S ", " S ", 'I', ironiumIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.lapisLazuliHoe ), " LL", " S ", " S ", 'L', lapis, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.redstoneHoe ), " RR", " S ", " S ", 'R', redstone, 'S', stick );

		// Leggings
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.diamondiumLeggings ), "DDD", "D D", "D D", 'D', diamondium );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.emeraldiLeggings ), "EEE", "E E", "E E", 'E', emeraldi );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.goldiriteLeggings ), "GGG", "G G", "G G", 'G', goldiriteIngot );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.ironiumLeggings ), "III", "I I", "I I", 'I', ironiumIngot );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.lapisLazuliLeggings ), "LLL", "L L", "L L", 'L', lapis );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.redstoneLeggings ), "RRR", "R R", "R R", 'R', redstone );

		// Magnet
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.magnetItem ), "I I", "IRI", "III", 'I', ironIngot, 'R', redstone );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.magnetItem ), "I I", "IRI", "III", 'I', ironiumIngot, 'R', redstone );

		// Pickaxes
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.diamondiumPickaxe ), "DDD", " S ", " S ", 'D', diamondium, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.emeraldiPickaxe ), "EEE", " S ", " S ", 'E', emeraldi, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.goldiritePickaxe ), "GGG", " S ", " S ", 'G', goldiriteIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.ironiumPickaxe ), "III", " S ", " S ", 'I', ironiumIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.lapisLazuliPickaxe ), "LLL", " S ", " S ", 'L', lapis, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.redstonePickaxe ), "RRR", " S ", " S ", 'R', redstone, 'S', stick );

		// Power Bank
		GameRegistry.addRecipe ( new ItemStack ( Blocks.powerBank ), "III", "IRI", "III", 'I', ironiumIngot, 'R', redstone );

		// Pulverizer
		GameRegistry.addRecipe ( new ItemStack ( Blocks.pulverizer ), "III", "IFI", "III", 'I', ironiumIngot, 'F', net.minecraft.init.Items.FLINT );

		// Shovels
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.diamondiumShovel ), " D ", " S ", " S ", 'D', diamondium, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.emeraldiShovel ), " E ", " S ", " S ", 'E', emeraldi, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.goldiriteShovel ), " G ", " S ", " S ", 'G', goldiriteIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.ironiumShovel ), " I ", " S ", " S ", 'I', ironiumIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.lapisLazuliShovel ), " L ", " S ", " S ", 'L', lapis, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.redstoneShovel ), " R ", " S ", " S ", 'R', redstone, 'S', stick );

		// Swords
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.diamondiumSword ), " D ", " D ", " S ", 'D', diamondium, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.emeraldiSword ), " E ", " E ", " S ", 'E', emeraldi, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.goldiriteSword ), " G ", " G ", " S ", 'G', goldiriteIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.ironiumSword ), " I ", " I ", " S ", 'I', ironiumIngot, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.lapisLazuliSword ), " L ", " L ", " S ", 'L', lapis, 'S', stick );
		GameRegistry.addShapedRecipe ( new ItemStack ( Items.redstoneSword ), " R ", " R ", " S ", 'R', redstone, 'S', stick );
	}

	private static void registerSmeltingRecipe ( ItemStack input, ItemStack output, float xp )
	{
		GameRegistry.addSmelting ( input, output, xp );
	}

	private static void registerSmeltingRecipes ()
	{
		float xp = 0.5F;
		float xpDust = ( xp + 0.1F );
		float xpDustGoldirite = ( xp + 0.4F );
		float xpDustIronium = ( xp + 0.2F );
		float xpGold = xpDust;
		float xpIron = xpDust;
		float xpLeather = ( xp + 0.1F );

		// Dust -> Gem/Ingot
		registerSmeltingRecipe ( new ItemStack ( Items.goldDust ), new ItemStack ( net.minecraft.init.Items.GOLD_INGOT ), xpGold );
		registerSmeltingRecipe ( new ItemStack ( Items.goldiriteDust ), new ItemStack ( Items.goldiriteIngot ), xpDustGoldirite );
		registerSmeltingRecipe ( new ItemStack ( Items.ironDust ), new ItemStack ( net.minecraft.init.Items.IRON_INGOT ), xpIron );
		registerSmeltingRecipe ( new ItemStack ( Items.ironiumDust ), new ItemStack ( Items.ironiumIngot ), xpDustIronium );

		// Rotten Flesh -> Leather
		if ( ConfigHandler.enableRottenFleshToLeatherRecipe )
		{
			registerSmeltingRecipe ( new ItemStack ( net.minecraft.init.Items.ROTTEN_FLESH ), new ItemStack ( net.minecraft.init.Items.LEATHER ), xpLeather );
		}
	}
}
