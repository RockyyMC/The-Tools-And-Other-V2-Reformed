
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.fluid.YellowWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.WaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.ToxicFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.RedWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.PurpleWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.PinkWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.PetrolleoFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.OrangeWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.MilkFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.LightBlueWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.GreenWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.CursedFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.BrownWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.BlueWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.ArcoirisWaterFluid;
import runner.rocky.the_tools_and_other_reformed.fluid.AquaWaterFluid;
import runner.rocky.the_tools_and_other_reformed.TheToolsAndOtherV2ReformedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class TheToolsAndOtherV2ReformedModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, TheToolsAndOtherV2ReformedMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> GREEN_WATER = REGISTRY.register("green_water", () -> new GreenWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_GREEN_WATER = REGISTRY.register("flowing_green_water", () -> new GreenWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> RED_WATER = REGISTRY.register("red_water", () -> new RedWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_RED_WATER = REGISTRY.register("flowing_red_water", () -> new RedWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> LIGHT_BLUE_WATER = REGISTRY.register("light_blue_water", () -> new LightBlueWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LIGHT_BLUE_WATER = REGISTRY.register("flowing_light_blue_water", () -> new LightBlueWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> MILK = REGISTRY.register("milk", () -> new MilkFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_MILK = REGISTRY.register("flowing_milk", () -> new MilkFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> CURSED = REGISTRY.register("cursed", () -> new CursedFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_CURSED = REGISTRY.register("flowing_cursed", () -> new CursedFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> TOXIC = REGISTRY.register("toxic", () -> new ToxicFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_TOXIC = REGISTRY.register("flowing_toxic", () -> new ToxicFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> YELLOW_WATER = REGISTRY.register("yellow_water", () -> new YellowWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_YELLOW_WATER = REGISTRY.register("flowing_yellow_water", () -> new YellowWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> PINK_WATER = REGISTRY.register("pink_water", () -> new PinkWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PINK_WATER = REGISTRY.register("flowing_pink_water", () -> new PinkWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> PURPLE_WATER = REGISTRY.register("purple_water", () -> new PurpleWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PURPLE_WATER = REGISTRY.register("flowing_purple_water", () -> new PurpleWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> WATER = REGISTRY.register("water", () -> new WaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_WATER = REGISTRY.register("flowing_water", () -> new WaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> ORANGE_WATER = REGISTRY.register("orange_water", () -> new OrangeWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ORANGE_WATER = REGISTRY.register("flowing_orange_water", () -> new OrangeWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> ARCOIRIS_WATER = REGISTRY.register("arcoiris_water", () -> new ArcoirisWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ARCOIRIS_WATER = REGISTRY.register("flowing_arcoiris_water", () -> new ArcoirisWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> PETROLLEO = REGISTRY.register("petrolleo", () -> new PetrolleoFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PETROLLEO = REGISTRY.register("flowing_petrolleo", () -> new PetrolleoFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> BROWN_WATER = REGISTRY.register("brown_water", () -> new BrownWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BROWN_WATER = REGISTRY.register("flowing_brown_water", () -> new BrownWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> AQUA_WATER = REGISTRY.register("aqua_water", () -> new AquaWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_AQUA_WATER = REGISTRY.register("flowing_aqua_water", () -> new AquaWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> BLUE_WATER = REGISTRY.register("blue_water", () -> new BlueWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BLUE_WATER = REGISTRY.register("flowing_blue_water", () -> new BlueWaterFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(GREEN_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GREEN_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(RED_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_RED_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIGHT_BLUE_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIGHT_BLUE_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MILK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MILK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CURSED.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CURSED.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(TOXIC.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TOXIC.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(YELLOW_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_YELLOW_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(PINK_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PINK_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(PURPLE_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PURPLE_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ORANGE_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ORANGE_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ARCOIRIS_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ARCOIRIS_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(PETROLLEO.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PETROLLEO.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BROWN_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BROWN_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(AQUA_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_AQUA_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BLUE_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLUE_WATER.get(), RenderType.translucent());
		}
	}
}
