package net.mcreator.amod.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.amod.configuration.ConfConfiguration;
import net.mcreator.amod.AModMod;

@Mod.EventBusSubscriber(modid = AModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AModModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfConfiguration.SPEC, "Conf.toml");
		});
	}
}
