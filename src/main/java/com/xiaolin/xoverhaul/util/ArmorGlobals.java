package com.xiaolin.xoverhaul.util;

import com.xiaolin.xiaolib.util.ModArmorData;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorGlobals {


    public static final ModArmorData WOODSTONE  = new ModArmorData(
            "woodstone", 3,
            1, 1, 1, 1,
            10, 0, 0,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Items.COBBLESTONE);

    public static final ModArmorData MONSTER  = new ModArmorData(
            "monster", 5,
            2, 4, 3, 1,
            10, 0, 0,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Items.AIR);

    public static final ModArmorData VILLAGE_CROWN  = new ModArmorData(
            "village_crown", 1,
            1, 0, 0, 0,
            0, 0, 0,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, Items.GOLD_INGOT);

}
