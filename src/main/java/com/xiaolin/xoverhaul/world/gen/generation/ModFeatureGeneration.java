package com.xiaolin.xoverhaul.world.gen.generation;

import com.xiaolin.xoverhaul.XOverhaul;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModFeatureGeneration {

    public static RegistryKey<ConfiguredFeature<?,?>> registerConfiguredKey(String name){
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(XOverhaul.MOD_ID, name));
    }

    public static RegistryKey<PlacedFeature> registerPlacedKey(String name){
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(XOverhaul.MOD_ID, name));
    }

    public static ConfiguredFeature<?, ?> registerConfiguredFeature(ConfiguredFeature<?, ?> configuredFeature, RegistryKey<ConfiguredFeature<?, ?>> key){
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

    public static PlacedFeature registerPlacedFeature(PlacedFeature placedFeature, RegistryKey<PlacedFeature> key){
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, key.getValue(), placedFeature);
    }

    public static void registerConfiguredFeatures(){
        XOverhaul.LOGGER.info("Registering ModConfiguredFeatures for " + XOverhaul.MOD_ID);
    }
}
