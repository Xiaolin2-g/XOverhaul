package com.xiaolin.xoverhaul.world.gen.treedecorator;

import com.mojang.serialization.Codec;
import com.xiaolin.xoverhaul.block.TreeFungusBlock;
import com.xiaolin.xoverhaul.init.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.*;
import java.util.function.BiConsumer;

public class TreeFungusTreeDecorator extends TreeDecorator {

    public static final Codec<TreeFungusTreeDecorator> CODEC =
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability")
                    .xmap(TreeFungusTreeDecorator::new, (decorator) -> decorator.probability).codec();

    private final float probability;

    public TreeFungusTreeDecorator(float probability) {
        this.probability = probability;
    }

    @Override
    protected TreeDecoratorType<?> getType() {
        return ModTreeDecoratorType.TREE_FUNGUS;
    }

    @Override
    public void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, List<BlockPos> logPositions, List<BlockPos> leavesPositions) {

        // Probability
        if (random.nextFloat() <= this.probability) {

            // Get Y value of the first log of the tree, bottom one?
            int i = logPositions.get(0).getY() + 2;
            MinecraftClient.getInstance().player.sendChatMessage("Y: " + i);

            logPositions.stream().filter((pos) -> pos.getY() - i <= 2).forEach((pos) -> {

                MinecraftClient.getInstance().player.sendChatMessage("Pos: " + pos);
                for (Direction direction : Direction.Type.HORIZONTAL) {
                    if (random.nextFloat() <= 0.10F) {
                        BlockPos blockPos = pos.add(direction.getOffsetX(), 0, direction.getOffsetZ());
                        if (Feature.isAir(world, blockPos)) {
                            replacer.accept(blockPos, ModBlocks.TREE_FUNGUS.getDefaultState().with(TreeFungusBlock.FACING, direction));
                        }
                    }
                }
            });
        }
    }

    /*
    private void placeFungus(BiConsumer<BlockPos, BlockState> replacer, BlockPos pos, BooleanProperty facing) {
        replacer.accept(pos, ModBlocks.TREE_FUNGUS.getDefaultState().with(TreeFungusBlock.FACING, FACING));
    }*/



}
