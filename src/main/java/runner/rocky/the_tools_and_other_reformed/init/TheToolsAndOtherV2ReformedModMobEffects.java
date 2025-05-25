
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.procedures.KilledProcedure;
import runner.rocky.the_tools_and_other_reformed.potion.WarkdesMobEffect;
import runner.rocky.the_tools_and_other_reformed.potion.VisionsMobEffect;
import runner.rocky.the_tools_and_other_reformed.potion.PetrollMobEffect;
import runner.rocky.the_tools_and_other_reformed.potion.IceMobEffect;
import runner.rocky.the_tools_and_other_reformed.potion.FlyesMobEffect;
import runner.rocky.the_tools_and_other_reformed.potion.DamageMobEffect;
import runner.rocky.the_tools_and_other_reformed.TheToolsAndOtherV2ReformedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class TheToolsAndOtherV2ReformedModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, TheToolsAndOtherV2ReformedMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> WARKDES = REGISTRY.register("warkdes", () -> new WarkdesMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICE = REGISTRY.register("ice", () -> new IceMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DAMAGE = REGISTRY.register("damage", () -> new DamageMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> VISIONS = REGISTRY.register("visions", () -> new VisionsMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FLYES = REGISTRY.register("flyes", () -> new FlyesMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PETROLL = REGISTRY.register("petroll", () -> new PetrollMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(WARKDES)) {
			KilledProcedure.execute(entity);
		}
	}
}
