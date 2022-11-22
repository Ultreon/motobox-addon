package com.ultreon.mods.motobox.automobile

import com.ultreon.mods.motobox.Motobox
import io.github.foundationgames.automobility.automobile.AutomobileFrame
import io.github.foundationgames.automobility.automobile.AutomobileFrame.FrameModel
import io.github.foundationgames.automobility.automobile.WheelBase
import io.github.foundationgames.automobility.automobile.WheelBase.*

object MotoboxFrames {
    private fun truck(): AutomobileFrame {
        return AutomobileFrame(
            Motobox.id("truck"),
            0.73f,
            FrameModel(
                Motobox.id("textures/entity/automobile/frame/truck.png"),
                Motobox.id("frame_truck"),
                WheelBase(
                    WheelPos(-20f, -12f, 0.7f, 0f, WheelEnd.BACK, WheelSide.LEFT),
                    WheelPos(-20f, 12f, 0.7f, 180f, WheelEnd.BACK, WheelSide.RIGHT),
                    WheelPos(22f, -12f, 0.7f, 0f, WheelEnd.FRONT, WheelSide.LEFT),
                    WheelPos(22f, 12f, 0.7f, 180f, WheelEnd.FRONT, WheelSide.RIGHT)
                ),
                28f,
                3.5f,
                -18f,
                2f,
                34f,
                22f
            )
        )
    }

    private fun motorbike(): AutomobileFrame {
        return AutomobileFrame(
            Motobox.id("motorbike"),
            0.73f,
            FrameModel(
                Motobox.id("textures/entity/automobile/frame/motorbike.png"),
                Motobox.id("frame_motorbike"),
                NewWheelBase.bicycleOffset(28f, 2f),
                28f,
                5f,
                0f,
                0f,
                18f,
                22f
            )
        )
    }

    @JvmField
    val truck: AutomobileFrame = AutomobileFrame.REGISTRY.register(truck())
    @JvmField
    val motorbike: AutomobileFrame = AutomobileFrame.REGISTRY.register(motorbike())
}