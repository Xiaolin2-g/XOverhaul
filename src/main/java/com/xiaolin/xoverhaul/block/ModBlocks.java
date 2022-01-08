package com.xiaolin.xoverhaul.block;


import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.mixin.object.builder.AbstractBlockSettingsAccessor;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block DIRTY_SAND = registerBlock("dirty_sand",
            new DirtySand(FabricBlockSettings.copyOf(Blocks.SAND)));

    public static final Block CHARRED_BONE_BLOCK = registerBlock("charred_bone_block",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK)));

    public static final Block PURPUR_COBBLESTONE = registerBlock("purpur_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

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

    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
                    .hardness(0.5f)
                    .resistance(1)
                    .sounds(BlockSoundGroup.SLIME)));

    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));

    public static final Block GRASS_BLOCK_SLAB = registerBlock("grass_block_slab",
          new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    public static final Block SOUL_NETHERRACK = registerBlock("soul_netherrack",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));

    public static final Block SOUL_NETHER_BRICKS = registerBlock("soul_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));

    public static final Block ENDER_FLOWER = registerBlock("ender_flower",
            new EnderFlower(StatusEffects.LEVITATION, 2, FabricBlockSettings.copyOf(Blocks.POPPY)));










    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(XOverhaul.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(XOverhaul.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.XOVERHAUL_BLOCKS)));
    }

    public static void registerModBlocks(){
        XOverhaul.LOGGER.info("Registering Mod Blocks for " + XOverhaul.MOD_ID);
    }
}
