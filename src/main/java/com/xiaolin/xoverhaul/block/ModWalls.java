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



    public static void registerModWalls(){
        XOverhaul.LOGGER.info("Registering Mod Walls for " + XOverhaul.MOD_ID);
    }

}
