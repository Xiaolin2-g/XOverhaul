package com.xiaolin.xoverhaul.client.model;

import com.ibm.icu.text.Normalizer2;
import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.entity.entities.LeatherlingEntity;
import com.xiaolin.xoverhaul.util.FileGlobals;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import java.io.File;
import java.io.FileFilter;

public class LeatherlingEntityModel extends AnimatedGeoModel<LeatherlingEntity> {

    @Override
    public Identifier getModelLocation(LeatherlingEntity object) {
        return new Identifier(XOverhaul.MOD_ID, FileGlobals.GeoModels +
                ModEntities.LEATHERLING_ID + FileGlobals.GeoJSON);
    }

    @Override
    public Identifier getTextureLocation(LeatherlingEntity object) {
        return new Identifier(
                XOverhaul.MOD_ID, FileGlobals.EntityTextures +
                ModEntities.LEATHERLING_ID + "/" + ModEntities.LEATHERLING_ID +
                FileGlobals.PNG);
    }

    @Override
    public Identifier getAnimationFileLocation(LeatherlingEntity animatable) {
        return new Identifier(
                XOverhaul.MOD_ID, FileGlobals.Animations +
                ModEntities.LEATHERLING_ID + FileGlobals.JSON);
    }
}
