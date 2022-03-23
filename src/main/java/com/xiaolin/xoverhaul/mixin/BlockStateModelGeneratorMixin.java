package com.xiaolin.xoverhaul.mixin;


import com.google.gson.JsonElement;
import com.xiaolin.xoverhaul.util.BlockStateModelGeneratorInterface;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Mixin(BlockStateModelGenerator.class)
public abstract class BlockStateModelGeneratorMixin implements BlockStateModelGeneratorInterface {

    @Shadow
    @Final
    Consumer<BlockStateSupplier> blockStateCollector;
    @Shadow
    @Final
    BiConsumer<Identifier, Supplier<JsonElement>> modelCollector;

    public void registerSlab(Block baseBlock, Block slabBlock) {
        Identifier identifier_full = ModelIds.getBlockModelId(baseBlock);
        TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(baseBlock);
        Identifier identifier_bottom = Models.SLAB.upload(slabBlock, texturedModel.getTextures(), this.modelCollector);
        Identifier identifier_top = Models.SLAB_TOP.upload(slabBlock, texturedModel.getTextures(), this.modelCollector);
        this.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier_bottom, identifier_top, identifier_full));
    }


    public void registerStairs(Block baseBlock, Block stairsBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(baseBlock);
        Identifier identifier_inner = Models.INNER_STAIRS.upload(stairsBlock, texturedModel.getTextures(), this.modelCollector);
        Identifier identifier_full = Models.STAIRS.upload(stairsBlock, texturedModel.getTextures(), this.modelCollector);
        Identifier identifier_outer = Models.OUTER_STAIRS.upload(stairsBlock, texturedModel.getTextures(), this.modelCollector);
        this.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(stairsBlock, identifier_inner, identifier_full, identifier_outer));
    }

}
