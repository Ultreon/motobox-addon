package com.ultreon.mods.motobox.automobile

import io.github.foundationgames.automobility.automobile.WheelBase

class OffsetBicycleWheelBase(sepLong: Float, offset: Float) : WheelBase(
    WheelPos(offset + sepLong / 2, -0.1f, 0.8f, 0f, WheelEnd.FRONT, WheelSide.LEFT),
    WheelPos(offset + sepLong / -2, -0.1f, 0.8f, 0f, WheelEnd.BACK, WheelSide.LEFT),
    WheelPos(offset + sepLong / 2, 0.1f, 0.8f, 0f, WheelEnd.FRONT, WheelSide.RIGHT),
    WheelPos(offset + sepLong / -2, 0.1f, 0.8f, 0f, WheelEnd.BACK, WheelSide.RIGHT)
)