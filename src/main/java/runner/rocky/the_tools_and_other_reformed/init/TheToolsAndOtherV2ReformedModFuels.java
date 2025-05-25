
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class TheToolsAndOtherV2ReformedModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == TheToolsAndOtherV2ReformedModItems.COLSITEM.get())
			event.setBurnTime(1200);
		else if (itemstack.getItem() == TheToolsAndOtherV2ReformedModItems.FANTIST.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == TheToolsAndOtherV2ReformedModItems.WOODSIDED.get())
			event.setBurnTime(1200);
	}
}
