package taketengaming.datmod.machine.pulverizer;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraftforge.items.ItemStackHandler;
import taketengaming.tencore.energy.EnergyStorage;
import taketengaming.tencore.recipes.PulverizerRecipes;
import taketengaming.tencore.tileentity.TileEntityBase;
import taketengaming.tencore.util.Energy;
import taketengaming.tencore.util.Machine;

/**
 * Created by Acid on 1/31/2017.
 */
public class TileEntityPulverizer extends TileEntityBase implements ITickable
{
	// Fields
	private int currentItemProcessingTime;
	protected int totalItemProcessingTime;

	public static final int SIZE = 2;

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

		if ( inputSlot.isEmpty () || energyHandler.getEnergyStored () == 0 || outputSlot.getCount () == 64 )
		{
			this.currentItemProcessingTime = 0;
			this.totalItemProcessingTime = 0;
			return;
		}

		ItemStack outputResult = PulverizerRecipes.getInstance ().getRecipe ( inputSlot );
		if ( outputResult.isEmpty () )
		{
			return;
		}
		else
		{
			if ( !outputSlot.isEmpty () && outputResult.getItem () != outputSlot.getItem () )
			{
				return;
			}

			outputResult.setCount ( 2 );
		}

		if ( this.currentItemProcessingTime == 0 )
		{
			this.totalItemProcessingTime = Machine.getItemProcessingTime ( inputSlot );
		}

		if ( this.currentItemProcessingTime == this.totalItemProcessingTime )
		{
			this.currentItemProcessingTime = 0;
			this.totalItemProcessingTime = 0;

			inputSlot.splitStack ( 1 );
			itemHandler.insertItem ( 1, outputResult.copy (), false );
			this.markDirty ();
		}
		else
		{
			this.currentItemProcessingTime++;
			energyHandler.extractEnergy ( Energy.REQUIREMENT, false );
		}
	}
}
