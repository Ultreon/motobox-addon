package com.ultreon.mods.motobox.render;

import com.ultreon.mods.motobox.Motobox;
import com.ultreon.mods.motobox.client.render.frame.MotorbikeFrameModel;
import com.ultreon.mods.motobox.client.render.frame.TruckFrameModel;
import io.github.foundationgames.jsonem.JsonEM;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

import static io.github.foundationgames.automobility.render.AutomobilityModels.MODELS;

@Environment(EnvType.CLIENT)
public final class MotoboxModels {
    @Environment(EnvType.CLIENT)
    public static void init() {
        MODELS.put(Motobox.id("frame_truck"), TruckFrameModel::new);
        MODELS.put(Motobox.id("frame_motorbike"), MotorbikeFrameModel::new);

        EntityModelLayerRegistry.registerModelLayer(TruckFrameModel.MODEL_LAYER, TruckFrameModel::createBodyLayer);
        JsonEM.registerModelLayer(MotorbikeFrameModel.MODEL_LAYER);
    }
}
