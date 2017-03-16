package taketengaming.datmod.machine.powerbank;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraftforge.items.ItemStackHandler;
import taketengaming.datmod.item.ItemMagnet;
import taketengaming.datmod.machine.PowerSender;
import taketengaming.tencore.energy.EnergyStorage;
import taketengaming.tencore.tileentity.TileEntityBase;
import taketengaming.tencore.util.Energy;

/**
 * Created by Acid on 1/31/2017.
 */
public class TileEntityPowerBank extends TileEntityBase implements ITickable
{
	public static final int SIZE = 2;

	private PowerSender powerSender = new PowerSender ();

	// Fields
	private int currentItemProcessingTime;
	protected int totalItemProcessingTime;

	protected int getCurrentItemProcessingTime ()
	{
		return this.currentItemProcessingTime;
	}

	@Override
	public void readFromNBT ( NBTTagCompound compound )
	{
		super.readFromNBT ( compound );

		if ( compound.hasKey ( "energy" ) )
		{
			this.energyStorageHandler.readFromNBT ( compound );
		}

		if ( compound.hasKey ( "Items" ) )
		{
			this.itemStackHandler.deserializeNBT ( ( NBTTagCompound ) compound.getTag ( "Items" ) );
		}

		this.currentItemProcessingTime = compound.getInteger ( "currentItemProcessingTime" );
		this.totalItemProcessingTime = compound.getInteger ( "totalItemProcessingTime" );
	}

	/**
	 * Like the old updateEntity(), except more generic.
	 */
	@Override
	public void update ()
	{
		this.powerSender.process ( this );

		EnergyStorage energyHandler = this.energyStorageHandler;
		ItemStackHandler itemHandler = this.itemStackHandler;
		ItemStack inputSlot = itemHandler.getStackInSlot ( 0 );
		ItemStack outputSlot = itemHandler.getStackInSlot ( 1 );

		if ( inputSlot == null || energyHandler.getEnergyStored () == 0 )
		{
			return;
		}

		Item inputItem = inputSlot.getItem ();
		if ( inputItem instanceof ItemMagnet )
		{
			NBTTagCompound nbt = inputSlot.getTagCompound ();
			if ( nbt == null || !nbt.hasKey ( "energyStored" ) )
			{
				return;
			}

			int energyStored = nbt.getInteger ( "energyStored" );
			if ( energyStored >= Energy.CAPACITY )
			{
				itemHandler.setStackInSlot ( 1, inputSlot.copy () );
				itemHandler.setStackInSlot ( 0, null );
			}
			else
			{
				nbt.setInteger ( "energyStored", energyStored + Energy.MAX_RECEIVE );
				energyHandler.extractEnergy ( Energy.MAX_SEND, false );
			}
		}
	}

	@Override
	public NBTTagCompound writeToNBT ( NBTTagCompound compound )
	{
		super.writeToNBT ( compound );

		this.energyStorageHandler.writeToNBT ( compound );
		compound.setTag ( "Items", this.itemStackHandler.serializeNBT () );

		compound.setInteger ( "currentItemProcessingTime", this.currentItemProcessingTime );
		compound.setInteger ( "totalItemProcessingTime", this.totalItemProcessingTime );

		return compound;
	}
}
