package com.xiaolin.xoverhaul.client.render;

import com.xiaolin.xoverhaul.XOverhaul;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

public class ChainedZombieEntityRenderer extends ZombieEntityRenderer{

    private final Identifier TEXTURE = new Identifier(XOverhaul.MOD_ID,
            "textures/entity/chained_zombie/chained_zombie.png");

    public ChainedZombieEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(ZombieEntity zombieEntity) {
        return TEXTURE;
    }
}
