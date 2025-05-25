// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelrockys<T extends rockys> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rockys"), "main");
	private final ModelPart bone;
	private final ModelPart upper_body;
	private final ModelPart neck;
	private final ModelPart head_main;
	private final ModelPart head;
	private final ModelPart eyes;
	private final ModelPart main_jaw;
	private final ModelPart left_jaw;
	private final ModelPart left_jaw2;
	private final ModelPart left_jaw3;
	private final ModelPart left_jaw4;
	private final ModelPart right_jaw;
	private final ModelPart right_jaw2;
	private final ModelPart right_jaw3;
	private final ModelPart right_jaw4;
	private final ModelPart right_jaw5;
	private final ModelPart right_jaw6;
	private final ModelPart right_jaw7;
	private final ModelPart right_jaw8;
	private final ModelPart left_ear;
	private final ModelPart right_ear;
	private final ModelPart left_shoul;
	private final ModelPart left_arm;
	private final ModelPart left_hand;
	private final ModelPart finger1;
	private final ModelPart finger2;
	private final ModelPart finger3;
	private final ModelPart finger4;
	private final ModelPart finger5;
	private final ModelPart finger6;
	private final ModelPart finger7;
	private final ModelPart finger8;
	private final ModelPart right_shoul;
	private final ModelPart right_arm;
	private final ModelPart right_hand;
	private final ModelPart finger9;
	private final ModelPart finger10;
	private final ModelPart finger11;
	private final ModelPart finger12;
	private final ModelPart finger13;
	private final ModelPart finger14;
	private final ModelPart finger15;
	private final ModelPart finger16;
	private final ModelPart pata_izda;
	private final ModelPart left_foot;
	private final ModelPart pata_dcha;
	private final ModelPart right_foot;
	private final ModelPart cintura;

	public Modelrockys(ModelPart root) {
		this.bone = root.getChild("bone");
		this.upper_body = this.bone.getChild("upper_body");
		this.neck = this.upper_body.getChild("neck");
		this.head_main = this.neck.getChild("head_main");
		this.head = this.head_main.getChild("head");
		this.eyes = this.head.getChild("eyes");
		this.main_jaw = this.head.getChild("main_jaw");
		this.left_jaw = this.main_jaw.getChild("left_jaw");
		this.left_jaw2 = this.left_jaw.getChild("left_jaw2");
		this.left_jaw3 = this.left_jaw2.getChild("left_jaw3");
		this.left_jaw4 = this.left_jaw3.getChild("left_jaw4");
		this.right_jaw = this.main_jaw.getChild("right_jaw");
		this.right_jaw2 = this.right_jaw.getChild("right_jaw2");
		this.right_jaw3 = this.right_jaw2.getChild("right_jaw3");
		this.right_jaw4 = this.right_jaw3.getChild("right_jaw4");
		this.right_jaw5 = this.main_jaw.getChild("right_jaw5");
		this.right_jaw6 = this.right_jaw5.getChild("right_jaw6");
		this.right_jaw7 = this.right_jaw6.getChild("right_jaw7");
		this.right_jaw8 = this.right_jaw7.getChild("right_jaw8");
		this.left_ear = this.head.getChild("left_ear");
		this.right_ear = this.head.getChild("right_ear");
		this.left_shoul = this.upper_body.getChild("left_shoul");
		this.left_arm = this.left_shoul.getChild("left_arm");
		this.left_hand = this.left_arm.getChild("left_hand");
		this.finger1 = this.left_hand.getChild("finger1");
		this.finger2 = this.finger1.getChild("finger2");
		this.finger3 = this.left_hand.getChild("finger3");
		this.finger4 = this.finger3.getChild("finger4");
		this.finger5 = this.left_hand.getChild("finger5");
		this.finger6 = this.finger5.getChild("finger6");
		this.finger7 = this.left_hand.getChild("finger7");
		this.finger8 = this.finger7.getChild("finger8");
		this.right_shoul = this.upper_body.getChild("right_shoul");
		this.right_arm = this.right_shoul.getChild("right_arm");
		this.right_hand = this.right_arm.getChild("right_hand");
		this.finger9 = this.right_hand.getChild("finger9");
		this.finger10 = this.finger9.getChild("finger10");
		this.finger11 = this.right_hand.getChild("finger11");
		this.finger12 = this.finger11.getChild("finger12");
		this.finger13 = this.right_hand.getChild("finger13");
		this.finger14 = this.finger13.getChild("finger14");
		this.finger15 = this.right_hand.getChild("finger15");
		this.finger16 = this.finger15.getChild("finger16");
		this.pata_izda = this.bone.getChild("pata_izda");
		this.left_foot = this.pata_izda.getChild("left_foot");
		this.pata_dcha = this.bone.getChild("pata_dcha");
		this.right_foot = this.pata_dcha.getChild("right_foot");
		this.cintura = this.bone.getChild("cintura");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, -11.0F, 0.0F));

		PartDefinition upper_body = bone.addOrReplaceChild("upper_body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -13.0F, -3.0F, 16.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(70, 11)
						.addBox(-4.0F, -16.0F, -3.0F, 8.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(90, 82)
						.addBox(-2.0F, -5.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition chest_r1 = upper_body.addOrReplaceChild("chest_r1",
				CubeListBuilder.create().texOffs(68, 88).addBox(-5.0F, -4.0F, -1.5F, 8.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -9.0F, -4.5F, 0.0F, 0.3927F, 0.0F));

		PartDefinition chest_r2 = upper_body.addOrReplaceChild("chest_r2",
				CubeListBuilder.create().texOffs(80, 38).addBox(-3.0F, -4.0F, -1.5F, 8.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -9.0F, -4.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition neck = upper_body.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -8.0F, -1.0F, 4.0F, 10.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -14.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_main = neck.addOrReplaceChild("head_main", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -8.0863F, -1.6499F, -0.7854F, 0.0F, 0.0F));

		PartDefinition head = head_main.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(56, 42)
						.addBox(-5.0F, -7.9137F, -9.3501F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 94)
						.addBox(-4.0F, -6.9137F, -0.3501F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 46)
						.addBox(-4.0F, -7.9137F, -7.3501F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 25)
						.addBox(-4.0F, 2.1731F, -8.8425F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(44, 0).addBox(-1.7173F, -1.9239F, -4.0F, 6.7F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6841F, 2.0863F, -5.1677F, 0.1983F, -0.1611F, -0.3981F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(38, 14).addBox(-4.9827F, -1.9239F, -4.0F, 6.7F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6841F, 2.0863F, -5.1677F, 0.1983F, 0.1611F, 0.3981F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(76, 0).addBox(-2.0F, -2.0F, 0.5F, 4.0F, 2.1F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.4863F, -9.8501F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(48, 72).addBox(-1.0F, -9.0F, 0.0F, 1.0F, 9.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 1.0863F, -10.3501F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(24, 46).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 7.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -6.9137F, -9.3501F, 0.0456F, 0.1685F, 0.2657F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, 0.0F, 0.0F, 2.0F, 7.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -6.9137F, -9.3501F, 0.0456F, -0.1685F, -0.2657F));

		PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.9137F, -9.1764F));

		PartDefinition eyes_r1 = eyes
				.addOrReplaceChild("eyes_r1",
						CubeListBuilder.create().texOffs(42, 28).addBox(1.4471F, -2.0F, -0.4315F, 2.0F, 4.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition eyes_r2 = eyes
				.addOrReplaceChild("eyes_r2",
						CubeListBuilder.create().texOffs(38, 28).addBox(-3.4471F, -2.0F, -0.4315F, 2.0F, 4.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition main_jaw = head.addOrReplaceChild("main_jaw", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.5F, 0.0863F, -0.3501F, 0.3927F, 0.0F, 0.0F));

		PartDefinition left_jaw = main_jaw.addOrReplaceChild("left_jaw",
				CubeListBuilder.create().texOffs(92, 59).addBox(2.3F, 2.4021F, -0.305F, 11.27F, 3.9F, 1.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.37F, -2.5F, 1.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition left_jaw_r1 = left_jaw.addOrReplaceChild("left_jaw_r1",
				CubeListBuilder.create().texOffs(38, 27)
						.addBox(-3.6F, 0.0F, -0.65F, 7.5F, 1.3F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 99)
						.addBox(-3.9F, 1.3F, -1.3F, 8.1F, 2.6F, 1.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7763F, 9.9009F, -7.1006F, 0.3927F, 0.0F, 0.0F));

		PartDefinition left_jaw2 = left_jaw.addOrReplaceChild(
				"left_jaw2", CubeListBuilder.create().texOffs(80, 49).addBox(2.1398F, 1.8315F, 0.5385F, 11.4F, 3.9F,
						1.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, -0.3914F, 0.0F, 0.0F));

		PartDefinition left_jaw3 = left_jaw2.addOrReplaceChild(
				"left_jaw3", CubeListBuilder.create().texOffs(92, 54).addBox(2.0542F, 0.9708F, 1.0994F, 11.4F, 3.9F,
						1.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, -0.3914F, 0.0F, 0.0F));

		PartDefinition left_jaw4 = left_jaw3.addOrReplaceChild("left_jaw4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, -0.3914F, 0.0F, 0.0F));

		PartDefinition right_jaw = main_jaw.addOrReplaceChild("right_jaw",
				CubeListBuilder.create().texOffs(106, 104).addBox(0.7F, 2.4021F, -1.605F, 1.3F, 3.9F, 2.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.37F, -2.5F, 1.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition right_jaw2 = right_jaw.addOrReplaceChild("right_jaw2",
				CubeListBuilder.create().texOffs(0, 107).addBox(0.8526F, 1.6572F, -0.7615F, 1.3F, 3.9F, 2.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, -0.3914F, 0.0334F, 0.0807F));

		PartDefinition right_jaw3 = right_jaw2.addOrReplaceChild("right_jaw3",
				CubeListBuilder.create().texOffs(46, 109).addBox(0.9165F, 0.6367F, -0.2673F, 1.3F, 3.9F, 2.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, -0.3914F, 0.0334F, 0.0807F));

		PartDefinition right_jaw4 = right_jaw3.addOrReplaceChild("right_jaw4",
				CubeListBuilder.create().texOffs(54, 109).addBox(0.8816F, -0.4965F, -0.2012F, 1.3F, 3.9F, 2.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, -0.3914F, 0.0334F, 0.0807F));

		PartDefinition right_jaw5 = main_jaw.addOrReplaceChild("right_jaw5",
				CubeListBuilder.create().texOffs(8, 110).addBox(0.0F, 2.4021F, -1.605F, 1.3F, 3.9F, 2.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.37F, -2.5F, 1.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition right_jaw6 = right_jaw5.addOrReplaceChild("right_jaw6",
				CubeListBuilder.create().texOffs(16, 110).addBox(-0.1602F, 1.8315F, -0.7615F, 1.3F, 3.9F, 2.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, -0.3914F, -0.0334F, -0.0807F));

		PartDefinition right_jaw7 = right_jaw6.addOrReplaceChild("right_jaw7",
				CubeListBuilder.create().texOffs(24, 110).addBox(-0.2458F, 0.9708F, -0.2006F, 1.3F, 3.9F, 2.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, -0.3914F, -0.0334F, -0.0807F));

		PartDefinition right_jaw8 = right_jaw7.addOrReplaceChild("right_jaw8",
				CubeListBuilder.create().texOffs(32, 110).addBox(-0.243F, -0.0427F, -0.0117F, 1.3F, 3.9F, 2.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, -0.3914F, -0.0334F, -0.0807F));

		PartDefinition right_jaw8_r1 = right_jaw8.addOrReplaceChild("right_jaw8_r1",
				CubeListBuilder.create().texOffs(92, 64).addBox(-4.15F, -1.95F, -0.8F, 9.3F, 3.9F, 1.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.907F, 1.9073F, 1.7883F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(),
				PartPose.offset(6.25F, -8.1637F, -7.3501F));

		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(),
				PartPose.offset(-6.25F, -8.1637F, -7.3501F));

		PartDefinition left_shoul = upper_body.addOrReplaceChild("left_shoul",
				CubeListBuilder.create().texOffs(0, 63)
						.addBox(-2.8F, 4.8F, -3.0F, 6.0F, 9.6F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 101)
						.addBox(-1.6F, 14.4F, -1.8F, 3.6F, 3.6F, 3.6F, new CubeDeformation(0.0F)),
				PartPose.offset(11.3333F, -12.4557F, -0.2909F));

		PartDefinition left_shoul_r1 = left_shoul.addOrReplaceChild("left_shoul_r1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-3.6F, -3.6F, -3.6F, 7.2F, 7.2F, 7.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 1.2F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_arm = left_shoul.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(48, 55)
				.addBox(-2.9F, 0.05F, -2.98F, 6.0F, 10.8F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1F, 16.75F, -0.02F));

		PartDefinition left_hand = left_arm.addOrReplaceChild("left_hand",
				CubeListBuilder.create().texOffs(88, 71).addBox(-2.3818F, -0.2F, -2.9782F, 4.8F, 4.8F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0818F, 11.05F, -0.0018F, 0.0F, -1.5708F, 0.0F));

		PartDefinition finger1 = left_hand.addOrReplaceChild("finger1",
				CubeListBuilder.create().texOffs(40, 79).addBox(-1.1F, -0.7F, -1.6F, 2.2F, 4.6F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6382F, 4.1F, -2.2382F, -0.1745F, 0.0F, -0.1745F));

		PartDefinition finger2 = finger1
				.addOrReplaceChild("finger2",
						CubeListBuilder.create().texOffs(32, 94).addBox(-2.1F, 0.0F, -1.6F, 2.2F, 4.6F, 2.2F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 3.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition finger3 = left_hand.addOrReplaceChild("finger3",
				CubeListBuilder.create().texOffs(82, 99).addBox(-1.1F, -0.7F, -1.6F, 2.2F, 4.6F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3618F, 4.1F, -2.2382F, -0.1745F, 0.0F, 0.0F));

		PartDefinition finger4 = finger3
				.addOrReplaceChild("finger4",
						CubeListBuilder.create().texOffs(14, 103).addBox(-2.1F, 0.0F, -1.6F, 2.2F, 4.6F, 2.2F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 3.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition finger5 = left_hand.addOrReplaceChild("finger5",
				CubeListBuilder.create().texOffs(22, 103).addBox(-1.1F, -0.7F, -1.6F, 2.2F, 4.6F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3618F, 4.1F, -2.2382F, -0.1745F, 0.0F, 0.1745F));

		PartDefinition finger6 = finger5
				.addOrReplaceChild("finger6",
						CubeListBuilder.create().texOffs(104, 16).addBox(-2.1F, 0.0F, -1.6F, 2.2F, 4.6F, 2.2F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 3.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition finger7 = left_hand.addOrReplaceChild("finger7",
				CubeListBuilder.create().texOffs(104, 23).addBox(-1.1F, -0.7F, -1.6F, 2.2F, 4.6F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3618F, 4.1F, 2.7618F, 0.1745F, 0.0F, 0.0F));

		PartDefinition finger8 = finger7
				.addOrReplaceChild("finger8",
						CubeListBuilder.create().texOffs(104, 30).addBox(-2.1F, 0.0F, -1.6F, 2.2F, 4.6F, 2.2F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 3.9F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_shoul = upper_body.addOrReplaceChild("right_shoul",
				CubeListBuilder.create().texOffs(24, 63)
						.addBox(-3.2F, 4.8F, -3.0F, 6.0F, 9.6F, 6.0F, new CubeDeformation(0.0F)).texOffs(102, 38)
						.addBox(-2.0F, 14.4F, -1.8F, 3.6F, 3.6F, 3.6F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.3333F, -12.4557F, -0.2909F));

		PartDefinition right_shoul_r1 = right_shoul
				.addOrReplaceChild("right_shoul_r1",
						CubeListBuilder.create().texOffs(28, 32).addBox(-3.6F, -3.6F, -3.6F, 7.2F, 7.2F, 7.2F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.4F, 1.2F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition right_arm = right_shoul.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(56, 25)
				.addBox(-3.1F, 0.05F, -2.98F, 6.0F, 10.8F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.1F, 16.75F, -0.02F));

		PartDefinition right_hand = right_arm.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(40, 90).addBox(-2.4182F, -0.2F, -2.9782F, 4.8F, 4.8F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0818F, 11.05F, -0.0018F, 0.0F, 1.5708F, 0.0F));

		PartDefinition finger9 = right_hand.addOrReplaceChild("finger9",
				CubeListBuilder.create().texOffs(104, 46).addBox(-1.1F, -0.7F, -1.6F, 2.2F, 4.6F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6382F, 4.1F, -2.2382F, -0.1745F, 0.0F, 0.1745F));

		PartDefinition finger10 = finger9
				.addOrReplaceChild("finger10",
						CubeListBuilder.create().texOffs(62, 104).addBox(-0.1F, 0.0F, -1.6F, 2.2F, 4.6F, 2.2F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.0F, 3.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition finger11 = right_hand.addOrReplaceChild("finger11",
				CubeListBuilder.create().texOffs(70, 104).addBox(-1.1F, -0.7F, -1.6F, 2.2F, 4.6F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3618F, 4.1F, -2.2382F, -0.1745F, 0.0F, 0.0F));

		PartDefinition finger12 = finger11
				.addOrReplaceChild("finger12",
						CubeListBuilder.create().texOffs(90, 104).addBox(-0.1F, 0.0F, -1.6F, 2.2F, 4.6F, 2.2F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.0F, 3.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition finger13 = right_hand.addOrReplaceChild("finger13",
				CubeListBuilder.create().texOffs(98, 104).addBox(-1.1F, -0.7F, -1.6F, 2.2F, 4.6F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3618F, 4.1F, -2.2382F, -0.1745F, 0.0F, -0.1745F));

		PartDefinition finger14 = finger13
				.addOrReplaceChild("finger14",
						CubeListBuilder.create().texOffs(78, 106).addBox(-0.1F, 0.0F, -1.6F, 2.2F, 4.6F, 2.2F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.0F, 3.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition finger15 = right_hand.addOrReplaceChild("finger15",
				CubeListBuilder.create().texOffs(106, 82).addBox(-1.1F, -0.7F, -1.6F, 2.2F, 4.6F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3618F, 4.1F, 2.7618F, 0.1745F, 0.0F, 0.0F));

		PartDefinition finger16 = finger15.addOrReplaceChild("finger16",
				CubeListBuilder.create().texOffs(106, 89).addBox(-0.1F, 0.0F, -1.6F, 2.2F, 4.6F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.9F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition pata_izda = bone.addOrReplaceChild("pata_izda",
				CubeListBuilder.create().texOffs(72, 55)
						.addBox(-2.5F, 0.925F, -2.25F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(100, 0)
						.addBox(-1.5F, 10.925F, -3.25F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 8.075F, -0.25F));

		PartDefinition left_foot = pata_izda.addOrReplaceChild("left_foot",
				CubeListBuilder.create().texOffs(0, 79)
						.addBox(-2.5F, 1.1333F, -0.6667F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 10)
						.addBox(-2.5F, 9.9333F, -0.6667F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(80, 20)
						.addBox(-2.5F, 11.1333F, -2.6667F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.6917F, -1.5833F));

		PartDefinition pata_dcha = bone.addOrReplaceChild("pata_dcha",
				CubeListBuilder.create().texOffs(68, 72)
						.addBox(-2.5F, 0.925F, -2.25F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 101)
						.addBox(-1.5F, 10.925F, -3.25F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 8.075F, -0.25F));

		PartDefinition right_foot = pata_dcha.addOrReplaceChild("right_foot",
				CubeListBuilder.create().texOffs(20, 79)
						.addBox(-2.5F, 1.1333F, -0.6667F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(90, 98)
						.addBox(-2.5F, 9.9333F, -0.6667F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(80, 29)
						.addBox(-2.5F, 11.1333F, -2.6667F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.6917F, -1.5833F));

		PartDefinition cintura = bone.addOrReplaceChild("cintura", CubeListBuilder.create().texOffs(0, 14).addBox(-6.0F,
				-10.5F, -3.5F, 12.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.5F, -0.5F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.upper_body.xRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.bone.xRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.neck.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}