
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.entity.RockysEntity;
import runner.rocky.the_tools_and_other_reformed.entity.PurpleSlimeEntity;
import runner.rocky.the_tools_and_other_reformed.entity.MatistEntity;
import runner.rocky.the_tools_and_other_reformed.entity.DuckEntity;
import runner.rocky.the_tools_and_other_reformed.entity.BrownPigEntity;
import runner.rocky.the_tools_and_other_reformed.entity.BlueSlimeEntity;
import runner.rocky.the_tools_and_other_reformed.entity.AireEntity;
import runner.rocky.the_tools_and_other_reformed.TheToolsAndOtherV2ReformedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TheToolsAndOtherV2ReformedModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, TheToolsAndOtherV2ReformedMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<DuckEntity>> DUCK = register("duck",
			EntityType.Builder.<DuckEntity>of(DuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MatistEntity>> MATIST = register("matist",
			EntityType.Builder.<MatistEntity>of(MatistEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockysEntity>> ROCKYS = register("rockys",
			EntityType.Builder.<RockysEntity>of(RockysEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AireEntity>> AIRE = register("aire",
			EntityType.Builder.<AireEntity>of(AireEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PurpleSlimeEntity>> PURPLE_SLIME = register("purple_slime",
			EntityType.Builder.<PurpleSlimeEntity>of(PurpleSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueSlimeEntity>> BLUE_SLIME = register("blue_slime",
			EntityType.Builder.<BlueSlimeEntity>of(BlueSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrownPigEntity>> BROWN_PIG = register("brown_pig",
			EntityType.Builder.<BrownPigEntity>of(BrownPigEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.9f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(TheToolsAndOtherV2ReformedMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		DuckEntity.init(event);
		MatistEntity.init(event);
		RockysEntity.init(event);
		PurpleSlimeEntity.init(event);
		BlueSlimeEntity.init(event);
		BrownPigEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DUCK.get(), DuckEntity.createAttributes().build());
		event.put(MATIST.get(), MatistEntity.createAttributes().build());
		event.put(ROCKYS.get(), RockysEntity.createAttributes().build());
		event.put(PURPLE_SLIME.get(), PurpleSlimeEntity.createAttributes().build());
		event.put(BLUE_SLIME.get(), BlueSlimeEntity.createAttributes().build());
		event.put(BROWN_PIG.get(), BrownPigEntity.createAttributes().build());
	}
}
