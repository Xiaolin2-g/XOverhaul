package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.block.ModPlants;
import com.xiaolin.xoverhaul.block.ModSlabs;
import com.xiaolin.xoverhaul.block.ModStairs;
import com.xiaolin.xoverhaul.util.DatagenGlobals;
import com.xiaolin.xoverhaul.util.XOverhaulTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(XOverhaulTags.Blocks.TRIPWIRE_HOOKS).add(Blocks.TRIPWIRE_HOOK);

        mineableTagged();
        soulSpeedBlockTagged();
        slabTagged();
        stairTagged();
        wallTagged();
        enderFlowerPlaceableTagged();
        smallFlowerTagged();
        soulFireBaseTagged();
        infiniburnTagged();
    }

    private void mineableTagged(){
        pickaxeTagged();
        axeTagged();
        shovelTagged();
        hoeTagged();
    }

    private void addToPickaxeTag(Block block){
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
    }

    private void pickaxeTagged(){
        addToPickaxeTag(Blocks.HONEYCOMB_BLOCK);

        addToPickaxeTag(ModBlocks.CHARRED_BONE_BLOCK);
        addToPickaxeTag(ModBlocks.PURPUR_COBBLESTONE);
        addToPickaxeTag(ModSlabs.WHITE_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.ORANGE_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.MAGENTA_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.LIGHT_BLUE_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.YELLOW_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.LIME_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.PINK_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.GRAY_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.LIGHT_GRAY_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.CYAN_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.PURPLE_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.BLUE_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.BROWN_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.GREEN_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.RED_CONCRETE_SLAB);
        addToPickaxeTag(ModSlabs.BLACK_CONCRETE_SLAB);
        addToPickaxeTag(ModStairs.WHITE_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.ORANGE_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.MAGENTA_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.LIGHT_BLUE_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.YELLOW_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.LIME_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.PINK_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.GRAY_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.LIGHT_GRAY_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.CYAN_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.PURPLE_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.BLUE_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.BROWN_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.GREEN_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.RED_CONCRETE_STAIRS);
        addToPickaxeTag(ModStairs.BLACK_CONCRETE_STAIRS);
        addToPickaxeTag(ModBlocks.SOUL_NETHERRACK);
        addToPickaxeTag(ModBlocks.SOUL_NETHER_BRICKS);
        addToPickaxeTag(ModBlocks.ENDER_END_STONE);


    }

    private void axeTagged(){
        addToAxeTag(ModBlocks.WOODEN_CRATE);
    }

    private void addToAxeTag(Block block){
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
    }

    private void addToShovelTag(Block block){
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
    }

    private void shovelTagged(){
        addToShovelTag(ModBlocks.DIRTY_SAND);
        addToShovelTag(ModSlabs.DIRT_SLAB);
    }

    private void addToHoeTag(Block block){
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).add(block);
    }

    private void hoeTagged(){
        addToHoeTag(ModBlocks.ROTTEN_FLESH_BLOCK);
    }

    private void addToSoulSpeedBlocksTag(Block block){
        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS).add(block);
    }

    private void soulSpeedBlockTagged(){
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

    private void slabTagged(){
        for(Block slab : DatagenGlobals.SLABS.values()){
            addToSlabsTag(slab);
        }
    }

    private void addToStairsTag(Block block){
        getOrCreateTagBuilder(BlockTags.STAIRS).add(block);
    }

    private void stairTagged(){
        for(Block stairs : DatagenGlobals.STAIRS.values()){
            addToStairsTag(stairs);
        }
    }

    private void addToWallsTag(Block block){
        getOrCreateTagBuilder(BlockTags.WALLS).add(block);
    }

    private void wallTagged(){
        for(Block walls : DatagenGlobals.WALLS.values()){
            addToWallsTag(walls);
        }
    }

    private void addToEnderFlowerPlaceablesTag(Block block){
        getOrCreateTagBuilder(XOverhaulTags.Blocks.ENDER_FLOWER_PLACEABLES).add(block);
    }

    private void enderFlowerPlaceableTagged(){
        addToEnderFlowerPlaceablesTag(Blocks.END_STONE);
        addToEnderFlowerPlaceablesTag(ModBlocks.PURPUR_COBBLESTONE);
    }

    private void addToSmallFlowersTag(Block block){
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS).add(block);
    }

    private void smallFlowerTagged(){
        addToSmallFlowersTag(ModPlants.ENDER_FLOWER);
        addToSmallFlowersTag(ModPlants.MAGENTA_TULIP);
        addToSmallFlowersTag(ModPlants.LIGHT_BLUE_TULIP);
        addToSmallFlowersTag(ModPlants.YELLOW_TULIP);
        addToSmallFlowersTag(ModPlants.LIME_TULIP);
        addToSmallFlowersTag(ModPlants.GRAY_TULIP);
        addToSmallFlowersTag(ModPlants.LIGHT_GRAY_TULIP);
        addToSmallFlowersTag(ModPlants.CYAN_TULIP);
        addToSmallFlowersTag(ModPlants.PURPLE_TULIP);
        addToSmallFlowersTag(ModPlants.BLUE_TULIP);
        addToSmallFlowersTag(ModPlants.BROWN_TULIP);
        addToSmallFlowersTag(ModPlants.GREEN_TULIP);
        addToSmallFlowersTag(ModPlants.BLACK_TULIP);
    }

    private void addToSoulFireBaseTag(Block block){
        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS).add(block);
    }

    private void soulFireBaseTagged(){
        addToSoulFireBaseTag(ModBlocks.SOUL_NETHERRACK);
        addToSoulFireBaseTag(ModBlocks.SOUL_NETHER_BRICKS);
    }

    private void addToInfiniburnTag(Block block){
        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD).add(block);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_NETHER).add(block);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_END).add(block);
    }

    private void infiniburnTagged(){
        addToInfiniburnTag(ModBlocks.SOUL_NETHERRACK);
    }

}
