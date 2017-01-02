package xlxacidxlx.datmod.compat;

import net.minecraftforge.fml.common.event.FMLInterModComms;

/**
 * Created by Acid on 1/2/2017.
 */
public class EnderIO extends Base
{
	EnderIO ()
	{
		super ( "EnderIO" );
	}

	public void init ()
	{
		logger.info ( "Registering recipes.." );

		// TODO: Figure out a way to make this neater..
		String string = "<SAGMillRecipes>\n" +
				"\t<recipeGroup name=\"DatMod\">\n" +
				"\t\t<recipe name=\"Diamondium\" energyCost=\"4000\">\n" +
				"\t\t\t<input>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"oreDiamondium\"/>\n" +
				"\t\t\t</input>\n" +
				"\n" +
				"\t\t\t<output>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"gemDiamondium\" number=\"1\"/>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"gemDiamondium\" number=\"1\" chance=\"0.05\"/>\n" +
				"\t\t\t</output>\n" +
				"\t\t</recipe>\n" +
				"\n" +
				"\t\t<recipe name=\"Emeraldi\" energyCost=\"4100\">\n" +
				"\t\t\t<input>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"oreEmeraldi\"/>\n" +
				"\t\t\t</input>\n" +
				"\n" +
				"\t\t\t<output>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"gemEmeraldi\" number=\"1\"/>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"gemEmeraldi\" number=\"1\" chance=\"0.05\"/>\n" +
				"\t\t\t</output>\n" +
				"\t\t</recipe>\n" +
				"\n" +
				"\t\t<recipe name=\"IroniumOre\" energyCost=\"3700\">\n" +
				"\t\t\t<input>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"oreIronium\"/>\n" +
				"\t\t\t</input>\n" +
				"\n" +
				"\t\t\t<output>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"dustIronium\" number=\"2\"/>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"dustTin\" number=\"1\" chance=\"0.05\"/>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"dustNickel\" number=\"1\" chance=\"0.1\"/>\n" +
				"\t\t\t\t<itemStack modID=\"minecraft\" itemName=\"cobblestone\" chance=\"0.15\"/>\n" +
				"\t\t\t</output>\n" +
				"\t\t</recipe>\n" +
				"\n" +
				"\t\t<recipe name=\"IroniumIngot\" energyCost=\"2400\">\n" +
				"\t\t\t<input>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"ingotIronium\"/>\n" +
				"\t\t\t</input>\n" +
				"\n" +
				"\t\t\t<output>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"dustIronium\" number=\"1\"/>\n" +
				"\t\t\t</output>\n" +
				"\t\t</recipe>\n" +
				"\n" +
				"\t\t<recipe name=\"GoldiriteOre\" energyCost=\"3700\">\n" +
				"\t\t\t<input>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"oreGoldirite\"/>\n" +
				"\t\t\t</input>\n" +
				"\n" +
				"\t\t\t<output>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"dustGoldirite\" number=\"2\"/>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"dustCopper\" number=\"1\" chance=\"0.2\"/>\n" +
				"\t\t\t\t<itemStack modID=\"minecraft\" itemName=\"cobblestone\" chance=\"0.15\"/>\n" +
				"\t\t\t</output>\n" +
				"\t\t</recipe>\n" +
				"\n" +
				"\t\t<recipe name=\"GoldiriteIngot\" energyCost=\"2500\">\n" +
				"\t\t\t<input>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"ingotGoldirite\"/>\n" +
				"\t\t\t</input>\n" +
				"\n" +
				"\t\t\t<output>\n" +
				"\t\t\t\t<itemStack oreDictionary=\"dustGoldirite\" number=\"1\"/>\n" +
				"\t\t\t</output>\n" +
				"\t\t</recipe>\n" +
				"\t</recipeGroup>\n" +
				"\n" +
				"\t<grindingBalls>\n" +
				"\t\t<grindingBall id=\"Diamond\" grindingMultiplier=\"1.5\" chanceMultiplier=\"2\" powerMultiplier=\"0.5\" durationRF=\"50000\">\n" +
				"\t\t\t<itemStack oreDictionary=\"gemDiamond\"/>\n" +
				"\t\t</grindingBall>\n" +
				"\n" +
				"\t\t<grindingBall id=\"DiamondBlock\" grindingMultiplier=\"1.8\" chanceMultiplier=\"4\" powerMultiplier=\"0.1\" durationRF=\"450000\">\n" +
				"\t\t\t<itemStack oreDictionary=\"blockDiamond\"/>\n" +
				"\t\t</grindingBall>\n" +
				"\n" +
				"\t\t<grindingBall id=\"Diamondium\" grindingMultiplier=\"1.8\" chanceMultiplier=\"2.4\" powerMultiplier=\"0.4\" durationRF=\"60000\">\n" +
				"\t\t\t<itemStack oreDictionary=\"gemDiamondium\"/>\n" +
				"\t\t</grindingBall>\n" +
				"\n" +
				"\t\t<grindingBall id=\"DiamondiumBlock\" grindingMultiplier=\"2\" chanceMultiplier=\"5\" powerMultiplier=\"0.4\" durationRF=\"540000\">\n" +
				"\t\t\t<itemStack oreDictionary=\"blockDiamondium\"/>\n" +
				"\t\t</grindingBall>\n" +
				"\t</grindingBalls>\n" +
				"</SAGMillRecipes>";
		FMLInterModComms.sendMessage ( super.getModId (), "recipe:sagmill", string );
	}
}
