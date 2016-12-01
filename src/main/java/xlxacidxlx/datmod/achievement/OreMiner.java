package xlxacidxlx.datmod.achievement;

import xlxacidxlx.datmod.base.Achievement;
import xlxacidxlx.datmod.register.Blocks;

/**
 * Created by Acid on 11/29/2016.
 */
public class OreMiner {
	public static final Achievement diamondium = Achievement.init("oreMinerDiamondium", 1, 1, Blocks.diamondiumOre, null);
	public static final Achievement emeraldi = Achievement.init("oreMinerEmeraldi", 1, 1, Blocks.emeraldiOre, null);
	public static final Achievement goldirite = Achievement.init("oreMinerGoldirite", 6, 1, Blocks.goldiriteOre, null);
	public static final Achievement ironium = Achievement.init("oreMinerIronium", 9, 1, Blocks.ironiumOre, null);

	public static final Achievement oreMiner = Achievement.init("oreMiner", 12, 1, Blocks.emeraldiOre, null);

	public static Achievement diamondium() {
		return diamondium;
	}

	public static Achievement emeraldi() {
		return emeraldi;
	}

	public static Achievement goldirite() {
		return goldirite;
	}

	public static Achievement ironium() {
		return ironium;
	}

	public static Achievement oreMiner() {
		return oreMiner;
	}
}
