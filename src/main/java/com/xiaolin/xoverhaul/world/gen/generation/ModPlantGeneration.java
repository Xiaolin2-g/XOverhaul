package com.xiaolin.xoverhaul.world.gen.generation;

import com.xiaolin.xoverhaul.init.ModPlants;
import com.xiaolin.xoverhaul.world.gen.features.ModPlantFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.mixin.gamerule.GameRulesAccessor;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModPlantGeneration extends ModFeatureGeneration{

    private static void addPlantsToBiomes(){
        addToEnd(ModPlantFeatures.ENDER_FLOWER_PLACED_FEATURE.getKey().get());
        addTulipsToBiomes();
        addToCrimsonForest(ModPlantFeatures.CRIMSON_SPROUTS_PLACED_FEATURE.getKey().get());
        addToBirchForest(ModPlantFeatures.BIRCH_FLOWER_PLACED_FEATURE.getKey().get());
    }

    private static void addTulipsToBiomes(){
        addToFlowerForest(ModPlantFeatures.MAGENTA_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.LIGHT_BLUE_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.YELLOW_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.LIME_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.GRAY_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.LIGHT_GRAY_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.CYAN_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.PURPLE_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.BLUE_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.BROWN_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.GREEN_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.BLACK_TULIP_PLACED_FEATURE.getKey().get());
    }

    public static void generatePlants(){
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
