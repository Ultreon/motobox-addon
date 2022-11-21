package com.ultreon.mods.motobox;

import com.ultreon.mods.motobox.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Motobox implements ModInitializer {
    private static final String MOD_ID = "motobox";

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        ModItems.init();
    }
}
