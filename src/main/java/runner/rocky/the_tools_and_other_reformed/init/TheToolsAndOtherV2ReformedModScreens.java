
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.client.gui.NetheriteChestGUIScreen;
import runner.rocky.the_tools_and_other_reformed.client.gui.IronChestGUIScreen;
import runner.rocky.the_tools_and_other_reformed.client.gui.FurnacingScreen;
import runner.rocky.the_tools_and_other_reformed.client.gui.FridgeGUIScreen;
import runner.rocky.the_tools_and_other_reformed.client.gui.EnchantsScreen;
import runner.rocky.the_tools_and_other_reformed.client.gui.DiamondChestGUIScreen;
import runner.rocky.the_tools_and_other_reformed.client.gui.ChestGUIScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheToolsAndOtherV2ReformedModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(TheToolsAndOtherV2ReformedModMenus.FURNACING.get(), FurnacingScreen::new);
		event.register(TheToolsAndOtherV2ReformedModMenus.CHEST_GUI.get(), ChestGUIScreen::new);
		event.register(TheToolsAndOtherV2ReformedModMenus.IRON_CHEST_GUI.get(), IronChestGUIScreen::new);
		event.register(TheToolsAndOtherV2ReformedModMenus.DIAMOND_CHEST_GUI.get(), DiamondChestGUIScreen::new);
		event.register(TheToolsAndOtherV2ReformedModMenus.NETHERITE_CHEST_GUI.get(), NetheriteChestGUIScreen::new);
		event.register(TheToolsAndOtherV2ReformedModMenus.FRIDGE_GUI.get(), FridgeGUIScreen::new);
		event.register(TheToolsAndOtherV2ReformedModMenus.ENCHANTS.get(), EnchantsScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}
