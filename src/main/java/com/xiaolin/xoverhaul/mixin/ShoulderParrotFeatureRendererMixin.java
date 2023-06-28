package com.xiaolin.xoverhaul.mixin;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer;
import net.minecraft.client.render.entity.model.ParrotEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ShoulderParrotFeatureRenderer.class)
public class ShoulderParrotFeatureRendererMixin<T extends PlayerEntity> {

    @Final @Shadow
    private ParrotEntityModel model;

    @Inject(method = "renderShoulderParrot",
            at = @At(value = "TAIL",
            target = "Lnet/minecraft/client/render/entity/model/ParrotEntityModel;poseOnShoulder(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;IIFFFFI)V"),
            locals = LocalCapture.CAPTURE_FAILSOFT,
            cancellable = true)
            private void renderBabyParrot(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T player, float limbAngle, float limbDistance, float headYaw, float headPitch, boolean leftShoulder, CallbackInfo ci){
            VertexConsumer vertexConsumer = null;
            this.model.render(matrices, null, light, OverlayTexture.DEFAULT_UV, 0, 0, 0, 255);
    }
}
