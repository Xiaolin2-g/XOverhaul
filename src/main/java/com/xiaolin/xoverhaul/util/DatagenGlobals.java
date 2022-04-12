package com.xiaolin.xoverhaul.util;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.*;
import com.xiaolin.xoverhaul.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;

import java.util.*;

public class DatagenGlobals {



    public static final List<Block> BLOCKS = new ArrayList<>();

    public static Map<Block, Block> SLABS = new HashMap<>();

    public static Map<Block, Block> STAIRS = new HashMap<>();

    public static Map<Block, Block> WALLS = new HashMap<>();

    public static final List<Block> PLANTS = new ArrayList<>();

    public static final List<Block> CROSS = new ArrayList<>();

    public static final List<Block> AXIS_ROTATED = new ArrayList<>();

    public static final List<Item> ITEMS = new ArrayList<>();

    public static final List<Item> ARMORS = new ArrayList<>();

    public static final List<Item> TOOLS = new ArrayList<>();

    public static final List<Item> FOODS = new ArrayList<>();



    private static void registerBlocks(){
        BLOCKS.add(ModBlocks.DIRTY_SAND);
        BLOCKS.add(ModBlocks.PURPUR_COBBLESTONE);
        BLOCKS.add(ModBlocks.ROTTEN_FLESH_BLOCK);
        BLOCKS.add(ModBlocks.SOUL_NETHERRACK);
        BLOCKS.add(ModBlocks.SOUL_NETHER_BRICKS);
        BLOCKS.add(ModBlocks.ENDER_END_STONE);
        BLOCKS.add(ModBlocks.WOODEN_CRATE);

    }



    private static void registerSlabs(){
        SLABS.put(Blocks.WHITE_CONCRETE, ModSlabs.WHITE_CONCRETE_SLAB);
        SLABS.put(Blocks.ORANGE_CONCRETE, ModSlabs.ORANGE_CONCRETE_SLAB);
        SLABS.put(Blocks.MAGENTA_CONCRETE, ModSlabs.MAGENTA_CONCRETE_SLAB);
        SLABS.put(Blocks.LIGHT_BLUE_CONCRETE, ModSlabs.LIGHT_BLUE_CONCRETE_SLAB);
        SLABS.put(Blocks.YELLOW_CONCRETE, ModSlabs.YELLOW_CONCRETE_SLAB);
        SLABS.put(Blocks.LIME_CONCRETE, ModSlabs.LIME_CONCRETE_SLAB);
        SLABS.put(Blocks.PINK_CONCRETE, ModSlabs.PINK_CONCRETE_SLAB);
        SLABS.put(Blocks.GRAY_CONCRETE, ModSlabs.GRAY_CONCRETE_SLAB);
        SLABS.put(Blocks.LIGHT_GRAY_CONCRETE, ModSlabs.LIGHT_GRAY_CONCRETE_SLAB);
        SLABS.put(Blocks.CYAN_CONCRETE, ModSlabs.CYAN_CONCRETE_SLAB);
        SLABS.put(Blocks.PURPLE_CONCRETE, ModSlabs.PURPLE_CONCRETE_SLAB);
        SLABS.put(Blocks.BLUE_CONCRETE, ModSlabs.BLUE_CONCRETE_SLAB);
        SLABS.put(Blocks.BROWN_CONCRETE, ModSlabs.BROWN_CONCRETE_SLAB);
        SLABS.put(Blocks.GREEN_CONCRETE, ModSlabs.GREEN_CONCRETE_SLAB);
        SLABS.put(Blocks.RED_CONCRETE, ModSlabs.RED_CONCRETE_SLAB);
        SLABS.put(Blocks.BLACK_CONCRETE, ModSlabs.BLACK_CONCRETE_SLAB);
        SLABS.put(Blocks.DIRT, ModSlabs.DIRT_SLAB);
        SLABS.put(Blocks.BEDROCK, ModSlabs.BEDROCK_SLAB);

    }

    private static void registerStairs(){
        STAIRS.put(Blocks.WHITE_CONCRETE, ModStairs.WHITE_CONCRETE_STAIRS);
        STAIRS.put(Blocks.ORANGE_CONCRETE, ModStairs.ORANGE_CONCRETE_STAIRS);
        STAIRS.put(Blocks.MAGENTA_CONCRETE, ModStairs.MAGENTA_CONCRETE_STAIRS);
        STAIRS.put(Blocks.LIGHT_BLUE_CONCRETE, ModStairs.LIGHT_BLUE_CONCRETE_STAIRS);
        STAIRS.put(Blocks.YELLOW_CONCRETE, ModStairs.YELLOW_CONCRETE_STAIRS);
        STAIRS.put(Blocks.LIME_CONCRETE, ModStairs.LIME_CONCRETE_STAIRS);
        STAIRS.put(Blocks.PINK_CONCRETE, ModStairs.PINK_CONCRETE_STAIRS);
        STAIRS.put(Blocks.GRAY_CONCRETE, ModStairs.GRAY_CONCRETE_STAIRS);
        STAIRS.put(Blocks.LIGHT_GRAY_CONCRETE, ModStairs.LIGHT_GRAY_CONCRETE_STAIRS);
        STAIRS.put(Blocks.CYAN_CONCRETE, ModStairs.CYAN_CONCRETE_STAIRS);
        STAIRS.put(Blocks.PURPLE_CONCRETE, ModStairs.PURPLE_CONCRETE_STAIRS);
        STAIRS.put(Blocks.BLUE_CONCRETE, ModStairs.BLUE_CONCRETE_STAIRS);
        STAIRS.put(Blocks.BROWN_CONCRETE, ModStairs.BROWN_CONCRETE_STAIRS);
        STAIRS.put(Blocks.GREEN_CONCRETE, ModStairs.GREEN_CONCRETE_STAIRS);
        STAIRS.put(Blocks.RED_CONCRETE, ModStairs.RED_CONCRETE_STAIRS);
        STAIRS.put(Blocks.BLACK_CONCRETE, ModStairs.BLACK_CONCRETE_STAIRS);
        STAIRS.put(Blocks.BEDROCK, ModStairs.BEDROCK_STAIRS);

    }

