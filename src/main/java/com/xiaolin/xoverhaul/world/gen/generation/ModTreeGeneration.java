package com.xiaolin.xoverhaul.world.gen.generation;

import com.xiaolin.xoverhaul.world.gen.features.ModTreeFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModTreeGeneration extends ModFeatureGeneration {


    private static void addTreesToBiomes(){

        addToBirchForest(ModTreeFeatures.BIRCH_TREE_FUNGUS_SPAWNED_PLACED_FEATURE.getKey().get());

    }

    private static void addToBirchForest(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

    public static void generateTrees(){
        addTreesToBiomes();
    }


}
