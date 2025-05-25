
package runner.rocky.the_tools_and_other_reformed.potion;

import runner.rocky.the_tools_and_other_reformed.procedures.WerknesProcedure;
import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModMobEffects;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.component.DataComponents;

import java.util.List;
import java.util.ArrayList;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WarkdesMobEffect extends MobEffect {
	public WarkdesMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		WerknesProcedure.execute(entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		WerknesProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		Consumable original = Items.HONEY_BOTTLE.components().get(DataComponents.CONSUMABLE);
		if (original != null) {
			List<ConsumeEffect> onConsumeEffects = new ArrayList<>(original.onConsumeEffects());
			onConsumeEffects.add(new RemoveStatusEffectsConsumeEffect(TheToolsAndOtherV2ReformedModMobEffects.WARKDES));
			Consumable replacementConsumable = new Consumable(original.consumeSeconds(), original.animation(), original.sound(), original.hasConsumeParticles(), onConsumeEffects);
			event.modify(Items.HONEY_BOTTLE, builder -> builder.set(DataComponents.CONSUMABLE, replacementConsumable));
		}
	}
}
