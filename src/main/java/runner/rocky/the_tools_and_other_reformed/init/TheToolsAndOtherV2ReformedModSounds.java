
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.TheToolsAndOtherV2ReformedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TheToolsAndOtherV2ReformedModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, TheToolsAndOtherV2ReformedMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> EXPLOSION = REGISTRY.register("explosion", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("the_tools_and_other_v2_reformed", "explosion")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EXPLOSIVE = REGISTRY.register("explosive", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("the_tools_and_other_v2_reformed", "explosive")));
}
