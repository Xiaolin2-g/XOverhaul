package com.xiaolin.xoverhaul.entity.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class ChainedMonsterEntity extends ZombieEntity {
    public ChainedMonsterEntity(EntityType<? extends ZombieEntity> entityType, World world) {
        super(entityType, world);
    }


    public static DefaultAttributeContainer.Builder createChainedMonsterAttributes(){
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 35.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.23f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3.0)
                .add(EntityAttributes.GENERIC_ARMOR, 0.0)
                .add(EntityAttributes.ZOMBIE_SPAWN_REINFORCEMENTS);


    }

    @Override
    protected SoundEvent getAmbientSound() {
        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.BLOCK_CHAIN_HIT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLOCK_CHAIN_BREAK;
    }

    @Override
    protected SoundEvent getStepSound() {
        return SoundEvents.BLOCK_CHAIN_PLACE;
    }

    @Override
    public boolean canBreakDoors() {
        return false;
    }

    @Override
    protected boolean shouldBreakDoors() {
        return false;
    }
    
}
