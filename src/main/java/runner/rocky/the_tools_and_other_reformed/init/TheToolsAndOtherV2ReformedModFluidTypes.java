
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.the_tools_and_other_reformed.init;

import runner.rocky.the_tools_and_other_reformed.fluid.types.YellowWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.WaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.ToxicFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.RedWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.PurpleWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.PinkWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.PetrolleoFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.OrangeWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.MilkFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.LightBlueWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.GreenWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.CursedFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.BrownWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.BlueWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.ArcoirisWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.fluid.types.AquaWaterFluidType;
import runner.rocky.the_tools_and_other_reformed.TheToolsAndOtherV2ReformedMod;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

public class TheToolsAndOtherV2ReformedModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, TheToolsAndOtherV2ReformedMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> GREEN_WATER_TYPE = REGISTRY.register("green_water", () -> new GreenWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> RED_WATER_TYPE = REGISTRY.register("red_water", () -> new RedWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> LIGHT_BLUE_WATER_TYPE = REGISTRY.register("light_blue_water", () -> new LightBlueWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> MILK_TYPE = REGISTRY.register("milk", () -> new MilkFluidType());
	public static final DeferredHolder<FluidType, FluidType> CURSED_TYPE = REGISTRY.register("cursed", () -> new CursedFluidType());
	public static final DeferredHolder<FluidType, FluidType> TOXIC_TYPE = REGISTRY.register("toxic", () -> new ToxicFluidType());
	public static final DeferredHolder<FluidType, FluidType> YELLOW_WATER_TYPE = REGISTRY.register("yellow_water", () -> new YellowWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> PINK_WATER_TYPE = REGISTRY.register("pink_water", () -> new PinkWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> PURPLE_WATER_TYPE = REGISTRY.register("purple_water", () -> new PurpleWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> WATER_TYPE = REGISTRY.register("water", () -> new WaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> ORANGE_WATER_TYPE = REGISTRY.register("orange_water", () -> new OrangeWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> ARCOIRIS_WATER_TYPE = REGISTRY.register("arcoiris_water", () -> new ArcoirisWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> PETROLLEO_TYPE = REGISTRY.register("petrolleo", () -> new PetrolleoFluidType());
	public static final DeferredHolder<FluidType, FluidType> BROWN_WATER_TYPE = REGISTRY.register("brown_water", () -> new BrownWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> AQUA_WATER_TYPE = REGISTRY.register("aqua_water", () -> new AquaWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> BLUE_WATER_TYPE = REGISTRY.register("blue_water", () -> new BlueWaterFluidType());
}
