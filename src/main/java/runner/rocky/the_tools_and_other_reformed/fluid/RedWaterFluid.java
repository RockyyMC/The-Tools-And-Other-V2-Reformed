
package runner.rocky.the_tools_and_other_reformed.fluid;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModItems;
import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModFluids;
import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModFluidTypes;
import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModBlocks;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class RedWaterFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> TheToolsAndOtherV2ReformedModFluidTypes.RED_WATER_TYPE.get(), () -> TheToolsAndOtherV2ReformedModFluids.RED_WATER.get(),
			() -> TheToolsAndOtherV2ReformedModFluids.FLOWING_RED_WATER.get()).explosionResistance(100f).bucket(() -> TheToolsAndOtherV2ReformedModItems.RED_WATER_BUCKET.get())
			.block(() -> (LiquidBlock) TheToolsAndOtherV2ReformedModBlocks.RED_WATER.get());

	private RedWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends RedWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends RedWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
