package xlxacidxlx.datmod.register;

/**
 * Created by Acid on 1/1/2017.
 */
public class OreDictionary
{
	public static void preInit ()
	{
		// Blocks
		net.minecraftforge.oredict.OreDictionary.registerOre ( "blockDiamondium", Blocks.diamondium );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "blockEmeraldi", Blocks.emeraldi );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "blockGoldirite", Blocks.goldirite );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "blockIronium", Blocks.ironium );

		// Dusts
		net.minecraftforge.oredict.OreDictionary.registerOre ( "dustGoldirite", Items.goldiriteDust );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "dustIronium", Items.ironiumDust );

		// Gems
		net.minecraftforge.oredict.OreDictionary.registerOre ( "gemDiamondium", Items.diamondium );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "gemEmeraldi", Items.emeraldi );

		// Ingots
		net.minecraftforge.oredict.OreDictionary.registerOre ( "diamondium", Items.diamondium );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "emeraldi", Items.emeraldi );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "ingotGoldirite", Items.goldiriteIngot );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "ingotIronium", Items.ironiumIngot );

		// Ores
		net.minecraftforge.oredict.OreDictionary.registerOre ( "oreDiamondium", Blocks.diamondiumOre );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "oreEmeraldi", Blocks.emeraldiOre );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "oreGoldirite", Blocks.goldiriteOre );
		net.minecraftforge.oredict.OreDictionary.registerOre ( "oreIronium", Blocks.ironiumOre );
	}
}
