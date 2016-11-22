package xlxacidxlx.datmod.event;

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
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.register.Items;

import java.util.Set;

/**
 * Created by Acid on 11/19/2016.
 */
public class PlayedLoggedIn {
	@SubscribeEvent
	public void playedLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;

		if (ConfigHandler.enableWelcomeMessage) {
			Style chatStyle = new Style().setBold(true).setColor(TextFormatting.DARK_GRAY);
			Style dividerStyle = new Style().setBold(true).setColor(TextFormatting.DARK_BLUE);
			Style githubStyle = new Style().setColor(TextFormatting.WHITE);
			ITextComponent divider = new TextComponentString("============================").setStyle(dividerStyle);

			player.addChatComponentMessage(divider);
			player.addChatComponentMessage(new TextComponentString("Thanks for trying out " + DatMod.NAME + ", " + player.getDisplayNameString()).setStyle(chatStyle));
			player.addChatComponentMessage(ForgeHooks.newChatWithLinks("Be sure to report issues at our GitHub: http://github.com/xlxacidxlx/DatMod/").setStyle(githubStyle));
			player.addChatComponentMessage(divider);
		}

		if (ConfigHandler.giveMagnet) {
			if (ConfigHandler.giveMagnetFirstJoinOnly) {
				Set<String> nbt = player.getTags();

				if (!nbt.contains("playedBefore")) {
					return;
				}
			}

			InventoryPlayer inventory = player.inventory;
			ItemStack magnetStack = new ItemStack(Items.magnetItem);
			if (!inventory.hasItemStack(magnetStack)) {
				boolean itemPlaced = false;
				int inventorySize = inventory.getSizeInventory();

				for (int i = 0; i < inventorySize; i++) {
					if (itemPlaced) {
						continue;
					}

					if (inventory.getStackInSlot(i) == null) {
						itemPlaced = true;
						inventory.setInventorySlotContents(i, magnetStack);
					}
				}
			}

			player.addTag("playedBefore");
		}
	}
}
