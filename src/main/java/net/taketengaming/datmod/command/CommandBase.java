package net.taketengaming.datmod.command;

import net.minecraft.command.ICommandSender;

public abstract class CommandBase extends net.minecraft.command.CommandBase
{
	private String name;

	public CommandBase ( String name )
	{
		this.setName ( name );
	}

	@Override
	public String getName ()
	{
		return this.name;
	}

	@Override
	public String getUsage ( ICommandSender sender )
	{
		return "/" + this.getName ();
	}

	private void setName ( String name )
	{
		this.name = name;
	}
}
