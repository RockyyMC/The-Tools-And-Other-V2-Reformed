
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PentistIngotItem extends Item {
	public PentistIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(56).fireResistant().enchantable(2));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}
}
