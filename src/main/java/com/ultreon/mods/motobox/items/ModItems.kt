package com.ultreon.mods.motobox.items;

import com.ultreon.mods.motobox.Motobox;
import com.ultreon.mods.motobox.automobile.MotoboxFrames;
import io.github.foundationgames.automobility.automobile.AutomobileEngine;
import io.github.foundationgames.automobility.automobile.AutomobilePrefab;
import io.github.foundationgames.automobility.automobile.AutomobileWheel;
import io.github.foundationgames.automobility.item.AutomobileItem;

public final class ModItems {
    public static void init() {
        AutomobileItem.addPrefabs(
                new AutomobilePrefab(Motobox.id("truck"), MotoboxFrames.TRUCK, AutomobileWheel.OFF_ROAD, AutomobileEngine.IRON),
                new AutomobilePrefab(Motobox.id("motorbike"), MotoboxFrames.MOTORBIKE, AutomobileWheel.STREET, AutomobileEngine.COPPER)
        );
    }
}
