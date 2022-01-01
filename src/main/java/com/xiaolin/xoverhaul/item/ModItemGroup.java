package com.xiaolin.xoverhaul.item;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup XOVERHAUL_ITEMS = FabricItemGroupBuilder.build(new Identifier(XOverhaul.MOD_ID ,
            "xoverhaul_items"), () -> new ItemStack(ModItems.IRON_CORE));


    public static final ItemGroup XOVERHAUL_BLOCKS = FabricItemGroupBuilder.build(new Identifier(XOverhaul.MOD_ID ,
            "xoverhaul_blocks"), () -> new ItemStack(ModBlocks.DIRTY_SAND));
}
