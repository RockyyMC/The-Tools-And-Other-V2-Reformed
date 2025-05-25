
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BrownPorkchopCokedItem extends Item {
	public BrownPorkchopCokedItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.99f).build()));
	}
}
