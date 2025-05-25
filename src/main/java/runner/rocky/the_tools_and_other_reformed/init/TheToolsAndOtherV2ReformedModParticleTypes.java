
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.TheToolsAndOtherV2ReformedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class TheToolsAndOtherV2ReformedModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, TheToolsAndOtherV2ReformedMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BERNY_PARTICLE = REGISTRY.register("berny_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> MAGNE_PARTICLE = REGISTRY.register("magne_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> TRUSTANIC_PARTICLE = REGISTRY.register("trustanic_particle", () -> new SimpleParticleType(false));
}
