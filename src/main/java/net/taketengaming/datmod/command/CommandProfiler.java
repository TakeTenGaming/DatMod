package net.taketengaming.datmod.command;

import com.google.common.collect.Iterables;
import net.minecraft.block.Block;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import java.text.DecimalFormat;

public class CommandProfiler extends CommandBase
{
	public CommandProfiler ()
	{
		super ( "profiler" );
	}

	@Override
	public String getUsage ( ICommandSender sender )
	{
		return "/" + this.getName () + " <block ID/Item ID>";
	}

	@Override
	public void execute ( MinecraftServer server, ICommandSender sender, String[] args ) throws CommandException
	{
		if ( args.length == 0 )
		{
			sender.sendMessage ( new TextComponentString ( this.getUsage ( sender ) ) );
			return;
		}

		Block block = getBlockByText ( sender, args[ 0 ] );
		int blocksSearched = 0;
		int matchesFound = 0;
		BlockPos position = sender.getPosition ();
		BlockPos minPosition = new BlockPos ( position.getX () - 15, 2, 15 );

		Iterable< BlockPos > blocks = BlockPos.getAllInBox ( position, minPosition );
		for ( BlockPos foundBlock : blocks )
		{
			Block foundBlockObject = sender.getEntityWorld ().getBlockState ( foundBlock ).getBlock ();

			if ( foundBlockObject.equals ( Blocks.AIR ) || foundBlockObject.equals ( Blocks.BEDROCK ) )
			{
				continue;
			}

			blocksSearched++;
			if ( foundBlockObject.equals ( block ) )
			{
				matchesFound++;
			}
		}

		DecimalFormat decimalFormat = new DecimalFormat ( "#,###" );
		String messageResponse = "====[ " + TextFormatting.GOLD + block.getLocalizedName () + TextFormatting.GRAY + " ]====\n";
		messageResponse += "Found " + TextFormatting.GOLD + decimalFormat.format ( Iterables.size ( blocks ) ) + TextFormatting.GRAY + " potential blocks\n";
		messageResponse += "Searched " + TextFormatting.GOLD + decimalFormat.format ( blocksSearched ) + TextFormatting.GRAY + "\n";
		messageResponse += "" + TextFormatting.GOLD + decimalFormat.format ( matchesFound ) + TextFormatting.GRAY + " matches found\n";
		messageResponse += "====[ /" + TextFormatting.GOLD + block.getLocalizedName () + TextFormatting.GRAY + " ]====";
		sender.sendMessage ( new TextComponentString ( messageResponse ).setStyle ( new Style ().setBold ( false ).setColor ( TextFormatting.GRAY ) ) );
	}
}