
package runner.rocky.the_tools_and_other_reformed.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RenforcedDiamondOreBlock extends Block {
	public RenforcedDiamondOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(8f, 18f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.CHIME));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
