package xlxacidxlx.datmod.base;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import xlxacidxlx.datmod.DatMod;

/**
 * Created by Acid on 11/29/2016.
 */
public class Achievement extends net.minecraft.stats.Achievement
{
	public Achievement ( String statIdIn, String unlocalizedName, int column, int row, ItemStack stack, net.minecraft.stats.Achievement parent )
	{
		super ( statIdIn, unlocalizedName, column, row, stack, parent );
	}

	public static Achievement init ( String name, int column, int row, Block block, Achievement parent )
	{
		return init ( name, column, row, new ItemStack ( block ), parent );
	}

	public static Achievement init ( String name, int column, int row, Item item, Achievement parent )
	{
		return init ( name, column, row, new ItemStack ( item ), parent );
	}

	public static Achievement init ( String name, int column, int row, ItemStack stack, net.minecraft.stats.Achievement parent )
	{
		String achievementName = DatMod.MODID + "_" + name;
		Achievement achievement = new Achievement ( achievementName, achievementName, column, row, stack, parent );
		achievement.registerStat ();

		return achievement;
	}
}
