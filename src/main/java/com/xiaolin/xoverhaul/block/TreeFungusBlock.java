package com.xiaolin.xoverhaul.block;

import net.minecraft.block.*;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class TreeFungusBlock extends BaseDirectionalBlock {

    public TreeFungusBlock(Settings settings) {
        super(settings);
    }

    static {
        NORTH_SHAPE = VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 5, 16, 2, 16), Block.createCuboidShape(3, 0, 2, 13, 2, 15), BooleanBiFunction.OR);
        SOUTH_SHAPE = VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 0, 16, 2, 11), Block.createCuboidShape(3, 0, 1, 13, 2, 14), BooleanBiFunction.OR);
        WEST_SHAPE = VoxelShapes.combineAndSimplify(Block.createCuboidShape(5, 0, 0, 16, 2, 16), Block.createCuboidShape(2, 0, 3, 15, 2, 13), BooleanBiFunction.OR);
        EAST_SHAPE = VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 0, 11, 2, 16), Block.createCuboidShape(1, 0, 3, 14, 2, 13), BooleanBiFunction.OR);
    }

}
