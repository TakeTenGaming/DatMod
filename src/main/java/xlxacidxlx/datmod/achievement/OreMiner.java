package xlxacidxlx.datmod.achievement;

import xlxacidxlx.datmod.base.Achievement;
import xlxacidxlx.datmod.register.Blocks;

/**
 * Created by Acid on 11/29/2016.
 */
public class OreMiner
{
	public static final Achievement diamondium = Achievement.init ( "oreMinerDiamondium", 5, 2, Blocks.diamondiumOre, null );
	public static final Achievement emeraldi = Achievement.init ( "oreMinerEmeraldi", 9, 2, Blocks.emeraldiOre, null );
	public static final Achievement goldirite = Achievement.init ( "oreMinerGoldirite", 7, 2, Blocks.goldiriteOre, null );
	public static final Achievement ironium = Achievement.init ( "oreMinerIronium", 3, 2, Blocks.ironiumOre, null );
	public static final Achievement oreMiner = Achievement.init ( "oreMiner", 1, 1, Blocks.emeraldiOre, null );

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
