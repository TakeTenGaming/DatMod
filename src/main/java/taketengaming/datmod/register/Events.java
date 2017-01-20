package taketengaming.datmod.register;

import net.minecraftforge.common.MinecraftForge;
import taketengaming.datmod.event.EntityItemPickup;
import taketengaming.datmod.event.LivingDrops;
import taketengaming.datmod.event.PlayedLoggedIn;

/**
 * Created by Acid on 10/26/2016.
 */
public class Events
{
	private static EntityItemPickup entityItemPickup = new EntityItemPickup ();
	private static LivingDrops livingDrops = new LivingDrops ();
	private static PlayedLoggedIn playedLoggedIn = new PlayedLoggedIn ();

	public static void init ()
	{
		MinecraftForge.EVENT_BUS.register ( entityItemPickup );
		MinecraftForge.EVENT_BUS.register ( livingDrops );
		MinecraftForge.EVENT_BUS.register ( playedLoggedIn );
	}
}
