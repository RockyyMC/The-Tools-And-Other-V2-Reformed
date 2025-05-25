
package runner.rocky.the_tools_and_other_reformed.potion;

import runner.rocky.the_tools_and_other_reformed.procedures.AddEffProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class VisionsMobEffect extends MobEffect {
	public VisionsMobEffect() {
		super(MobEffectCategory.NEUTRAL, -15007515);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.lingering_potion.throw")));
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		AddEffProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}
