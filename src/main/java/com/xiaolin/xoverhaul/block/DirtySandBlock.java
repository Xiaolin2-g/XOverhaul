package com.xiaolin.xoverhaul.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class DirtySandBlock extends FallingBlock {
    public DirtySandBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        // Gets hand item
        ItemStack itemStack = player.getStackInHand(hand);
        // If item is water bottle
        if (PotionUtil.getPotion(itemStack) == Potions.WATER) {
            // And only in the server
            if(!world.isClient){
                // Set dirty sand to sand
                world.setBlockState(pos, Blocks.SAND.getDefaultState());
                // Remove 1 water bottle
                if (!player.getAbilities().creativeMode){
                    itemStack.decrement(1);
                }
                // Give 1 empty bottle
                player.giveItemStack(new ItemStack(Items.GLASS_BOTTLE, 1));
                // Play bottle sound
                world.playSound(null, player.getX(), player.getY(), player.getZ(),
                        SoundEvents.ITEM_BOTTLE_EMPTY, SoundCategory.NEUTRAL, 0.5F, 1F);
                // Hand animation
                return ActionResult.SUCCESS;
            }
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
