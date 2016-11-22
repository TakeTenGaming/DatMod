package xlxacidxlx.datmod.base;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Acid on 11/19/2016.
 */
public class Container extends net.minecraft.inventory.Container {
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}
}
