package com.ultreon.mods.motobox.client.render.frame;

import com.ultreon.mods.motobox.Motobox;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class TruckFrameModel<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("frame_truck"), "main");
    private static final double TRANSLATE = 1.1;
    private final ModelPart bone10;

    public TruckFrameModel(ModelPart root) {
        super(RenderLayer::getEntityCutout);
        this.bone10 = root.getChild("bone10");
    }

    public TruckFrameModel(EntityRendererFactory.Context context) {
        this(context.getPart(MODEL_LAYER));
    }

    public static TexturedModelData createBodyLayer() {
        ModelData meshdefinition = new ModelData();
        ModelPartData partdefinition = meshdefinition.getRoot();

        ModelPartData bone10 = partdefinition.addChild("bone10", ModelPartBuilder.create().uv(72, 98).cuboid(30.0259F, -0.5094F, -16.434F, 5.0F, 4.0F, 32.0F, new Dilation(0.0F))
                .uv(106, 31).cuboid(30.0259F, 3.4906F, -16.434F, 5.0F, 3.0F, 32.0F, new Dilation(0.0F))
                .uv(0, 96).cuboid(14.5259F, -0.5094F, -16.434F, 4.0F, 7.0F, 32.0F, new Dilation(0.0F))
                .uv(68, 66).cuboid(-2.4741F, 5.4906F, -15.434F, 17.0F, 2.0F, 30.0F, new Dilation(0.0F))
                .uv(148, 41).cuboid(-1.4741F, 1.4906F, -15.434F, 11.0F, 3.0F, 12.0F, new Dilation(0.0F))
                .uv(114, 102).cuboid(-1.4741F, -6.5094F, 2.566F, 4.0F, 8.0F, 12.0F, new Dilation(0.0F))
                .uv(40, 113).cuboid(-1.4741F, 1.4906F, 2.566F, 11.0F, 3.0F, 12.0F, new Dilation(0.0F))
                .uv(0, 96).cuboid(-1.4741F, -6.5094F, -15.434F, 4.0F, 8.0F, 12.0F, new Dilation(0.0F))
                .uv(0, 36).cuboid(-27.4741F, 5.4906F, -14.434F, 25.0F, 2.0F, 28.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-5.4741F, -8.5094F, -2.434F, 3.0F, 11.0F, 12.0F, new Dilation(0.0F))
                .uv(40, 98).cuboid(-14.4741F, 2.4906F, -2.434F, 12.0F, 3.0F, 12.0F, new Dilation(0.0F))
                .uv(76, 9).cuboid(-23.4741F, -0.5094F, -14.434F, 12.0F, 6.0F, 3.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(14.5259F, -4.5094F, -16.434F, 22.0F, 4.0F, 32.0F, new Dilation(0.0F))
                .uv(47, 134).cuboid(18.5259F, -0.5094F, -12.434F, 11.0F, 8.0F, 25.0F, new Dilation(0.0F))
                .uv(0, 83).cuboid(35.5259F, -3.5094F, 8.566F, 2.0F, 4.0F, 6.0F, new Dilation(0.0F))
                .uv(82, 82).cuboid(35.5259F, -3.5094F, -15.934F, 2.0F, 4.0F, 6.0F, new Dilation(0.0F))
                .uv(34, 135).cuboid(36.5259F, -3.5094F, -9.434F, 1.0F, 4.0F, 18.0F, new Dilation(0.0F))
                .uv(148, 125).cuboid(-2.4741F, -4.5094F, 14.566F, 17.0F, 7.0F, 2.0F, new Dilation(0.0F))
                .uv(132, 68).cuboid(11.5259F, -4.5094F, -15.434F, 3.0F, 4.0F, 30.0F, new Dilation(0.0F))
                .uv(70, 76).cuboid(11.5259F, -0.5094F, -3.434F, 3.0F, 6.0F, 6.0F, new Dilation(0.0F))
                .uv(0, 23).cuboid(1.5259F, 2.4906F, -3.434F, 10.0F, 3.0F, 6.0F, new Dilation(0.0F))
                .uv(148, 116).cuboid(-2.4741F, -4.5094F, -17.434F, 17.0F, 7.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 23).cuboid(12.5259F, -9.5094F, -15.434F, 2.0F, 5.0F, 0.0F, new Dilation(0.0F))
                .uv(18, 0).cuboid(12.5259F, -9.5094F, 14.566F, 2.0F, 5.0F, 0.0F, new Dilation(0.0F))
                .uv(76, 0).cuboid(-2.2241F, -15.0094F, -15.684F, 16.0F, 1.0F, 30.0F, new Dilation(0.0F))
                .uv(2, 2).cuboid(14.0259F, -5.5094F, 15.566F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(92, 36).cuboid(13.7759F, -7.0094F, 16.566F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
                .uv(18, 85).cuboid(13.7759F, -7.0094F, -21.434F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 2).cuboid(14.0259F, -5.5094F, -17.434F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(89, 142).cuboid(-2.4741F, -4.5094F, -15.434F, 1.0F, 10.0F, 30.0F, new Dilation(0.0F))
                .uv(0, 137).cuboid(-1.9741F, -14.5094F, -15.434F, 1.0F, 10.0F, 30.0F, new Dilation(0.0F))
                .uv(138, 5).cuboid(-2.4741F, 2.4906F, 14.566F, 17.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(138, 0).cuboid(-2.4741F, 2.4906F, -16.434F, 17.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 50).cuboid(-11.9741F, -4.5094F, 13.566F, 9.0F, 12.0F, 2.0F, new Dilation(0.0F))
                .uv(138, 16).cuboid(-27.4741F, -4.5094F, 13.566F, 15.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(70, 88).cuboid(-27.4741F, -0.5094F, 13.566F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(10, 83).cuboid(-27.4741F, 3.4906F, 13.566F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(138, 10).cuboid(-27.4741F, -4.5094F, -16.434F, 15.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(82, 76).cuboid(-27.4741F, -0.5094F, -16.434F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(78, 48).cuboid(-27.4741F, 3.4906F, -16.434F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 36).cuboid(-11.9741F, -4.5094F, -16.434F, 9.0F, 12.0F, 2.0F, new Dilation(0.0F))
                .uv(76, 0).cuboid(-23.4741F, -0.5094F, 10.566F, 12.0F, 6.0F, 3.0F, new Dilation(0.0F))
                .uv(80, 31).cuboid(-28.9741F, 3.4906F, -14.434F, 1.0F, 4.0F, 28.0F, new Dilation(0.0F))
                .uv(114, 102).cuboid(-28.9741F, -4.5094F, -16.434F, 1.0F, 8.0F, 32.0F, new Dilation(0.0F))
                .uv(76, 18).cuboid(-14.4741F, -1.5094F, -3.434F, 9.0F, 4.0F, 3.0F, new Dilation(0.0F))
                .uv(0, 76).cuboid(-14.4741F, -1.5094F, 7.566F, 9.0F, 4.0F, 3.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(10.5259F, -4.5094F, 5.566F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(18, 0).cuboid(9.5259F, -5.5094F, 4.566F, 1.0F, 6.0F, 6.0F, new Dilation(0.0F))
                .uv(121, 142).cuboid(-27.4741F, -1.5094F, -10.434F, 11.0F, 7.0F, 11.0F, new Dilation(0.0F))
                .uv(148, 102).cuboid(-27.4741F, -4.5094F, -10.434F, 11.0F, 3.0F, 11.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-22.9741F, -3.2594F, 0.566F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(11, 199).cuboid(-32.4741F, 5.4906F, -3.434F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(1, 200).cuboid(-31.4741F, 5.4906F, -2.434F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.434F, 13.5094F, 2.5259F, 0.0F, 1.5708F, 0.0F));

        bone10.addChild("bone5", ModelPartBuilder.create().uv(90, 46).cuboid(-2.75F, -5.0F, -1.0F, 5.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.2759F, -9.1926F, 14.2268F, 0.0873F, 0.0F, 0.0F));
        bone10.addChild("bone", ModelPartBuilder.create().uv(22, 48).cuboid(-0.75F, -5.0F, -0.75F, 1.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(14.1332F, -9.4151F, 13.9444F, 0.0873F, 0.0F, -0.1745F));
        bone10.addChild("bone3", ModelPartBuilder.create().uv(22, 36).cuboid(-0.75F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(13.8848F, -9.6173F, -15.0624F, -0.0873F, 0.0F, -0.1745F));
        bone10.addChild("bone4", ModelPartBuilder.create().uv(148, 4).cuboid(-0.5F, -5.0F, -13.875F, 1.0F, 10.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(13.7056F, -8.9982F, 0.191F, 0.0F, 0.0F, -0.1745F));
        bone10.addChild("bone6", ModelPartBuilder.create().uv(78, 36).cuboid(-2.75F, -5.0F, -1.0F, 5.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.2759F, -9.1926F, -15.0948F, -0.0873F, 0.0F, 0.0F));
        bone10.addChild("bone7", ModelPartBuilder.create().uv(70, 66).cuboid(-5.0F, -4.875F, -0.5F, 10.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.0259F, -9.0676F, -15.0948F, -0.0873F, 0.0F, 0.0F));
        bone10.addChild("bone8", ModelPartBuilder.create().uv(0, 66).cuboid(-5.0F, -4.75F, -0.5F, 10.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.0259F, -9.1812F, 14.4883F, 0.0873F, 0.0F, 0.0F));
        bone10.addChild("bone2", ModelPartBuilder.create().uv(0, 66).cuboid(-10.5F, -1.25F, -14.0F, 21.0F, 2.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(24.8532F, -4.7166F, -0.434F, 0.0F, 0.0F, 0.0873F));

        return TexturedModelData.of(meshdefinition, 256, 256);
    }

    @Override
    public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        matrices.push();
        {
            matrices.translate(0, -TRANSLATE, 0);
            bone10.render(matrices, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        }
        matrices.pop();
    }
}