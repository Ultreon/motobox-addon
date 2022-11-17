package com.ultreon.mods.motobox.automobile;

import io.github.foundationgames.automobility.automobile.WheelBase;

public class OffsetBicycleWheelBase extends WheelBase {
    public OffsetBicycleWheelBase(float sepLong, float offset) {
        super(
                new WheelPos(offset + sepLong / 2, -0.1f, 0.8f, 0, WheelEnd.FRONT, WheelSide.LEFT),
                new WheelPos(offset + sepLong / -2, -0.1f, 0.8f, 0, WheelEnd.BACK, WheelSide.LEFT),
                new WheelPos(offset + sepLong / 2, 0.1f, 0.8f, 0, WheelEnd.FRONT, WheelSide.RIGHT),
                new WheelPos(offset + sepLong / -2, 0.1f, 0.8f, 0, WheelEnd.BACK, WheelSide.RIGHT)
        );
    }
}
