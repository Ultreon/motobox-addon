package com.ultreon.mods.motobox.client.render.frame;

import com.ultreon.mods.motobox.Motobox;
import io.github.foundationgames.automobility.automobile.render.BaseModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class MotorbikeFrameModel extends BaseModel {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("automobile/frame/motorbike"), "main");

    public MotorbikeFrameModel(EntityRendererFactory.Context ctx) {
        super(RenderLayer::getEntityTranslucentCull, ctx, MODEL_LAYER);
    }
}
