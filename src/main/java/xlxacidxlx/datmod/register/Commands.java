package xlxacidxlx.datmod.register;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import xlxacidxlx.datmod.command.DatMod;
import xlxacidxlx.datmod.command.Profiler;

/**
 * Created by Acid on 11/18/2016.
 */
public class Commands
{
	private static DatMod datMod = new DatMod ();
	private static Profiler profiler = new Profiler ();

	public static void serverStarting ( FMLServerStartingEvent event )
	{
		event.registerServerCommand ( datMod );
		event.registerServerCommand ( profiler );
	}
}
