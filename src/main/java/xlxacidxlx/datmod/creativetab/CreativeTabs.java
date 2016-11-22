package xlxacidxlx.datmod.creativetab;

/**
 * Created by Acid on 10/26/2016.
 */
public class CreativeTabs {
	public static Armors armors;
	public static Blocks blocks;
	public static Dusts dusts;
	public static Ingots ingots;
	public static Items items;
	public static Ores ores;
	public static Tools tools;

	/**
	 * Registers all of our creative tabs
	 */
	public CreativeTabs() {
		armors=new Armors();
		blocks = new Blocks();
		dusts = new Dusts();
		ingots = new Ingots();
		items = new Items();
		ores = new Ores();
		tools = new Tools();
	}
}
