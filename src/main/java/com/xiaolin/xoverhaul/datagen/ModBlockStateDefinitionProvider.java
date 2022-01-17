package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.util.BlockStateModelGeneratorInterface;
import com.xiaolin.xoverhaul.util.GlobalsXOverhaul;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockStateDefinitionProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.*;

public class ModBlockStateDefinitionProvider extends FabricBlockStateDefinitionProvider {
    public ModBlockStateDefinitionProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateCubes(blockStateModelGenerator);
        generateSlabs(blockStateModelGenerator);
        generateStairs(blockStateModelGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    private void generateCubes(BlockStateModelGenerator blockStateModelGenerator) {

        for (int i = 0; i < GlobalsXOverhaul.BLOCKS.length; i++) {
            blockStateModelGenerator.registerSimpleCubeAll(GlobalsXOverhaul.BLOCKS[i]);
            blockStateModelGenerator.registerParentedItemModel(GlobalsXOverhaul.BLOCKS[i],
                    ModelIds.getBlockModelId(GlobalsXOverhaul.BLOCKS[i]));
        }
    }

    private void generateSlabs(BlockStateModelGenerator blockStateModelGenerator) {

        for (int i = 0; i < GlobalsXOverhaul.SLABS.length; i++) {
            XOverhaul.LOGGER.info("DEBUG START");
            ((BlockStateModelGeneratorInterface)blockStateModelGenerator).registerSlab(GlobalsXOverhaul.SLABS_BASE[i],
                    GlobalsXOverhaul.SLABS[i]);

            XOverhaul.LOGGER.info("DEBUG MID");
            blockStateModelGenerator.registerParentedItemModel(GlobalsXOverhaul.SLABS[i],
                    ModelIds.getBlockModelId(GlobalsXOverhaul.SLABS[i]));
            XOverhaul.LOGGER.info("DEBUG END");
        }
    }

    private void generateStairs(BlockStateModelGenerator blockStateModelGenerator) {

        for (int i = 0; i < GlobalsXOverhaul.STAIRS.length; i++) {
            XOverhaul.LOGGER.info("DEBUG START");
            ((BlockStateModelGeneratorInterface)blockStateModelGenerator).registerStairs(GlobalsXOverhaul.STAIRS_BASE[i],
                    GlobalsXOverhaul.STAIRS[i]);

            XOverhaul.LOGGER.info("DEBUG MID");
            blockStateModelGenerator.registerParentedItemModel(GlobalsXOverhaul.STAIRS[i],
                    ModelIds.getBlockModelId(GlobalsXOverhaul.STAIRS[i]));

            XOverhaul.LOGGER.info("DEBUG END");
        }
    }


}
