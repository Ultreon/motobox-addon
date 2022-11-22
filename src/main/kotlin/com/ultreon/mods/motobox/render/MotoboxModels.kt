package com.ultreon.mods.motobox.render

import com.ultreon.mods.motobox.Motobox
import com.ultreon.mods.motobox.client.render.frame.MotorbikeFrameModel
import com.ultreon.mods.motobox.client.render.frame.TruckFrameModel
import io.github.foundationgames.automobility.render.AutomobilityModels
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry
import java.util.function.Function

@Environment(EnvType.CLIENT)
object MotoboxModels {
    @Environment(EnvType.CLIENT)
    fun init() {
        AutomobilityModels.MODELS[Motobox.id("frame_truck")] = Function { TruckFrameModel(it) }
        AutomobilityModels.MODELS[Motobox.id("frame_motorbike")] = Function { MotorbikeFrameModel(it) }
        EntityModelLayerRegistry.registerModelLayer(TruckFrameModel.modelLayer) { TruckFrameModel.createBodyLayer() }
        EntityModelLayerRegistry.registerModelLayer(MotorbikeFrameModel.modelLayer) { MotorbikeFrameModel.createBodyLayer() }
    }
}