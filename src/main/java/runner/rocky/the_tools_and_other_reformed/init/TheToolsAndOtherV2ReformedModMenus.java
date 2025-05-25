
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.world.inventory.NetheriteChestGUIMenu;
import runner.rocky.the_tools_and_other_reformed.world.inventory.IronChestGUIMenu;
import runner.rocky.the_tools_and_other_reformed.world.inventory.FurnacingMenu;
import runner.rocky.the_tools_and_other_reformed.world.inventory.FridgeGUIMenu;
import runner.rocky.the_tools_and_other_reformed.world.inventory.EnchantsMenu;
import runner.rocky.the_tools_and_other_reformed.world.inventory.DiamondChestGUIMenu;
import runner.rocky.the_tools_and_other_reformed.world.inventory.ChestGUIMenu;
import runner.rocky.the_tools_and_other_reformed.network.MenuStateUpdateMessage;
import runner.rocky.the_tools_and_other_reformed.TheToolsAndOtherV2ReformedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import java.util.Map;

public class TheToolsAndOtherV2ReformedModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, TheToolsAndOtherV2ReformedMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<FurnacingMenu>> FURNACING = REGISTRY.register("furnacing", () -> IMenuTypeExtension.create(FurnacingMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ChestGUIMenu>> CHEST_GUI = REGISTRY.register("chest_gui", () -> IMenuTypeExtension.create(ChestGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<IronChestGUIMenu>> IRON_CHEST_GUI = REGISTRY.register("iron_chest_gui", () -> IMenuTypeExtension.create(IronChestGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DiamondChestGUIMenu>> DIAMOND_CHEST_GUI = REGISTRY.register("diamond_chest_gui", () -> IMenuTypeExtension.create(DiamondChestGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<NetheriteChestGUIMenu>> NETHERITE_CHEST_GUI = REGISTRY.register("netherite_chest_gui", () -> IMenuTypeExtension.create(NetheriteChestGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FridgeGUIMenu>> FRIDGE_GUI = REGISTRY.register("fridge_gui", () -> IMenuTypeExtension.create(FridgeGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EnchantsMenu>> ENCHANTS = REGISTRY.register("enchants", () -> IMenuTypeExtension.create(EnchantsMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof TheToolsAndOtherV2ReformedModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				PacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}
