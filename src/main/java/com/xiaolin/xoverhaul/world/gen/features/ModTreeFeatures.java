package com.xiaolin.xoverhaul.world.gen.features;

import com.xiaolin.xoverhaul.world.gen.treedecorator.TreeFungusTreeDecorator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModTreeFeatures extends com.xiaolin.xiaolib.world.gen.features.ModTreeFeatures {

    public static final TreeFungusTreeDecorator TREE_FUNGUS = new TreeFungusTreeDecorator(1f);

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_TREE_FUNGUS_CONFIGURED_FEATURE =
            configureTree("birch_tree_fungus_configured_feature",
                    birch().decorators(List.of(TREE_FUNGUS)));

    public static final RegistryEntry<PlacedFeature> BIRCH_TREE_FUNGUS_CHECKED_PLACED_FEATURE =
            checkTree("birch_tree_fungus_checked_placed_feature",
                    BIRCH_TREE_FUNGUS_CONFIGURED_FEATURE, Blocks.BIRCH_SAPLING);

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BIRCH_TREE_FUNGUS_SPAWNED_CONFIGURED_FEATURE =
            configureTreeSpawn("birch_tree_fungus_spawned_configured_feature",
                    BIRCH_TREE_FUNGUS_CHECKED_PLACED_FEATURE, 0.5f);

    public static final RegistryEntry<PlacedFeature> BIRCH_TREE_FUNGUS_SPAWNED_PLACED_FEATURE =
            placeTree("birch_tree_fungus_spawned_placed_feature",
                    BIRCH_TREE_FUNGUS_SPAWNED_CONFIGURED_FEATURE,
                    1, 0.5f, 1);





}
