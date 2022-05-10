
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AModModTabs {
	public static CreativeModeTab TAB_UNDERGROUD_MOD;

	public static void load() {
		TAB_UNDERGROUD_MOD = new CreativeModeTab("tabundergroud_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AModModItems.PLATINIUM_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
