package com.ultreon.mods.motobox.client.render.frame

import com.ultreon.mods.motobox.Motobox
import io.github.foundationgames.automobility.automobile.render.BaseModel
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.entity.EntityRendererFactory
import net.minecraft.client.render.entity.model.EntityModelLayer
import net.minecraft.util.Identifier
import java.util.function.Function

class MotorbikeFrameModel(ctx: EntityRendererFactory.Context?) :
    BaseModel(Function { texture: Identifier? -> RenderLayer.getEntityTranslucentCull(texture) }, ctx, MODEL_LAYER) {
    companion object {
        @JvmField
        val MODEL_LAYER = EntityModelLayer(Motobox.id("automobile/frame/motorbike"), "main")
    }
}