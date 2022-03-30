package com.xiaolin.xoverhaul.block;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.SproutsBlock;
import net.minecraft.entity.effect.StatusEffects;

public class ModPlants extends BlockInitBase {

    public static final Block ENDER_FLOWER = registerBlock("ender_flower",
            new EnderFlowerBlock(StatusEffects.LEVITATION, 2, FabricBlockSettings.copyOf(Blocks.POPPY)));

    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block LIGHT_BLUE_TULIP = registerBlock("light_blue_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block LIME_TULIP = registerBlock("lime_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block GRAY_TULIP = registerBlock("gray_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block LIGHT_GRAY_TULIP = registerBlock("light_gray_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block CYAN_TULIP = registerBlock("cyan_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block PURPLE_TULIP = registerBlock("purple_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block BLUE_TULIP = registerBlock("blue_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block BROWN_TULIP = registerBlock("brown_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block GREEN_TULIP = registerBlock("green_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block BLACK_TULIP = registerBlock("black_tulip",
            new FlowerBlock(StatusEffects.SPEED, 2, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));

    public static final Block CRIMSON_SPROUTS = registerBlock("crimson_sprouts",
            new SproutsBlock(FabricBlockSettings.copyOf(Blocks.NETHER_SPROUTS)));

    public static void registerModPlants(){
        XOverhaul.LOGGER.info("Registering Mod Plants for " + XOverhaul.MOD_ID);
    }

}
