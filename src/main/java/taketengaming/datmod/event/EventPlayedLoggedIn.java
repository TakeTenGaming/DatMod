package taketengaming.datmod.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import taketengaming.datmod.ConfigHandler;
import taketengaming.datmod.DatMod;
import taketengaming.datmod.register.Items;

import java.util.Set;

/**
 * Created by Acid on 11/19/2016.
 */
public class EventPlayedLoggedIn
{
	@SubscribeEvent
	public void playedLoggedIn ( PlayerEvent.PlayerLoggedInEvent event )
	{
		EntityPlayer player = event.player;

		Set< String > nbt = player.getTags ();

		if ( ConfigHandler.enableWelcomeMessage )
		{
			boolean welcome = true;
			if ( ConfigHandler.enableWelcomeMessageFirstJoinOnly && nbt.contains ( "playedBefore" ) )
			{
				welcome = false;
			}

			if ( welcome )
			{
				Style chatStyle = new Style ().setColor ( TextFormatting.GRAY );
				Style dividerStyle = new Style ().setBold ( true ).setColor ( TextFormatting.DARK_BLUE );
				ITextComponent divider = new TextComponentString ( "-----------------------" ).setStyle ( dividerStyle );
				ITextComponent dividerTop = new TextComponentString ( "--------[" + DatMod.NAME + "]--------" ).setStyle ( dividerStyle );

				player.sendMessage ( dividerTop );
				player.sendMessage ( ForgeHooks.newChatWithLinks ( "Thanks for trying our mod, " + TextFormatting.WHITE + player.getDisplayNameString () + TextFormatting.GRAY + "! " +
						"Suggest features/report issues: http://github.com/TakeTenGaming/DatMod/" ).setStyle ( chatStyle ) );
				player.sendMessage ( divider );
			}
		}

		if ( ConfigHandler.giveMagnet )
		{
			boolean giveMagnet = true;

			if ( ConfigHandler.giveMagnetFirstJoinOnly && nbt.contains ( "playedBefore" ) )
			{
				giveMagnet = false;
			}

			if ( giveMagnet )
			{
				InventoryPlayer inventory = player.inventory;
				ItemStack magnetStack = new ItemStack ( Items.magnetItem );
				if ( !inventory.hasItemStack ( magnetStack ) )
				{
					boolean itemPlaced = false;
					int inventorySize = inventory.getSizeInventory ();

					for ( int i = 0; i < inventorySize; i++ )
					{
						if ( itemPlaced )
						{
							continue;
						}

						if ( inventory.getStackInSlot ( i ) == null )
						{
							itemPlaced = true;
							inventory.setInventorySlotContents ( i, magnetStack );
						}
					}
				}
			}
		}

		player.addTag ( "playedBefore" );
	}
}
