package runner.rocky.the_tools_and_other_reformed.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class EnredaderaCondicionDePosicionValidaParaColocarProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		return !(world.isEmptyBlock(BlockPos.containing(x, y, z - 1)) || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() instanceof LiquidBlock) && (getDirectionFromBlockState(blockstate)) == Direction.SOUTH
				|| !(world.isEmptyBlock(BlockPos.containing(x, y, z + 1)) || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() instanceof LiquidBlock) && (getDirectionFromBlockState(blockstate)) == Direction.NORTH
				|| !(world.isEmptyBlock(BlockPos.containing(x + 1, y, z)) || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() instanceof LiquidBlock) && (getDirectionFromBlockState(blockstate)) == Direction.WEST
				|| !(world.isEmptyBlock(BlockPos.containing(x - 1, y, z)) || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() instanceof LiquidBlock) && (getDirectionFromBlockState(blockstate)) == Direction.EAST
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("neoforge:vines")))
						&& (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y + 1, z))))) == (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z)))));
	}

	private static Direction getDirectionFromBlockState(BlockState blockState) {
		if (blockState.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty ep && ep.getValueClass() == Direction.class)
			return (Direction) blockState.getValue(ep);
		if (blockState.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty ep && ep.getValueClass() == Direction.Axis.class)
			return Direction.fromAxisAndDirection((Direction.Axis) blockState.getValue(ep), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}
}
