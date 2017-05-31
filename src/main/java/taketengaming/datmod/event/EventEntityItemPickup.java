package taketengaming.datmod.event;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import taketengaming.datmod.achievement.AchievementOreMiner;
import taketengaming.tencore.Achievement;

/**
 * Created by Acid on 11/29/2016.
 */
public class EventEntityItemPickup
{
	@SubscribeEvent
	public void entityItemPickup ( EntityItemPickupEvent event )
	{
		EntityItem item = event.getItem ();
		EntityPlayer player = event.getEntityPlayer ();

		switch ( item.getName () )
		{
			case "item.tile.diamondiumore":
				if ( player.hasAchievement ( AchievementOreMiner.ironium () ) )
				{
					player.addStat ( AchievementOreMiner.diamondium () );
				}
				break;

			case "item.tile.emeraldiore":
				if ( player.hasAchievement ( AchievementOreMiner.diamondium () ) )
				{
					player.addStat ( AchievementOreMiner.emeraldi () );
				}
				break;

			case "item.tile.goldiriteore":
				if ( player.hasAchievement ( AchievementOreMiner.diamondium () ) )
				{
					player.addStat ( AchievementOreMiner.goldirite () );
				}
				break;

			case "item.tile.ironiumore":
				player.addStat ( AchievementOreMiner.ironium () );
				break;
		}

		Achievement[] achievements = { AchievementOreMiner.ironium, AchievementOreMiner.diamondium, AchievementOreMiner.goldirite, AchievementOreMiner.emeraldi };
		int receivedAchievements = 0;

		for ( Achievement achievement : achievements )
		{
			if ( player.hasAchievement ( achievement ) )
			{
				receivedAchievements++;
			}
		}

		if ( receivedAchievements == achievements.length )
		{
			player.addStat ( AchievementOreMiner.oreMiner () );
		}
	}
}
