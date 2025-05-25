
package runner.rocky.the_tools_and_other_reformed.client.renderer;

import runner.rocky.the_tools_and_other_reformed.entity.BrownPigEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

public class BrownPigRenderer extends MobRenderer<BrownPigEntity, LivingEntityRenderState, PigModel> {
	private BrownPigEntity entity = null;

	public BrownPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BrownPigEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("the_tools_and_other_v2_reformed:textures/entities/brown_pig.png");
	}
}
