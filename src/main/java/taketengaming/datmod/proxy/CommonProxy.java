package taketengaming.datmod.proxy;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import taketengaming.datmod.ConfigHandler;
import taketengaming.datmod.OreGenerator;

/**
 * Created by Acid on 10/26/2016.
 */
public class CommonProxy
{
	public void init ( FMLInitializationEvent event )
	{
		if ( ConfigHandler.enableOreGeneration )
		{
			GameRegistry.registerWorldGenerator ( new OreGenerator (), 0 );
		}
	}

	public void postInit ( FMLPostInitializationEvent event )
	{
	}

	public void preInit ( FMLPreInitializationEvent event )
	{
	}
}
