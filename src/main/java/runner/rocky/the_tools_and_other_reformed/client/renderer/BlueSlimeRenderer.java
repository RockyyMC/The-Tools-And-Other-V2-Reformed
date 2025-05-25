
package runner.rocky.the_tools_and_other_reformed.client.renderer;

import runner.rocky.the_tools_and_other_reformed.entity.BlueSlimeEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import com.mojang.blaze3d.vertex.PoseStack;

public class BlueSlimeRenderer extends MobRenderer<BlueSlimeEntity, LivingEntityRenderState, SlimeModel> {
	private BlueSlimeEntity entity = null;

	public BlueSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BlueSlimeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("the_tools_and_other_v2_reformed:textures/entities/blue_slime.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(3f, 3f, 3f);
	}
}
