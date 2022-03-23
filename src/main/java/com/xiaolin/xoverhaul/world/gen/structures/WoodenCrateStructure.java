/*package com.xiaolin.xoverhaul.world.gen.structures;

import com.mojang.serialization.Codec;
import net.minecraft.structure.*;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

public class WoodenCrateStructure extends StructureFeature<DefaultFeatureConfig> {
    public WoodenCrateStructure(Codec<DefaultFeatureConfig> configCodec, StructureGeneratorFactory<DefaultFeatureConfig> piecesGenerator) {
        super(configCodec, piecesGenerator);
    }


    private static void addPieces(StructurePiecesCollector collector, StructurePiecesGenerator.Context<DefaultFeatureConfig> context) {
        BlockPos blockPos = new BlockPos(context.chunkPos().getStartX(), 90, context.chunkPos().getStartZ());
        BlockRotation blockRotation = BlockRotation.random(context.random());
        WoodenCrateGenerator.addPieces(context.structureManager(), blockPos, blockRotation, this.chil);
    }
}*/