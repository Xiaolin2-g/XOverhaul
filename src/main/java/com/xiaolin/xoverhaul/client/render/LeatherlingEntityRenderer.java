package com.xiaolin.xoverhaul.client.render;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.client.model.LeatherlingEntityModel;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.entity.entities.LeatherlingEntity;
import com.xiaolin.xoverhaul.util.FileGlobals;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LeatherlingEntityRenderer extends GeoEntityRenderer<LeatherlingEntity> {


    public LeatherlingEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LeatherlingEntityModel());
    }
}
