package com.xiaolin.xoverhaul.entity.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class LeatherlingEntity extends BaseMeleeHostileEntity implements Angerable{

    public LeatherlingEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createAttributes(){
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 5.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.30f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_PARROT_IMITATE_SLIME;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_VILLAGER_WORK_LEATHERWORKER;
    }


    @Override
    public int getAngerTime() {
        return 0;
    }

    @Override
    public void setAngerTime(int angerTime) {

    }

    @Nullable
    @Override
    public UUID getAngryAt() {
        return null;
    }

    @Override
    public void setAngryAt(@Nullable UUID angryAt) {

    }

    @Override
    public void chooseRandomAngerTime() {

    }

    @Override
    public void writeAngerToNbt(NbtCompound nbt) {
        Angerable.super.writeAngerToNbt(nbt);
    }

    @Override
    public void readAngerFromNbt(World world, NbtCompound nbt) {
        Angerable.super.readAngerFromNbt(world, nbt);
    }

    @Override
    public void tickAngerLogic(ServerWorld world, boolean angerPersistent) {
        Angerable.super.tickAngerLogic(world, angerPersistent);
    }

    @Override
    public boolean shouldAngerAt(LivingEntity entity) {
        return Angerable.super.shouldAngerAt(entity);
    }

    @Override
    public boolean isUniversallyAngry(World world) {
        return Angerable.super.isUniversallyAngry(world);
    }

    @Override
    public boolean hasAngerTime() {
        return Angerable.super.hasAngerTime();
    }

    @Override
    public void forgive(PlayerEntity player) {
        Angerable.super.forgive(player);
    }

    @Override
    public void universallyAnger() {
        Angerable.super.universallyAnger();
    }

    @Override
    public void stopAnger() {
        Angerable.super.stopAnger();
    }
}
