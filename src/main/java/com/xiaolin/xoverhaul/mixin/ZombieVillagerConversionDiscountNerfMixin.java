package com.xiaolin.xoverhaul.mixin;

import net.minecraft.entity.passive.VillagerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(VillagerEntity.class)
public abstract class ZombieVillagerConversionDiscountNerfMixin {

    @ModifyConstant(method = "onInteractionWith", constant = @Constant(intValue = 25, ordinal = 0))
    private int changeMinorGossipAmount(int original){
        return 0;
    }

    @ModifyConstant(method = "onInteractionWith", constant = @Constant(intValue = 20))
    private int changeMajorGossipAmount(int original){
        return 0;
    }

}
