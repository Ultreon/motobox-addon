package com.ultreon.mods.motobox.render

import com.ultreon.mods.motobox.Motobox
import com.ultreon.mods.motobox.client.render.frame.MotorbikeFrameModel
import com.ultreon.mods.motobox.client.render.frame.TruckFrameModel
import io.github.foundationgames.automobility.render.AutomobilityModels
import io.github.foundationgames.jsonem.JsonEM
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry
import java.util.function.Function

@Environment(EnvType.CLIENT)
object MotoboxModels {
    @Environment(EnvType.CLIENT)
    fun init() {
        AutomobilityModels.MODELS[Motobox.id("frame_truck")] = Function { context -> TruckFrameModel(context) }
        AutomobilityModels.MODELS[Motobox.id("frame_motorbike")] = Function { ctx -> MotorbikeFrameModel(ctx) }
        EntityModelLayerRegistry.registerModelLayer(TruckFrameModel.modelLayer) { TruckFrameModel.createBodyLayer() }
        JsonEM.registerModelLayer(MotorbikeFrameModel.MODEL_LAYER)
    }
}