package xlxacidxlx.datmod.event;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xlxacidxlx.datmod.achievement.OreMiner;

/**
 * Created by Acid on 11/29/2016.
 */
public class EntityItemPickup {
	@SubscribeEvent
	public void entityItemPickup(EntityItemPickupEvent event) {
		EntityItem item = event.getItem();
		EntityPlayer player = event.getEntityPlayer();

		switch (item.getName()) {
			case "item.tile.diamondiumore":
				player.addStat(OreMiner.diamondium);
				break;

			case "item.tile.emeraldiore":
				player.addStat(OreMiner.emeraldi);
				break;

			case "item.tile.goldiriteore":
				player.addStat(OreMiner.goldirite);
				break;

			case "item.tile.ironiumore":
				player.addStat(OreMiner.ironium);
				break;
		}
	}
}
