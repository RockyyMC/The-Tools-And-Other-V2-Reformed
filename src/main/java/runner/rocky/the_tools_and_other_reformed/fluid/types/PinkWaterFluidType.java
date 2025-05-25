
package runner.rocky.the_tools_and_other_reformed.fluid.types;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModFluidTypes;

import org.joml.Vector4f;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.renderer.FogParameters;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Camera;

import com.mojang.blaze3d.shaders.FogShape;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PinkWaterFluidType extends FluidType {
	public PinkWaterFluidType() {
		super(FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).supportsBoating(true).canHydrate(true).motionScale(0.007D).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
				.sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("the_tools_and_other_v2_reformed:block/pink_water_s");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("the_tools_and_other_v2_reformed:block/pink_water_f");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public Vector4f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector4f fluidFogColor) {
				return new Vector4f(1f, 0.2f, 1f, fluidFogColor.w);
			}

			@Override
			public FogParameters modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, FogParameters fogParameters) {
				float nearDistance = fogParameters.start();
				float farDistance = fogParameters.end();
				Entity entity = camera.getEntity();
				Level world = entity.level();
				return new FogParameters(0f, Math.min(48f, renderDistance), FogShape.SPHERE, fogParameters.red(), fogParameters.green(), fogParameters.blue(), fogParameters.alpha());
			}
		}, TheToolsAndOtherV2ReformedModFluidTypes.PINK_WATER_TYPE.get());
	}
}
