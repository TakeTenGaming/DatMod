package xlxacidxlx.datmod.register;

import net.minecraftforge.common.AchievementPage;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.achievement.OreMiner;
import xlxacidxlx.datmod.base.Achievement;

import java.util.ArrayList;

/**
 * Created by Acid on 11/29/2016.
 */
public class Achievements {
	private static final ArrayList<net.minecraft.stats.Achievement> ACHIEVEMENTS = new ArrayList<>();

	private static final Achievement ORE_MINER_DIAMONDIUM = OreMiner.diamondium();
	private static final Achievement ORE_MINER_EMERALDI = OreMiner.emeraldi();
	private static final Achievement ORE_MINER_GOLDIRITE = OreMiner.goldirite();
	private static final Achievement ORE_MINER_IRONIUM = OreMiner.ironium();

	private static final Achievement ORE_MINER = OreMiner.oreMiner();

	public static void init() {
		ACHIEVEMENTS.add(ORE_MINER_DIAMONDIUM);
		ACHIEVEMENTS.add(ORE_MINER_EMERALDI);
		ACHIEVEMENTS.add(ORE_MINER_GOLDIRITE);
		ACHIEVEMENTS.add(ORE_MINER_IRONIUM);

		ACHIEVEMENTS.add(ORE_MINER);

		AchievementPage page = new AchievementPage(DatMod.NAME);
		page.getAchievements().addAll(ACHIEVEMENTS);
		AchievementPage.registerAchievementPage(page);
	}
}
