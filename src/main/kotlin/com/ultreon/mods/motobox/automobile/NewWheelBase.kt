package com.ultreon.mods.motobox.automobile

import io.github.foundationgames.automobility.automobile.WheelBase

@Suppress("unused")
object NewWheelBase {
    fun offset(separationLong: Float, separationWide: Float, offset: Float): WheelBase {
        return OffsetWheelBase(separationLong, separationWide, offset)
    }

    fun bicycle(separationLong: Float): WheelBase {
        return BicycleWheelBase(separationLong)
    }

    fun bicycleOffset(separationLong: Float, offset: Float): WheelBase {
        return OffsetBicycleWheelBase(separationLong, offset)
    }
}