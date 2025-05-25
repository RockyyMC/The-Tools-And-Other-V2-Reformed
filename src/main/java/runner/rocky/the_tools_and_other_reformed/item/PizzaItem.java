
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PizzaItem extends Item {
	public PizzaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(32).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(1.99f).build()));
	}
}
