
package runner.rocky.the_tools_and_other_reformed.block;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class PinkWaterBlock extends LiquidBlock {
	public PinkWaterBlock(BlockBehaviour.Properties properties) {
		super(TheToolsAndOtherV2ReformedModFluids.PINK_WATER.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
