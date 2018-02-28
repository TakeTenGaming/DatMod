package net.taketengaming.datmod.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBase extends TileEntity
{
	public boolean canInteractWith ( EntityPlayer playerIn )
	{
		return ( !this.isInvalid () && playerIn.getDistanceSq ( pos.add ( 0.5D, 0.5D, 0.5D ) ) <= 64D );
	}

	@Override
	public void readFromNBT ( NBTTagCompound compound )
	{
		super.readFromNBT ( compound );
	}

	@Override
	public NBTTagCompound writeToNBT ( NBTTagCompound compound )
	{
		return super.writeToNBT ( compound );
	}
}
