package com.xiaolin.xoverhaul.init;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.BlockInitBase;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class ModWalls extends BlockInitBase {


    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block CHISELED_STONE_BRICK_WALL = registerBlock("chiseled_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));

    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));

    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE)));

    public static final Block CHISELED_SANDSTONE_WALL = registerBlock("chiseled_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE)));

    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)));

    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE)));

    public static final Block CHISELED_RED_SANDSTONE_WALL = registerBlock("chiseled_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE)));

    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));

    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));

    public static final Block PURPUR_BLOCK_WALL = registerBlock("purpur_block_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block BASALT_WALL = registerBlock("basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));

    public static final Block CHISELED_POLISHED_BLACKSTONE_WALL = registerBlock("chiseled_polished_blackstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE)));

    public static final Block QUARTZ_BLOCK_WALL = registerBlock("quartz_block_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));

    public static final Block CHISELED_QUARTZ_BLOCK_WALL = registerBlock("chiseled_quartz_block_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_QUARTZ_BLOCK)));

    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));

    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));

    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_NETHER_BRICKS)));

    public static final Block CHISELED_NETHER_BRICK_WALL = registerBlock("chiseled_nether_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_NETHER_BRICKS)));

    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));

    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE)));

    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));

    public static final Block TERRACOTA_WALL = registerBlock("terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block WHITE_TERRACOTA_WALL = registerBlock("white_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    public static final Block ORANGE_TERRACOTA_WALL = registerBlock("orange_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTA_WALL = registerBlock("magenta_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTA_WALL = registerBlock("light_blue_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final Block YELLOW_TERRACOTA_WALL = registerBlock("yellow_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));

    public static final Block LIME_TERRACOTA_WALL = registerBlock("lime_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));

    public static final Block PINK_TERRACOTA_WALL = registerBlock("pink_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));

    public static final Block GRAY_TERRACOTA_WALL = registerBlock("gray_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTA_WALL = registerBlock("light_gray_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final Block CYAN_TERRACOTA_WALL = registerBlock("cyan_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));

    public static final Block PURPLE_TERRACOTA_WALL = registerBlock("purple_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));

    public static final Block BLUE_TERRACOTA_WALL = registerBlock("blue_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));

    public static final Block BROWN_TERRACOTA_WALL = registerBlock("brown_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));

    public static final Block GREEN_TERRACOTA_WALL = registerBlock("green_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));

    public static final Block RED_TERRACOTA_WALL = registerBlock("red_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));

    public static final Block BLACK_TERRACOTA_WALL = registerBlock("black_terracota_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));




    public static void registerModWalls(){
        XOverhaul.LOGGER.info("Registering Mod Walls for " + XOverhaul.MOD_ID);
    }

}
