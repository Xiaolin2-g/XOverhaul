package com.xiaolin.xoverhaul.block;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class ModWalls extends BlockInitBase {


    public static final Block BEDROCK_WALLS = registerBlock("bedrock_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static final Block STONE_WALLS = registerBlock("stone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block SMOOTH_STONE_WALLS = registerBlock("smooth_stone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block CRACKED_STONE_BRICKS_WALLS = registerBlock("cracked_stone_bricks_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block CHISELED_STONE_BRICKS_WALLS = registerBlock("chiseled_stone_bricks_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block NETHERRACK_WALLS = registerBlock("netherrack_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));

    public static final Block CUT_SANDSTONE_WALLS = registerBlock("cut_sandstone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));

    public static final Block SMOOTH_SANDSTONE_WALLS = registerBlock("smooth_sandstone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE)));

    public static final Block CHISELED_SANDSTONE_WALLS = registerBlock("chiseled_sandstone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE)));

    public static final Block CUT_RED_SANDSTONE_WALLS = registerBlock("cut_red_sandstone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)));

    public static final Block SMOOTH_RED_SANDSTONE_WALLS = registerBlock("smooth_red_sandstone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE)));

    public static final Block CHISELED_RED_SANDSTONE_WALLS = registerBlock("chiseled_red_sandstone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE)));

    public static final Block END_STONE_WALLS = registerBlock("end_stone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block POLISHED_GRANITE_WALLS = registerBlock("polished_granite_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));

    public static final Block POLISHED_DIORITE_WALLS = registerBlock("polished_diorite_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));

    public static final Block POLISHED_ANDESITE_WALLS = registerBlock("polished_andesite_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));

    public static final Block PURPUR_BLOCK_WALLS = registerBlock("purpur_block_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block BASALT_WALLS = registerBlock("basalt_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_WALLS = registerBlock("cracked_polished_blackstone_bricks_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));

    public static final Block CHISELED_POLISHED_BLACKSTONE_WALLS = registerBlock("chiseled_polished_blackstone_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE)));







    public static final Block OBSIDIAN_WALLS = registerBlock("obsidian_walls",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));



    public static void registerModWalls(){
        XOverhaul.LOGGER.info("Registering Mod Walls for " + XOverhaul.MOD_ID);
    }

}
