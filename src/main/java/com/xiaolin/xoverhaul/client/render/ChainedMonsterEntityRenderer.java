package com.xiaolin.xoverhaul.client.render;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.client.model.ChainedMonsterEntityModel;
import com.xiaolin.xoverhaul.client.model.LeatherlingEntityModel;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.entity.entities.ChainedMonsterEntity;
import com.xiaolin.xoverhaul.util.FileGlobals;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.io.File;

public class ChainedMonsterEntityRenderer extends GeoEntityRenderer<ChainedMonsterEntity> {


    public ChainedMonsterEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new ChainedMonsterEntityModel());
    }
}
