package com.xiaolin.xoverhaul.mixin;

import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TurtleEntity.class)
public abstract class TurtleLeashMixin {

    @Inject(method = "canBeLeashedBy", at = @At("RETURN"), cancellable = true)
    public void canBeLeashedBy(PlayerEntity player, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(canBeLeashedByMixin());
    }

    private boolean canBeLeashedByMixin(){
        return true;
    }

}
