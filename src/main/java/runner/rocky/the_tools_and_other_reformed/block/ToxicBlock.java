
package runner.rocky.the_tools_and_other_reformed.block;

import runner.rocky.the_tools_and_other_reformed.procedures.DamaggeProcedure;
import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class ToxicBlock extends LiquidBlock {
	public ToxicBlock(BlockBehaviour.Properties properties) {
		super(TheToolsAndOtherV2ReformedModFluids.TOXIC.get(), properties.mapColor(MapColor.COLOR_LIGHT_GREEN).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		DamaggeProcedure.execute(entity);
	}
}
