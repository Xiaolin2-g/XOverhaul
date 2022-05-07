package com.xiaolin.xoverhaul.entity.entities;

import com.xiaolin.xoverhaul.util.AnimationHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class BaseHostileEntity extends HostileEntity implements IAnimatable {

    private final AnimationFactory factory = new AnimationFactory(this);

    protected BaseHostileEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public void initGoals() {

        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0D));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, true));

    }


    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(AnimationHelper.idleAndWalkingController(this));
        animationData.addAnimationController(AnimationHelper.attackController(this, this));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
