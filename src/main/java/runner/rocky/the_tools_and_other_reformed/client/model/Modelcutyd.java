package runner.rocky.the_tools_and_other_reformed.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcutyd extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("the_tools_and_other_v2_reformed", "modelcutyd"), "main");
	public final ModelPart cutyd;
	public final ModelPart pierna_izda;
	public final ModelPart part2;
	public final ModelPart brazo_izdo;
	public final ModelPart part4;
	public final ModelPart pierna_dcha;
	public final ModelPart part1;
	public final ModelPart brazo_dcho;
	public final ModelPart part3;
	public final ModelPart torso;
	public final ModelPart torsov3;
	public final ModelPart torsov2;
	public final ModelPart torsov4;
	public final ModelPart cabeza;

	public Modelcutyd(ModelPart root) {
		super(root);
		this.cutyd = root.getChild("cutyd");
		this.pierna_izda = this.cutyd.getChild("pierna_izda");
		this.part2 = this.pierna_izda.getChild("part2");
		this.brazo_izdo = this.cutyd.getChild("brazo_izdo");
		this.part4 = this.brazo_izdo.getChild("part4");
		this.pierna_dcha = this.cutyd.getChild("pierna_dcha");
		this.part1 = this.pierna_dcha.getChild("part1");
		this.brazo_dcho = this.cutyd.getChild("brazo_dcho");
		this.part3 = this.brazo_dcho.getChild("part3");
		this.torso = this.cutyd.getChild("torso");
		this.torsov3 = this.torso.getChild("torsov3");
		this.torsov2 = this.torso.getChild("torsov2");
		this.torsov4 = this.torso.getChild("torsov4");
		this.cabeza = this.cutyd.getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cutyd = partdefinition.addOrReplaceChild("cutyd", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition pierna_izda = cutyd.addOrReplaceChild("pierna_izda", CubeListBuilder.create().texOffs(24, 27).addBox(-2.0F, 13.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
				.addBox(-1.0F, 5.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 30).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 8.0F, 0.0F));
		PartDefinition part2 = pierna_izda.addOrReplaceChild("part2", CubeListBuilder.create().texOffs(24, 39).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));
		PartDefinition brazo_izdo = cutyd.addOrReplaceChild("brazo_izdo", CubeListBuilder.create().texOffs(16, 33).addBox(-2.0F, 13.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
				.addBox(-1.0F, 5.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 45).addBox(-1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -6.0F, 0.0F));
		PartDefinition part4 = brazo_izdo.addOrReplaceChild("part4",
				CubeListBuilder.create().texOffs(40, 37).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 3).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 0.0F, 0.0F));
		PartDefinition pierna_dcha = cutyd.addOrReplaceChild("pierna_dcha", CubeListBuilder.create().texOffs(32, 33).addBox(0.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
				.addBox(-1.0F, 11.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 13).addBox(0.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 10.0F, 0.0F));
		PartDefinition part1 = pierna_dcha.addOrReplaceChild("part1", CubeListBuilder.create().texOffs(40, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -1.0F, 0.0F));
		PartDefinition brazo_dcho = cutyd.addOrReplaceChild("brazo_dcho", CubeListBuilder.create().texOffs(8, 36).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
				.addBox(-2.0F, 14.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 16).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -7.0F, 0.0F));
		PartDefinition part3 = brazo_dcho.addOrReplaceChild("part3",
				CubeListBuilder.create().texOffs(40, 29).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 8).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 2.0F, 0.0F));
		PartDefinition torso = cutyd.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition torsov3 = torso.addOrReplaceChild("torsov3", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -5.0F, -2.0F, 8.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition torsov2 = torso.addOrReplaceChild("torsov2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 2.0F, 0.0F));
		PartDefinition torsov4 = torso.addOrReplaceChild("torsov4", CubeListBuilder.create().texOffs(32, 43).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, 0.0F));
		PartDefinition cabeza = cutyd.addOrReplaceChild("cabeza",
				CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 11).addBox(-3.0F, -4.0F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
						.addBox(-3.0F, -5.0F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 0).addBox(-2.0F, -6.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -17.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}
