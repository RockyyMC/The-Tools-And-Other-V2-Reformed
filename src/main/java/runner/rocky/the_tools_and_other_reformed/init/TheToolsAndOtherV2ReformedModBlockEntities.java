
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.block.entity.NetheriteChestBlockEntity;
import runner.rocky.the_tools_and_other_reformed.block.entity.IronChestBlockEntity;
import runner.rocky.the_tools_and_other_reformed.block.entity.FridgeBlockEntity;
import runner.rocky.the_tools_and_other_reformed.block.entity.EnredaderaBlockEntity;
import runner.rocky.the_tools_and_other_reformed.block.entity.Enredadera3BlockEntity;
import runner.rocky.the_tools_and_other_reformed.block.entity.Enredadera2BlockEntity;
import runner.rocky.the_tools_and_other_reformed.block.entity.EmeraldTableEnchantedBlockEntity;
import runner.rocky.the_tools_and_other_reformed.block.entity.DiamondChestBlockEntity;
import runner.rocky.the_tools_and_other_reformed.block.entity.ChestBlockEntity;
import runner.rocky.the_tools_and_other_reformed.block.entity.BlastingFurnaceBlockEntity;
import runner.rocky.the_tools_and_other_reformed.TheToolsAndOtherV2ReformedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TheToolsAndOtherV2ReformedModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, TheToolsAndOtherV2ReformedMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EnredaderaBlockEntity>> ENREDADERA = register("enredadera", TheToolsAndOtherV2ReformedModBlocks.ENREDADERA, EnredaderaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enredadera2BlockEntity>> ENREDADERA_2 = register("enredadera_2", TheToolsAndOtherV2ReformedModBlocks.ENREDADERA_2, Enredadera2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enredadera3BlockEntity>> ENREDADERA_3 = register("enredadera_3", TheToolsAndOtherV2ReformedModBlocks.ENREDADERA_3, Enredadera3BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BlastingFurnaceBlockEntity>> BLASTING_FURNACE = register("blasting_furnace", TheToolsAndOtherV2ReformedModBlocks.BLASTING_FURNACE, BlastingFurnaceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ChestBlockEntity>> GLASS_CHEST = register("glass_chest", TheToolsAndOtherV2ReformedModBlocks.GLASS_CHEST, ChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IronChestBlockEntity>> IRON_CHEST = register("iron_chest", TheToolsAndOtherV2ReformedModBlocks.IRON_CHEST, IronChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DiamondChestBlockEntity>> DIAMOND_CHEST = register("diamond_chest", TheToolsAndOtherV2ReformedModBlocks.DIAMOND_CHEST, DiamondChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<NetheriteChestBlockEntity>> NETHERITE_CHEST = register("netherite_chest", TheToolsAndOtherV2ReformedModBlocks.NETHERITE_CHEST, NetheriteChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FridgeBlockEntity>> FRIDGE = register("fridge", TheToolsAndOtherV2ReformedModBlocks.FRIDGE, FridgeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EmeraldTableEnchantedBlockEntity>> GOOD_TABLE = register("good_table", TheToolsAndOtherV2ReformedModBlocks.GOOD_TABLE, EmeraldTableEnchantedBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENREDADERA.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENREDADERA_2.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENREDADERA_3.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLASTING_FURNACE.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GLASS_CHEST.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, IRON_CHEST.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DIAMOND_CHEST.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NETHERITE_CHEST.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FRIDGE.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GOOD_TABLE.get(), (blockEntity, side) -> blockEntity.getItemHandler());
	}
}
