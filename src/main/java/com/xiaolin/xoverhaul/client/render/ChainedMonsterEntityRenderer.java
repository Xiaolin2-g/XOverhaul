package com.xiaolin.xoverhaul.client.render;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.util.FileGlobals;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

import java.io.File;

public class ChainedMonsterEntityRenderer extends ZombieEntityRenderer{

    private final Identifier TEXTURE = new Identifier(
            XOverhaul.MOD_ID, FileGlobals.EntityTextures +
            ModEntities.CHAINED_MONSTER_ID + "/" + ModEntities.CHAINED_MONSTER_ID +
            FileGlobals.PNG);

    public ChainedMonsterEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(ZombieEntity zombieEntity) {
        return TEXTURE;
    }
}
