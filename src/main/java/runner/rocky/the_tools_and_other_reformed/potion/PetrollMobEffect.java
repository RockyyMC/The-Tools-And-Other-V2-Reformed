
package runner.rocky.the_tools_and_other_reformed.potion;

import runner.rocky.the_tools_and_other_reformed.procedures.TickdProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.server.level.ServerLevel;

public class PetrollMobEffect extends InstantenousMobEffect {
	public PetrollMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
	}

	@Override
	public void applyInstantenousEffect(ServerLevel level, Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		TickdProcedure.execute(entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		TickdProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}
