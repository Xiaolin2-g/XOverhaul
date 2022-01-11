package com.xiaolin.xoverhaul.item;


import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.Item;
import net.minecraft.item.PotionItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item IRON_CORE = registerItem("iron_core",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item CHARRED_BONE = registerItem("charred_bone",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item CHARRED_BONE_MEAL = registerItem("charred_bone_meal",
            new CharredBoneMeal(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item LEATHER_ARMOR_PIECE = registerItem("leather_armor_piece",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item GOLD_ARMOR_SCRAP = registerItem("gold_armor_scrap",
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







    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(XOverhaul.MOD_ID, name), item);
    }

    public static void registerModItems(){
        XOverhaul.LOGGER.info("Registering Mod Items for " + XOverhaul.MOD_ID);

    }
}
