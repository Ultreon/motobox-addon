package com.ultreon.mods.motobox.automobile;

import io.github.foundationgames.automobility.automobile.WheelBase;

@SuppressWarnings("unused")
public class NewWheelBase {
    public static WheelBase offset(float separationLong, float separationWide, float offset) {
        return new OffsetWheelBase(separationLong, separationWide, offset);
    }

    public static WheelBase bicycle(float separationLong) {
        return new BicycleWheelBase(separationLong);
    }

    public static WheelBase bicycleOffset(float separationLong, float offset) {
        return new OffsetBicycleWheelBase(separationLong, offset);
    }
}
