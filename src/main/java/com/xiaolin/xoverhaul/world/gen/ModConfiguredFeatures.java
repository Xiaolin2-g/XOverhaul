package com.xiaolin.xoverhaul.world.gen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.util.Var;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

import java.text.RuleBasedCollator;

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

    public static ConfiguredFeature<?,?> SOUL_NETHERRACK_CONFIGURED_FEATURE =
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER,
                    ModBlocks.SOUL_NETHERRACK.getDefaultState(),
                    999)); // vein size

    public static PlacedFeature SOUL_NETHERRACK_PLACED_FEATURE =
            SOUL_NETHERRACK_CONFIGURED_FEATURE.withPlacement(
                    CountPlacementModifier.of(99), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(128))); // bottom Y level, top Y level


}
