package com.xiaolin.xoverhaul.block;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ModStairs extends BlockInitBase {

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new BaseStairs(Blocks.WHITE_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new BaseStairs(Blocks.ORANGE_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new BaseStairs(Blocks.MAGENTA_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new BaseStairs(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new BaseStairs(Blocks.YELLOW_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new BaseStairs(Blocks.LIME_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new BaseStairs(Blocks.PINK_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new BaseStairs(Blocks.GRAY_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new BaseStairs(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new BaseStairs(Blocks.CYAN_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new BaseStairs(Blocks.PURPLE_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new BaseStairs(Blocks.BLUE_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new BaseStairs(Blocks.BROWN_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new BaseStairs(Blocks.GREEN_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new BaseStairs(Blocks.RED_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new BaseStairs(Blocks.BLACK_CONCRETE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));

    public static final Block BEDROCK_STAIRS = registerBlock("bedrock_stairs",
            new BaseStairs(Blocks.BEDROCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new BaseStairs(Blocks.SMOOTH_STONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static void registerModStairs(){
        XOverhaul.LOGGER.info("Registering Mod Stairs for " + XOverhaul.MOD_ID);
    }

}
