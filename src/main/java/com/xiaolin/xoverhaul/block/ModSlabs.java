package com.xiaolin.xoverhaul.block;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

public class ModSlabs extends BlockInitBase {

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));

    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));

    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static void registerModSlabs(){
        XOverhaul.LOGGER.info("Registering Mod Slabs for " + XOverhaul.MOD_ID);
    }


}
