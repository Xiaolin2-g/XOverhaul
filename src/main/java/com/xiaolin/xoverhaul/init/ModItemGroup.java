package com.xiaolin.xoverhaul.init;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup XOVERHAUL_ITEMS = FabricItemGroupBuilder.build(new Identifier(XOverhaul.MOD_ID ,
            "xoverhaul_items"), () -> new ItemStack(ModItems.IRON_CORE));

    public static final ItemGroup XOVERHAUL_BLOCKS = FabricItemGroupBuilder.build(new Identifier(XOverhaul.MOD_ID ,
            "xoverhaul_blocks"), () -> new ItemStack(ModBlocks.WOODEN_CRATE));

    public static final ItemGroup XOVERHAUL_ARMORS = FabricItemGroupBuilder.build(new Identifier(XOverhaul.MOD_ID ,
            "xoverhaul_armors"), () -> new ItemStack(ModArmor.MONSTER_CHESTPLATE));

    public static final ItemGroup XOVERHAUL_WEAPONS = FabricItemGroupBuilder.build(new Identifier(XOverhaul.MOD_ID ,
            "xoverhaul_weapons"), () -> new ItemStack(ModBlocks.DIRTY_SAND));

    public static final ItemGroup XOVERHAUL_TOOLS = FabricItemGroupBuilder.build(new Identifier(XOverhaul.MOD_ID ,
            "xoverhaul_tools"), () -> new ItemStack(ModTools.SCRAPER));

    public static final ItemGroup XOVERHAUL_FOODS = FabricItemGroupBuilder.build(new Identifier(XOverhaul.MOD_ID ,
            "xoverhaul_foods"), () -> new ItemStack(ModFood.GOLDEN_BREAD));

    public static final ItemGroup XOVERHAUL_SPAWN_EGGS = FabricItemGroupBuilder.build(new Identifier(XOverhaul.MOD_ID ,
            "xoverhaul_spawn_eggs"), () -> new ItemStack(ModSpawnEggs.CHAINED_MONSTER_SPAWN_EGG));
}
