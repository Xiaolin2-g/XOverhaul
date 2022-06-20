package com.xiaolin.xoverhaul.init;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.item.ItemInitBase;
import com.xiaolin.xoverhaul.item.VillageCrownItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class ModArmor extends ItemInitBase {


    public static final Item WOODSTONE_HELMET = registerItem("woodstone_helmet",
            new ArmorItem(ModArmorMaterial.WOODSTONE, EquipmentSlot.HEAD,
                    new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_ARMORS)));

    public static final Item WOODSTONE_CHESTPLATE = registerItem("woodstone_chestplate",
            new ArmorItem(ModArmorMaterial.WOODSTONE, EquipmentSlot.CHEST,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ARMORS)));

    public static final Item WOODSTONE_LEGGINGS = registerItem("woodstone_leggings",
            new ArmorItem(ModArmorMaterial.WOODSTONE, EquipmentSlot.LEGS,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ARMORS)));

    public static final Item WOODSTONE_BOOTS = registerItem("woodstone_boots",
            new ArmorItem(ModArmorMaterial.WOODSTONE, EquipmentSlot.FEET,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ARMORS)));

    public static final Item MONSTER_HELMET = registerItem("monster_helmet",
            new ArmorItem(ModArmorMaterial.MONSTER, EquipmentSlot.HEAD,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ARMORS)));

    public static final Item MONSTER_CHESTPLATE = registerItem("monster_chestplate",
            new ArmorItem(ModArmorMaterial.MONSTER, EquipmentSlot.CHEST,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ARMORS)));

    public static final Item MONSTER_LEGGINGS = registerItem("monster_leggings",
            new ArmorItem(ModArmorMaterial.MONSTER, EquipmentSlot.LEGS,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ARMORS)));

    public static final Item MONSTER_BOOTS = registerItem("monster_boots",
            new ArmorItem(ModArmorMaterial.MONSTER, EquipmentSlot.FEET,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ARMORS)));

    public static final Item VILLAGE_CROWN = registerItem("village_crown",
            new VillageCrownItem(ModArmorMaterial.VILLAGE_CROWN, EquipmentSlot.HEAD,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_ARMORS)));


    public static void registerModArmor(){
        XOverhaul.LOGGER.info("Registering Mod Armor for " + XOverhaul.MOD_ID);

    }
}
