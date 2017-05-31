package taketengaming.datmod.machine.generator;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import taketengaming.datmod.DatMod;
import taketengaming.tencore.energy.EnergyStorage;

/**
 * Created by Acid on 2/26/2017.
 */
public class GuiGenerator extends GuiContainer
{
	private static final ResourceLocation background = new ResourceLocation ( DatMod.MODID, "textures/gui/generator.png" );

	public TileEntityGenerator tileEntity;

	public GuiGenerator ( TileEntityGenerator tileEntity, ContainerGenerator container )
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

		EnergyStorage energyStorage = this.tileEntity.energyStorageHandler;
		float energyPercentage = 0;
		int energyStored = energyStorage.getEnergyStored ();
		int maxEnergy = energyStorage.getMaxEnergyStored ();

		if ( energyStored > 0 )
		{
			energyPercentage = ( float ) ( ( energyStored * 100 ) / maxEnergy );
		}

		this.drawTexturedModalRect ( ( guiLeft + 8 ), ( guiTop + 7 ), 176, 24, 16, ( int ) energyPercentage );

		if ( this.tileEntity.isProcessing () && this.tileEntity.getCurrentItemProcessingTime () > 0 )
		{
			float percentageCompleted = ( float ) ( ( this.tileEntity.currentItemProcessingTime * 100 ) / this.tileEntity.getTotalItemProcessingTime () ) / 4;
			this.drawTexturedModalRect ( ( guiLeft + 84 ), ( guiTop + 41 ), 177, 0, 18, ( int ) ( percentageCompleted - 2 ) );
		}
	}
}
