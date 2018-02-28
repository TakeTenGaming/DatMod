package net.taketengaming.datmod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void init ()
	{
		// Ore Dictionary
		ModItems.initOreDict ();
		ModBlocks.initOreDict ();

		// Recipes
		// TODO: Register recipes here..?

		// Smelting
		float xpBonus = 0.2f;
		float diamondiumXp = ( 1.0f + xpBonus );
		float emeraldiXp = ( 1.0f + xpBonus );
		float goldiriteXp = ( 1.0f + xpBonus );
		float ironiumXp = ( 0.7f + xpBonus );

		GameRegistry.addSmelting ( ModBlocks.diamondiumOre, new ItemStack ( ModItems.diamondium ), diamondiumXp );
		GameRegistry.addSmelting ( ModBlocks.emeraldiOre, new ItemStack ( ModItems.emeraldi ), emeraldiXp );
		GameRegistry.addSmelting ( ModBlocks.goldiriteOre, new ItemStack ( ModItems.goldiriteIngot ), goldiriteXp );
		GameRegistry.addSmelting ( ModBlocks.ironiumOre, new ItemStack ( ModItems.ironiumIngot ), ironiumXp );
	}
}
