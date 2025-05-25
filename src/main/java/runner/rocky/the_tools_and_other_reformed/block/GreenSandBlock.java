
package runner.rocky.the_tools_and_other_reformed.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;

import com.mojang.serialization.MapCodec;

public class GreenSandBlock extends FallingBlock {
	public static final MapCodec<GreenSandBlock> CODEC = simpleCodec(GreenSandBlock::new);

	public MapCodec<GreenSandBlock> codec() {
		return CODEC;
	}

	public GreenSandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
