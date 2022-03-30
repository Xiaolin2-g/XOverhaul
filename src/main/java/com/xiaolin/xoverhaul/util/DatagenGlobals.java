package com.xiaolin.xoverhaul.util;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.block.ModPlants;
import com.xiaolin.xoverhaul.block.ModSlabs;
import com.xiaolin.xoverhaul.block.ModStairs;
import com.xiaolin.xoverhaul.item.ModFood;
import com.xiaolin.xoverhaul.item.ModItems;
import com.xiaolin.xoverhaul.item.ModSpawnEggs;
import com.xiaolin.xoverhaul.item.ModTools;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;

public class DatagenGlobals {


    public static final Block[] BLOCKS =
            {ModBlocks.DIRTY_SAND, ModBlocks.PURPUR_COBBLESTONE, ModBlocks.ROTTEN_FLESH_BLOCK,
                    ModBlocks.SOUL_NETHERRACK, ModBlocks.SOUL_NETHER_BRICKS, ModBlocks.ENDER_END_STONE,
                    ModBlocks.WOODEN_CRATE};

    public static final Block[] SLABS_BASE =
            {Blocks.WHITE_CONCRETE, Blocks.ORANGE_CONCRETE, Blocks.MAGENTA_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE,
                    Blocks.YELLOW_CONCRETE, Blocks.LIME_CONCRETE, Blocks.PINK_CONCRETE, Blocks.GRAY_CONCRETE,
                    Blocks.LIGHT_GRAY_CONCRETE, Blocks.CYAN_CONCRETE, Blocks.PURPLE_CONCRETE, Blocks.BLUE_CONCRETE,
                    Blocks.BROWN_CONCRETE, Blocks.GREEN_CONCRETE, Blocks.RED_CONCRETE, Blocks.BLACK_CONCRETE,
                    Blocks.DIRT, Blocks.BEDROCK};

    public static final Block[] SLABS =
            {ModSlabs.WHITE_CONCRETE_SLAB, ModSlabs.ORANGE_CONCRETE_SLAB, ModSlabs.MAGENTA_CONCRETE_SLAB,
                    ModSlabs.LIGHT_BLUE_CONCRETE_SLAB, ModSlabs.YELLOW_CONCRETE_SLAB, ModSlabs.LIME_CONCRETE_SLAB,
                    ModSlabs.PINK_CONCRETE_SLAB, ModSlabs.GRAY_CONCRETE_SLAB, ModSlabs.LIGHT_GRAY_CONCRETE_SLAB,
                    ModSlabs.CYAN_CONCRETE_SLAB, ModSlabs.PURPLE_CONCRETE_SLAB, ModSlabs.BLUE_CONCRETE_SLAB,
                    ModSlabs.BROWN_CONCRETE_SLAB, ModSlabs.GREEN_CONCRETE_SLAB, ModSlabs.RED_CONCRETE_SLAB,
                    ModSlabs.BLACK_CONCRETE_SLAB,
                    ModSlabs.DIRT_SLAB, ModSlabs.BEDROCK_SLAB};

    public static final Block[] STAIRS_BASE =
            {Blocks.WHITE_CONCRETE, Blocks.ORANGE_CONCRETE, Blocks.MAGENTA_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE,
                    Blocks.YELLOW_CONCRETE, Blocks.LIME_CONCRETE, Blocks.PINK_CONCRETE, Blocks.GRAY_CONCRETE,
                    Blocks.LIGHT_GRAY_CONCRETE, Blocks.CYAN_CONCRETE, Blocks.PURPLE_CONCRETE, Blocks.BLUE_CONCRETE,
                    Blocks.BROWN_CONCRETE, Blocks.GREEN_CONCRETE, Blocks.RED_CONCRETE, Blocks.BLACK_CONCRETE,
                    Blocks.BEDROCK};

