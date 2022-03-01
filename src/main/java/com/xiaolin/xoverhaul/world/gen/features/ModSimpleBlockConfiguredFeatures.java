package com.xiaolin.xoverhaul.world.gen.features;

import com.xiaolin.xoverhaul.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModSimpleBlockConfiguredFeatures {

    public static ConfiguredFeature<?,?> WOODEN_CRATE_CONFIGURED_FEATURE = configureSimpleBlock(ModBlocks.WOODEN_CRATE);

    public static PlacedFeature WOODEN_CRATE_PLACED_FEATURE = placeSimpleBlock(WOODEN_CRATE_CONFIGURED_FEATURE, 1);

    private static ConfiguredFeature<?,?> configureSimpleBlock(Block block){
        return Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(
                (BlockStateProvider.of(block))));
    }

    private static PlacedFeature placeSimpleBlock(ConfiguredFeature<?,?> configuredFeature, int blocksPerChunk){
        return  configuredFeature.withPlacement(
                CountPlacementModifier.of(blocksPerChunk), // tries per chunk
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());
    }
}
