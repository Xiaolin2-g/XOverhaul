package com.xiaolin.xoverhaul.util;

import net.minecraft.entity.LivingEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

public class AnimationHelper {

    // BUILDERS

    public static final AnimationBuilder IDLE = new AnimationBuilder().addAnimation("idle", true);

    public static final AnimationBuilder WALKING = new AnimationBuilder().addAnimation("walking", true);

    public static final AnimationBuilder ATTACK = new AnimationBuilder().addAnimation("attack", false);


    // ANIMATIONS

    private static void setIdleAnimation(AnimationEvent event) {

        event.getController().setAnimation(IDLE);
    }

    private static void setAttackAnimation(AnimationEvent event) {

        event.getController().setAnimation(ATTACK);
    }

    private static void setWalkingAnimation(AnimationEvent event) {

        event.getController().setAnimation(WALKING);
    }

    // LOGIC

    private static PlayState idleAndWalkingAnimation(AnimationEvent event){
        if (!event.isMoving()) {
            setIdleAnimation(event);
        }
        else {
            setWalkingAnimation(event);
        }

        return PlayState.CONTINUE;
    }

    private static PlayState attackAnimation(AnimationEvent event, LivingEntity entity){
        if(entity.handSwinging){
            setAttackAnimation(event);
            return PlayState.CONTINUE;
        }

        event.getController().markNeedsReload();

        return PlayState.STOP;
    }


    // CONTROLLERS

    public static <T extends IAnimatable> AnimationController idleAndWalkingController(T animatable) {
        return new AnimationController(animatable, "idleAndMovement",
                0,  event -> idleAndWalkingAnimation(event));
    }

    public static <T extends IAnimatable> AnimationController attackController(T animatable, LivingEntity livingEntity) {
        return new AnimationController(animatable, "attack",
                0,  event -> attackAnimation(event, livingEntity));
    }







    }
