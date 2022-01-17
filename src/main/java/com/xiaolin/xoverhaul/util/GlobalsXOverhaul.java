package com.xiaolin.xoverhaul.util;

import com.xiaolin.xoverhaul.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;


public class GlobalsXOverhaul {


    // Armor Variables


    // Woodstone Armor

    public static String WOODSTONE_NAME = "woodstone";
    public static int WOODSTONE_DURABILITY_MULTIPLIER = 3;
    public static int WOODSTONE_HELMET_PROTECTION = 1;
    public static int WOODSTONE_CHESTPLATE_PROTECTION = 1;
    public static int WOODSTONE_LEGGINGS_PROTECTION = 1;
    public static int WOODSTONE_BOOTS_PROTECTION = 1;
    public static int[] WOODSTONE_PROTECTION_ARRAY = {WOODSTONE_BOOTS_PROTECTION, WOODSTONE_LEGGINGS_PROTECTION,
            WOODSTONE_CHESTPLATE_PROTECTION, WOODSTONE_HELMET_PROTECTION};
    public static int WOODSTONE_ENCHANTABILITY = 10;
    public static int WOODSTONE_ARMOR_TOUGHNESS = 0;
    public static int WOODSTONE_KNOCKBACK_RESISTANCE = 0;
    public static SoundEvent WOODSTONE_EQUIP_SOUND = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    public static Item WOODSTONE_REPAIR_INGREDIENT = Items.COBBLESTONE;


    // Monster Armor

    public static String MONSTER_NAME = "monster";
    public static int MONSTER_DURABILITY_MULTIPLIER = 5;
    public static int MONSTER_HELMET_PROTECTION = 2;
    public static int MONSTER_CHESTPLATE_PROTECTION = 4;
    public static int MONSTER_LEGGINGS_PROTECTION = 3;
    public static int MONSTER_BOOTS_PROTECTION = 1;
    public static int[] MONSTER_PROTECTION_ARRAY = {MONSTER_BOOTS_PROTECTION, MONSTER_LEGGINGS_PROTECTION,
            MONSTER_CHESTPLATE_PROTECTION, MONSTER_HELMET_PROTECTION};
    public static int MONSTER_ENCHANTABILITY = 10;
    public static int MONSTER_ARMOR_TOUGHNESS = 0;
    public static int MONSTER_KNOCKBACK_RESISTANCE = 0;
    public static SoundEvent MONSTER_EQUIP_SOUND = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    public static Item MONSTER_REPAIR_INGREDIENT = Items.COBBLESTONE;






    // Block Variables

    // Ore Generation conditions
    // public static final RuleTest PRISMARINE = new TagMatchRuleTest(XOverhaulTags.Blocks.GOLDEN_PRISMARINE_BRICK_CAN_REPLACE);

    public static RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);

    public static RuleTest SAND = new BlockMatchRuleTest(Blocks.SAND);

    public static RuleTest AIR = new BlockMatchRuleTest(Blocks.AIR);

    // Block Category List

    public static Block[] BLOCKS = {ModBlocks.ENDER_END_STONE};
    public static Block[] SLABS_BASE = {Blocks.BEDROCK};
    public static Block[] SLABS = {ModBlocks.BEDROCK_SLAB};
    public static Block[] STAIRS_BASE = {Blocks.BEDROCK};
    public static Block[] STAIRS = {ModBlocks.BEDROCK_STAIRS};


    // Item variables

    // Bark fuel time

    public static int BARK_FUEL_TIME = 100;


}
