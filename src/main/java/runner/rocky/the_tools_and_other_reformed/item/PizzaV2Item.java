
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PizzaV2Item extends Item {
	public PizzaV2Item(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(1).food((new FoodProperties.Builder()).nutrition(14).saturationModifier(12f).alwaysEdible().build()));
	}
}
