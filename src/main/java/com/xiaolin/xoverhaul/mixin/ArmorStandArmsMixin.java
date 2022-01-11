package com.xiaolin.xoverhaul.mixin;


import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.item.ArmorStandItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ArmorStandItem.class)
public abstract class ArmorStandArmsMixin implements ArmorStandInvoker {

    @Inject(method = "useOnBlock",
    at = @At(value = "INVOKE",
    target = "Lnet/minecraft/world/World;emitGameEvent(Lnet/minecraft/entity/Entity;Lnet/minecraft/world/event/GameEvent;Lnet/minecraft/entity/Entity;)V"),
    locals = LocalCapture.CAPTURE_FAILSOFT,
    cancellable = true)
    public void showArms(ItemUsageContext context , CallbackInfoReturnable<ActionResult> cir,
                         World world,
                         ItemPlacementContext itemPlacementContext, BlockPos blockPos,
                         ItemStack itemStack, Vec3d vec3d,
                         Box box, ServerWorld serverWorld,
                         ArmorStandEntity armorStandEntity){
        ((ArmorStandInvoker)armorStandEntity).invokeSetShowArms(true);
    }
/*
    @Inject(method = "useOnBlock", at = @At("TAIL"), cancellable = true, locals = LocalCapture.CAPTURE_FAILSOFT)
    public void showArms(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir, ArmorStandEntity armorStandEntity){
        ((ArmorStandInvoker)armorStandEntity).invokeSetShowArms(true);
    }*/
}
