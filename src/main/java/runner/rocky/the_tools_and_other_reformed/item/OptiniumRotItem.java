
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class OptiniumRotItem extends Item {
	public OptiniumRotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).durability(234).enchantable(49));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 34f;
	}

	@Override
	public boolean isCorrectToolForDrops(ItemStack itemstack, BlockState state) {
		return true;
	}
}
