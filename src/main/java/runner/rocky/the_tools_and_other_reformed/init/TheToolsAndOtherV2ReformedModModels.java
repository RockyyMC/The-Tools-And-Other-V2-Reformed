
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.client.model.Modelrockys;
import runner.rocky.the_tools_and_other_reformed.client.model.Modelmetist;
import runner.rocky.the_tools_and_other_reformed.client.model.Modelmatistv2;
import runner.rocky.the_tools_and_other_reformed.client.model.Modelcutyd;
import runner.rocky.the_tools_and_other_reformed.client.model.Modelbaby_purple_slime;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TheToolsAndOtherV2ReformedModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelrockys.LAYER_LOCATION, Modelrockys::createBodyLayer);
		event.registerLayerDefinition(Modelmatistv2.LAYER_LOCATION, Modelmatistv2::createBodyLayer);
		event.registerLayerDefinition(Modelcutyd.LAYER_LOCATION, Modelcutyd::createBodyLayer);
		event.registerLayerDefinition(Modelmetist.LAYER_LOCATION, Modelmetist::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_purple_slime.LAYER_LOCATION, Modelbaby_purple_slime::createBodyLayer);
	}
}
