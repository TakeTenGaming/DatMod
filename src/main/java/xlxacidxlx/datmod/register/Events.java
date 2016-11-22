package xlxacidxlx.datmod.register;

import net.minecraftforge.common.MinecraftForge;
import xlxacidxlx.datmod.event.LivingDrops;
import xlxacidxlx.datmod.event.PlayedLoggedIn;

/**
 * Created by Acid on 10/26/2016.
 */
public class Events {
	private static LivingDrops livingDrops = new LivingDrops();
	private static PlayedLoggedIn playedLoggedIn = new PlayedLoggedIn();

	/**
	 * Registers all the mod's events during Forge's FMLInitialization event
	 */
	public static void init() {
		MinecraftForge.EVENT_BUS.register(livingDrops);
		MinecraftForge.EVENT_BUS.register(playedLoggedIn);
	}
}
