/*package com.xiaolin.xoverhaul.util;

import com.xiaolin.xoverhaul.XOverhaul;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class XOverhaulTags {

    public static class Blocks{

        public static final Tag.IOptionalNamedTag<Block> FIRESTONE_CLICKABLE_BLOCKS =
                createTag("firestone_clickable_blocks");

        public static final Tags.IOptionalNamedTag<Block> GOLDEN_PRISMARINE_BRICK_CAN_REPLACE =
                createTag("golden_prismarine_brick_blocks");

        public static final Tags.IOptionalNamedTag<Block> ENDER_FLOWER_PLACEABLES =
                createTag("ender_flower_placeables");


        private static Tags.IOptionalNamedTag<Block> createTag(String name){
            return BlockTags.createOptional(new ResourceLocation(XOverhaul.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name){
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items{

        public static final Tags.IOptionalNamedTag<Item> AMETHYST = createForgeTag("gems/amethyst");



        private static Tags.IOptionalNamedTag<Item> createTag(String name){
            return ItemTags.createOptional(new ResourceLocation(XOverhaul.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name){
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }



}
*/