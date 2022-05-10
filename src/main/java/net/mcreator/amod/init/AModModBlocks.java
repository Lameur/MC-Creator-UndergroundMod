
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.amod.block.UndergroundPortalBlock;
import net.mcreator.amod.block.UndergroundGrassBlock;
import net.mcreator.amod.block.UndergroundBlockBaseBlock;
import net.mcreator.amod.block.PlatiniumOreBlock;
import net.mcreator.amod.block.PlatiniumBlockBlock;
import net.mcreator.amod.block.CraftingBlock;
import net.mcreator.amod.AModMod;

public class AModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AModMod.MODID);
	public static final RegistryObject<Block> UNDERGROUND_PORTAL = REGISTRY.register("underground_portal", () -> new UndergroundPortalBlock());
	public static final RegistryObject<Block> PLATINIUM_BLOCK = REGISTRY.register("platinium_block", () -> new PlatiniumBlockBlock());
	public static final RegistryObject<Block> PLATINIUM_ORE = REGISTRY.register("platinium_ore", () -> new PlatiniumOreBlock());
	public static final RegistryObject<Block> CRAFTING = REGISTRY.register("crafting", () -> new CraftingBlock());
	public static final RegistryObject<Block> UNDERGROUND_BLOCK_BASE = REGISTRY.register("underground_block_base",
			() -> new UndergroundBlockBaseBlock());
	public static final RegistryObject<Block> UNDERGROUND_GRASS = REGISTRY.register("underground_grass", () -> new UndergroundGrassBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CraftingBlock.registerRenderLayer();
			UndergroundGrassBlock.registerRenderLayer();
		}
	}
}
