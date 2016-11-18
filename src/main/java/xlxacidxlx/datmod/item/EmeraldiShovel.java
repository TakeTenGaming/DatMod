package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemShovel;

/**
 * Created by Acid on 11/1/2016.
 */
public class EmeraldiShovel extends ItemShovel {
	/**
	 * Constructs the Emeraldi Shovel
	 */
	public EmeraldiShovel() {
		super(Materials.emeraldi, "Emeraldi Shovel");

		setImplemented(true);
	}
}
