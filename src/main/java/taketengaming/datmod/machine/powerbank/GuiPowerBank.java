package taketengaming.datmod.machine.powerbank;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import org.lwjgl.opengl.GL11;
import taketengaming.datmod.DatMod;
import taketengaming.tencore.util.Energy;

/**
 * Created by Acid on 1/31/2017.
 */
public class GuiPowerBank extends GuiContainer
{
	private static final ResourceLocation background = new ResourceLocation ( DatMod.MODID, "textures/gui/power_bank.png" );

	public TileEntityPowerBank tileEntity;

	public GuiPowerBank ( TileEntityPowerBank tileEntity, ContainerPowerBank container )
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
		int centerX = ( int ) ( this.guiLeft / 2.4 );
		int centerY = ( int ) ( this.guiTop / 3.5 );

		FontRenderer fontObj = this.fontRenderer;
		fontObj.drawString ( "Energy Stored: " + this.tileEntity.getCapability ( CapabilityEnergy.ENERGY, null ).getEnergyStored (), centerX, centerY, 0 );
		fontObj.drawString ( "Energy Capacity: " + Energy.CAPACITY, centerX, centerY + 10, 0 );
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

		this.drawTexturedModalRect ( ( guiLeft + 8 ), ( guiTop + 7 ), 176, 22, 16, ( int ) energyPercentage );
	}
}
