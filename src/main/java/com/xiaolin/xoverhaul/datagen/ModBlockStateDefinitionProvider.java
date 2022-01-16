package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockStateDefinitionProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;

public class ModBlockStateDefinitionProvider extends FabricBlockStateDefinitionProvider {
    public ModBlockStateDefinitionProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDER_END_STONE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
