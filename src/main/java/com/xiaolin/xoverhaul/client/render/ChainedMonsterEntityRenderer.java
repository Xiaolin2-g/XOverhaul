package com.xiaolin.xoverhaul.client.render;

import com.xiaolin.xoverhaul.client.model.ChainedMonsterEntityModel;
import com.xiaolin.xoverhaul.entity.entities.ChainedMonsterEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ChainedMonsterEntityRenderer extends GeoEntityRenderer<ChainedMonsterEntity> {


    public ChainedMonsterEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new ChainedMonsterEntityModel());
    }
}
