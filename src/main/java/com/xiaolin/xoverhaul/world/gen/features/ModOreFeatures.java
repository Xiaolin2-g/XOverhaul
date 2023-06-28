package com.xiaolin.xoverhaul.world.gen.features;

import com.xiaolin.xiaolib.util.RuleTestGlobals;
import com.xiaolin.xoverhaul.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModOreFeatures extends com.xiaolin.xiaolib.world.gen.features.ModOreFeatures {

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PURPUR_COBBLESTONE_CONFIGURED_FEATURE =
            configureOre("purpur_cobblestone_configured_feature",
                    RuleTestGlobals.END_STONE,
                    ModBlocks.PURPUR_COBBLESTONE, 50);

    public static final RegistryEntry<PlacedFeature> PURPUR_COBBLESTONE_PLACED_FEATURE =
            placeOre("purpur_cobblestone_placed_feature",
                    PURPUR_COBBLESTONE_CONFIGURED_FEATURE,
                    2, YOffset.fixed(50), YOffset.fixed(100));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SOUL_NETHERRACK_CONFIGURED_FEATURE =
            configureOre("soul_netherrack_configured_feature",
                    OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.SOUL_NETHERRACK, 64);

    public static final RegistryEntry<PlacedFeature> SOUL_NETHERRACK_PLACED_FEATURE =
            placeOre("soul_netherrack_placed_feature",
                    SOUL_NETHERRACK_CONFIGURED_FEATURE,
                    4, YOffset.getBottom(), YOffset.fixed(128));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DIRTY_SAND_CONFIGURED_FEATURE =
            configureOre("dirty_sand_configured_feature",
                    RuleTestGlobals.SAND, ModBlocks.DIRTY_SAND, 10);

    public static final RegistryEntry<PlacedFeature> DIRTY_SAND_PLACED_FEATURE =
            placeOre("dirty_sand_configured_feature",
                    DIRTY_SAND_CONFIGURED_FEATURE,
                    1, YOffset.fixed(62), YOffset.fixed(65));

}