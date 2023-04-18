
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.amod.world.biome.GlobalBiomeBiome;
import net.mcreator.amod.AModMod;

public class AModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, AModMod.MODID);
	public static final RegistryObject<Biome> GLOBAL_BIOME = REGISTRY.register("global_biome", () -> GlobalBiomeBiome.createBiome());
}
