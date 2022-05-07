package com.xiaolin.xoverhaul.util;

import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

public class AnimationHelper {

    // BUILDERS

    public static final AnimationBuilder IDLE = new AnimationBuilder().addAnimation("idle", true);

    public static final AnimationBuilder WALKING = new AnimationBuilder().addAnimation("walking", true);

    public static final AnimationBuilder ATTACK = new AnimationBuilder().addAnimation("attack", true);


    // ANIMATIONS

    private static void setIdleAnimation(AnimationEvent event) {

        event.getController().setAnimation(IDLE);
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


    // CONTROLLERS

    public static <T extends IAnimatable> AnimationController idleAndWalkingController(T entity) {
        return new AnimationController(entity, "idleAndMovement",
                0,  event -> idleAndWalkingAnimation(event));
    }








    }
