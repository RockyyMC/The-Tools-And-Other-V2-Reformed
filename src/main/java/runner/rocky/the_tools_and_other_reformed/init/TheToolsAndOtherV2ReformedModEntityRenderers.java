
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.client.renderer.RockysRenderer;
import runner.rocky.the_tools_and_other_reformed.client.renderer.PurpleSlimeRenderer;
import runner.rocky.the_tools_and_other_reformed.client.renderer.MatistRenderer;
import runner.rocky.the_tools_and_other_reformed.client.renderer.DuckRenderer;
import runner.rocky.the_tools_and_other_reformed.client.renderer.BrownPigRenderer;
import runner.rocky.the_tools_and_other_reformed.client.renderer.BlueSlimeRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheToolsAndOtherV2ReformedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheToolsAndOtherV2ReformedModEntities.DUCK.get(), DuckRenderer::new);
		event.registerEntityRenderer(TheToolsAndOtherV2ReformedModEntities.MATIST.get(), MatistRenderer::new);
		event.registerEntityRenderer(TheToolsAndOtherV2ReformedModEntities.ROCKYS.get(), RockysRenderer::new);
		event.registerEntityRenderer(TheToolsAndOtherV2ReformedModEntities.AIRE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TheToolsAndOtherV2ReformedModEntities.PURPLE_SLIME.get(), PurpleSlimeRenderer::new);
		event.registerEntityRenderer(TheToolsAndOtherV2ReformedModEntities.BLUE_SLIME.get(), BlueSlimeRenderer::new);
		event.registerEntityRenderer(TheToolsAndOtherV2ReformedModEntities.BROWN_PIG.get(), BrownPigRenderer::new);
	}
}
