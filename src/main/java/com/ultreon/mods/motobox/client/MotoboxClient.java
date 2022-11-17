package com.ultreon.mods.motobox.client;

import com.ultreon.mods.motobox.render.MotoboxModels;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class MotoboxClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MotoboxModels.init();
    }
}
