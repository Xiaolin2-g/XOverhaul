package com.xiaolin.xoverhaul.init;


import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.BlockInitBase;
import com.xiaolin.xoverhaul.block.DirtySandBlock;
import com.xiaolin.xoverhaul.block.TreeFungusBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks extends BlockInitBase {

    public static final Block DIRTY_SAND = registerBlock("dirty_sand",
            new DirtySandBlock(FabricBlockSettings.copyOf(Blocks.SAND)));

    public static final Block CHARRED_BONE_BLOCK = registerBlock("charred_bone_block",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK)));

    public static final Block PURPUR_COBBLESTONE = registerBlock("purpur_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
                    .hardness(0.5f)
                    .resistance(1)
                    .sounds(BlockSoundGroup.SLIME)));


    public static final Block SOUL_NETHERRACK = registerBlock("soul_netherrack",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));

    public static final Block SOUL_NETHER_BRICKS = registerBlock("soul_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));


    public static final Block ENDER_END_STONE = registerBlock("ender_end_stone",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));


    public static final Block WOODEN_CRATE = registerBlock("wooden_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block GLAZED_TERRACOTTA = registerBlock("glazed_terracotta",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA)));


    public static void registerModBlocks(){
        XOverhaul.LOGGER.info("Registering Mod Blocks for " + XOverhaul.MOD_ID);
    }
}
