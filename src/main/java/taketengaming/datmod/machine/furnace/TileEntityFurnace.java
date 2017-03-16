package taketengaming.datmod.machine.furnace;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraftforge.items.ItemStackHandler;
import taketengaming.tencore.energy.EnergyStorage;
import taketengaming.tencore.recipes.FurnaceRecipes;
import taketengaming.tencore.recipes.Recipe;
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
		if ( inputSlot != null && inputSlot.stackSize > 0 )
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

		if ( inputSlot == null || outputSlot != null && outputSlot.stackSize >= outputSlot.getMaxStackSize () )
		{
			this.currentItemProcessingTime = 0;
			this.totalItemProcessingTime = 0;
			return;
		}

		Recipe outputResult = FurnaceRecipes.getInstance ().getRecipe ( inputSlot );
		if ( outputResult == null )
		{
			return;
		}

		ItemStack outputResultItem = outputResult.getOutput ();

		if ( this.currentItemProcessingTime == 0 )
		{
			this.totalItemProcessingTime = Machine.getItemProcessingTime ( outputResultItem );
		}

		if ( energyHandler.getEnergyStored () == 0 )
		{
			return;
		}

		if ( this.currentItemProcessingTime == this.totalItemProcessingTime )
		{
			if ( ( inputSlot.stackSize - 1 ) == 0 )
			{
				itemHandler.setStackInSlot ( 0, null );
			}
			else
			{
				inputSlot.stackSize--;
			}

			this.currentItemProcessingTime = 0;
			this.totalItemProcessingTime = 0;

			itemHandler.insertItem ( 1, outputResultItem.copy (), false );
			energyHandler.extractEnergy ( Energy.REQUIREMENT, false );
		}
		else
		{
			this.currentItemProcessingTime++;
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