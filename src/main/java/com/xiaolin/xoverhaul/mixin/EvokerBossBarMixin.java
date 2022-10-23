package com.xiaolin.xoverhaul.mixin;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.mob.EvokerEntity;
import net.minecraft.entity.mob.SpellcastingIllagerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EvokerEntity.class)
public abstract class EvokerBossBarMixin extends SpellcastingIllagerEntity {

    public ServerBossBar bossBar;

    public EvokerBossBarMixin(EntityType<? extends EvokerEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "<init>", at = @At("RETURN"))
    private void initBossBar(EntityType entityType, World world, CallbackInfo ci){
        bossBar = new ServerBossBar(this.getDisplayName(), BossBar.Color.PURPLE, BossBar.Style.PROGRESS);
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("RETURN"), cancellable = true)
    private void readBossBarName(NbtCompound nbt, CallbackInfo ci){
        if (this.hasCustomName()) {
            this.bossBar.setName(this.getDisplayName());
        }
    }

    @Inject(method = "mobTick", at = @At("RETURN"), cancellable = true)
    private void updateBossBar(CallbackInfo ci){
        this.bossBar.setPercent(this.getHealth() / this.getMaxHealth());
    }

    public void setCustomName(@Nullable Text name) {
        super.setCustomName(name);
        this.bossBar.setName(this.getDisplayName());
    }

    public void onStartedTrackingBy(ServerPlayerEntity player) {
        super.onStartedTrackingBy(player);
        this.bossBar.addPlayer(player);
    }

    public void onStoppedTrackingBy(ServerPlayerEntity player) {
        super.onStoppedTrackingBy(player);
        this.bossBar.removePlayer(player);
    }


}
