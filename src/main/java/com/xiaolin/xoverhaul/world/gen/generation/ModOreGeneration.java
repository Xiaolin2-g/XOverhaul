package com.xiaolin.xoverhaul.world.gen.generation;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import com.xiaolin.xoverhaul.world.gen.features.ModOreConfiguredFeatures;

public class ModOreGeneration extends ModFeatureGeneration {

    public static RegistryKey<ConfiguredFeature<?, ?>> PURPUR_COBBLESTONE_CONFIGURED_KEY = registerConfiguredKey("purpur_cobblestone");
    public static RegistryKey<PlacedFeature> PURPUR_COBBLESTONE_PLACED_KEY = registerPlacedKey("purpur_cobblestone");

    public static RegistryKey<ConfiguredFeature<?, ?>> SOUL_NETHERRACK_CONFIGURED_KEY = registerConfiguredKey("soul_netherrack");
    public static RegistryKey<PlacedFeature> SOUL_NETHERRACK_PLACED_KEY = registerPlacedKey("soul_netherrack");

    public static RegistryKey<ConfiguredFeature<?, ?>> DIRTY_SAND_CONFIGURED_KEY = registerConfiguredKey("dirty_sand");
    public static RegistryKey<PlacedFeature> DIRTY_SAND_PLACED_KEY = registerPlacedKey("dirty_sand");

    private static void configureOres(){
        registerConfiguredFeature(ModOreConfiguredFeatures.PURPUR_COBBLESTONE_CONFIGURED_FEATURE, PURPUR_COBBLESTONE_CONFIGURED_KEY);
        registerConfiguredFeature(ModOreConfiguredFeatures.SOUL_NETHERRACK_CONFIGURED_FEATURE, SOUL_NETHERRACK_CONFIGURED_KEY);
        registerConfiguredFeature(ModOreConfiguredFeatures.DIRTY_SAND_CONFIGURED_FEATURE, DIRTY_SAND_CONFIGURED_KEY);

    }

    private static void placeOres(){
        registerPlacedFeature(ModOreConfiguredFeatures.PURPUR_COBBLESTONE_PLACED_FEATURE, PURPUR_COBBLESTONE_PLACED_KEY);
        registerPlacedFeature(ModOreConfiguredFeatures.SOUL_NETHERRACK_PLACED_FEATURE, SOUL_NETHERRACK_PLACED_KEY);
        registerPlacedFeature(ModOreConfiguredFeatures.DIRTY_SAND_PLACED_FEATURE, DIRTY_SAND_PLACED_KEY);
    }

    private static void addOresToBiomes(){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, PURPUR_COBBLESTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, SOUL_NETHERRACK_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.UNDERGROUND_ORES, DIRTY_SAND_PLACED_KEY);
    }

    public static void generateOres(){
        configureOres();
        placeOres();
        addOresToBiomes();
    }



}
