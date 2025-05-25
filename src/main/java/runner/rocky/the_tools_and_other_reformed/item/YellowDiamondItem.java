
package runner.rocky.the_tools_and_other_reformed.item;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModItems;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import java.util.Map;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class YellowDiamondItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(60, Map.of(ArmorType.BOOTS, 41, ArmorType.LEGGINGS, 42, ArmorType.CHESTPLATE, 47, ArmorType.HELMET, 45, ArmorType.BODY, 47), 56,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_diamond")), 4f, 3f, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:yellow_diamond_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("the_tools_and_other_v2_reformed:yellow_diamond")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other_v2_reformed:textures/models/armor/yellow_diamond_layer_1.png");
			}
		}, TheToolsAndOtherV2ReformedModItems.YELLOW_DIAMOND_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other_v2_reformed:textures/models/armor/yellow_diamond_layer_1.png");
			}
		}, TheToolsAndOtherV2ReformedModItems.YELLOW_DIAMOND_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other_v2_reformed:textures/models/armor/yellow_diamond_layer_2.png");
			}
		}, TheToolsAndOtherV2ReformedModItems.YELLOW_DIAMOND_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other_v2_reformed:textures/models/armor/yellow_diamond_layer_1.png");
			}
		}, TheToolsAndOtherV2ReformedModItems.YELLOW_DIAMOND_BOOTS.get());
	}

	private YellowDiamondItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends YellowDiamondItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}
	}

	public static class Chestplate extends YellowDiamondItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}
	}

	public static class Leggings extends YellowDiamondItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}
	}

	public static class Boots extends YellowDiamondItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}
	}
}
