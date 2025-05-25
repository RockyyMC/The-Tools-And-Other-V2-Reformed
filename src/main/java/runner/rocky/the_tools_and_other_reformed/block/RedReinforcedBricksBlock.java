
package runner.rocky.the_tools_and_other_reformed.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RedReinforcedBricksBlock extends Block {
	public RedReinforcedBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.STONE).strength(2f, 20f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
