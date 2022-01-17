package com.xiaolin.xoverhaul.item;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModArmor {

    public static final Item WOODSTONE_HELMET = registerItem("woodstone_helmet",
            new ArmorItem(ModArmorMaterial.WOODSTONE, EquipmentSlot.HEAD,
                    new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item WOODSTONE_CHESTPLATE = registerItem("woodstone_chestplate",
            new ArmorItem(ModArmorMaterial.WOODSTONE, EquipmentSlot.CHEST,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item WOODSTONE_LEGGINGS = registerItem("woodstone_leggings",
            new ArmorItem(ModArmorMaterial.WOODSTONE, EquipmentSlot.LEGS,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item WOODSTONE_BOOTS = registerItem("woodstone_boots",
            new ArmorItem(ModArmorMaterial.WOODSTONE, EquipmentSlot.FEET,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item MONSTER_HELMET = registerItem("monster_helmet",
            new ArmorItem(ModArmorMaterial.MONSTER, EquipmentSlot.HEAD,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item MONSTER_CHESTPLATE = registerItem("monster_chestplate",
            new ArmorItem(ModArmorMaterial.MONSTER, EquipmentSlot.CHEST,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item MONSTER_LEGGINGS = registerItem("monster_leggings",
            new ArmorItem(ModArmorMaterial.MONSTER, EquipmentSlot.LEGS,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ITEMS)));

    public static final Item MONSTER_BOOTS = registerItem("monster_boots",
            new ArmorItem(ModArmorMaterial.MONSTER, EquipmentSlot.FEET,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ITEMS)));


    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(XOverhaul.MOD_ID, name), item);
    }

    public static void registerModArmor(){
        XOverhaul.LOGGER.info("Registering Mod Armor for " + XOverhaul.MOD_ID);

    }
}
