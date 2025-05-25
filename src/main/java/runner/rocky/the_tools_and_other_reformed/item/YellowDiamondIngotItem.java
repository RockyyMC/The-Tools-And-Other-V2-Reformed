
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class YellowDiamondIngotItem extends Item {
	public YellowDiamondIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(64).fireResistant());
	}
}
