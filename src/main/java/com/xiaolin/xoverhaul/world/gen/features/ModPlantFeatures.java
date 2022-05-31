package com.xiaolin.xoverhaul.world.gen.features;

import com.xiaolin.xoverhaul.init.ModPlants;
import net.minecraft.block.Block;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.Arrays;

public class ModPlantFeatures {

    public static final ConfiguredFeature<?, ?> ENDER_FLOWER_CONFIGURED_FEATURE = configureFlower(ModPlants.ENDER_FLOWER);

    public static final PlacedFeature ENDER_FLOWER_PLACED_FEATURE = placeFlower(ENDER_FLOWER_CONFIGURED_FEATURE, 32);

    public static final ConfiguredFeature<?,?> MAGENTA_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.MAGENTA_TULIP);

    public static final PlacedFeature MAGENTA_TULIP_PLACED_FEATURE = placeTulip(MAGENTA_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> LIGHT_BLUE_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.LIGHT_BLUE_TULIP);

    public static final PlacedFeature LIGHT_BLUE_TULIP_PLACED_FEATURE = placeTulip(LIGHT_BLUE_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> YELLOW_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.YELLOW_TULIP);

    public static final PlacedFeature YELLOW_TULIP_PLACED_FEATURE = placeTulip(YELLOW_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> LIME_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.LIME_TULIP);

    public static final PlacedFeature LIME_TULIP_PLACED_FEATURE = placeTulip(LIME_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> GRAY_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.GRAY_TULIP);

    public static final PlacedFeature GRAY_TULIP_PLACED_FEATURE = placeTulip(GRAY_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> LIGHT_GRAY_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.LIGHT_GRAY_TULIP);

    public static final PlacedFeature LIGHT_GRAY_TULIP_PLACED_FEATURE = placeTulip(LIGHT_GRAY_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> CYAN_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.CYAN_TULIP);

    public static final PlacedFeature CYAN_TULIP_PLACED_FEATURE = placeTulip(CYAN_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> PURPLE_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.PURPLE_TULIP);

    public static final PlacedFeature PURPLE_TULIP_PLACED_FEATURE = placeTulip(PURPLE_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> BLUE_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.BLUE_TULIP);

    public static final PlacedFeature BLUE_TULIP_PLACED_FEATURE = placeTulip(BLUE_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> BROWN_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.BROWN_TULIP);

    public static final PlacedFeature BROWN_TULIP_PLACED_FEATURE = placeTulip(BROWN_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> GREEN_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.GREEN_TULIP);

    public static final PlacedFeature GREEN_TULIP_PLACED_FEATURE = placeTulip(GREEN_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?,?> BLACK_TULIP_CONFIGURED_FEATURE = configureFlower(ModPlants.BLACK_TULIP);

    public static final PlacedFeature BLACK_TULIP_PLACED_FEATURE = placeTulip(BLACK_TULIP_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?, ?> CRIMSON_SPROUTS_CONFIGURED_FEATURE = configureSprouts(ModPlants.CRIMSON_SPROUTS);

    public static final PlacedFeature CRIMSON_SPROUTS_PLACED_FEATURE = placeSprouts(CRIMSON_SPROUTS_CONFIGURED_FEATURE);

    public static final ConfiguredFeature<?, ?> BIRCH_FLOWER_CONFIGURED_FEATURE = configureFlower(ModPlants.BIRCH_FLOWER);

    public static final PlacedFeature BIRCH_FLOWER_PLACED_FEATURE = placeFlower(BIRCH_FLOWER_CONFIGURED_FEATURE, 32);


    private static ConfiguredFeature<?,?> configureFlower(Block flower){
        return new ConfiguredFeature(Feature.FLOWER, new RandomPatchFeatureConfig(12, 6, 2, // i: tries, j: x and z spread, k: y spread
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of(flower)))));
    }

    private static PlacedFeature placeFlower(ConfiguredFeature<?,?> configuredFeature, int triesPerChunk){
        return new PlacedFeature(RegistryEntry.of(configuredFeature),
                Arrays.asList(
                RarityFilterPlacementModifier.of(triesPerChunk), // tries per chunk
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()));
    }

    private static PlacedFeature placeTulip(ConfiguredFeature<?,?> configuredFeature){
        return placeFlower(configuredFeature, 16);
    }

    private static ConfiguredFeature<?, ?> configureSprouts(Block sprouts){
        return new ConfiguredFeature(Feature.NETHER_FOREST_VEGETATION,
                (new NetherForestVegetationFeatureConfig
                        (BlockStateProvider.of(sprouts),8, 4)));
    }

    private static PlacedFeature placeSprouts(ConfiguredFeature<?,?> configuredFeature){
        return new PlacedFeature(RegistryEntry.of(configuredFeature),
                Arrays.asList(
                (CountMultilayerPlacementModifier.of(2)),
                        BiomePlacementModifier.of()));

    }


}

