package com.xiaolin.xoverhaul.util.interfaces;

public interface ILivingEntity {

    void initGoals();

    void initDataTracker();

    void tick();

    void tickMovement();
}
