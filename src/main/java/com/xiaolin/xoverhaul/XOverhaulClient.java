package com.xiaolin.xoverhaul;

import com.xiaolin.xoverhaul.client.render.ModRenderers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class XOverhaulClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderers.registerRenderers();
    }

}
