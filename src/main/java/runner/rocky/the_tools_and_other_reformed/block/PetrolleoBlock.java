
package runner.rocky.the_tools_and_other_reformed.block;

import runner.rocky.the_tools_and_other_reformed.procedures.TickdProcedure;
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

public class PetrolleoBlock extends LiquidBlock {
	public PetrolleoBlock(BlockBehaviour.Properties properties) {
		super(TheToolsAndOtherV2ReformedModFluids.PETROLLEO.get(), properties.mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		TickdProcedure.execute(entity);
	}
}
