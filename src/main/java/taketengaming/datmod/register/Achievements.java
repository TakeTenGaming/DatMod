package taketengaming.datmod.register;

import net.minecraftforge.common.AchievementPage;
import taketengaming.datmod.DatMod;
import taketengaming.datmod.achievement.OreMiner;
import taketengaming.tencore.Achievement;

import java.util.ArrayList;

/**
 * Created by Acid on 11/29/2016.
 */
public class Achievements
{
	private static final ArrayList< net.minecraft.stats.Achievement > ACHIEVEMENTS = new ArrayList<> ();

	private static final Achievement ORE_MINER = OreMiner.oreMiner ();
	private static final Achievement ORE_MINER_DIAMONDIUM = OreMiner.diamondium ();
	private static final Achievement ORE_MINER_EMERALDI = OreMiner.emeraldi ();
	private static final Achievement ORE_MINER_GOLDIRITE = OreMiner.goldirite ();
	private static final Achievement ORE_MINER_IRONIUM = OreMiner.ironium ();

	public static void init ()
	{
		ACHIEVEMENTS.add ( ORE_MINER );
		ACHIEVEMENTS.add ( ORE_MINER_DIAMONDIUM );
		ACHIEVEMENTS.add ( ORE_MINER_EMERALDI );
		ACHIEVEMENTS.add ( ORE_MINER_GOLDIRITE );
		ACHIEVEMENTS.add ( ORE_MINER_IRONIUM );

		AchievementPage page = new AchievementPage ( DatMod.NAME );
		page.getAchievements ().addAll ( ACHIEVEMENTS );
		AchievementPage.registerAchievementPage ( page );
	}
}