    public static final Block[] STAIRS =
            {ModStairs.WHITE_CONCRETE_STAIRS, ModStairs.ORANGE_CONCRETE_STAIRS, ModStairs.MAGENTA_CONCRETE_STAIRS,
                    ModStairs.LIGHT_BLUE_CONCRETE_STAIRS, ModStairs.YELLOW_CONCRETE_STAIRS, ModStairs.LIME_CONCRETE_STAIRS,
                    ModStairs.PINK_CONCRETE_STAIRS, ModStairs.GRAY_CONCRETE_STAIRS, ModStairs.LIGHT_GRAY_CONCRETE_STAIRS,
                    ModStairs.CYAN_CONCRETE_STAIRS, ModStairs.PURPLE_CONCRETE_STAIRS, ModStairs.BLUE_CONCRETE_STAIRS,
                    ModStairs.BROWN_CONCRETE_STAIRS, ModStairs.GREEN_CONCRETE_STAIRS, ModStairs.RED_CONCRETE_STAIRS,
                    ModStairs.BLACK_CONCRETE_STAIRS,
                    ModStairs.BEDROCK_STAIRS};

    public static final Block[] CROSS =
            {ModPlants.ENDER_FLOWER, ModPlants.MAGENTA_TULIP, ModPlants.LIGHT_BLUE_TULIP, ModPlants.YELLOW_TULIP,
                    ModPlants.LIME_TULIP, ModPlants.GRAY_TULIP, ModPlants.LIGHT_GRAY_TULIP, ModPlants.CYAN_TULIP,
                    ModPlants.PURPLE_TULIP, ModPlants.BLUE_TULIP, ModPlants.BROWN_TULIP, ModPlants.GREEN_TULIP,
                    ModPlants.BLACK_TULIP, ModPlants.CRIMSON_SPROUTS};

    public static final Block[] AXIS_ROTATED =
            {ModBlocks.CHARRED_BONE_BLOCK};




    public static final Item[] ITEMS =
            {ModItems.TEST_ITEM,
                    ModItems.IRON_CORE, ModItems.CHARRED_BONE, ModItems.CHARRED_BONE_MEAL, ModItems.LEATHER_ARMOR_PIECE,
                    ModItems.GOLDEN_ARMOR_SCRAP, ModItems.OAK_BARK, ModItems.BIRCH_BARK, ModItems.SPRUCE_BARK,
                    ModItems.JUNGLE_BARK, ModItems.ACACIA_BARK, ModItems.DARK_OAK_BARK, ModItems.CRIMSON_BARK,
                    ModItems.WARPED_BARK, ModItems.STRIPPED_OAK_BARK, ModItems.STRIPPED_BIRCH_BARK,
                    ModItems.STRIPPED_SPRUCE_BARK, ModItems.STRIPPED_JUNGLE_BARK, ModItems.STRIPPED_ACACIA_BARK,
                    ModItems.STRIPPED_DARK_OAK_BARK, ModItems.STRIPPED_CRIMSON_BARK, ModItems.STRIPPED_WARPED_BARK,
                    ModItems.GLUE, ModItems.ELYTRA_WING};

    /* public static Item[] ARMORS =
            {ModArmor.WOODSTONE_HELMET, ModArmor.WOODSTONE_CHESTPLATE, ModArmor.WOODSTONE_LEGGINGS,
                    ModArmor.WOODSTONE_BOOTS, ModArmor.MONSTER_HELMET, ModArmor.MONSTER_CHESTPLATE, ModArmor.MONSTER_LEGGINGS,
                    ModArmor.MONSTER_BOOTS}; */

    public static final Item[] TOOLS = {
            ModTools.SCRAPER};

    public static final Item[] FOODS = {
            ModFood.GOLDEN_BEETROOT, ModFood.GOLDEN_WHEAT,
            ModFood.GOLDEN_BREAD, ModFood.GOLDEN_POTATO ,ModFood.GOLDEN_BAKED_POTATO, ModFood.GOLDEN_POISONOUS_POTATO,
            ModFood.COOKED_TROPICAL_FISH, ModFood.CAKE_SLICE};

}
