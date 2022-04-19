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


    private static void registerBlocks() {
        BLOCKS.add(ModBlocks.DIRTY_SAND);
        BLOCKS.add(ModBlocks.PURPUR_COBBLESTONE);
        BLOCKS.add(ModBlocks.ROTTEN_FLESH_BLOCK);
        BLOCKS.add(ModBlocks.SOUL_NETHERRACK);
        BLOCKS.add(ModBlocks.SOUL_NETHER_BRICKS);
        BLOCKS.add(ModBlocks.ENDER_END_STONE);
        BLOCKS.add(ModBlocks.WOODEN_CRATE);

    }

    private static void registerConcreteSlabs() {
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
    }

    private static void registerTerracotaSlabs(){
        SLABS.put(Blocks.TERRACOTTA, ModSlabs.TERRACOTA_SLAB);
        SLABS.put(Blocks.WHITE_TERRACOTTA, ModSlabs.WHITE_TERRACOTA_SLAB);
        SLABS.put(Blocks.ORANGE_TERRACOTTA, ModSlabs.ORANGE_TERRACOTA_SLAB);
        SLABS.put(Blocks.MAGENTA_TERRACOTTA, ModSlabs.MAGENTA_TERRACOTA_SLAB);
        SLABS.put(Blocks.LIGHT_BLUE_TERRACOTTA, ModSlabs.LIGHT_BLUE_TERRACOTA_SLAB);
        SLABS.put(Blocks.YELLOW_TERRACOTTA, ModSlabs.YELLOW_TERRACOTA_SLAB);
        SLABS.put(Blocks.LIME_TERRACOTTA, ModSlabs.LIME_TERRACOTA_SLAB);
        SLABS.put(Blocks.PINK_TERRACOTTA, ModSlabs.PINK_TERRACOTA_SLAB);
        SLABS.put(Blocks.GRAY_TERRACOTTA, ModSlabs.GRAY_TERRACOTA_SLAB);
        SLABS.put(Blocks.LIGHT_GRAY_TERRACOTTA, ModSlabs.LIGHT_GRAY_TERRACOTA_SLAB);
        SLABS.put(Blocks.CYAN_TERRACOTTA, ModSlabs.CYAN_TERRACOTA_SLAB);
        SLABS.put(Blocks.PURPLE_TERRACOTTA, ModSlabs.PURPLE_TERRACOTA_SLAB);
        SLABS.put(Blocks.BLUE_TERRACOTTA, ModSlabs.BLUE_TERRACOTA_SLAB);
        SLABS.put(Blocks.BROWN_TERRACOTTA, ModSlabs.BROWN_TERRACOTA_SLAB);
        SLABS.put(Blocks.GREEN_TERRACOTTA, ModSlabs.GREEN_TERRACOTA_SLAB);
        SLABS.put(Blocks.RED_TERRACOTTA, ModSlabs.RED_TERRACOTA_SLAB);
        SLABS.put(Blocks.BLACK_TERRACOTTA, ModSlabs.BLACK_TERRACOTA_SLAB);
    }

    private static void registerSlabs() {
        registerConcreteSlabs();
        registerTerracotaSlabs();

        SLABS.put(Blocks.DIRT, ModSlabs.DIRT_SLAB);
        SLABS.put(Blocks.BEDROCK, ModSlabs.BEDROCK_SLAB);
        SLABS.put(Blocks.CRACKED_STONE_BRICKS, ModSlabs.CRACKED_STONE_BRICK_SLAB);
        SLABS.put(Blocks.CHISELED_STONE_BRICKS, ModSlabs.CHISELED_STONE_BRICK_SLAB);
        SLABS.put(Blocks.NETHERRACK, ModSlabs.NETHERRACK_SLAB);
        SLABS.put(Blocks.CHISELED_SANDSTONE, ModSlabs.CHISELED_SANDSTONE_SLAB);
        SLABS.put(Blocks.CHISELED_RED_SANDSTONE, ModSlabs.CHISELED_RED_SANDSTONE_SLAB);
        SLABS.put(Blocks.END_STONE, ModSlabs.END_STONE_SLAB);
        SLABS.put(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModSlabs.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        SLABS.put(Blocks.CHISELED_POLISHED_BLACKSTONE, ModSlabs.CHISELED_POLISHED_BLACKSTONE_SLAB);
        SLABS.put(Blocks.CHISELED_QUARTZ_BLOCK, ModSlabs.CHISELED_QUARTZ_BLOCK_SLAB);
        SLABS.put(Blocks.QUARTZ_BRICKS, ModSlabs.QUARTZ_BRICKS_SLAB);
        SLABS.put(Blocks.CRACKED_NETHER_BRICKS, ModSlabs.CRACKED_NETHER_BRICK_SLAB);
        SLABS.put(Blocks.CHISELED_NETHER_BRICKS, ModSlabs.CHISELED_NETHER_BRICK_SLAB);
        SLABS.put(Blocks.BASALT, ModSlabs.BASALT_SLAB);
        SLABS.put(Blocks.OBSIDIAN, ModSlabs.OBSIDIAN_SLAB);
    }


    private static void registerConcreteStairs() {
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
    }

    private static void registerTerracotaStairs(){
        STAIRS.put(Blocks.TERRACOTTA, ModStairs.TERRACOTA_STAIRS);
        STAIRS.put(Blocks.WHITE_TERRACOTTA, ModStairs.WHITE_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.ORANGE_TERRACOTTA, ModStairs.ORANGE_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.MAGENTA_TERRACOTTA, ModStairs.MAGENTA_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.LIGHT_BLUE_TERRACOTTA, ModStairs.LIGHT_BLUE_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.YELLOW_TERRACOTTA, ModStairs.YELLOW_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.LIME_TERRACOTTA, ModStairs.LIME_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.PINK_TERRACOTTA, ModStairs.PINK_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.GRAY_TERRACOTTA, ModStairs.GRAY_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.LIGHT_GRAY_TERRACOTTA, ModStairs.LIGHT_GRAY_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.CYAN_TERRACOTTA, ModStairs.CYAN_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.PURPLE_TERRACOTTA, ModStairs.PURPLE_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.BLUE_TERRACOTTA, ModStairs.BLUE_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.BROWN_TERRACOTTA, ModStairs.BROWN_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.GREEN_TERRACOTTA, ModStairs.GREEN_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.RED_TERRACOTTA, ModStairs.RED_TERRACOTA_STAIRS);
        STAIRS.put(Blocks.BLACK_TERRACOTTA, ModStairs.BLACK_TERRACOTA_STAIRS);
    }

    private static void registerStairs() {

        registerConcreteStairs();
        registerTerracotaStairs();

        STAIRS.put(Blocks.BEDROCK, ModStairs.BEDROCK_STAIRS);
        STAIRS.put(Blocks.SMOOTH_STONE, ModStairs.SMOOTH_STONE_STAIRS);
        STAIRS.put(Blocks.CRACKED_STONE_BRICKS, ModStairs.CRACKED_STONE_BRICK_STAIRS);
        STAIRS.put(Blocks.CHISELED_STONE_BRICKS, ModStairs.CHISELED_STONE_BRICK_STAIRS);
        STAIRS.put(Blocks.NETHERRACK, ModStairs.NETHERRACK_STAIRS);
        STAIRS.put(Blocks.CUT_SANDSTONE, ModStairs.CUT_SANDSTONE_STAIRS);
        STAIRS.put(Blocks.CHISELED_SANDSTONE, ModStairs.CHISELED_SANDSTONE_STAIRS);
        STAIRS.put(Blocks.CUT_RED_SANDSTONE, ModStairs.CUT_RED_SANDSTONE_STAIRS);
        STAIRS.put(Blocks.CHISELED_RED_SANDSTONE, ModStairs.CHISELED_RED_SANDSTONE_STAIRS);
        STAIRS.put(Blocks.END_STONE, ModStairs.END_STONE_STAIRS);
        STAIRS.put(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModStairs.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        STAIRS.put(Blocks.CHISELED_POLISHED_BLACKSTONE, ModStairs.CHISELED_POLISHED_BLACKSTONE_STAIRS);
        STAIRS.put(Blocks.CHISELED_QUARTZ_BLOCK, ModStairs.CHISELED_QUARTZ_BLOCK_STAIRS);
        STAIRS.put(Blocks.QUARTZ_BRICKS, ModStairs.QUARTZ_BRICKS_STAIRS);
        STAIRS.put(Blocks.CRACKED_NETHER_BRICKS, ModStairs.CRACKED_NETHER_BRICK_STAIRS);
        STAIRS.put(Blocks.CHISELED_NETHER_BRICKS, ModStairs.CHISELED_NETHER_BRICK_STAIRS);
        STAIRS.put(Blocks.BASALT, ModStairs.BASALT_STAIRS);
        STAIRS.put(Blocks.OBSIDIAN, ModStairs.OBSIDIAN_STAIRS);

    }

    private static void registerConcreteWalls(){
        WALLS.put(Blocks.WHITE_CONCRETE, ModWalls.WHITE_CONCRETE_WALL);
        WALLS.put(Blocks.ORANGE_CONCRETE, ModWalls.ORANGE_CONCRETE_WALL);
        WALLS.put(Blocks.MAGENTA_CONCRETE, ModWalls.MAGENTA_CONCRETE_WALL);
        WALLS.put(Blocks.LIGHT_BLUE_CONCRETE, ModWalls.LIGHT_BLUE_CONCRETE_WALL);
        WALLS.put(Blocks.YELLOW_CONCRETE, ModWalls.YELLOW_CONCRETE_WALL);
        WALLS.put(Blocks.LIME_CONCRETE, ModWalls.LIME_CONCRETE_WALL);
        WALLS.put(Blocks.PINK_CONCRETE, ModWalls.PINK_CONCRETE_WALL);
        WALLS.put(Blocks.GRAY_CONCRETE, ModWalls.GRAY_CONCRETE_WALL);
        WALLS.put(Blocks.LIGHT_GRAY_CONCRETE, ModWalls.LIGHT_GRAY_CONCRETE_WALL);
        WALLS.put(Blocks.CYAN_CONCRETE, ModWalls.CYAN_CONCRETE_WALL);
        WALLS.put(Blocks.PURPLE_CONCRETE, ModWalls.PURPLE_CONCRETE_WALL);
        WALLS.put(Blocks.BLUE_CONCRETE, ModWalls.BLUE_CONCRETE_WALL);
        WALLS.put(Blocks.BROWN_CONCRETE, ModWalls.BROWN_CONCRETE_WALL);
        WALLS.put(Blocks.GREEN_CONCRETE, ModWalls.GREEN_CONCRETE_WALL);
        WALLS.put(Blocks.RED_CONCRETE, ModWalls.RED_CONCRETE_WALL);
        WALLS.put(Blocks.BLACK_CONCRETE, ModWalls.BLACK_CONCRETE_WALL);
    }

    private static void registerTerracotaWalls(){
        WALLS.put(Blocks.TERRACOTTA, ModWalls.TERRACOTA_WALL);
        WALLS.put(Blocks.WHITE_TERRACOTTA, ModWalls.WHITE_TERRACOTA_WALL);
        WALLS.put(Blocks.ORANGE_TERRACOTTA, ModWalls.ORANGE_TERRACOTA_WALL);
        WALLS.put(Blocks.MAGENTA_TERRACOTTA, ModWalls.MAGENTA_TERRACOTA_WALL);
        WALLS.put(Blocks.LIGHT_BLUE_TERRACOTTA, ModWalls.LIGHT_BLUE_TERRACOTA_WALL);
        WALLS.put(Blocks.YELLOW_TERRACOTTA, ModWalls.YELLOW_TERRACOTA_WALL);
        WALLS.put(Blocks.LIME_TERRACOTTA, ModWalls.LIME_TERRACOTA_WALL);
        WALLS.put(Blocks.PINK_TERRACOTTA, ModWalls.PINK_TERRACOTA_WALL);
        WALLS.put(Blocks.GRAY_TERRACOTTA, ModWalls.GRAY_TERRACOTA_WALL);
        WALLS.put(Blocks.LIGHT_GRAY_TERRACOTTA, ModWalls.LIGHT_GRAY_TERRACOTA_WALL);
        WALLS.put(Blocks.CYAN_TERRACOTTA, ModWalls.CYAN_TERRACOTA_WALL);
        WALLS.put(Blocks.PURPLE_TERRACOTTA, ModWalls.PURPLE_TERRACOTA_WALL);
        WALLS.put(Blocks.BLUE_TERRACOTTA, ModWalls.BLUE_TERRACOTA_WALL);
        WALLS.put(Blocks.BROWN_TERRACOTTA, ModWalls.BROWN_TERRACOTA_WALL);
        WALLS.put(Blocks.GREEN_TERRACOTTA, ModWalls.GREEN_TERRACOTA_WALL);
        WALLS.put(Blocks.RED_TERRACOTTA, ModWalls.RED_TERRACOTA_WALL);
        WALLS.put(Blocks.BLACK_TERRACOTTA, ModWalls.BLACK_TERRACOTA_WALL);
    }

    private static void registerWalls() {

        registerConcreteWalls();
        registerTerracotaWalls();

        WALLS.put(Blocks.BEDROCK, ModWalls.BEDROCK_WALL);
        WALLS.put(Blocks.STONE, ModWalls.STONE_WALL);
        WALLS.put(Blocks.SMOOTH_STONE, ModWalls.SMOOTH_STONE_WALL);
        WALLS.put(Blocks.CRACKED_STONE_BRICKS, ModWalls.CRACKED_STONE_BRICK_WALL);
        WALLS.put(Blocks.CHISELED_STONE_BRICKS, ModWalls.CHISELED_STONE_BRICK_WALL);
        WALLS.put(Blocks.NETHERRACK, ModWalls.NETHERRACK_WALL);
        WALLS.put(Blocks.CUT_SANDSTONE, ModWalls.CUT_SANDSTONE_WALL);
        WALLS.put(Blocks.CHISELED_SANDSTONE, ModWalls.CHISELED_SANDSTONE_WALL);
        WALLS.put(Blocks.CUT_RED_SANDSTONE, ModWalls.CUT_RED_SANDSTONE_WALL);
        WALLS.put(Blocks.CHISELED_RED_SANDSTONE, ModWalls.CHISELED_RED_SANDSTONE_WALL);
        WALLS.put(Blocks.END_STONE, ModWalls.END_STONE_WALL);
        WALLS.put(Blocks.POLISHED_GRANITE, ModWalls.POLISHED_GRANITE_WALL);
        WALLS.put(Blocks.POLISHED_DIORITE, ModWalls.POLISHED_DIORITE_WALL);
        WALLS.put(Blocks.POLISHED_ANDESITE, ModWalls.POLISHED_ANDESITE_WALL);
        WALLS.put(Blocks.PURPUR_BLOCK, ModWalls.PURPUR_BLOCK_WALL);
        WALLS.put(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModWalls.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
        WALLS.put(Blocks.CHISELED_POLISHED_BLACKSTONE, ModWalls.CHISELED_POLISHED_BLACKSTONE_WALL);
        WALLS.put(Blocks.CHISELED_QUARTZ_BLOCK, ModWalls.CHISELED_QUARTZ_BLOCK_WALL);
        WALLS.put(Blocks.QUARTZ_BRICKS, ModWalls.QUARTZ_BRICK_WALL);
        WALLS.put(Blocks.CRACKED_NETHER_BRICKS, ModWalls.CRACKED_NETHER_BRICK_WALL);
        WALLS.put(Blocks.CHISELED_NETHER_BRICKS, ModWalls.CHISELED_NETHER_BRICK_WALL);
        WALLS.put(Blocks.PRISMARINE_BRICKS, ModWalls.PRISMARINE_BRICK_WALL);
        WALLS.put(Blocks.DARK_PRISMARINE, ModWalls.DARK_PRISMARINE_WALL);
        WALLS.put(Blocks.BASALT, ModWalls.BASALT_WALL);
        WALLS.put(Blocks.SMOOTH_SANDSTONE, ModWalls.SMOOTH_SANDSTONE_WALL);
        WALLS.put(Blocks.SMOOTH_RED_SANDSTONE, ModWalls.SMOOTH_RED_SANDSTONE_WALL);
        WALLS.put(Blocks.QUARTZ_BLOCK, ModWalls.QUARTZ_BLOCK_WALL);
        WALLS.put(Blocks.OBSIDIAN, ModWalls.OBSIDIAN_WALL);
    }

    private static void registerPlants() {
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

    private static void registerCross() {
        registerPlants();
        CROSS.addAll(PLANTS);
    }

    private static void registerAxisRotated() {
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

    private static void registerBarks() {
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

    private static void registerTools() {
        TOOLS.add(ModTools.SCRAPER);
    }

    private static void registerFoods() {
        FOODS.add(ModFood.GOLDEN_BEETROOT);
        FOODS.add(ModFood.GOLDEN_WHEAT);
        FOODS.add(ModFood.GOLDEN_BREAD);
        FOODS.add(ModFood.GOLDEN_POTATO);
        FOODS.add(ModFood.GOLDEN_BAKED_POTATO);
        FOODS.add(ModFood.GOLDEN_POISONOUS_POTATO);
        FOODS.add(ModFood.COOKED_TROPICAL_FISH);
        FOODS.add(ModFood.CAKE_SLICE);
    }

    private static void registerAllBlocks() {
        registerBlocks();
        registerSlabs();
        registerStairs();
        registerWalls();
        registerCross();
        registerAxisRotated();
    }

    private static void registerAllItems() {
        registerItems();
        registerArmors();
        registerTools();
        registerFoods();
    }


    public static void registerDatagen() {
        XOverhaul.LOGGER.info("Registering data for datagen...");
        registerAllBlocks();
        registerAllItems();
    }

}
