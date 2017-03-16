package taketengaming.datmod.compat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taketengaming.datmod.DatMod;

/**
 * Created by Acid on 1/2/2017.
 */
public class CompatHandler
{
	public static Logger logger = LogManager.getLogger ( DatMod.NAME + " CompatHandler" );

	public static void init ()
	{
		// Ender IO
		EnderIo enderIo = new EnderIo ();
		enderIo.init ();
	}
}
