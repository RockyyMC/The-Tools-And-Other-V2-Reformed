
package runner.rocky.the_tools_and_other_reformed.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;

import com.mojang.serialization.MapCodec;

public class RedSandBlock extends FallingBlock {
	public static final MapCodec<RedSandBlock> CODEC = simpleCodec(RedSandBlock::new);

	public MapCodec<RedSandBlock> codec() {
		return CODEC;
	}

	public RedSandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
