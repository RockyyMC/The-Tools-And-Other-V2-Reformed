
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.client.particle.TrustanicParticleParticle;
import runner.rocky.the_tools_and_other_reformed.client.particle.MagneParticleParticle;
import runner.rocky.the_tools_and_other_reformed.client.particle.BernyParticleParticle;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheToolsAndOtherV2ReformedModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(TheToolsAndOtherV2ReformedModParticleTypes.BERNY_PARTICLE.get(), BernyParticleParticle::provider);
		event.registerSpriteSet(TheToolsAndOtherV2ReformedModParticleTypes.MAGNE_PARTICLE.get(), MagneParticleParticle::provider);
		event.registerSpriteSet(TheToolsAndOtherV2ReformedModParticleTypes.TRUSTANIC_PARTICLE.get(), TrustanicParticleParticle::provider);
	}
}
