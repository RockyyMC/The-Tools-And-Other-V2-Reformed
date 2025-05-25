
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
public class AquaWaterFluidType extends FluidType {
	public AquaWaterFluidType() {
		super(FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).supportsBoating(true).canHydrate(true).motionScale(0.007D).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
				.sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("the_tools_and_other_v2_reformed:block/aqua_water_f");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("the_tools_and_other_v2_reformed:block/aqua_water_s");

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
				return new Vector4f(0.1568627451f, 0.8509803922f, 0.5725490196f, fluidFogColor.w);
			}

			@Override
			public FogParameters modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, FogParameters fogParameters) {
				float nearDistance = fogParameters.start();
				float farDistance = fogParameters.end();
				Entity entity = camera.getEntity();
				Level world = entity.level();
				return new FogParameters(0f, Math.min(48f, renderDistance), FogShape.SPHERE, fogParameters.red(), fogParameters.green(), fogParameters.blue(), fogParameters.alpha());
			}
		}, TheToolsAndOtherV2ReformedModFluidTypes.AQUA_WATER_TYPE.get());
	}
}
