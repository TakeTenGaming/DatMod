package taketengaming.datmod.machine.pulverizer;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import org.lwjgl.opengl.GL11;
import taketengaming.datmod.DatMod;

/**
 * Created by Acid on 1/31/2017.
 */
public class GuiPulverizer extends GuiContainer
{
	private static final ResourceLocation background = new ResourceLocation ( DatMod.MODID, "textures/gui/pulverizer.png" );

	public TileEntityPulverizer tileEntity;

	public GuiPulverizer ( TileEntityPulverizer tileEntity, ContainerPulverizer container )
	{
		super ( container );

		this.tileEntity = tileEntity;
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

	@Override
	protected void drawGuiContainerBackgroundLayer ( float partialTicks, int mouseX, int mouseY )
	{
		GL11.glColor4f ( 1, 1, 1, 1 );

		mc.getTextureManager ().bindTexture ( background );
		this.drawTexturedModalRect ( guiLeft, guiTop, 0, 0, xSize, ySize );

		IEnergyStorage energyStorage = this.tileEntity.getCapability ( CapabilityEnergy.ENERGY, null );
		float energyPercentage = 0;
		int energyStored = energyStorage.getEnergyStored ();
		int maxEnergy = energyStorage.getMaxEnergyStored ();

		if ( energyStored > 0 )
		{
			energyPercentage = ( float ) ( ( energyStored * 100 ) / maxEnergy );
		}

		this.drawTexturedModalRect ( ( guiLeft + 8 ), ( guiTop + 7 ), 176, 18, 16, ( int ) energyPercentage );

		if ( this.tileEntity.isProcessing () && this.tileEntity.getCurrentItemProcessingTime () > 0 )
		{
			float percentageCompleted = ( float ) ( ( this.tileEntity.getCurrentItemProcessingTime () * 100 ) / this.tileEntity.getTotalItemProcessingTime () ) / 4;
			this.drawTexturedModalRect ( ( guiLeft + 81 ), ( guiTop + 35 ), 177, 0, ( int ) percentageCompleted, 15 );
		}
	}
}
