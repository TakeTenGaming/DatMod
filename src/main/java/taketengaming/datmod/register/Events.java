package taketengaming.datmod.register;

import net.minecraftforge.common.MinecraftForge;
import taketengaming.datmod.event.EventEntityItemPickup;
import taketengaming.datmod.event.EventLivingDrops;
import taketengaming.datmod.event.EventPlayedLoggedIn;

/**
 * Created by Acid on 10/26/2016.
 */
public class Events
{
	private static EventEntityItemPickup entityItemPickup = new EventEntityItemPickup ();
	private static EventLivingDrops livingDrops = new EventLivingDrops ();
	private static EventPlayedLoggedIn playedLoggedIn = new EventPlayedLoggedIn ();

	public static void init ()
	{
		MinecraftForge.EVENT_BUS.register ( entityItemPickup );
		MinecraftForge.EVENT_BUS.register ( livingDrops );
		MinecraftForge.EVENT_BUS.register ( playedLoggedIn );
	}
}
