package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.item.ModArmor;
import com.xiaolin.xoverhaul.util.interfaces.BlockStateModelGeneratorInterface;
import com.xiaolin.xoverhaul.util.DatagenGlobals;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockStateDefinitionProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;

import java.util.Map;

public class ModBlockStateDefinitionProvider extends FabricBlockStateDefinitionProvider {
    public ModBlockStateDefinitionProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateCubes(blockStateModelGenerator);
        generateSlabs(blockStateModelGenerator);
        generateStairs(blockStateModelGenerator);
        generateWalls(blockStateModelGenerator);
        generateCross(blockStateModelGenerator);
        generateAxisRotated(blockStateModelGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        generateItems(itemModelGenerator);
        generateArmors(itemModelGenerator);
        generateTools(itemModelGenerator);
        generateFoods(itemModelGenerator);
    }

    private void generateItems(ItemModelGenerator itemModelGenerator){
        for (Item item : DatagenGlobals.ITEMS) {

            registerModelGenerated(itemModelGenerator, item);
        }
    }

    private void generateArmors(ItemModelGenerator itemModelGenerator){
        XOverhaul.LOGGER.info("Armors: ");

        for (Item armor : DatagenGlobals.ARMORS) {

            registerModelGenerated(itemModelGenerator, armor);
        }
    }

    private void generateTools(ItemModelGenerator itemModelGenerator){
        for (Item tool : DatagenGlobals.TOOLS) {

            registerModelGenerated(itemModelGenerator, tool);
        }
    }

    private void generateFoods(ItemModelGenerator itemModelGenerator){
        for (Item food : DatagenGlobals.FOODS) {

            registerModelGenerated(itemModelGenerator, food);
        }
    }


    private void registerModelGenerated(ItemModelGenerator itemModelGenerator, Item item){
        itemModelGenerator.register(item, Models.GENERATED);
    }


    private void registerModelHandheld(ItemModelGenerator itemModelGenerator, Item item){
        itemModelGenerator.register(item, Models.HANDHELD);
    }

    private void generateCubes(BlockStateModelGenerator blockStateModelGenerator) {

        for (Block block : DatagenGlobals.BLOCKS) {
            blockStateModelGenerator.registerSimpleCubeAll(block);

            blockStateModelGenerator.registerParentedItemModel(block,
                    ModelIds.getBlockModelId(block));
        }
    }

    private void generateSlabs(BlockStateModelGenerator blockStateModelGenerator) {

        for (Map.Entry<Block, Block> slabs : DatagenGlobals.SLABS.entrySet()) {

            ((BlockStateModelGeneratorInterface)blockStateModelGenerator)
                    .registerSlab(slabs.getKey(), slabs.getValue());

            blockStateModelGenerator.registerParentedItemModel(slabs.getValue(),
                    ModelIds.getBlockModelId(slabs.getValue()));
        }
    }



    private void generateStairs(BlockStateModelGenerator blockStateModelGenerator) {

        for (Map.Entry<Block, Block> stairs : DatagenGlobals.STAIRS.entrySet()) {

            ((BlockStateModelGeneratorInterface)blockStateModelGenerator)
                    .registerStairs(stairs.getKey(), stairs.getValue());

            blockStateModelGenerator
                    .registerParentedItemModel(stairs.getValue(),
                    ModelIds.getBlockModelId(stairs.getValue()));

        }
    }


    private void generateWalls(BlockStateModelGenerator blockStateModelGenerator) {

        for (Map.Entry<Block, Block> wall : DatagenGlobals.WALLS.entrySet()) {

            ((BlockStateModelGeneratorInterface)blockStateModelGenerator)
                    .registerWalls(wall.getKey(), wall.getValue());

        }
    }


    private void generateCross(BlockStateModelGenerator blockStateModelGenerator) {

        for (Block block : DatagenGlobals.CROSS) {

            blockStateModelGenerator.registerTintableCross(block, BlockStateModelGenerator.TintType.NOT_TINTED);

        }
    }

    private void generateAxisRotated(BlockStateModelGenerator blockStateModelGenerator) {

        for (Block block : DatagenGlobals.AXIS_ROTATED) {

            blockStateModelGenerator.registerAxisRotated(block, TexturedModel.CUBE_COLUMN);
            blockStateModelGenerator.registerParentedItemModel(block,
                    ModelIds.getBlockModelId(block));
        }
    }

}
