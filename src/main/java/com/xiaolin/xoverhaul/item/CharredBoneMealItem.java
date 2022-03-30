package com.xiaolin.xoverhaul.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CharredBoneMealItem extends Item {
    public CharredBoneMealItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        World world = player.getWorld();
        if(!world.isClient){
            if(stack.getItem() == ModItems.CHARRED_BONE_MEAL){
                if(entity instanceof PassiveEntity){ // && entity instanceof ParrotEntity == false){
                    if(!entity.isBaby()){
                        if (!player.getAbilities().creativeMode){
                            stack.decrement(1);
                        }
                        ((PassiveEntity) entity).setBreedingAge(-2000000000);
                        world.playSound(null, player.getX(), player.getY(), player.getZ(),
                                SoundEvents.ENTITY_ZOMBIE_VILLAGER_CONVERTED, SoundCategory.NEUTRAL, 0.5F, 2F);
                        return ActionResult.SUCCESS;
                    }
                }
            }
        }

        return super.useOnEntity(stack, player, entity, hand);
    }
}
