package xlxacidxlx.datmod.command;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import xlxacidxlx.datmod.base.Command;

/**
 * Created by Acid on 11/6/2016.
 */
public class DatMod extends Command {
	@Override
	public String getCommandName() {
		return "datmod";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		String message = "Thanks for installing " + xlxacidxlx.datmod.DatMod.NAME + " v" + xlxacidxlx.datmod.DatMod.VERSION + "!";
		sender.addChatMessage(new TextComponentString(message));
	}
}
