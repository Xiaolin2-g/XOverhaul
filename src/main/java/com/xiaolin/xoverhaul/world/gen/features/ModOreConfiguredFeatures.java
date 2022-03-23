package com.xiaolin.xoverhaul.world.gen.features;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.util.RuleTestGlobals;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;

import java.util.Arrays;

public class ModOreConfiguredFeatures {

    public static ConfiguredFeature<?,?> PURPUR_COBBLESTONE_CONFIGURED_FEATURE =
            configureOre(RuleTestGlobals.END_STONE, ModBlocks.PURPUR_COBBLESTONE, 50);


    public static PlacedFeature PURPUR_COBBLESTONE_PLACED_FEATURE =
            placeOre(PURPUR_COBBLESTONE_CONFIGURED_FEATURE, 2, YOffset.fixed(50), YOffset.fixed(100));



    public static ConfiguredFeature<?,?> SOUL_NETHERRACK_CONFIGURED_FEATURE =
            configureOre(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.SOUL_NETHERRACK, 64);


    public static PlacedFeature SOUL_NETHERRACK_PLACED_FEATURE =
            placeOre(SOUL_NETHERRACK_CONFIGURED_FEATURE, 4, YOffset.getBottom(), YOffset.fixed(128));



    public static ConfiguredFeature<?,?> DIRTY_SAND_CONFIGURED_FEATURE =
            configureOre(RuleTestGlobals.SAND, ModBlocks.DIRTY_SAND, 10);

    public static PlacedFeature DIRTY_SAND_PLACED_FEATURE =
            placeOre(DIRTY_SAND_CONFIGURED_FEATURE, 1, YOffset.fixed(62), YOffset.fixed(65));




    public static ConfiguredFeature<?, ?> configureOre(RuleTest ruleTest, Block block, int veinSize){
        return new ConfiguredFeature(
                Feature.ORE, new OreFeatureConfig(
                ruleTest,
                block.getDefaultState(),
                veinSize)); // vein size
    }


    public static PlacedFeature placeOre(ConfiguredFeature<?, ?> configuredFeature, int veinsPerChunk,
                                         YOffset bottomYLevel, YOffset topYLevel){
        return new PlacedFeature(
                RegistryEntry.of(configuredFeature),
                Arrays.asList(
                        CountPlacementModifier.of(veinsPerChunk), // number of veins per chunk
                        SquarePlacementModifier.of(), // spreading horizontally
                        HeightRangePlacementModifier.uniform(bottomYLevel, topYLevel))); // bottom Y level, top Y level
    }




}