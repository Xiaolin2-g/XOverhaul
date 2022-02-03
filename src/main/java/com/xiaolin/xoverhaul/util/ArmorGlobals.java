package com.xiaolin.xoverhaul.util;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorGlobals {

    // Woodstone Armor

    public static final String WOODSTONE_NAME = "woodstone";
    public static final int WOODSTONE_DURABILITY_MULTIPLIER = 3;
    public static final int WOODSTONE_HELMET_PROTECTION = 1;
    public static final int WOODSTONE_CHESTPLATE_PROTECTION = 1;
    public static final int WOODSTONE_LEGGINGS_PROTECTION = 1;
    public static final int WOODSTONE_BOOTS_PROTECTION = 1;
    public static final int[] WOODSTONE_PROTECTION_ARRAY = {WOODSTONE_BOOTS_PROTECTION, WOODSTONE_LEGGINGS_PROTECTION,
            WOODSTONE_CHESTPLATE_PROTECTION, WOODSTONE_HELMET_PROTECTION};
    public static final int WOODSTONE_ENCHANTABILITY = 10;
    public static final int WOODSTONE_ARMOR_TOUGHNESS = 0;
    public static final int WOODSTONE_KNOCKBACK_RESISTANCE = 0;
    public static final SoundEvent WOODSTONE_EQUIP_SOUND = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    public static final Item WOODSTONE_REPAIR_INGREDIENT = Items.COBBLESTONE;


    // Monster Armor

    public static final String MONSTER_NAME = "monster";
    public static final int MONSTER_DURABILITY_MULTIPLIER = 5;
    public static final int MONSTER_HELMET_PROTECTION = 2;
    public static final int MONSTER_CHESTPLATE_PROTECTION = 4;
    public static final int MONSTER_LEGGINGS_PROTECTION = 3;
    public static final int MONSTER_BOOTS_PROTECTION = 1;
    public static final int[] MONSTER_PROTECTION_ARRAY = {MONSTER_BOOTS_PROTECTION, MONSTER_LEGGINGS_PROTECTION,
            MONSTER_CHESTPLATE_PROTECTION, MONSTER_HELMET_PROTECTION};
    public static final int MONSTER_ENCHANTABILITY = 10;
    public static final int MONSTER_ARMOR_TOUGHNESS = 0;
    public static final int MONSTER_KNOCKBACK_RESISTANCE = 0;
    public static final SoundEvent MONSTER_EQUIP_SOUND = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    public static final Item MONSTER_REPAIR_INGREDIENT = Items.AIR;




}
