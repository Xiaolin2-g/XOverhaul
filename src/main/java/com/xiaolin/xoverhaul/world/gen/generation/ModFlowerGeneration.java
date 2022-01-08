package com.xiaolin.xoverhaul.world.gen.generation;

import com.xiaolin.xoverhaul.world.gen.features.ModFlowerConfiguredFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModFlowerGeneration extends ModFeatureGeneration{

    public static RegistryKey<ConfiguredFeature<?, ?>> ENDER_FLOWER_CONFIGURED_KEY = registerConfiguredKey("ender_flower");
    public static RegistryKey<PlacedFeature> ENDER_FLOWER_PLACED_KEY = registerPlacedKey("ender_flower");


    private static void configureFlowers(){
        registerConfiguredFeature(ModFlowerConfiguredFeatures.ENDER_FLOWER_CONFIGURED_FEATURE, ENDER_FLOWER_CONFIGURED_KEY);
    }

    private static void placeFlowers(){
        registerPlacedFeature(ModFlowerConfiguredFeatures.ENDER_FLOWER_PLACED_FEATURE, ENDER_FLOWER_PLACED_KEY);
    }

    private static void addFlowersToBiomes(){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.VEGETAL_DECORATION, ENDER_FLOWER_PLACED_KEY);
    }

    public static void generateFlowers(){
        configureFlowers();
        placeFlowers();
        addFlowersToBiomes();
    }
}
