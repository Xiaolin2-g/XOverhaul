package com.xiaolin.xoverhaul.world.gen.generation;

import com.xiaolin.xoverhaul.world.gen.features.ModPlantFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModPlantGeneration extends ModFeatureGeneration{

    public static RegistryKey<ConfiguredFeature<?, ?>> ENDER_FLOWER_CONFIGURED_KEY = registerConfiguredKey("ender_flower");
    public static RegistryKey<PlacedFeature> ENDER_FLOWER_PLACED_KEY = registerPlacedKey("ender_flower");
    public static RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_TULIP_CONFIGURED_KEY = registerConfiguredKey("magenta_tulip");
    public static RegistryKey<PlacedFeature> MAGENTA_TULIP_PLACED_KEY = registerPlacedKey("magenta_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_TULIP_CONFIGURED_KEY = registerConfiguredKey("light_blue_tulip");
    public static RegistryKey<PlacedFeature> LIGHT_BLUE_TULIP_PLACED_KEY = registerPlacedKey("light_blue_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> YELLOW_TULIP_CONFIGURED_KEY = registerConfiguredKey("yellow_tulip");
    public static RegistryKey<PlacedFeature> YELLOW_TULIP_PLACED_KEY = registerPlacedKey("yellow_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> LIME_TULIP_CONFIGURED_KEY = registerConfiguredKey("lime_tulip");
    public static RegistryKey<PlacedFeature> LIME_TULIP_PLACED_KEY = registerPlacedKey("lime_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> GRAY_TULIP_CONFIGURED_KEY = registerConfiguredKey("gray_tulip");
    public static RegistryKey<PlacedFeature> GRAY_TULIP_PLACED_KEY = registerPlacedKey("gray_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_TULIP_CONFIGURED_KEY = registerConfiguredKey("light_gray_tulip");
    public static RegistryKey<PlacedFeature> LIGHT_GRAY_TULIP_PLACED_KEY = registerPlacedKey("light_gray_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> CYAN_TULIP_CONFIGURED_KEY = registerConfiguredKey("cyan_tulip");
    public static RegistryKey<PlacedFeature> CYAN_TULIP_PLACED_KEY = registerPlacedKey("cyan_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> PURPLE_TULIP_CONFIGURED_KEY = registerConfiguredKey("purple_tulip");
    public static RegistryKey<PlacedFeature> PURPLE_TULIP_PLACED_KEY = registerPlacedKey("purple_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> BLUE_TULIP_CONFIGURED_KEY = registerConfiguredKey("blue_tulip");
    public static RegistryKey<PlacedFeature> BLUE_TULIP_PLACED_KEY = registerPlacedKey("blue_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> BROWN_TULIP_CONFIGURED_KEY = registerConfiguredKey("brown_tulip");
    public static RegistryKey<PlacedFeature> BROWN_TULIP_PLACED_KEY = registerPlacedKey("brown_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> GREEN_TULIP_CONFIGURED_KEY = registerConfiguredKey("green_tulip");
    public static RegistryKey<PlacedFeature> GREEN_TULIP_PLACED_KEY = registerPlacedKey("green_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> BLACK_TULIP_CONFIGURED_KEY = registerConfiguredKey("black_tulip");
    public static RegistryKey<PlacedFeature> BLACK_TULIP_PLACED_KEY = registerPlacedKey("black_tulip");
    public static RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_SPROUTS_CONFIGURED_KEY = registerConfiguredKey("crimson_sprouts");
    public static RegistryKey<PlacedFeature> CRIMSON_SPROUTS_PLACED_KEY = registerPlacedKey("crimson_sprouts");
    public static RegistryKey<ConfiguredFeature<?, ?>> BIRCH_FLOWER_CONFIGURED_KEY = registerConfiguredKey("birch_flower");
    public static RegistryKey<PlacedFeature> BIRCH_FLOWER_PLACED_KEY = registerPlacedKey("birch_flower");


    private static void configurePlants(){
        registerConfiguredFeature(ModPlantFeatures.ENDER_FLOWER_CONFIGURED_FEATURE, ENDER_FLOWER_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.MAGENTA_TULIP_CONFIGURED_FEATURE, MAGENTA_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.LIGHT_BLUE_TULIP_CONFIGURED_FEATURE, LIGHT_BLUE_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.YELLOW_TULIP_CONFIGURED_FEATURE, YELLOW_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.LIME_TULIP_CONFIGURED_FEATURE, LIME_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.GRAY_TULIP_CONFIGURED_FEATURE, GRAY_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.LIGHT_GRAY_TULIP_CONFIGURED_FEATURE, LIGHT_GRAY_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.CYAN_TULIP_CONFIGURED_FEATURE, CYAN_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.PURPLE_TULIP_CONFIGURED_FEATURE, PURPLE_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.BLUE_TULIP_CONFIGURED_FEATURE, BLUE_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.BROWN_TULIP_CONFIGURED_FEATURE, BROWN_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.GREEN_TULIP_CONFIGURED_FEATURE, GREEN_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.BLACK_TULIP_CONFIGURED_FEATURE, BLACK_TULIP_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.CRIMSON_SPROUTS_CONFIGURED_FEATURE, CRIMSON_SPROUTS_CONFIGURED_KEY);
        registerConfiguredFeature(ModPlantFeatures.BIRCH_FLOWER_CONFIGURED_FEATURE, BIRCH_FLOWER_CONFIGURED_KEY);

    }

    private static void placePlants(){
        registerPlacedFeature(ModPlantFeatures.ENDER_FLOWER_PLACED_FEATURE, ENDER_FLOWER_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.MAGENTA_TULIP_PLACED_FEATURE, MAGENTA_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.LIGHT_BLUE_TULIP_PLACED_FEATURE, LIGHT_BLUE_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.YELLOW_TULIP_PLACED_FEATURE, YELLOW_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.LIME_TULIP_PLACED_FEATURE, LIME_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.GRAY_TULIP_PLACED_FEATURE, GRAY_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.LIGHT_GRAY_TULIP_PLACED_FEATURE, LIGHT_GRAY_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.CYAN_TULIP_PLACED_FEATURE, CYAN_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.PURPLE_TULIP_PLACED_FEATURE, PURPLE_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.BLUE_TULIP_PLACED_FEATURE, BLUE_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.BROWN_TULIP_PLACED_FEATURE, BROWN_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.GREEN_TULIP_PLACED_FEATURE, GREEN_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.BLACK_TULIP_PLACED_FEATURE, BLACK_TULIP_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.CRIMSON_SPROUTS_PLACED_FEATURE, CRIMSON_SPROUTS_PLACED_KEY);
        registerPlacedFeature(ModPlantFeatures.BIRCH_FLOWER_PLACED_FEATURE, BIRCH_FLOWER_PLACED_KEY);
    }

    private static void addPlantsToBiomes(){
        addToEnd(ENDER_FLOWER_PLACED_KEY);
        addToFlowerForest(MAGENTA_TULIP_PLACED_KEY);
        addToFlowerForest(LIGHT_BLUE_TULIP_PLACED_KEY);
        addToFlowerForest(YELLOW_TULIP_PLACED_KEY);
        addToFlowerForest(LIME_TULIP_PLACED_KEY);
        addToFlowerForest(GRAY_TULIP_PLACED_KEY);
        addToFlowerForest(LIGHT_GRAY_TULIP_PLACED_KEY);
        addToFlowerForest(CYAN_TULIP_PLACED_KEY);
        addToFlowerForest(PURPLE_TULIP_PLACED_KEY);
        addToFlowerForest(BLUE_TULIP_PLACED_KEY);
        addToFlowerForest(BROWN_TULIP_PLACED_KEY);
        addToFlowerForest(GREEN_TULIP_PLACED_KEY);
        addToFlowerForest(BLACK_TULIP_PLACED_KEY);
        addToCrimsonForest(CRIMSON_SPROUTS_PLACED_KEY);
        addToBirchForest(BIRCH_FLOWER_PLACED_KEY);
    }

    public static void generatePlants(){
        configurePlants();
        placePlants();
        addPlantsToBiomes();
    }

    private static void addToFlowerForest(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

    private static void addToBirchForest(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

    private static void addToNether(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

    private static void addToEnd(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

    private static void addToCrimsonForest(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

}
