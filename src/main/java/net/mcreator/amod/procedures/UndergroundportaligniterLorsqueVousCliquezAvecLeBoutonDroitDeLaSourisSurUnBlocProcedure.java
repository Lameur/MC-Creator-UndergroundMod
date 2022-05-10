package net.mcreator.amod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.amod.init.AModModItems;
import net.mcreator.amod.init.AModModBlocks;

import java.util.Random;

public class UndergroundportaligniterLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < (int) (8); index0++) {
			sy = -3;
			for (int index1 = 0; index1 < (int) (8); index1++) {
				sz = -3;
				for (int index2 = 0; index2 < (int) (8); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == AModModBlocks.PLATINIUM_BLOCK.get()) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			{
				ItemStack _ist = new ItemStack(AModModItems.UNDERGROUNDPORTALIGNITER.get());
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
