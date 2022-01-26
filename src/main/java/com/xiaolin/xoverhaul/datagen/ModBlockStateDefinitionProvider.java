package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.item.ModArmor;
import com.xiaolin.xoverhaul.util.BlockStateModelGeneratorInterface;
import com.xiaolin.xoverhaul.util.GlobalsXOverhaul;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockStateDefinitionProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.*;
import net.minecraft.item.Item;

public class ModBlockStateDefinitionProvider extends FabricBlockStateDefinitionProvider {
    public ModBlockStateDefinitionProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateCubes(blockStateModelGenerator);
        generateSlabs(blockStateModelGenerator);
        generateStairs(blockStateModelGenerator);
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
        for (Item item : GlobalsXOverhaul.ITEMS) {

            registerModelGenerated(itemModelGenerator, item);
        }
    }

    private void generateArmors(ItemModelGenerator itemModelGenerator){
        XOverhaul.LOGGER.info("Armors: ");
        registerModelGenerated(itemModelGenerator, ModArmor.WOODSTONE_HELMET);
        registerModelGenerated(itemModelGenerator, ModArmor.WOODSTONE_CHESTPLATE);
        registerModelGenerated(itemModelGenerator, ModArmor.WOODSTONE_LEGGINGS);
        registerModelGenerated(itemModelGenerator, ModArmor.WOODSTONE_BOOTS);
        registerModelGenerated(itemModelGenerator, ModArmor.MONSTER_HELMET);
        registerModelGenerated(itemModelGenerator, ModArmor.MONSTER_CHESTPLATE);
        registerModelGenerated(itemModelGenerator, ModArmor.MONSTER_LEGGINGS);
        registerModelGenerated(itemModelGenerator, ModArmor.MONSTER_BOOTS);
    }

    private void generateTools(ItemModelGenerator itemModelGenerator){
        for (Item item : GlobalsXOverhaul.TOOLS) {

            registerModelGenerated(itemModelGenerator, item);
        }
    }

    private void generateFoods(ItemModelGenerator itemModelGenerator){
        for (Item food : GlobalsXOverhaul.FOODS) {

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

        for (Block block : GlobalsXOverhaul.BLOCKS) {
            blockStateModelGenerator.registerSimpleCubeAll(block);
            blockStateModelGenerator.registerParentedItemModel(block,
                    ModelIds.getBlockModelId(block));
        }
    }

    private void generateSlabs(BlockStateModelGenerator blockStateModelGenerator) {

        for (int i = 0; i < GlobalsXOverhaul.SLABS.length; i++) {

            ((BlockStateModelGeneratorInterface)blockStateModelGenerator).registerSlab(GlobalsXOverhaul.SLABS_BASE[i],
                    GlobalsXOverhaul.SLABS[i]);

            blockStateModelGenerator.registerParentedItemModel(GlobalsXOverhaul.SLABS[i],
                    ModelIds.getBlockModelId(GlobalsXOverhaul.SLABS[i]));
        }
    }

    private void generateStairs(BlockStateModelGenerator blockStateModelGenerator) {

        for (int i = 0; i < GlobalsXOverhaul.STAIRS.length; i++) {

            ((BlockStateModelGeneratorInterface)blockStateModelGenerator).registerStairs(GlobalsXOverhaul.STAIRS_BASE[i],
                    GlobalsXOverhaul.STAIRS[i]);

            blockStateModelGenerator.registerParentedItemModel(GlobalsXOverhaul.STAIRS[i],
                    ModelIds.getBlockModelId(GlobalsXOverhaul.STAIRS[i]));

        }
    }

    private void generateCross(BlockStateModelGenerator blockStateModelGenerator) {

        for (Block block : GlobalsXOverhaul.CROSS) {

            blockStateModelGenerator.registerTintableCross(block, BlockStateModelGenerator.TintType.NOT_TINTED);

        }
    }

    private void generateAxisRotated(BlockStateModelGenerator blockStateModelGenerator) {

        for (Block block : GlobalsXOverhaul.AXIS_ROTATED) {

            blockStateModelGenerator.registerAxisRotated(block, TexturedModel.CUBE_COLUMN);
            blockStateModelGenerator.registerParentedItemModel(block,
                    ModelIds.getBlockModelId(block));
        }
    }

}
