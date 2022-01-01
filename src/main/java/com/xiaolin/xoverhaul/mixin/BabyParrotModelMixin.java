package com.xiaolin.xoverhaul.mixin;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.ParrotEntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

@Mixin(ParrotEntityModel.class)
public abstract class BabyParrotModelMixin extends SinglePartEntityModel {
    @Shadow @Final private ModelPart head;
    @Shadow @Final private ModelPart leftWing;
    @Shadow @Final private ModelPart rightWing;
    @Shadow @Final private ModelPart feather;
    @Shadow @Final private ModelPart leftLeg;
    @Shadow @Final private ModelPart rightLeg;
    @Shadow @Final private ModelPart tail;
    @Shadow @Final private ModelPart root;
    @Shadow @Final private ModelPart body;

    private final boolean headScaled = true;
    private final float childHeadYOffset = 10f;
    private final float childHeadZOffset = 2f;

    private final float invertedChildHeadScale = 2.0f;
    private final float invertedChildBodyScale = 2.0f;
    private final float childBodyYOffset = 24.0f;



    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        if (this.child) {
            matrices.push();
            float f;
            if (this.headScaled) {
                f = 1.5F / this.invertedChildHeadScale;
                matrices.scale(f, f, f);
            }

            matrices.translate(0.0D, (double)(this.childHeadYOffset / 16.0F), (double)(this.childHeadZOffset / 16.0F));
            this.getHeadParts().forEach((headPart) -> {
                headPart.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            });
            matrices.pop();
            matrices.push();
            f = 1.0F / this.invertedChildBodyScale;
            matrices.scale(f, f, f);
            matrices.translate(0.0D, (double)(this.childBodyYOffset / 16.0F), 0.0D);
            this.getBodyParts().forEach((bodyPart) -> {
                bodyPart.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            });
            matrices.pop();
        } else {
            this.getHeadParts().forEach((headPart) -> {
                headPart.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            });
            this.getBodyParts().forEach((bodyPart) -> {
                bodyPart.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            });
        }

    }

    protected Iterable<ModelPart> getHeadParts() {
        return ImmutableList.of(this.head);
    }

    protected Iterable<ModelPart> getBodyParts() {
        return ImmutableList.of(this.body, this.tail, this.leftWing, this.rightWing, this.leftLeg, this.rightLeg);
    }
}
