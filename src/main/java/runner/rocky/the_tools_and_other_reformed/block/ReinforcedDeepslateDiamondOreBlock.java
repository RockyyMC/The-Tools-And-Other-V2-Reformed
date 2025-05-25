
package runner.rocky.the_tools_and_other_reformed.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ReinforcedDeepslateDiamondOreBlock extends Block {
	public ReinforcedDeepslateDiamondOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(9f, 19f).instrument(NoteBlockInstrument.CHIME));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
