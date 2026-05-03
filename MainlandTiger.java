// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class MainlandTiger<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mainlandtiger"), "main");
	private final ModelPart mob;
	private final ModelPart Body;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart head;
	private final ModelPart mouth;
	private final ModelPart leg4;
	private final ModelPart leg3;
	private final ModelPart leg2;
	private final ModelPart leg;

	public MainlandTiger(ModelPart root) {
		this.mob = root.getChild("mob");
		this.Body = this.mob.getChild("Body");
		this.tail = this.Body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.head = this.Body.getChild("head");
		this.mouth = this.head.getChild("mouth");
		this.leg4 = this.mob.getChild("leg4");
		this.leg3 = this.mob.getChild("leg3");
		this.leg2 = this.mob.getChild("leg2");
		this.leg = this.mob.getChild("leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mob = partdefinition.addOrReplaceChild("mob", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 1.0F));

		PartDefinition Body = mob.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 21).addBox(-5.0819F, -1.5001F, -7.0F, 9.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 74).addBox(-5.0819F, -1.5001F, -10.0F, 9.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0819F, -2.5001F, -19.0F, 9.0F, 12.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(31, 86).addBox(-5.0819F, 9.4999F, -19.0F, 9.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -4.5F, 10.0F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(54, 34).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0181F, -0.0001F, 1.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(53, 33).addBox(-1.5F, -1.0F, -0.2F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.2F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(51, 59).addBox(-1.5F, -0.1034F, -0.5813F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 9.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head = Body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(36, 20).addBox(-3.0F, -4.0F, -5.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(31, 114).addBox(-3.5F, -9.0F, -5.5F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(92, 41).addBox(-4.5F, -4.0F, -6.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(24, 61).addBox(2.0F, -5.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 61).addBox(-3.0F, -5.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 61).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 6).addBox(-5.0F, -2.0F, -2.5F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(70, 21).addBox(-2.0F, 3.0F, -8.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(83, 19).addBox(-1.5F, 1.25F, -7.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(88, 32).addBox(-1.5F, 1.5F, -7.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 69).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 1.5F, -20.0F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(88, 66).addBox(-2.0F, 1.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(39, 11).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(79, 25).addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(83, 19).addBox(-1.5F, -0.25F, -3.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -4.0F));

		PartDefinition leg4 = mob.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(36, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, -1.0F, 9.5F));

		PartDefinition leg3 = mob.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 41).addBox(-0.75F, -1.0F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -2.0F, 9.5F));

		PartDefinition leg2 = mob.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(16, 41).addBox(-2.75F, -1.0F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.25F, -2.0F, -6.0F));

		PartDefinition leg = mob.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(32, 52).addBox(-1.45F, -1.0F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, -2.0F, -6.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mob.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}