// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class deer<T extends deer> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "deer"), "main");
	private final ModelPart deer;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart Head;
	private final ModelPart right ear;
	private final ModelPart left ear;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart leg1;
	private final ModelPart leg2;

	public deer(ModelPart root) {
		this.deer = root.getChild("deer");
		this.body = this.deer.getChild("body");
		this.tail = this.body.getChild("tail");
		this.Head = this.body.getChild("Head");
		this.right ear = this.Head.getChild("right ear");
		this.left ear = this.Head.getChild("left ear");
		this.leg3 = this.body.getChild("leg3");
		this.leg4 = this.body.getChild("leg4");
		this.leg1 = this.body.getChild("leg1");
		this.leg2 = this.body.getChild("leg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition deer = partdefinition.addOrReplaceChild("deer", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, -4.0F));

		PartDefinition body = deer.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 6.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(3, 2).addBox(-4.0F, -29.0F, -5.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 19.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 6.0F));

		PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 26).addBox(-1.0F, -0.1059F, -6.0979F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, 1.7453F, 0.0F, 0.0F));

		PartDefinition Head = body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(29, 33).addBox(-2.0F, -10.0F, -6.75F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1, 30).addBox(-2.5794F, -11.0F, -3.6324F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, -8.0F));

		PartDefinition head_r1 = Head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(47, 0).addBox(-9.9662F, -9.5086F, 0.1261F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -10.5F, -2.75F, 0.1764F, 1.2202F, 0.1805F));

		PartDefinition head_r2 = Head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(27, 0).addBox(-0.2566F, -10.1305F, -0.0423F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -10.0F, -2.75F, 0.1764F, -1.2202F, -0.1805F));

		PartDefinition right ear = Head.addOrReplaceChild("right ear", CubeListBuilder.create(), PartPose.offset(2.0F, -10.0F, -1.0F));

		PartDefinition head_r3 = right ear.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(52, 39).addBox(0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left ear = Head.addOrReplaceChild("left ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -10.0F, -1.0F));

		PartDefinition head_r4 = left ear.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(41, 22).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition leg3 = body.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(26, 43).addBox(-1.4F, 0.0F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 9.0F, 5.0F));

		PartDefinition leg4 = body.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(42, 43).addBox(-1.6F, 0.0F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 9.0F, 5.0F));

		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(53, 22).addBox(-1.9F, 0.0F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 9.0F, -7.0F));

		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 54).addBox(-1.6F, 0.0F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 9.0F, -7.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(deer entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		deer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}