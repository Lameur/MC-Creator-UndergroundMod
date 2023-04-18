
package net.mcreator.amod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;

import net.mcreator.amod.procedures.UndergroundportaligniterLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure;
import net.mcreator.amod.init.AModModTabs;

public class UndergroundportaligniterItem extends Item {
	public UndergroundportaligniterItem() {
		super(new Item.Properties().tab(AModModTabs.TAB_UNDERGROUD_MOD).durability(45).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		UndergroundportaligniterLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		UndergroundportaligniterLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
