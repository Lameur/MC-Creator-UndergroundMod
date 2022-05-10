
package net.mcreator.amod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.amod.init.AModModTabs;
import net.mcreator.amod.init.AModModItems;

public abstract class PlatiniumArmorItem extends ArmorItem {
	public PlatiniumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{20, 50, 60, 20}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 90;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AModModItems.PLATINIUM_INGOT.get()));
			}

			@Override
			public String getName() {
				return "platinium_armor";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PlatiniumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AModModTabs.TAB_UNDERGROUD_MOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "a_mod:textures/models/armor/platinium_layer_1.png";
		}
	}

	public static class Chestplate extends PlatiniumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AModModTabs.TAB_UNDERGROUD_MOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "a_mod:textures/models/armor/platinium_layer_1.png";
		}
	}

	public static class Leggings extends PlatiniumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AModModTabs.TAB_UNDERGROUD_MOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "a_mod:textures/models/armor/platinium_layer_2.png";
		}
	}

	public static class Boots extends PlatiniumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AModModTabs.TAB_UNDERGROUD_MOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "a_mod:textures/models/armor/platinium_layer_1.png";
		}
	}
}
