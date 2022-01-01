package com.xiaolin.xoverhaul.world.gen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.util.Var;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import com.xiaolin.xoverhaul.world.gen.ModConfiguredFeatures;

public class ModOreGeneration {

    public static RegistryKey<ConfiguredFeature<?, ?>> PURPUR_COBBLESTONE_CONFIGURED_KEY = registerConfiguredKey("purpur_cobblestone");
    public static RegistryKey<PlacedFeature> PURPUR_COBBLESTONE_PLACED_KEY = registerPlacedKey("purpur_cobblestone");

    private static void configureOres(){
        registerConfiguredFeature(ModConfiguredFeatures.PURPUR_COBBLESTONE_CONFIGURED_FEATURE, PURPUR_COBBLESTONE_CONFIGURED_KEY);
    }

    private static void placeOres(){
        registerPlacedFeature(ModConfiguredFeatures.PURPUR_COBBLESTONE_PLACED_FEATURE, PURPUR_COBBLESTONE_PLACED_KEY);
    }

    private static void addOresToBiomes(){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, PURPUR_COBBLESTONE_PLACED_KEY);
    }

    public static void generateOres(){
        configureOres();
        placeOres();
        addOresToBiomes();
    }



    private static RegistryKey<ConfiguredFeature<?,?>> registerConfiguredKey(String name){
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(XOverhaul.MOD_ID, name));
    }

    private static RegistryKey<PlacedFeature> registerPlacedKey(String name){
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(XOverhaul.MOD_ID, name));
    }

    private static ConfiguredFeature<?, ?> registerConfiguredFeature(ConfiguredFeature<?, ?> configuredFeature, RegistryKey<ConfiguredFeature<?, ?>> key){
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

    private static PlacedFeature registerPlacedFeature(PlacedFeature placedFeature, RegistryKey<PlacedFeature> key){
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, key.getValue(), placedFeature);
    }

    public static void registerConfiguredFeatures(){
        XOverhaul.LOGGER.info("Registering ModConfiguredFeatures for " + XOverhaul.MOD_ID);
    }




}
