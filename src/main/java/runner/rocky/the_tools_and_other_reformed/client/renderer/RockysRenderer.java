
package runner.rocky.the_tools_and_other_reformed.client.renderer;

import runner.rocky.the_tools_and_other_reformed.entity.RockysEntity;
import runner.rocky.the_tools_and_other_reformed.client.model.Modelrockys;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RockysRenderer extends MobRenderer<RockysEntity, LivingEntityRenderState, Modelrockys> {
	private RockysEntity entity = null;

	public RockysRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrockys(context.bakeLayer(Modelrockys.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RockysEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("the_tools_and_other_v2_reformed:textures/entities/rockys.png");
	}
}
