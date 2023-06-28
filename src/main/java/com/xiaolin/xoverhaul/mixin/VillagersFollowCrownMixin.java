package com.xiaolin.xoverhaul.mixin;


import com.xiaolin.xiaolib.goals.ArmorTemptGoal;
import com.xiaolin.xoverhaul.init.ModArmor;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(VillagerEntity.class)
public abstract class VillagersFollowCrownMixin extends MerchantEntity {

    public Ingredient itemToFollow;

    public VillagersFollowCrownMixin(EntityType<? extends MerchantEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void initGoals() {

        itemToFollow = Ingredient.ofItems(ModArmor.VILLAGE_CROWN);

        this.goalSelector.add(4, new ArmorTemptGoal(((VillagerEntity)(Object)this), 1.0f, itemToFollow, false));
    }



}