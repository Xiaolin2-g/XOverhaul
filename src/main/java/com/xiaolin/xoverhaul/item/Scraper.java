package com.xiaolin.xoverhaul.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class Scraper extends DontConsumeOnCraftItem {
    public Scraper(Settings settings) {
        super(settings);
        // settings.recipeRemainder(this);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getBlockPos();
        world.setBlockState(blockpos, Blocks.MAGMA_BLOCK.getDefaultState());
        return ActionResult.SUCCESS;
    }

}
