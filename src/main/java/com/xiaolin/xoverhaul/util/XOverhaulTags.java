package com.xiaolin.xoverhaul.util;

import com.xiaolin.xoverhaul.XOverhaul;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class XOverhaulTags {

    public static class Blocks {

        public static final TagKey<Block> ENDER_FLOWER_PLACEABLES = TagKey.of(Registry.BLOCK_KEY, new Identifier(
                XOverhaul.MOD_ID, "ender_flower_placeables"));

        public static final TagKey<Block> GOLDEN_PRISMARINE_BRICK_CAN_REPLACE = TagKey.of(Registry.BLOCK_KEY, new Identifier(
                XOverhaul.MOD_ID, "golden_prismarine_brick_can_replace"));

    }

}
