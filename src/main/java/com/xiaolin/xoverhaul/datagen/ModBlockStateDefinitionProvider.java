package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.init.ModPlants;
import com.xiaolin.xoverhaul.init.ModSlabs;
import com.xiaolin.xoverhaul.init.ModStairs;
import com.xiaolin.xoverhaul.init.ModWalls;
import com.xiaolin.xoverhaul.util.interfaces.BlockStateModelGeneratorInterface;
import com.xiaolin.xoverhaul.util.DatagenGlobals;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;

import java.util.Map;

public class ModBlockStateDefinitionProvider extends FabricModelProvider {
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

            if(slabs.getValue() != ModSlabs.BASALT_SLAB)
            {

                ((BlockStateModelGeneratorInterface)blockStateModelGenerator)
                        .registerSlab(slabs.getKey(), slabs.getValue());

                blockStateModelGenerator.registerParentedItemModel(slabs.getValue(),
                        ModelIds.getBlockModelId(slabs.getValue()));
            }
        }
    }



    private void generateStairs(BlockStateModelGenerator blockStateModelGenerator) {

        for (Map.Entry<Block, Block> stairs : DatagenGlobals.STAIRS.entrySet()) {

            if(stairs.getValue() != ModStairs.BASALT_STAIRS)
            {

                ((BlockStateModelGeneratorInterface)blockStateModelGenerator)
                        .registerStairs(stairs.getKey(), stairs.getValue());

                blockStateModelGenerator
                        .registerParentedItemModel(stairs.getValue(),
                                ModelIds.getBlockModelId(stairs.getValue()));
            }
        }
    }


    private void generateWalls(BlockStateModelGenerator blockStateModelGenerator) {

        for (Map.Entry<Block, Block> wall : DatagenGlobals.WALLS.entrySet()) {

            if(
                    wall.getValue() != ModWalls.BASALT_WALL &&
                    wall.getValue() != ModWalls.SMOOTH_SANDSTONE_WALL &&
                    wall.getValue() != ModWalls.SMOOTH_RED_SANDSTONE_WALL &&
                    wall.getValue() != ModWalls.QUARTZ_BLOCK_WALL &&
                    wall.getValue() != ModWalls.SMOOTH_QUARTZ_WALL

            )
            {

                ((BlockStateModelGeneratorInterface)blockStateModelGenerator)
                        .registerWalls(wall.getKey(), wall.getValue());
            }
        }
    }


    private void generateCross(BlockStateModelGenerator blockStateModelGenerator) {

        for (Block block : DatagenGlobals.CROSS) {

            if(block != ModPlants.BIRCH_FLOWER){

                blockStateModelGenerator.registerTintableCross(block, BlockStateModelGenerator.TintType.NOT_TINTED);

            }
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
