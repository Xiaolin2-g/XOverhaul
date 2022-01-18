package com.xiaolin.xoverhaul.util;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.item.ModArmor;
import com.xiaolin.xoverhaul.item.ModFood;
import com.xiaolin.xoverhaul.item.ModItems;
import com.xiaolin.xoverhaul.item.ModTools;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    public static Block[] BLOCKS =
            {ModBlocks.DIRTY_SAND, ModBlocks.PURPUR_COBBLESTONE, ModBlocks.ROTTEN_FLESH_BLOCK,
             ModBlocks.SOUL_NETHERRACK, ModBlocks.SOUL_NETHER_BRICKS, ModBlocks.ENDER_END_STONE};

    public static Block[] SLABS_BASE =
            {Blocks.WHITE_CONCRETE, Blocks.ORANGE_CONCRETE, Blocks.MAGENTA_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE,
             Blocks.YELLOW_CONCRETE, Blocks.LIME_CONCRETE, Blocks.PINK_CONCRETE, Blocks.GRAY_CONCRETE,
             Blocks.LIGHT_GRAY_CONCRETE, Blocks.CYAN_CONCRETE, Blocks.PURPLE_CONCRETE, Blocks.BLUE_CONCRETE,
             Blocks.BROWN_CONCRETE, Blocks.GREEN_CONCRETE, Blocks.RED_CONCRETE, Blocks.BLACK_CONCRETE,
            Blocks.DIRT, Blocks.BEDROCK};

    public static Block[] SLABS =
            {ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_SLAB,
             ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_SLAB,
             ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB,
             ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_SLAB,
             ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_SLAB,
             ModBlocks.BLACK_CONCRETE_SLAB,
                    ModBlocks.DIRT_SLAB, ModBlocks.BEDROCK_SLAB};

    public static Block[] STAIRS_BASE =
            {Blocks.WHITE_CONCRETE, Blocks.ORANGE_CONCRETE, Blocks.MAGENTA_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE,
             Blocks.YELLOW_CONCRETE, Blocks.LIME_CONCRETE, Blocks.PINK_CONCRETE, Blocks.GRAY_CONCRETE,
             Blocks.LIGHT_GRAY_CONCRETE, Blocks.CYAN_CONCRETE, Blocks.PURPLE_CONCRETE, Blocks.BLUE_CONCRETE,
             Blocks.BROWN_CONCRETE, Blocks.GREEN_CONCRETE, Blocks.RED_CONCRETE, Blocks.BLACK_CONCRETE,
            Blocks.BEDROCK};

    public static Block[] STAIRS =
            {ModBlocks.WHITE_CONCRETE_STAIRS, ModBlocks.ORANGE_CONCRETE_STAIRS, ModBlocks.MAGENTA_CONCRETE_STAIRS,
             ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, ModBlocks.YELLOW_CONCRETE_STAIRS, ModBlocks.LIME_CONCRETE_STAIRS,
             ModBlocks.PINK_CONCRETE_STAIRS, ModBlocks.GRAY_CONCRETE_STAIRS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS,
             ModBlocks.CYAN_CONCRETE_STAIRS, ModBlocks.PURPLE_CONCRETE_STAIRS, ModBlocks.BLUE_CONCRETE_STAIRS,
             ModBlocks.BROWN_CONCRETE_STAIRS, ModBlocks.GREEN_CONCRETE_STAIRS, ModBlocks.RED_CONCRETE_STAIRS,
             ModBlocks.BLACK_CONCRETE_STAIRS,
                    ModBlocks.BEDROCK_STAIRS};

    public static Block[] CROSS =
            {ModBlocks.ENDER_FLOWER, ModBlocks.MAGENTA_TULIP, ModBlocks.LIGHT_BLUE_TULIP, ModBlocks.YELLOW_TULIP,
                    ModBlocks.LIME_TULIP, ModBlocks.GRAY_TULIP, ModBlocks.LIGHT_GRAY_TULIP, ModBlocks.CYAN_TULIP,
                    ModBlocks.PURPLE_TULIP, ModBlocks.BLUE_TULIP, ModBlocks.BROWN_TULIP, ModBlocks.GREEN_TULIP,
                    ModBlocks.BLACK_TULIP};

    public static Block[] AXIS_ROTATED =
            {ModBlocks.CHARRED_BONE_BLOCK};


    // Item variables

    public static Item[] ITEMS =
            {ModItems.IRON_CORE, ModItems.CHARRED_BONE, ModItems.CHARRED_BONE_MEAL, ModItems.LEATHER_ARMOR_PIECE,
            ModItems.GOLD_ARMOR_SCRAP, ModItems.OAK_BARK, ModItems.BIRCH_BARK, ModItems.SPRUCE_BARK,
            ModItems.JUNGLE_BARK, ModItems.ACACIA_BARK, ModItems.DARK_OAK_BARK, ModItems.CRIMSON_BARK,
            ModItems.WARPED_BARK, ModItems.STRIPPED_OAK_BARK, ModItems.STRIPPED_BIRCH_BARK,
            ModItems.STRIPPED_SPRUCE_BARK, ModItems.STRIPPED_JUNGLE_BARK, ModItems.STRIPPED_ACACIA_BARK,
            ModItems.STRIPPED_DARK_OAK_BARK, ModItems.STRIPPED_CRIMSON_BARK, ModItems.STRIPPED_WARPED_BARK,
            ModItems.GLUE};

    /* public static Item[] ARMORS =
            {ModArmor.WOODSTONE_HELMET, ModArmor.WOODSTONE_CHESTPLATE, ModArmor.WOODSTONE_LEGGINGS,
                    ModArmor.WOODSTONE_BOOTS, ModArmor.MONSTER_HELMET, ModArmor.MONSTER_CHESTPLATE, ModArmor.MONSTER_LEGGINGS,
                    ModArmor.MONSTER_BOOTS}; */

    public static Item[] TOOLS = {
            ModTools.SCRAPER};

    public static Item[] FOODS = {
            ModFood.GOLDEN_BEETROOT, ModFood.GOLDEN_WHEAT,
            ModFood.GOLDEN_BREAD, ModFood.GOLDEN_POTATO ,ModFood.GOLDEN_BAKED_POTATO, ModFood.GOLDEN_POISONOUS_POTATO,
            ModFood.COOKED_TROPICAL_FISH};
    // Bark fuel time

    public static int BARK_FUEL_TIME = 100;


}
