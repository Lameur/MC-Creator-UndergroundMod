package net.mcreator.amod.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> CHEAT;
	static {
		BUILDER.push("");
		CHEAT = BUILDER.define("", false);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
