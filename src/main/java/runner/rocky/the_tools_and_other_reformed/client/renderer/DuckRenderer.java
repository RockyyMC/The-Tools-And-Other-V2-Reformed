
package runner.rocky.the_tools_and_other_reformed.client.renderer;

import runner.rocky.the_tools_and_other_reformed.entity.DuckEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.ChickenRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class DuckRenderer extends MobRenderer<DuckEntity, ChickenRenderState, ChickenModel> {
	private DuckEntity entity = null;

	public DuckRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.7f);
	}

	@Override
	public ChickenRenderState createRenderState() {
		return new ChickenRenderState();
	}

	@Override
	public void extractRenderState(DuckEntity entity, ChickenRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(ChickenRenderState state) {
		return ResourceLocation.parse("the_tools_and_other_v2_reformed:textures/entities/duck.png");
	}
}
