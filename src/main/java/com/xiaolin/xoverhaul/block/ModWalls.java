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



    public static void registerModWalls(){
        XOverhaul.LOGGER.info("Registering Mod Walls for " + XOverhaul.MOD_ID);
    }

}
