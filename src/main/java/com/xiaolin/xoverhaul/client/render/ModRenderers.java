package com.xiaolin.xoverhaul.client.render;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.ModEntities;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModRenderers {


    public static void registerRenderers() {
        EntityRendererRegistry.register(ModEntities.CHAINED_MONSTER, ChainedMonsterEntityRenderer::new);
    }

    public static EntityModelLayer registerNewModelLayer(String name){
            return new EntityModelLayer(new Identifier(XOverhaul.MOD_ID), name);
        }
}
