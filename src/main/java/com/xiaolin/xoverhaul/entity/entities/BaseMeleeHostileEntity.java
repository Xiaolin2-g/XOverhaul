package com.xiaolin.xoverhaul.entity.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class BaseMeleeHostileEntity extends BaseHostileEntity {

    protected BaseMeleeHostileEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void initGoals() {
        super.initGoals();

        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.0D, false));
    }
}
