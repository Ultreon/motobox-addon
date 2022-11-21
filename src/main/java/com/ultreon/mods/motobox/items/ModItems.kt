package com.ultreon.mods.motobox.items

import com.ultreon.mods.motobox.Motobox
import com.ultreon.mods.motobox.automobile.MotoboxFrames
import io.github.foundationgames.automobility.automobile.AutomobileEngine
import io.github.foundationgames.automobility.automobile.AutomobilePrefab
import io.github.foundationgames.automobility.automobile.AutomobileWheel
import io.github.foundationgames.automobility.item.AutomobileItem

object ModItems {
    @JvmStatic
    fun init() {
        AutomobileItem.addPrefabs(
            AutomobilePrefab(Motobox.id("truck"), MotoboxFrames.truck, AutomobileWheel.OFF_ROAD, AutomobileEngine.IRON),
            AutomobilePrefab(
                Motobox.id("motorbike"),
                MotoboxFrames.motorbike,
                AutomobileWheel.STREET,
                AutomobileEngine.COPPER
            )
        )
    }
}