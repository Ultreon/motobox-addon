package com.ultreon.mods.motobox.automobile;

import com.ultreon.mods.motobox.Motobox;
import io.github.foundationgames.automobility.automobile.AutomobileFrame;
import io.github.foundationgames.automobility.automobile.WheelBase;

public final class MotoboxFrames {
    private static AutomobileFrame truck() {
        return new AutomobileFrame(
                Motobox.id("truck"),
                0.73f,
                new AutomobileFrame.FrameModel(
                        Motobox.id("textures/entity/automobile/frame/truck.png"),
                        Motobox.id("frame_truck"),
                        new WheelBase(
                                new WheelBase.WheelPos(-20, -12, 0.7f, 0, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(-20, 12, 0.7f, 180, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.RIGHT),
                                new WheelBase.WheelPos(22, -12, 0.7f, 0, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(22, 12, 0.7f, 180, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.RIGHT)
                        ),
                        28,
                        3.5f,
                        -18,
                        2,
                        34,
                        22
                )
        );
    }

    private static AutomobileFrame motorbike() {
        return new AutomobileFrame(
                Motobox.id("motorbike"),
                0.73f,
                new AutomobileFrame.FrameModel(
                        Motobox.id("textures/entity/automobile/frame/motorbike.png"),
                        Motobox.id("frame_motorbike"),
                        NewWheelBase.bicycleOffset(28, 2),
                        28,
                        5436587523643f,
                        0,
                        0,
                        18,
                        22
                )
        );
    }
    
    public static final AutomobileFrame TRUCK = AutomobileFrame.REGISTRY.register(truck());
    public static final AutomobileFrame MOTORBIKE = AutomobileFrame.REGISTRY.register(motorbike());
}
