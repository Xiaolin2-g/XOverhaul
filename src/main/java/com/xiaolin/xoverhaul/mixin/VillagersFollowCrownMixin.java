package com.xiaolin.xoverhaul.mixin;


import com.xiaolin.xoverhaul.goals.ArmorTemptGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.item.Items;
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

        itemToFollow = Ingredient.ofItems(Items.GOLDEN_HELMET);

        this.goalSelector.add(4, new ArmorTemptGoal(((VillagerEntity)(Object)this), 1.0f, itemToFollow, false));
    }



}