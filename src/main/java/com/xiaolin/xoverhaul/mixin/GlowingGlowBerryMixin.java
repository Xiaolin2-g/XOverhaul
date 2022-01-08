package com.xiaolin.xoverhaul.mixin;


import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FoodComponents.class)
public class GlowingGlowBerryMixin {


    @Shadow
    @Final
    @Mutable
    public static FoodComponent GLOW_BERRIES;


    @Inject(method = "<clinit>",
    at = @At(value = "FIELD",
    opcode = Opcodes.PUTSTATIC,
    target = "Lnet/minecraft/item/FoodComponents;GLOW_BERRIES:Lnet/minecraft/item/FoodComponent;",
    shift = At.Shift.AFTER))
    private static void glowingBerry(CallbackInfo ci){
        GLOW_BERRIES = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 40, 0), 1.0F).build();
    }


}
