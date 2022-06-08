package com.xiaolin.xoverhaul.mixin;

import net.minecraft.entity.mob.ZombieVillagerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ZombieVillagerEntity.class)
public interface ZombieVillagerConversionMixin {

    @Invoker("finishConversion")
    void invokeFinishConversion(ServerWorld serverWorld);

}