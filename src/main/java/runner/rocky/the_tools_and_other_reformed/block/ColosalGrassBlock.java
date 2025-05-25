
package runner.rocky.the_tools_and_other_reformed.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ColosalGrassBlock extends Block {
	public ColosalGrassBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.GRASS).sound(SoundType.WET_GRASS).strength(3f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