    private static void registerWalls(){
        WALLS.put(Blocks.BEDROCK, ModWalls.BEDROCK_WALLS);
    }

    private static void registerPlants(){
        PLANTS.add(ModPlants.ENDER_FLOWER);
        PLANTS.add(ModPlants.MAGENTA_TULIP);
        PLANTS.add(ModPlants.LIGHT_BLUE_TULIP);
        PLANTS.add(ModPlants.YELLOW_TULIP);
        PLANTS.add(ModPlants.LIME_TULIP);
        PLANTS.add(ModPlants.GRAY_TULIP);
        PLANTS.add(ModPlants.LIGHT_GRAY_TULIP);
        PLANTS.add(ModPlants.CYAN_TULIP);
        PLANTS.add(ModPlants.PURPLE_TULIP);
        PLANTS.add(ModPlants.BLUE_TULIP);
        PLANTS.add(ModPlants.BROWN_TULIP);
        PLANTS.add(ModPlants.GREEN_TULIP);
        PLANTS.add(ModPlants.BLACK_TULIP);
        PLANTS.add(ModPlants.CRIMSON_SPROUTS);
    }

    private static void registerCross(){
        registerPlants();
        CROSS.addAll(PLANTS);
    }

    private static void registerAxisRotated(){
        AXIS_ROTATED.add(ModBlocks.CHARRED_BONE_BLOCK);
    }

    private static void registerItems() {
        ITEMS.add(ModItems.TEST_ITEM);

        ITEMS.add(ModItems.IRON_CORE);
        ITEMS.add(ModItems.CHARRED_BONE);
        ITEMS.add(ModItems.CHARRED_BONE_MEAL);
        ITEMS.add(ModItems.LEATHER_ARMOR_PIECE);
        ITEMS.add(ModItems.GOLDEN_ARMOR_SCRAP);
        registerBarks();
        ITEMS.add(ModItems.GLUE);
        ITEMS.add(ModItems.ELYTRA_WING);
    }

    private static void registerBarks(){
        ITEMS.add(ModItems.OAK_BARK);
        ITEMS.add(ModItems.BIRCH_BARK);
        ITEMS.add(ModItems.SPRUCE_BARK);
        ITEMS.add(ModItems.JUNGLE_BARK);
        ITEMS.add(ModItems.ACACIA_BARK);
        ITEMS.add(ModItems.DARK_OAK_BARK);
        ITEMS.add(ModItems.CRIMSON_BARK);
        ITEMS.add(ModItems.WARPED_BARK);
        ITEMS.add(ModItems.STRIPPED_OAK_BARK);
        ITEMS.add(ModItems.STRIPPED_BIRCH_BARK);
        ITEMS.add(ModItems.STRIPPED_SPRUCE_BARK);
        ITEMS.add(ModItems.STRIPPED_JUNGLE_BARK);
        ITEMS.add(ModItems.STRIPPED_ACACIA_BARK);
        ITEMS.add(ModItems.STRIPPED_DARK_OAK_BARK);
        ITEMS.add(ModItems.STRIPPED_CRIMSON_BARK);
        ITEMS.add(ModItems.STRIPPED_WARPED_BARK);

    }

    private static void registerArmors() {
        ARMORS.add(ModArmor.WOODSTONE_HELMET);
        ARMORS.add(ModArmor.WOODSTONE_CHESTPLATE);
        ARMORS.add(ModArmor.WOODSTONE_LEGGINGS);
        ARMORS.add(ModArmor.WOODSTONE_BOOTS);

        ARMORS.add(ModArmor.MONSTER_HELMET);
        ARMORS.add(ModArmor.MONSTER_CHESTPLATE);
        ARMORS.add(ModArmor.MONSTER_LEGGINGS);
        ARMORS.add(ModArmor.MONSTER_BOOTS);
    }

    private static void registerTools(){
        TOOLS.add(ModTools.SCRAPER);
    }

    private static void registerFoods(){
        FOODS.add(ModFood.GOLDEN_BEETROOT);
        FOODS.add(ModFood.GOLDEN_WHEAT);
        FOODS.add(ModFood.GOLDEN_BREAD);
        FOODS.add(ModFood.GOLDEN_POTATO);
        FOODS.add(ModFood.GOLDEN_BAKED_POTATO);
        FOODS.add(ModFood.GOLDEN_POISONOUS_POTATO);
        FOODS.add(ModFood.COOKED_TROPICAL_FISH);
        FOODS.add(ModFood.CAKE_SLICE);
    }

    private static void registerAllBlocks(){
        registerBlocks();
        registerSlabs();
        registerStairs();
        registerWalls();
        registerCross();
        registerAxisRotated();
    }

    private static void registerAllItems(){
        registerItems();
        registerArmors();
        registerTools();
        registerFoods();
    }


    public static void registerDatagen(){
        XOverhaul.LOGGER.info("Registering data for datagen...");
        registerAllBlocks();
        registerAllItems();
    }


}
