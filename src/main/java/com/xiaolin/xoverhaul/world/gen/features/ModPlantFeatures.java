package com.xiaolin.xoverhaul.world.gen.features;

import com.xiaolin.xoverhaul.init.ModPlants;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ModPlantFeatures {

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> ENDER_FLOWER_CONFIGURED_FEATURE =
            configureFlower("ender_flower_configured_feature", ModPlants.ENDER_FLOWER);

    public static final RegistryEntry<PlacedFeature> ENDER_FLOWER_PLACED_FEATURE =
            placeFlower("ender_flower_placed_feature", ENDER_FLOWER_CONFIGURED_FEATURE, 32);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> MAGENTA_TULIP_CONFIGURED_FEATURE =
            configureFlower("magenta_tulip_configured_feature", ModPlants.MAGENTA_TULIP);

    public static final RegistryEntry<PlacedFeature> MAGENTA_TULIP_PLACED_FEATURE =
            placeTulip("magenta_tulip_placed_feature", MAGENTA_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> LIGHT_BLUE_TULIP_CONFIGURED_FEATURE =
            configureFlower("light_blue_tulip_configured_feature", ModPlants.LIGHT_BLUE_TULIP);

    public static final RegistryEntry<PlacedFeature> LIGHT_BLUE_TULIP_PLACED_FEATURE =
            placeTulip("light_blue_tulip_placed_feature", LIGHT_BLUE_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> YELLOW_TULIP_CONFIGURED_FEATURE =
            configureFlower("yellow_tulip_configured_feature", ModPlants.YELLOW_TULIP);

    public static final RegistryEntry<PlacedFeature> YELLOW_TULIP_PLACED_FEATURE =
            placeTulip("yellow_tulip_placed_feature", YELLOW_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> LIME_TULIP_CONFIGURED_FEATURE =
            configureFlower("lime_tulip_configured_feature", ModPlants.LIME_TULIP);

    public static final RegistryEntry<PlacedFeature> LIME_TULIP_PLACED_FEATURE =
            placeTulip("lime_tulip_placed_feature", LIME_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GRAY_TULIP_CONFIGURED_FEATURE =
            configureFlower("gray_tulip_configured_feature", ModPlants.GRAY_TULIP);

    public static final RegistryEntry<PlacedFeature> GRAY_TULIP_PLACED_FEATURE =
            placeTulip("gray_tulip_placed_feature", GRAY_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> LIGHT_GRAY_TULIP_CONFIGURED_FEATURE =
            configureFlower("light_gray_tulip_configured_feature", ModPlants.LIGHT_GRAY_TULIP);

    public static final RegistryEntry<PlacedFeature> LIGHT_GRAY_TULIP_PLACED_FEATURE =
            placeTulip("light_gray_tulip_placed_feature", LIGHT_GRAY_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> CYAN_TULIP_CONFIGURED_FEATURE =
            configureFlower("cyan_tulip_configured_feature", ModPlants.CYAN_TULIP);

    public static final RegistryEntry<PlacedFeature> CYAN_TULIP_PLACED_FEATURE =
            placeTulip("cyan_tulip_placed_feature", CYAN_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PURPLE_TULIP_CONFIGURED_FEATURE =
            configureFlower("purple_tulip_configured_feature", ModPlants.PURPLE_TULIP);

    public static final RegistryEntry<PlacedFeature> PURPLE_TULIP_PLACED_FEATURE =
            placeTulip("purple_tulip_placed_feature", PURPLE_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> BLUE_TULIP_CONFIGURED_FEATURE =
            configureFlower("blue_tulip_configured_feature", ModPlants.BLUE_TULIP);

    public static final RegistryEntry<PlacedFeature> BLUE_TULIP_PLACED_FEATURE =
            placeTulip("blue_tulip_placed_feature", BLUE_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> BROWN_TULIP_CONFIGURED_FEATURE =
            configureFlower("brown_tulip_configured_feature", ModPlants.BROWN_TULIP);

    public static final RegistryEntry<PlacedFeature> BROWN_TULIP_PLACED_FEATURE =
            placeTulip("brown_tulip_placed_feature", BROWN_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GREEN_TULIP_CONFIGURED_FEATURE =
            configureFlower("green_tulip_configured_feature", ModPlants.GREEN_TULIP);

    public static final RegistryEntry<PlacedFeature> GREEN_TULIP_PLACED_FEATURE =
            placeTulip("green_tulip_placed_feature", GREEN_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> BLACK_TULIP_CONFIGURED_FEATURE =
            configureFlower("black_tulip_configured_feature", ModPlants.BLACK_TULIP);

    public static final RegistryEntry<PlacedFeature> BLACK_TULIP_PLACED_FEATURE =
            placeTulip("black_tulip_placed_feature", BLACK_TULIP_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> CRIMSON_SPROUTS_CONFIGURED_FEATURE =
            configureSprouts("crimson_sprouts_configured_feature", ModPlants.CRIMSON_SPROUTS);

    public static final RegistryEntry<PlacedFeature> CRIMSON_SPROUTS_PLACED_FEATURE =
            placeSprouts("crimson_sprouts_placed_feature", CRIMSON_SPROUTS_CONFIGURED_FEATURE);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> BIRCH_FLOWER_CONFIGURED_FEATURE =
            configureFlower("birch_flower_configured_feature", ModPlants.BIRCH_FLOWER);

    public static final RegistryEntry<PlacedFeature> BIRCH_FLOWER_PLACED_FEATURE =
            placeFlower("birch_flower_placed_feature", BIRCH_FLOWER_CONFIGURED_FEATURE, 32);


    private static RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> configureFlower(String id, Block flower){

        return ConfiguredFeatures.register(
                id, Feature.FLOWER,
                new RandomPatchFeatureConfig(12, 6, 2, // i: tries, j: x and z spread, k: y spread
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of(flower)))));
    }

    private static RegistryEntry<PlacedFeature> placeFlower(String id, RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> configuredFeature, int triesPerChunk){
        return PlacedFeatures.register(id, configuredFeature,
                List.of(
                RarityFilterPlacementModifier.of(triesPerChunk), // tries per chunk
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()));
    }

    private static RegistryEntry<PlacedFeature> placeTulip(String id, RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> configuredFeature){
        return placeFlower(id, configuredFeature, 16);
    }

    private static RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> configureSprouts(String id, Block sprouts){

        return ConfiguredFeatures.register
                (id, Feature.NETHER_FOREST_VEGETATION,
                        new NetherForestVegetationFeatureConfig
                                (BlockStateProvider.of(sprouts),
                                        8, 4));
    }

    private static RegistryEntry<PlacedFeature> placeSprouts(String id, RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig,?>> configuredFeature){
        return PlacedFeatures.register(id, configuredFeature,
                CountMultilayerPlacementModifier.of(4),
                BiomePlacementModifier.of());
    }


}

