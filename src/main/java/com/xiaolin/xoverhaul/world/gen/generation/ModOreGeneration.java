package com.xiaolin.xoverhaul.world.gen.generation;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import com.xiaolin.xoverhaul.world.gen.features.ModOreFeatures;

public class ModOreGeneration extends ModFeatureGeneration {

    private static void addOresToBiomes(){

        addOreToTheEnd(ModOreFeatures.PURPUR_COBBLESTONE_PLACED_FEATURE.getKey().get());

        addOreToSoulSandValley(ModOreFeatures.SOUL_NETHERRACK_PLACED_FEATURE.getKey().get());

        addOreBeach(ModOreFeatures.DIRTY_SAND_PLACED_FEATURE.getKey().get());
    }

    private static void addOreToTheEnd(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, key);
    }

    private static void addOreToSoulSandValley(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, key);
    }

    private static void addOreBeach(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.UNDERGROUND_ORES, key);
    }

    public static void generateOres(){
        addOresToBiomes();
    }
}
