
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.amod.item.UndergroundportaligniterItem;
import net.mcreator.amod.item.UndergroundItem;
import net.mcreator.amod.item.PlatiniumSwordItem;
import net.mcreator.amod.item.PlatiniumShovelItem;
import net.mcreator.amod.item.PlatiniumPickaxeItem;
import net.mcreator.amod.item.PlatiniumIngotItem;
import net.mcreator.amod.item.PlatiniumHoeItem;
import net.mcreator.amod.item.PlatiniumBowItem;
import net.mcreator.amod.item.PlatiniumAxeItem;
import net.mcreator.amod.item.PlatiniumArmorItem;
import net.mcreator.amod.item.ArrowbulletItem;
import net.mcreator.amod.AModMod;

public class AModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AModMod.MODID);
	public static final RegistryObject<Item> PLATINIUM_INGOT = REGISTRY.register("platinium_ingot", () -> new PlatiniumIngotItem());
	public static final RegistryObject<Item> UNDERGROUND = REGISTRY.register("underground", () -> new UndergroundItem());
	public static final RegistryObject<Item> PLATINIUM_BLOCK = block(AModModBlocks.PLATINIUM_BLOCK, AModModTabs.TAB_UNDERGROUD_MOD);
	public static final RegistryObject<Item> PLATINIUM_ORE = block(AModModBlocks.PLATINIUM_ORE, AModModTabs.TAB_UNDERGROUD_MOD);
	public static final RegistryObject<Item> CRAFTING = block(AModModBlocks.CRAFTING, AModModTabs.TAB_UNDERGROUD_MOD);
	public static final RegistryObject<Item> UNDERGROUND_BLOCK_BASE = block(AModModBlocks.UNDERGROUND_BLOCK_BASE, AModModTabs.TAB_UNDERGROUD_MOD);
	public static final RegistryObject<Item> UNDERGROUND_GRASS = block(AModModBlocks.UNDERGROUND_GRASS, AModModTabs.TAB_UNDERGROUD_MOD);
	public static final RegistryObject<Item> PLATINIUM_ARMOR_HELMET = REGISTRY.register("platinium_armor_helmet", () -> new PlatiniumArmorItem.Helmet());
	public static final RegistryObject<Item> PLATINIUM_ARMOR_CHESTPLATE = REGISTRY.register("platinium_armor_chestplate", () -> new PlatiniumArmorItem.Chestplate());
	public static final RegistryObject<Item> PLATINIUM_ARMOR_LEGGINGS = REGISTRY.register("platinium_armor_leggings", () -> new PlatiniumArmorItem.Leggings());
	public static final RegistryObject<Item> PLATINIUM_ARMOR_BOOTS = REGISTRY.register("platinium_armor_boots", () -> new PlatiniumArmorItem.Boots());
	public static final RegistryObject<Item> PLATINIUM_SWORD = REGISTRY.register("platinium_sword", () -> new PlatiniumSwordItem());
	public static final RegistryObject<Item> PLATINIUM_PICKAXE = REGISTRY.register("platinium_pickaxe", () -> new PlatiniumPickaxeItem());
	public static final RegistryObject<Item> PLATINIUM_AXE = REGISTRY.register("platinium_axe", () -> new PlatiniumAxeItem());
	public static final RegistryObject<Item> PLATINIUM_SHOVEL = REGISTRY.register("platinium_shovel", () -> new PlatiniumShovelItem());
	public static final RegistryObject<Item> PLATINIUM_HOE = REGISTRY.register("platinium_hoe", () -> new PlatiniumHoeItem());
	public static final RegistryObject<Item> PLATINIUM_BOW = REGISTRY.register("platinium_bow", () -> new PlatiniumBowItem());
	public static final RegistryObject<Item> UNDERGROUNDPORTALIGNITER = REGISTRY.register("undergroundportaligniter", () -> new UndergroundportaligniterItem());
	public static final RegistryObject<Item> ARROWBULLET = REGISTRY.register("arrowbullet", () -> new ArrowbulletItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
