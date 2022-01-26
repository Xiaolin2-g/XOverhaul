package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.util.GlobalsXOverhaul;
import com.xiaolin.xoverhaul.util.XOverhaulTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.GiftLootTableGenerator;
import net.minecraft.tag.BlockTags;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(XOverhaulTags.Blocks.TRIPWIRE_HOOKS).add(Blocks.TRIPWIRE_HOOK);

        mineableTags();
        soulSpeedBlocksTags();
        slabTags();
        stairsTags();
        enderFlowerPlaceablesTags();
        smallFlowersTags();
    }

    private void mineableTags(){
        pickaxeTags();
        axeTags();
        shovelTags();
        hoeTags();
    }

    private void addToPickaxeTag(Block block){
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
    }

    private void pickaxeTags(){
        addToPickaxeTag(ModBlocks.CHARRED_BONE_BLOCK);
        addToPickaxeTag(ModBlocks.PURPUR_COBBLESTONE);
        addToPickaxeTag(ModBlocks.WHITE_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.ORANGE_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.MAGENTA_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.YELLOW_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.LIME_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.PINK_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.GRAY_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.CYAN_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.PURPLE_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.BLUE_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.BROWN_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.GREEN_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.RED_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.BLACK_CONCRETE_SLAB);
        addToPickaxeTag(ModBlocks.WHITE_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.ORANGE_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.YELLOW_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.LIME_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.PINK_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.GRAY_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.CYAN_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.PURPLE_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.BLUE_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.BROWN_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.GREEN_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.RED_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.BLACK_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.SOUL_NETHERRACK);
        addToPickaxeTag(ModBlocks.SOUL_NETHER_BRICKS);
        addToPickaxeTag(ModBlocks.ENDER_END_STONE);


    }

    private void axeTags(){

    }

    private void addToShovelTag(Block block){
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
    }

    private void shovelTags(){
        addToShovelTag(ModBlocks.DIRTY_SAND);
        addToShovelTag(ModBlocks.DIRT_SLAB);
    }

    private void addToHoeTag(Block block){
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).add(block);
    }

    private void hoeTags(){
        addToHoeTag(ModBlocks.ROTTEN_FLESH_BLOCK);
    }

    private void addToSoulSpeedBlocksTag(Block block){
        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS).add(block);
    }

    private void soulSpeedBlocksTags(){
        addToSoulSpeedBlocksTag(ModBlocks.SOUL_NETHERRACK);
        addToSoulSpeedBlocksTag(ModBlocks.SOUL_NETHER_BRICKS);
    }

    private void needsToolTags(){

    }

    private void addToNeedsStoneToolTag(Block block){
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
    }

    private void addToNeedsIronToolTag(Block block){
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(block);
    }

    private void addToNeedsDiamondToolTag(Block block){
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(block);
    }

    private void addToSlabsTag(Block block){
        getOrCreateTagBuilder(BlockTags.SLABS).add(block);
    }

    private void slabTags(){
        for(Block slab : GlobalsXOverhaul.SLABS){
            addToSlabsTag(slab);
        }
    }

    private void addToStairsTag(Block block){
        getOrCreateTagBuilder(BlockTags.STAIRS).add(block);
    }

    private void stairsTags(){
        for(Block stairs : GlobalsXOverhaul.STAIRS){
            addToStairsTag(stairs);
        }
    }

    private void addToEnderFlowerPlaceablesTag(Block block){
        getOrCreateTagBuilder(XOverhaulTags.Blocks.ENDER_FLOWER_PLACEABLES).add(block);
    }

    private void enderFlowerPlaceablesTags(){
        addToEnderFlowerPlaceablesTag(Blocks.END_STONE);
        addToEnderFlowerPlaceablesTag(ModBlocks.PURPUR_COBBLESTONE);
    }

    private void addToSmallFlowersTag(Block block){
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS).add(block);
    }

    private void smallFlowersTags(){
        addToSmallFlowersTag(ModBlocks.ENDER_FLOWER);
        addToSmallFlowersTag(ModBlocks.MAGENTA_TULIP);
        addToSmallFlowersTag(ModBlocks.LIGHT_BLUE_TULIP);
        addToSmallFlowersTag(ModBlocks.YELLOW_TULIP);
        addToSmallFlowersTag(ModBlocks.LIME_TULIP);
        addToSmallFlowersTag(ModBlocks.GRAY_TULIP);
        addToSmallFlowersTag(ModBlocks.LIGHT_GRAY_TULIP);
        addToSmallFlowersTag(ModBlocks.CYAN_TULIP);
        addToSmallFlowersTag(ModBlocks.PURPLE_TULIP);
        addToSmallFlowersTag(ModBlocks.BLUE_TULIP);
        addToSmallFlowersTag(ModBlocks.BROWN_TULIP);
        addToSmallFlowersTag(ModBlocks.GREEN_TULIP);
        addToSmallFlowersTag(ModBlocks.BLACK_TULIP);
    }
}
