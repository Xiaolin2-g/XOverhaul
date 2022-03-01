package com.xiaolin.xoverhaul.world.gen.generation;

import com.xiaolin.xoverhaul.world.gen.features.ModOreConfiguredFeatures;
import com.xiaolin.xoverhaul.world.gen.features.ModSimpleBlockConfiguredFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModSimpleBlockGeneration extends ModFeatureGeneration{

    public static RegistryKey<ConfiguredFeature<?, ?>> WOODEN_CRATE_CONFIGURED_KEY = registerConfiguredKey("wooden_crate");
    public static RegistryKey<PlacedFeature> WOODEN_CRATE_PLACED_KEY = registerPlacedKey("wooden_crate");


    private static void configureSimpleBlocks(){
        registerConfiguredFeature(ModSimpleBlockConfiguredFeatures.WOODEN_CRATE_CONFIGURED_FEATURE, WOODEN_CRATE_CONFIGURED_KEY);
    }

    private static void placeSimpleBlocks(){
        registerPlacedFeature(ModSimpleBlockConfiguredFeatures.WOODEN_CRATE_PLACED_FEATURE, WOODEN_CRATE_PLACED_KEY);
    }

    private static void addSimpleBlocksToBiomes(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.FOREST,
                        BiomeKeys.PLAINS,
                        BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, WOODEN_CRATE_PLACED_KEY);
    }

    public static void generateSimpleBlocks(){
        configureSimpleBlocks();
        placeSimpleBlocks();
        addSimpleBlocksToBiomes();
    }
}
