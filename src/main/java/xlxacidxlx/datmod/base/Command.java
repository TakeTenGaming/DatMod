package xlxacidxlx.datmod.base;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

/**
 * Created by Acid on 11/18/2016.
 */
public abstract class Command extends CommandBase
{
	@Override
	public String getCommandUsage ( ICommandSender sender )
	{
		return "/" + getCommandName ();
	}
}
