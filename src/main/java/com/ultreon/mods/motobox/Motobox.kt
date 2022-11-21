package com.ultreon.mods.motobox

import com.ultreon.mods.motobox.items.ModItems.init
import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier

object Motobox : ModInitializer {
    private const val modId = "motobox"

    override fun onInitialize() {
        init()
    }

    @JvmStatic
    fun id(path: String?): Identifier {
        return Identifier(modId, path)
    }
}