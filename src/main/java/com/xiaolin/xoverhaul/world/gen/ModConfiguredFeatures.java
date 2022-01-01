package com.xiaolin.xoverhaul.world.gen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.util.Var;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModConfiguredFeatures {



    public static ConfiguredFeature<?,?> PURPUR_COBBLESTONE_CONFIGURED_FEATURE =
            Feature.ORE.configure(new OreFeatureConfig(
                    Var.END_STONE,
                    ModBlocks.PURPUR_COBBLESTONE.getDefaultState(),
                    50)); // vein size

    public static PlacedFeature PURPUR_COBBLESTONE_PLACED_FEATURE =
            PURPUR_COBBLESTONE_CONFIGURED_FEATURE.withPlacement(
                    CountPlacementModifier.of(2), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.fixed(50), YOffset.fixed(100))); // bottom Y level, top Y level





}
