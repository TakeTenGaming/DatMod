package taketengaming.datmod.recipes;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import taketengaming.datmod.register.Blocks;
import taketengaming.datmod.register.Items;
import taketengaming.tencore.recipes.BaseRecipeHandler;

/**
 * Created by Acid on 5/11/2017.
 */
public class PulverizerRecipes
{
	public static void init ()
	{
		BaseRecipeHandler pulverizerInstance = taketengaming.tencore.recipes.PulverizerRecipes.getInstance ();

		// Minecraft
		pulverizerInstance.addRecipe ( net.minecraft.init.Blocks.COAL_ORE, net.minecraft.init.Items.COAL );
		pulverizerInstance.addRecipe ( net.minecraft.init.Blocks.DIAMOND_ORE, net.minecraft.init.Items.DIAMOND );
		pulverizerInstance.addRecipe ( net.minecraft.init.Blocks.EMERALD_ORE, net.minecraft.init.Items.EMERALD );
		pulverizerInstance.addRecipe ( net.minecraft.init.Blocks.GOLD_ORE, Items.goldDust );
		pulverizerInstance.addRecipe ( net.minecraft.init.Blocks.IRON_ORE, Items.ironDust );
		pulverizerInstance.addRecipe ( net.minecraft.init.Blocks.LAPIS_ORE, new ItemStack ( net.minecraft.init.Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage () ) );
		pulverizerInstance.addRecipe ( net.minecraft.init.Blocks.QUARTZ_ORE, net.minecraft.init.Items.QUARTZ );
		pulverizerInstance.addRecipe ( net.minecraft.init.Blocks.REDSTONE_ORE, net.minecraft.init.Items.REDSTONE );

		// DatMod
		pulverizerInstance.addRecipe ( Blocks.diamondiumOre, Items.diamondium );
		pulverizerInstance.addRecipe ( Blocks.emeraldiOre, Items.emeraldi );
		pulverizerInstance.addRecipe ( Blocks.goldiriteOre, Items.goldiriteDust );
		pulverizerInstance.addRecipe ( Blocks.ironiumOre, Items.ironiumDust );
	}
}
