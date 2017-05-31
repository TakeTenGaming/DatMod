package taketengaming.datmod.recipes;

import net.minecraft.item.ItemStack;
import taketengaming.datmod.ConfigHandler;
import taketengaming.datmod.register.Blocks;
import taketengaming.datmod.register.Items;
import taketengaming.tencore.recipes.BaseRecipeHandler;

/**
 * Created by Acid on 5/11/2017.
 */
public class FurnaceRecipes
{
	public static void init ()
	{
		BaseRecipeHandler furnaceInstance = taketengaming.tencore.recipes.FurnaceRecipes.getInstance ();

		// Minecraft
		furnaceInstance.addRecipe ( Items.goldDust, net.minecraft.init.Items.GOLD_INGOT );
		furnaceInstance.addRecipe ( Items.ironDust, net.minecraft.init.Items.IRON_INGOT );

		// DatMod
		furnaceInstance.addRecipe ( Blocks.diamondiumOre, Items.diamondium );
		furnaceInstance.addRecipe ( Blocks.emeraldiOre, Items.emeraldi );
		furnaceInstance.addRecipe ( Items.goldiriteDust, Items.goldiriteIngot );
		furnaceInstance.addRecipe ( Items.ironiumDust, Items.ironiumIngot );

		// Rotten Flesh -> Leather
		if ( ConfigHandler.enableRottenFleshToLeatherRecipe )
		{
			furnaceInstance.addRecipe ( new ItemStack ( net.minecraft.init.Items.ROTTEN_FLESH ), new ItemStack ( net.minecraft.init.Items.LEATHER ) );
		}
	}
}
