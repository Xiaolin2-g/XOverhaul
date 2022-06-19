package com.xiaolin.xoverhaul.client.armor;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.entity.entities.ChainedMonsterEntity;
import com.xiaolin.xoverhaul.init.ModArmor;
import com.xiaolin.xoverhaul.item.VillageCrownItem;
import com.xiaolin.xoverhaul.util.FileGlobals;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import java.io.File;

public class VillageCrownArmorModel extends AnimatedGeoModel<VillageCrownItem> {

    @Override
    public Identifier getModelLocation(VillageCrownItem object) {
        return new Identifier(XOverhaul.MOD_ID, FileGlobals.GeoModels +
                FileGlobals.VillageCrown + FileGlobals.GeoJSON);
    }

    @Override
    public Identifier getTextureLocation(VillageCrownItem object) {
        return new Identifier(
                XOverhaul.MOD_ID, FileGlobals.ArmorTextures +
                FileGlobals.VillageCrown + FileGlobals.PNG);
    }

    @Override
    public Identifier getAnimationFileLocation(VillageCrownItem animatable) {
        return new Identifier(
                XOverhaul.MOD_ID, FileGlobals.Animations +
                FileGlobals.VillageCrown + FileGlobals.JSON);
    }

}
