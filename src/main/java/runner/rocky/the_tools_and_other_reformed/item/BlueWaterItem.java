
package runner.rocky.the_tools_and_other_reformed.item;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class BlueWaterItem extends BucketItem {
	public BlueWaterItem(Item.Properties properties) {
		super(TheToolsAndOtherV2ReformedModFluids.BLUE_WATER.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
