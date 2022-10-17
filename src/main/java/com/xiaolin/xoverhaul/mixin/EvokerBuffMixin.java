package com.xiaolin.xoverhaul.mixin;

import net.minecraft.entity.mob.EvokerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(EvokerEntity.class)

public abstract class EvokerBuffMixin {

    @ModifyConstant(method = "createEvokerAttributes", constant = @Constant(doubleValue = 24))
    private static double changeEvokerHealth(double original) {
        return 125;
    }
}
