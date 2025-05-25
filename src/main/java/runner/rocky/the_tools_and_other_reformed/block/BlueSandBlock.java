
package runner.rocky.the_tools_and_other_reformed.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;

import com.mojang.serialization.MapCodec;

public class BlueSandBlock extends FallingBlock {
	public static final MapCodec<BlueSandBlock> CODEC = simpleCodec(BlueSandBlock::new);

	public MapCodec<BlueSandBlock> codec() {
		return CODEC;
	}

	public BlueSandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
