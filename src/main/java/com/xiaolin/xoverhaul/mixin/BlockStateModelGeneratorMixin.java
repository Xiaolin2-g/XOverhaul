package com.xiaolin.xoverhaul.mixin;


import com.google.gson.JsonElement;
import com.xiaolin.xoverhaul.util.BlockStateModelGeneratorInterface;
import net.minecraft.block.Block;
import net.minecraft.data.client.model.*;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Mixin(BlockStateModelGenerator.class)
public abstract class BlockStateModelGeneratorMixin implements BlockStateModelGeneratorInterface {

   @Shadow @Final Consumer<BlockStateSupplier> blockStateCollector;
   @Shadow @Final BiConsumer<Identifier, Supplier<JsonElement>> modelCollector;

    public void registerSlab(Block baseBlock, Block slabBlock) {
        Identifier identifier = ModelIds.getBlockModelId(baseBlock);
        TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(baseBlock);
        Identifier identifier2 = Models.SLAB.upload(slabBlock, texturedModel.getTexture(), this.modelCollector);
        Identifier identifier3 = Models.SLAB_TOP.upload(slabBlock, texturedModel.getTexture(), this.modelCollector);
        this.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier2, identifier3, identifier));
    }
}
