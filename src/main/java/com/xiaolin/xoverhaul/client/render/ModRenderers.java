package com.xiaolin.xoverhaul.client.render;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.client.armor.VillageCrownArmorRenderer;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.init.ModArmor;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ModRenderers {


    public static void registerRenderers() {
        EntityRendererRegistry.register(ModEntities.CHAINED_MONSTER, ChainedMonsterEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.LEATHERLING, LeatherlingEntityRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(new VillageCrownArmorRenderer(), ModArmor.VILLAGE_CROWN);
    }

}
