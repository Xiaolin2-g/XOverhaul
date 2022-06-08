package com.xiaolin.xoverhaul.mixin;


import net.minecraft.entity.decoration.ArmorStandEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ArmorStandEntity.class)
public interface ArmorStandInvoker {

    @Invoker("setShowArms")
    void invokeSetShowArms(boolean showArms);

}
