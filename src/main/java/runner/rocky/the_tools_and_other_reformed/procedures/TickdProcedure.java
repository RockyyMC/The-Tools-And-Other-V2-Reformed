package runner.rocky.the_tools_and_other_reformed.procedures;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class TickdProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TheToolsAndOtherV2ReformedModMobEffects.PETROLL, 60, 1));
		}
	}
}
