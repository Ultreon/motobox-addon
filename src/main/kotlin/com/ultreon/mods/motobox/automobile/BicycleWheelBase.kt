package com.ultreon.mods.motobox.automobile

import io.github.foundationgames.automobility.automobile.WheelBase

class BicycleWheelBase(sepLong: Float) : WheelBase(
    WheelPos(sepLong / 2, 0f, 1f, 0f, WheelEnd.FRONT, WheelSide.LEFT),
    WheelPos(sepLong / -2, 0f, 1f, 0f, WheelEnd.BACK, WheelSide.LEFT),
    WheelPos(sepLong / 2, 0f, 1f, 0f, WheelEnd.FRONT, WheelSide.RIGHT),
    WheelPos(sepLong / -2, 0f, 1f, 0f, WheelEnd.BACK, WheelSide.RIGHT)
)