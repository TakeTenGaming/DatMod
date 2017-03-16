package taketengaming.datmod.machine.furnace;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import taketengaming.datmod.DatMod;

/**
 * Created by Acid on 1/23/2017.
 */
public class GuiFurnace extends GuiContainer
{
	private static final ResourceLocation background = new ResourceLocation ( DatMod.MODID, "textures/gui/furnace.png" );

	public TileEntityFurnace tileEntity;

	public GuiFurnace ( TileEntityFurnace tileEntity, ContainerFurnace container )
	{
		super ( container );

		this.tileEntity = tileEntity;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer ( float partialTicks, int mouseX, int mouseY )
	{
		mc.getTextureManager ().bindTexture ( background );
		drawTexturedModalRect ( guiLeft, guiTop, 0, 0, xSize, ySize );

		IEnergyStorage energyStorage = this.tileEntity.getCapability ( CapabilityEnergy.ENERGY, null );
		float energyPercentage = 0;
		int energyStored = energyStorage.getEnergyStored ();
		int maxEnergy = energyStorage.getMaxEnergyStored ();

		if ( energyStored > 0 )
		{
			energyPercentage = ( float ) ( ( energyStored * 100 ) / maxEnergy );
		}

		drawTexturedModalRect ( ( guiLeft + 8 ), ( guiTop + 7 ), 176, 18, 16, ( int ) energyPercentage );

		if ( this.tileEntity.isProcessing () && this.tileEntity.getCurrentItemProcessingTime () > 0 )
		{
			float percentageCompleted = ( float ) ( ( this.tileEntity.getCurrentItemProcessingTime () * 100 ) / this.tileEntity.getTotalItemProcessingTime () ) / 4;
			drawTexturedModalRect ( ( guiLeft + 81 ), ( guiTop + 35 ), 177, 0, ( int ) percentageCompleted, 15 );
		}
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 *
	 * @param mouseX
	 * @param mouseY
	 */
	@Override
	protected void drawGuiContainerForegroundLayer ( int mouseX, int mouseY )
	{
		// TODO: Draw the inventory title here..
	}
}