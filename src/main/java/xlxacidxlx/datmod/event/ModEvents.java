package xlxacidxlx.datmod.event;

import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Acid on 10/26/2016.
 */
public class ModEvents {
	private static EntityJoinWorld entityJoinWorldEvent = new EntityJoinWorld();

	public static void postInit() {
		MinecraftForge.EVENT_BUS.register(entityJoinWorldEvent);
	}
}
