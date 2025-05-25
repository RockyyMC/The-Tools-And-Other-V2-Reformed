
package runner.rocky.the_tools_and_other_reformed.potion;

import runner.rocky.the_tools_and_other_reformed.procedures.AddEfectProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;

public class IceMobEffect extends MobEffect {
	public IceMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16711681);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		AddEfectProcedure.execute(entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		AddEfectProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}

	@Override
	public void onMobHurt(ServerLevel level, LivingEntity entity, int amplifier, DamageSource damagesource, float damage) {
		AddEfectProcedure.execute(entity);
	}
}
