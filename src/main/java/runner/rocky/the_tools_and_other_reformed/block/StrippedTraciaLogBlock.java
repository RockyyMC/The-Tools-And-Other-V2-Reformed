
package runner.rocky.the_tools_and_other_reformed.block;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

public class StrippedTraciaLogBlock extends Block {
	public StrippedTraciaLogBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(4f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state, boolean includeData, Player entity) {
		return new ItemStack(TheToolsAndOtherV2ReformedModBlocks.STRIPPED_TRACIA_LOG.get());
	}
}
