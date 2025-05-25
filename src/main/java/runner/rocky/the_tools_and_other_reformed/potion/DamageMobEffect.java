
package runner.rocky.the_tools_and_other_reformed.potion;

import runner.rocky.the_tools_and_other_reformed.procedures.DamageToPlayerProcedure;
import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModMobEffects;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientMobEffectExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DamageMobEffect extends MobEffect {
	public DamageMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		DamageToPlayerProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}

	@SubscribeEvent
	public static void registerMobEffectExtensions(RegisterClientExtensionsEvent event) {
		event.registerMobEffect(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, AbstractContainerScreen<?> screen, GuiGraphics guiGraphics, int x, int y, int blitOffset) {
				return false;
			}
		}, TheToolsAndOtherV2ReformedModMobEffects.DAMAGE.get());
	}
}
