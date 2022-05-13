package com.xiaolin.xoverhaul.item;


import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems extends ItemInitBase {

    public static final Item IRON_CORE = registerItem("iron_core",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item CHARRED_BONE = registerItem("charred_bone",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item CHARRED_BONE_MEAL = registerItem("charred_bone_meal",
            new CharredBoneMealItem(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item LEATHER_ARMOR_PIECE = registerItem("leather_armor_piece",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item GOLDEN_ARMOR_SCRAP = registerItem("golden_armor_scrap",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));


    public static final Item OAK_BARK = registerItem("oak_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item BIRCH_BARK = registerItem("birch_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item SPRUCE_BARK = registerItem("spruce_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item JUNGLE_BARK = registerItem("jungle_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item ACACIA_BARK = registerItem("acacia_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item DARK_OAK_BARK = registerItem("dark_oak_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item CRIMSON_BARK = registerItem("crimson_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item WARPED_BARK = registerItem("warped_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item STRIPPED_OAK_BARK = registerItem("stripped_oak_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item STRIPPED_BIRCH_BARK = registerItem("stripped_birch_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item STRIPPED_SPRUCE_BARK = registerItem("stripped_spruce_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item STRIPPED_JUNGLE_BARK = registerItem("stripped_jungle_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item STRIPPED_ACACIA_BARK = registerItem("stripped_acacia_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item STRIPPED_DARK_OAK_BARK = registerItem("stripped_dark_oak_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item STRIPPED_CRIMSON_BARK = registerItem("stripped_crimson_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item STRIPPED_WARPED_BARK = registerItem("stripped_warped_bark",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item GLUE = registerItem("glue",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item ELYTRA_WING = registerItem("elytra_wing",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));








    public static final Item TEST_ITEM = registerItem("test_item",
            new TestItem(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item RECIPE_REMOVED_ITEM = registerItem("recipe_removed_item",
            new RecipeRemovedItem(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));



    public static void registerModItems(){
        XOverhaul.LOGGER.info("Registering Mod Items for " + XOverhaul.MOD_ID);
    }
}
