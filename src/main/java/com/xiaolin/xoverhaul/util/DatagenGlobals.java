package com.xiaolin.xoverhaul.util;

import com.xiaolin.xoverhaul.block.ModBlocks;
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
                    ModBlocks.SOUL_NETHERRACK, ModBlocks.SOUL_NETHER_BRICKS, ModBlocks.ENDER_END_STONE};

    public static final Block[] SLABS_BASE =
            {Blocks.WHITE_CONCRETE, Blocks.ORANGE_CONCRETE, Blocks.MAGENTA_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE,
                    Blocks.YELLOW_CONCRETE, Blocks.LIME_CONCRETE, Blocks.PINK_CONCRETE, Blocks.GRAY_CONCRETE,
                    Blocks.LIGHT_GRAY_CONCRETE, Blocks.CYAN_CONCRETE, Blocks.PURPLE_CONCRETE, Blocks.BLUE_CONCRETE,
                    Blocks.BROWN_CONCRETE, Blocks.GREEN_CONCRETE, Blocks.RED_CONCRETE, Blocks.BLACK_CONCRETE,
                    Blocks.DIRT, Blocks.BEDROCK};

    public static final Block[] SLABS =
            {ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_SLAB,
                    ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_SLAB,
                    ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB,
                    ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_SLAB,
                    ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_SLAB,
                    ModBlocks.BLACK_CONCRETE_SLAB,
                    ModBlocks.DIRT_SLAB, ModBlocks.BEDROCK_SLAB};

    public static final Block[] STAIRS_BASE =
            {Blocks.WHITE_CONCRETE, Blocks.ORANGE_CONCRETE, Blocks.MAGENTA_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE,
                    Blocks.YELLOW_CONCRETE, Blocks.LIME_CONCRETE, Blocks.PINK_CONCRETE, Blocks.GRAY_CONCRETE,
                    Blocks.LIGHT_GRAY_CONCRETE, Blocks.CYAN_CONCRETE, Blocks.PURPLE_CONCRETE, Blocks.BLUE_CONCRETE,
                    Blocks.BROWN_CONCRETE, Blocks.GREEN_CONCRETE, Blocks.RED_CONCRETE, Blocks.BLACK_CONCRETE,
                    Blocks.BEDROCK};

    public static final Block[] STAIRS =
            {ModBlocks.WHITE_CONCRETE_STAIRS, ModBlocks.ORANGE_CONCRETE_STAIRS, ModBlocks.MAGENTA_CONCRETE_STAIRS,
                    ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, ModBlocks.YELLOW_CONCRETE_STAIRS, ModBlocks.LIME_CONCRETE_STAIRS,
                    ModBlocks.PINK_CONCRETE_STAIRS, ModBlocks.GRAY_CONCRETE_STAIRS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS,
                    ModBlocks.CYAN_CONCRETE_STAIRS, ModBlocks.PURPLE_CONCRETE_STAIRS, ModBlocks.BLUE_CONCRETE_STAIRS,
                    ModBlocks.BROWN_CONCRETE_STAIRS, ModBlocks.GREEN_CONCRETE_STAIRS, ModBlocks.RED_CONCRETE_STAIRS,
                    ModBlocks.BLACK_CONCRETE_STAIRS,
                    ModBlocks.BEDROCK_STAIRS};

    public static final Block[] CROSS =
            {ModBlocks.ENDER_FLOWER, ModBlocks.MAGENTA_TULIP, ModBlocks.LIGHT_BLUE_TULIP, ModBlocks.YELLOW_TULIP,
                    ModBlocks.LIME_TULIP, ModBlocks.GRAY_TULIP, ModBlocks.LIGHT_GRAY_TULIP, ModBlocks.CYAN_TULIP,
                    ModBlocks.PURPLE_TULIP, ModBlocks.BLUE_TULIP, ModBlocks.BROWN_TULIP, ModBlocks.GREEN_TULIP,
                    ModBlocks.BLACK_TULIP, ModBlocks.CRIMSON_SPROUTS};

    public static final Block[] AXIS_ROTATED =
            {ModBlocks.CHARRED_BONE_BLOCK};




    public static final Item[] ITEMS =
            {ModItems.IRON_CORE, ModItems.CHARRED_BONE, ModItems.CHARRED_BONE_MEAL, ModItems.LEATHER_ARMOR_PIECE,
                    ModItems.GOLDEN_ARMOR_SCRAP, ModItems.OAK_BARK, ModItems.BIRCH_BARK, ModItems.SPRUCE_BARK,
                    ModItems.JUNGLE_BARK, ModItems.ACACIA_BARK, ModItems.DARK_OAK_BARK, ModItems.CRIMSON_BARK,
                    ModItems.WARPED_BARK, ModItems.STRIPPED_OAK_BARK, ModItems.STRIPPED_BIRCH_BARK,
                    ModItems.STRIPPED_SPRUCE_BARK, ModItems.STRIPPED_JUNGLE_BARK, ModItems.STRIPPED_ACACIA_BARK,
                    ModItems.STRIPPED_DARK_OAK_BARK, ModItems.STRIPPED_CRIMSON_BARK, ModItems.STRIPPED_WARPED_BARK,
                    ModItems.GLUE};

    /* public static Item[] ARMORS =
            {ModArmor.WOODSTONE_HELMET, ModArmor.WOODSTONE_CHESTPLATE, ModArmor.WOODSTONE_LEGGINGS,
                    ModArmor.WOODSTONE_BOOTS, ModArmor.MONSTER_HELMET, ModArmor.MONSTER_CHESTPLATE, ModArmor.MONSTER_LEGGINGS,
                    ModArmor.MONSTER_BOOTS}; */

    public static final Item[] TOOLS = {
            ModTools.SCRAPER};

    public static final Item[] FOODS = {
            ModFood.GOLDEN_BEETROOT, ModFood.GOLDEN_WHEAT,
            ModFood.GOLDEN_BREAD, ModFood.GOLDEN_POTATO ,ModFood.GOLDEN_BAKED_POTATO, ModFood.GOLDEN_POISONOUS_POTATO,
            ModFood.COOKED_TROPICAL_FISH};

}
