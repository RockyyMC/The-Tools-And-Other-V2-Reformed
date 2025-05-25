
package runner.rocky.the_tools_and_other_reformed.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;

import com.mojang.serialization.MapCodec;

public class LightBlueSandBlock extends FallingBlock {
	public static final MapCodec<LightBlueSandBlock> CODEC = simpleCodec(LightBlueSandBlock::new);

	public MapCodec<LightBlueSandBlock> codec() {
		return CODEC;
	}

	public LightBlueSandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
