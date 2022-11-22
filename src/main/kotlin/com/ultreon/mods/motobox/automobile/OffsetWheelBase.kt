package com.ultreon.mods.motobox.automobile

import io.github.foundationgames.automobility.automobile.WheelBase

class OffsetWheelBase(sepLong: Float, sepWide: Float, offset: Float) : WheelBase(
    WheelPos(offset + sepLong / 2, sepWide / -2, 1f, 0f, WheelEnd.FRONT, WheelSide.LEFT),
    WheelPos(offset + sepLong / -2, sepWide / -2, 1f, 0f, WheelEnd.BACK, WheelSide.LEFT),
    WheelPos(offset + sepLong / 2, sepWide / 2, 1f, 180f, WheelEnd.FRONT, WheelSide.RIGHT),
    WheelPos(offset + sepLong / -2, sepWide / 2, 1f, 180f, WheelEnd.BACK, WheelSide.RIGHT)
)