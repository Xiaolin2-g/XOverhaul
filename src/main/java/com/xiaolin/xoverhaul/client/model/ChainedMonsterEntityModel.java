package com.xiaolin.xoverhaul.client.model;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.entity.entities.ChainedMonsterEntity;
import com.xiaolin.xoverhaul.util.FileGlobals;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChainedMonsterEntityModel extends AnimatedGeoModel<ChainedMonsterEntity> {

    @Override
    public Identifier getModelLocation(ChainedMonsterEntity object) {
        return new Identifier(XOverhaul.MOD_ID, FileGlobals.GeoModels +
                ModEntities.CHAINED_MONSTER_ID + FileGlobals.GeoJSON);
    }

    @Override
    public Identifier getTextureLocation(ChainedMonsterEntity object) {
        return new Identifier(
                XOverhaul.MOD_ID, FileGlobals.EntityTextures +
                ModEntities.CHAINED_MONSTER_ID + "/" + ModEntities.CHAINED_MONSTER_ID +
                FileGlobals.PNG);
    }

    @Override
    public Identifier getAnimationFileLocation(ChainedMonsterEntity animatable) {
        return new Identifier(
                XOverhaul.MOD_ID, FileGlobals.Animations +
                ModEntities.CHAINED_MONSTER_ID + FileGlobals.JSON);
    }
}
