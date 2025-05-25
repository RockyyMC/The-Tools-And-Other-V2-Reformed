
package runner.rocky.the_tools_and_other_reformed.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MagnificteciossReinforcedBlock extends Block {
	public MagnificteciossReinforcedBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(20f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
