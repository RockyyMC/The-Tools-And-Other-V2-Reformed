
package runner.rocky.the_tools_and_other_reformed.block;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModBlocks;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.Minecraft;

public class OptiniumBlock extends Block {
	public OptiniumBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.register((bs, world, pos, index) -> {
			return world != null && pos != null ? Minecraft.getInstance().level.getBiome(pos).value().getFogColor() : 12638463;
		}, TheToolsAndOtherV2ReformedModBlocks.OPTINIUM.get());
	}
}
