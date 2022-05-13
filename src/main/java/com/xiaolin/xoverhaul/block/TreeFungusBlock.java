package com.xiaolin.xoverhaul.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class TreeFungusBlock extends Block {
    public TreeFungusBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.combineAndSimplify
                        (Block.createCuboidShape(0, 0, 2.5, 16, 2, 13.5),
                                Block.createCuboidShape(3, 0, 0, 13, 2, 16),
                                BooleanBiFunction.OR);
    }

}
