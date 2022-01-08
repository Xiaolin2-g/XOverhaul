package com.xiaolin.xoverhaul.mixin;

import com.xiaolin.xoverhaul.XOverhaul;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PotionItem.class)
public class PotionGlintMixin {



    @Inject(method = "hasGlint", at = @At("RETURN"), cancellable = true)
    public void hasGlint(ItemStack stack, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(false);
    }

}
