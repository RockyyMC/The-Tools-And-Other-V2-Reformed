
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package runner.rocky.the_tools_and_other_reformed.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class TheToolsAndOtherV2ReformedModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(TheToolsAndOtherV2ReformedModItems.REDSTONE_HELMET.get()), 7, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(TheToolsAndOtherV2ReformedModItems.ONE_HUNDRED_DOLLARS.get(), 6), 5, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(TheToolsAndOtherV2ReformedModItems.NETHERITE_HAMMER.get()), 3, 5, 0.09f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(TheToolsAndOtherV2ReformedModItems.REDSTONE_CHESTPLATE.get()), 2, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(TheToolsAndOtherV2ReformedModItems.REDSTONE_LEGGINGS.get()), 6, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(TheToolsAndOtherV2ReformedModItems.REDSTONE_BOOTS.get()), 4, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 14), new ItemStack(TheToolsAndOtherV2ReformedModItems.PENTIST_HELMET.get()), 5, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 18), new ItemStack(TheToolsAndOtherV2ReformedModItems.PENTIST_HELMET.get()), 6, 5, 0.09f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 23), new ItemStack(TheToolsAndOtherV2ReformedModItems.PENTIST_CHESTPLATE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(TheToolsAndOtherV2ReformedModItems.PENTIST_LEGGINGS.get()), 5, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherV2ReformedModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 14), new ItemStack(TheToolsAndOtherV2ReformedModItems.PENTIST_BOOTS.get()), 6, 5, 0.05f));
		}
	}
}
