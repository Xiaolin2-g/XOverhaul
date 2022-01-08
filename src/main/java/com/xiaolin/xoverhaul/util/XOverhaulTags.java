package com.xiaolin.xoverhaul.util;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import org.lwjgl.system.CallbackI;

public class XOverhaulTags {

    public static class Blocks {

        public static final Tag<Block> ENDER_FLOWER_PLACEABLES = TagFactory.BLOCK.create(new Identifier(
                XOverhaul.MOD_ID, "ender_flower_placeables"));

        public static final Tag<Block> GOLDEN_PRISMARINE_BRICK_CAN_REPLACE = TagFactory.BLOCK.create(new Identifier(
                XOverhaul.MOD_ID, "golden_prismarine_brick_can_replace"));
    }

    public static class Items{

    }

}
