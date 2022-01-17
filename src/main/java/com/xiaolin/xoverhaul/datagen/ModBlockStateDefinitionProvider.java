package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.util.BlockStateModelGeneratorInterface;
import com.xiaolin.xoverhaul.util.GlobalsXOverhaul;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockStateDefinitionProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.SlabType;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class ModBlockStateDefinitionProvider extends FabricBlockStateDefinitionProvider {
    public ModBlockStateDefinitionProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateCubes(blockStateModelGenerator);
        generateSlabs(blockStateModelGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    private void generateCubes(BlockStateModelGenerator blockStateModelGenerator) {

        for (int i = 0; i < GlobalsXOverhaul.blocks.length; i++) {
            blockStateModelGenerator.registerSimpleCubeAll(GlobalsXOverhaul.blocks[i]);
            blockStateModelGenerator.registerParentedItemModel(GlobalsXOverhaul.blocks[i],
                    ModelIds.getBlockModelId(GlobalsXOverhaul.blocks[i]));
        }
    }

    private void generateSlabs(BlockStateModelGenerator blockStateModelGenerator) {

        for (int i = 0; i < GlobalsXOverhaul.slabs.length; i++) {
            XOverhaul.LOGGER.info("DEBUG START");
            ((BlockStateModelGeneratorInterface)blockStateModelGenerator).registerSlab(GlobalsXOverhaul.slabsBase[i],
                    GlobalsXOverhaul.slabs[i]);

            XOverhaul.LOGGER.info("DEBUG MID");
            blockStateModelGenerator.registerParentedItemModel(GlobalsXOverhaul.slabs[i],
                    ModelIds.getBlockModelId(GlobalsXOverhaul.slabs[i]));
            XOverhaul.LOGGER.info("DEBUG END");
        }
    }

    private void generateStairs(BlockStateModelGenerator blockStateModelGenerator) {
        Block[] slabs = {ModBlocks.BEDROCK_SLAB};
        Block[] slabsBase = {Blocks.BEDROCK};

        for (int i = 0; i < slabs.length; i++) {
            XOverhaul.LOGGER.info("DEBUG START");
            ((BlockStateModelGeneratorInterface)blockStateModelGenerator).registerSlab(slabsBase[i], slabs[i]);

            XOverhaul.LOGGER.info("DEBUG MID");
            blockStateModelGenerator.registerParentedItemModel(slabs[i], ModelIds.getBlockModelId(slabs[i]));

            XOverhaul.LOGGER.info("DEBUG END");
        }
    }


}
