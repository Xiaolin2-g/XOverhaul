package com.xiaolin.xoverhaul.world.gen.features;

import com.xiaolin.xoverhaul.block.ModBlocks;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModFlowerConfiguredFeatures {

    public static ConfiguredFeature<?, ?> ENDER_FLOWER_CONFIGURED_FEATURE =
            Feature.FLOWER.configure(new RandomPatchFeatureConfig(12, 6, 2, () -> // i: tries, j: x and z spread, k: y spread
                    Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig
                    (BlockStateProvider.of(ModBlocks.ENDER_FLOWER))).withInAirFilter()));

    public static PlacedFeature ENDER_FLOWER_PLACED_FEATURE =
            ENDER_FLOWER_CONFIGURED_FEATURE.withPlacement(
                    RarityFilterPlacementModifier.of(32), // tries per chunk
                    SquarePlacementModifier.of(),
                    PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                    BiomePlacementModifier.of());


}

