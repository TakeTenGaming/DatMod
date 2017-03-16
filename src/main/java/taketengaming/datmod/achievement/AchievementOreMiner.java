package taketengaming.datmod.achievement;

import taketengaming.datmod.register.Blocks;
import taketengaming.tencore.Achievement;

/**
 * Created by Acid on 11/29/2016.
 */
public class AchievementOreMiner
{
	public static final Achievement ironium = Achievement.init ( "oreMinerIronium", 3, 0, Blocks.ironiumOre, null );
	public static final Achievement emeraldi = Achievement.init ( "oreMinerEmeraldi", 5, 2, Blocks.emeraldiOre, ironium );
	public static final Achievement diamondium = Achievement.init ( "oreMinerDiamondium", 7, 4, Blocks.diamondiumOre, ironium );
	public static final Achievement goldirite = Achievement.init ( "oreMinerGoldirite", 9, 6, Blocks.goldiriteOre, diamondium );
	public static final Achievement oreMiner = Achievement.init ( "oreMiner", 11, 8, Blocks.emeraldiOre, emeraldi );

	public static Achievement diamondium ()
	{
		return diamondium;
	}

	public static Achievement emeraldi ()
	{
		return emeraldi;
	}

	public static Achievement goldirite ()
	{
		return goldirite;
	}

	public static Achievement ironium ()
	{
		return ironium;
	}

	public static Achievement oreMiner ()
	{
		return oreMiner;
	}
}
