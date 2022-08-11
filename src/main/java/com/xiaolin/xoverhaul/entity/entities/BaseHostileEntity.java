package com.xiaolin.xoverhaul.entity.entities;

import com.xiaolin.xoverhaul.util.AnimationHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.LightType;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.Random;

public class BaseHostileEntity extends HostileEntity implements IAnimatable {

    private final AnimationFactory factory = new AnimationFactory(this);

    protected BaseHostileEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static boolean isSpawnSurface(ServerWorldAccess world, BlockPos pos, Random random) {
        return world.getLightLevel(LightType.SKY, pos) > 0;
    }

    public static boolean isSpawnSurfaceAndDarkness(ServerWorldAccess world, BlockPos pos, Random random) {
        if (world.getLightLevel(LightType.BLOCK, pos) > 0) {
            return false;
        }
        int i = world.toServerWorld().isThundering() ? world.getLightLevel(pos, 10) : world.getLightLevel(pos);
        return i <= random.nextInt(8);
    }

    public static boolean canSpawnInSurface(EntityType<? extends HostileEntity> type, ServerWorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
        return world.getDifficulty() != Difficulty.PEACEFUL && isSpawnSurface(world, pos, random) && HostileEntity.canMobSpawn(type, world, spawnReason, pos, random);
    }

    public static boolean canSpawnInSurfaceAndDarkness(EntityType<? extends HostileEntity> type, ServerWorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
        return canSpawnInSurface(type, world, spawnReason, pos, random) && isSpawnSurfaceAndDarkness(world, pos, random);
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
