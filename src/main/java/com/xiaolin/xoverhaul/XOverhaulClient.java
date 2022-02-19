package com.xiaolin.xoverhaul;

import com.xiaolin.xoverhaul.client.render.ChainedZombieEntityRenderer;
import com.xiaolin.xoverhaul.client.render.ModRenderers;
import com.xiaolin.xoverhaul.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

@Environment(EnvType.CLIENT)
public class XOverhaulClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderers.registerRenderers();
    }

}
