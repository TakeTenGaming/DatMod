package xlxacidxlx.datmod.compat;

import net.minecraftforge.fml.common.Loader;

/**
 * Created by Acid on 1/2/2017.
 */
public class CompatHandler
{
	public static void init ()
	{
		// Ender IO
		if ( Loader.isModLoaded ( "EnderIO" ) )
		{
			EnderIO enderIO = new EnderIO ();
			enderIO.init ();
		}
	}
}
