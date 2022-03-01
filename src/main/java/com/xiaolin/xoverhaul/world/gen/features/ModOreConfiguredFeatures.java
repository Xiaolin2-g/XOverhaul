package com.xiaolin.xoverhaul.world.gen.features;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.util.RuleTestGlobals;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModOreConfiguredFeatures {

    public static ConfiguredFeature<?,?> PURPUR_COBBLESTONE_CONFIGURED_FEATURE =
            Feature.ORE.configure(new OreFeatureConfig(
                    RuleTestGlobals.END_STONE,
                    ModBlocks.PURPUR_COBBLESTONE.getDefaultState(),
                    50)); // vein size


    public static PlacedFeature PURPUR_COBBLESTONE_PLACED_FEATURE =
            PURPUR_COBBLESTONE_CONFIGURED_FEATURE.withPlacement(
                    CountPlacementModifier.of(2), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.fixed(50), YOffset.fixed(100))); // bottom Y level, top Y level

    public static ConfiguredFeature<?,?> SOUL_NETHERRACK_CONFIGURED_FEATURE =
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER,
                    ModBlocks.SOUL_NETHERRACK.getDefaultState(),
                    64)); // vein size

    public static PlacedFeature SOUL_NETHERRACK_PLACED_FEATURE =
            SOUL_NETHERRACK_CONFIGURED_FEATURE.withPlacement(
                    CountPlacementModifier.of(4), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(128))); // bottom Y level, top Y level

    public static ConfiguredFeature<?,?> DIRTY_SAND_CONFIGURED_FEATURE =
            Feature.ORE.configure(new OreFeatureConfig(
                    RuleTestGlobals.SAND,
                    ModBlocks.DIRTY_SAND.getDefaultState(),
                    10)); // vein size

    public static PlacedFeature DIRTY_SAND_PLACED_FEATURE =
            DIRTY_SAND_CONFIGURED_FEATURE.withPlacement(
                    CountPlacementModifier.of(1), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(65))); // bottom Y level, top Y level


}