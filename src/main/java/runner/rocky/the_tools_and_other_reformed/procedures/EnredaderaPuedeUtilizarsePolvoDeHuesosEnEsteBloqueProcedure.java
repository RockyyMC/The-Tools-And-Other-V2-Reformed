package runner.rocky.the_tools_and_other_reformed.procedures;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class EnredaderaPuedeUtilizarsePolvoDeHuesosEnEsteBloqueProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TheToolsAndOtherV2ReformedModBlocks.ENREDADERA.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TheToolsAndOtherV2ReformedModBlocks.ENREDADERA_2.get();
	}
}
