package com.xiaolin.xoverhaul.client.render;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.entities.LeatherlingEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

public class LeatherlingEntityRenderer extends SlimeEntityRenderer {

    private final Identifier TEXTURE = new Identifier(XOverhaul.MOD_ID,
            "textures/entity/leatherling/leatherling.png");

    public LeatherlingEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(SlimeEntity slimeEntity) {
        return TEXTURE;
    }
}
