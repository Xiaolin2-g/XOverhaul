package com.xiaolin.xoverhaul.client.render;

import com.xiaolin.xoverhaul.client.model.LeatherlingEntityModel;
import com.xiaolin.xoverhaul.entity.entities.LeatherlingEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LeatherlingEntityRenderer extends GeoEntityRenderer<LeatherlingEntity> {


    public LeatherlingEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LeatherlingEntityModel());
    }
}
