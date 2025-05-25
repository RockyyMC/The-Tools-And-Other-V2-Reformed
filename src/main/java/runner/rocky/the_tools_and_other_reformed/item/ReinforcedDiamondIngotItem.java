
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReinforcedDiamondIngotItem extends Item {
	public ReinforcedDiamondIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(64));
	}
}
