package com.xiaolin.xoverhaul.block;

import com.xiaolin.xoverhaul.util.XOverhaulTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class EnderFlower extends FlowerBlock {
    public EnderFlower(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
        super(suspiciousStewEffect, effectDuration, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(XOverhaulTags.Blocks.ENDER_FLOWER_PLACEABLES);
    }
}
