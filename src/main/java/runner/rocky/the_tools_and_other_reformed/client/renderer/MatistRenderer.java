
package runner.rocky.the_tools_and_other_reformed.client.renderer;

import runner.rocky.the_tools_and_other_reformed.entity.MatistEntity;
import runner.rocky.the_tools_and_other_reformed.client.model.Modelmatistv2;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MatistRenderer extends MobRenderer<MatistEntity, LivingEntityRenderState, Modelmatistv2> {
	private MatistEntity entity = null;

	public MatistRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmatistv2(context.bakeLayer(Modelmatistv2.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MatistEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("the_tools_and_other_v2_reformed:textures/entities/matist_trading.png");
	}
}
