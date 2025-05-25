
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedDiamondIngotItem extends Item {
	public RedDiamondIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
