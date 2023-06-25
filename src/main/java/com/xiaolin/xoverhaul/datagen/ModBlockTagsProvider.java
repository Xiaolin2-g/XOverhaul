package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xiaolib.util.ModTags;
import com.xiaolin.xoverhaul.init.ModBlocks;
import com.xiaolin.xoverhaul.init.ModPlants;
import com.xiaolin.xoverhaul.init.ModSlabs;
import com.xiaolin.xoverhaul.util.DatagenGlobals;
import com.xiaolin.xoverhaul.util.XOverhaulTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ModBlockTagsProvider extends com.xiaolin.xiaolib.datagen.ModBlockTagsProvider {
    public ModBlockTagsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ModTags.Blocks.TRIPWIRE_HOOKS).add(Blocks.TRIPWIRE_HOOK);

        mineableTagged();
        soulSpeedBlockTagged();
        slabTagged();
        stairTagged();
        wallTagged();
        enderFlowerPlaceableTagged();
        smallFlowerTagged();
        soulFireBaseTagged();
        infiniburnTagged();
        leavesTagged();
    }

    private void mineableTagged(){
        pickaxeTagged();
        axeTagged();
        shovelTagged();
        hoeTagged();
    }



    private void pickaxeTagged(){

        for (Block block : DatagenGlobals.SLABS.values()){
            if(block != ModSlabs.DIRT_SLAB){
                addToPickaxeTag(block);
            }
        }

        for (Block block : DatagenGlobals.STAIRS.values()){
                addToPickaxeTag(block);
        }


        addToPickaxeTag(Blocks.HONEYCOMB_BLOCK);
        glassPickaxeTagged();
        addToPickaxeTag(Blocks.BEACON);
        headsPickaxeTagged();

        addToPickaxeTag(ModBlocks.CHARRED_BONE_BLOCK);
        addToPickaxeTag(ModBlocks.PURPUR_COBBLESTONE);
        addToPickaxeTag(ModBlocks.SOUL_NETHERRACK);
        addToPickaxeTag(ModBlocks.SOUL_NETHER_BRICKS);
        addToPickaxeTag(ModBlocks.ENDER_END_STONE);
        addToPickaxeTag(ModBlocks.GLAZED_TERRACOTTA);

    }

    private void glassPickaxeTagged(){
        addToPickaxeTag(Blocks.GLASS);
        addToPickaxeTag(Blocks.WHITE_STAINED_GLASS);
        addToPickaxeTag(Blocks.ORANGE_STAINED_GLASS);
        addToPickaxeTag(Blocks.MAGENTA_STAINED_GLASS);
        addToPickaxeTag(Blocks.LIGHT_BLUE_STAINED_GLASS);
        addToPickaxeTag(Blocks.YELLOW_STAINED_GLASS);
        addToPickaxeTag(Blocks.LIME_STAINED_GLASS);
        addToPickaxeTag(Blocks.PINK_STAINED_GLASS);
        addToPickaxeTag(Blocks.GRAY_STAINED_GLASS);
        addToPickaxeTag(Blocks.LIGHT_GRAY_STAINED_GLASS);
        addToPickaxeTag(Blocks.CYAN_STAINED_GLASS);
        addToPickaxeTag(Blocks.PURPLE_STAINED_GLASS);
        addToPickaxeTag(Blocks.BLUE_STAINED_GLASS);
        addToPickaxeTag(Blocks.BROWN_STAINED_GLASS);
        addToPickaxeTag(Blocks.GREEN_STAINED_GLASS);
        addToPickaxeTag(Blocks.RED_STAINED_GLASS);
        addToPickaxeTag(Blocks.BLACK_STAINED_GLASS);
        addToPickaxeTag(Blocks.GLASS_PANE);
        addToPickaxeTag(Blocks.WHITE_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.ORANGE_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.MAGENTA_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.YELLOW_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.LIME_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.PINK_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.GRAY_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.CYAN_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.PURPLE_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.BLUE_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.BROWN_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.GREEN_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.RED_STAINED_GLASS_PANE);
        addToPickaxeTag(Blocks.BLACK_STAINED_GLASS_PANE);
    }

    private void headsPickaxeTagged(){
        addToPickaxeTag(Blocks.CREEPER_HEAD);
        addToPickaxeTag(Blocks.CREEPER_WALL_HEAD);
        addToPickaxeTag(Blocks.DRAGON_HEAD);
        addToPickaxeTag(Blocks.DRAGON_WALL_HEAD);
        addToPickaxeTag(Blocks.PLAYER_HEAD);
        addToPickaxeTag(Blocks.PLAYER_WALL_HEAD);
        addToPickaxeTag(Blocks.ZOMBIE_HEAD);
        addToPickaxeTag(Blocks.ZOMBIE_WALL_HEAD);
    }

    private void axeTagged(){
        addToAxeTag(ModBlocks.WOODEN_CRATE);
        bedsToAxeTag();
    }


    private void bedsToAxeTag(){
        addToAxeTag(Blocks.WHITE_BED);
        addToAxeTag(Blocks.ORANGE_BED);
        addToAxeTag(Blocks.MAGENTA_BED);
        addToAxeTag(Blocks.LIGHT_BLUE_BED);
        addToAxeTag(Blocks.YELLOW_BED);
        addToAxeTag(Blocks.LIME_BED);
        addToAxeTag(Blocks.PINK_BED);
        addToAxeTag(Blocks.GRAY_BED);
        addToAxeTag(Blocks.LIGHT_GRAY_BED);
        addToAxeTag(Blocks.CYAN_BED);
        addToAxeTag(Blocks.PURPLE_BED);
        addToAxeTag(Blocks.BLUE_BED);
        addToAxeTag(Blocks.BROWN_BED);
        addToAxeTag(Blocks.GREEN_BED);
        addToAxeTag(Blocks.RED_BED);
        addToAxeTag(Blocks.BLACK_BED);
    }


    private void shovelTagged(){
        addToShovelTag(ModBlocks.DIRTY_SAND);
        addToShovelTag(ModSlabs.DIRT_SLAB);
    }



    private void hoeTagged(){
        addToHoeTag(ModBlocks.ROTTEN_FLESH_BLOCK);
    }



    private void soulSpeedBlockTagged(){
        addToSoulSpeedBlocksTag(ModBlocks.SOUL_NETHERRACK);
        addToSoulSpeedBlocksTag(ModBlocks.SOUL_NETHER_BRICKS);
    }

    private void needsToolTags(){

    }


    private void slabTagged(){
        for(Block slab : DatagenGlobals.SLABS.values()){
            addToSlabsTag(slab);
        }
    }



    private void stairTagged(){
        for(Block stairs : DatagenGlobals.STAIRS.values()){
            addToStairsTag(stairs);
        }
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



    private void soulFireBaseTagged(){
        addToSoulFireBaseTag(ModBlocks.SOUL_NETHERRACK);
        addToSoulFireBaseTag(ModBlocks.SOUL_NETHER_BRICKS);
    }



    private void infiniburnTagged(){
        addToInfiniburnTag(ModBlocks.SOUL_NETHERRACK);
    }



    private void leavesTagged(){
        addToLeavesTag(Blocks.NETHER_WART_BLOCK);
        addToLeavesTag(Blocks.WARPED_WART_BLOCK);
    }

}
