package taketengaming.datmod.machine.furnace;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraftforge.items.ItemStackHandler;
import taketengaming.tencore.energy.EnergyStorage;
import taketengaming.tencore.recipes.FurnaceRecipes;
import taketengaming.tencore.tileentity.TileEntityBase;
import taketengaming.tencore.util.Energy;
import taketengaming.tencore.util.Machine;

/**
 * Created by Acid on 1/23/2017.
 */
public class TileEntityFurnace extends TileEntityBase implements ITickable
{
	// Fields
	protected int currentItemProcessingTime;
	protected int totalItemProcessingTime;

	protected int getCurrentItemProcessingTime ()
	{
		return this.currentItemProcessingTime;
	}

	protected int getTotalItemProcessingTime ()
	{
		return this.totalItemProcessingTime;
	}

	public boolean isProcessing ()
	{
		ItemStack inputSlot = this.itemStackHandler.getStackInSlot ( 0 );
		if ( !inputSlot.isEmpty () && inputSlot.getCount () > 0 )
		{
			if ( this.currentItemProcessingTime > 0 )
			{
				return true;
			}
		}

		return false;
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

	/**
	 * Like the old updateEntity(), except more generic.
	 */
	@Override
	public void update ()
	{
		EnergyStorage energyHandler = this.energyStorageHandler;
		ItemStackHandler itemHandler = this.itemStackHandler;
		ItemStack inputSlot = itemHandler.getStackInSlot ( 0 );
		ItemStack outputSlot = itemHandler.getStackInSlot ( 1 );

		if ( inputSlot.isEmpty () || outputSlot.getCount () == 64 )
		{
			this.currentItemProcessingTime = 0;
			this.totalItemProcessingTime = 0;
			return;
		}

		ItemStack outputResult = FurnaceRecipes.getInstance ().getRecipe ( inputSlot );
		if ( outputResult.isEmpty () )
		{
			return;
		}

		if ( this.currentItemProcessingTime == 0 )
		{
			this.totalItemProcessingTime = Machine.getItemProcessingTime ( outputResult.getItem () );
		}

		if ( energyHandler.getEnergyStored () == 0 )
		{
			return;
		}
		else
		{
			this.currentItemProcessingTime++;
			energyHandler.extractEnergy ( Energy.REQUIREMENT, false );
		}

		if ( this.currentItemProcessingTime == this.totalItemProcessingTime )
		{
			this.currentItemProcessingTime = 0;
			this.totalItemProcessingTime = 0;

			inputSlot.splitStack ( 1 );
			itemHandler.insertItem ( 1, outputResult.copy (), false );
			this.markDirty ();
		}
	}
}