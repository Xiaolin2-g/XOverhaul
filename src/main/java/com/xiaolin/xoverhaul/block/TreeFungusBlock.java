package com.xiaolin.xoverhaul.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.Map;

public class TreeFungusBlock extends Block {


    public static final DirectionProperty FACING;

    private final VoxelShape SHAPE = VoxelShapes.combineAndSimplify(Block.createCuboidShape
            (5, 0, 0, 16, 2, 16), Block.createCuboidShape
            (2, 0, 3, 15, 2, 13), BooleanBiFunction.OR);

    Map<Direction, VoxelShape> SHAPES = Maps.newEnumMap
            (ImmutableMap.of(Direction.NORTH, Block.createCuboidShape
                    (5.5D, 3.0D, 11.0D, 10.5D, 13.0D, 16.0D),

                    Direction.SOUTH, Block.createCuboidShape
                            (5.5D, 3.0D, 0.0D, 10.5D, 13.0D, 5.0D)

                    , Direction.WEST, Block.createCuboidShape
                            (11.0D, 3.0D, 5.5D, 16.0D, 13.0D, 10.5D)

                    , Direction.EAST, Block.createCuboidShape
                            (0.0D, 3.0D, 5.5D, 5.0D, 13.0D, 10.5D)));


    public TreeFungusBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
    }

}
