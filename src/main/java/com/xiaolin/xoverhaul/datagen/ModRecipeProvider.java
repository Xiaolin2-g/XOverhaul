package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.item.ModArmor;
import com.xiaolin.xoverhaul.item.ModItems;
import com.xiaolin.xoverhaul.item.ModTools;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipesProvider;
import net.fabricmc.fabric.impl.tag.extension.TagDelegate;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.RecipesProvider;
import net.minecraft.data.server.recipe.CraftingRecipeJsonFactory;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonFactory;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonFactory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipesProvider {
    public ModRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        barkRecipes(exporter);
        woodRecipes(exporter);
        concreteSlabRecipes(exporter);
        concreteStairsRecipes(exporter);
        dyeRecipes(exporter);
        compactingRecipes(exporter);
        armorRecipes(exporter);
    }

    private void barkRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.OAK_LOG, ModItems.OAK_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.BIRCH_LOG, ModItems.BIRCH_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.SPRUCE_LOG, ModItems.SPRUCE_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.JUNGLE_LOG, ModItems.JUNGLE_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.ACACIA_LOG, ModItems.ACACIA_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.DARK_OAK_LOG, ModItems.DARK_OAK_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.CRIMSON_STEM, ModItems.CRIMSON_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.WARPED_STEM, ModItems.WARPED_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.STRIPPED_OAK_LOG, ModItems.STRIPPED_OAK_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.STRIPPED_BIRCH_LOG, ModItems.STRIPPED_BIRCH_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.STRIPPED_SPRUCE_LOG, ModItems.STRIPPED_SPRUCE_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.STRIPPED_JUNGLE_LOG, ModItems.STRIPPED_JUNGLE_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.STRIPPED_ACACIA_LOG, ModItems.STRIPPED_ACACIA_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.STRIPPED_DARK_OAK_LOG, ModItems.STRIPPED_DARK_OAK_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.STRIPPED_CRIMSON_STEM, ModItems.STRIPPED_CRIMSON_BARK);
        ModRecipeHelper.offerBarkRecipe(exporter, Blocks.STRIPPED_WARPED_STEM, ModItems.STRIPPED_WARPED_BARK);
    }


    private void woodRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.OAK_LOG, ModItems.OAK_BARK, Blocks.OAK_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.BIRCH_LOG, ModItems.BIRCH_BARK, Blocks.BIRCH_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.SPRUCE_LOG, ModItems.SPRUCE_BARK, Blocks.SPRUCE_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.JUNGLE_LOG, ModItems.JUNGLE_BARK, Blocks.JUNGLE_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.ACACIA_LOG, ModItems.ACACIA_BARK, Blocks.ACACIA_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.DARK_OAK_LOG, ModItems.DARK_OAK_BARK, Blocks.DARK_OAK_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.CRIMSON_STEM, ModItems.CRIMSON_BARK, Blocks.CRIMSON_HYPHAE);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.WARPED_STEM, ModItems.WARPED_BARK, Blocks.WARPED_HYPHAE);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_OAK_LOG, ModItems.STRIPPED_OAK_BARK, Blocks.STRIPPED_OAK_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_BIRCH_LOG, ModItems.STRIPPED_BIRCH_BARK, Blocks.STRIPPED_BIRCH_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_SPRUCE_LOG, ModItems.STRIPPED_SPRUCE_BARK, Blocks.STRIPPED_SPRUCE_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_ACACIA_LOG, ModItems.STRIPPED_ACACIA_BARK, Blocks.STRIPPED_ACACIA_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_DARK_OAK_LOG, ModItems.STRIPPED_DARK_OAK_BARK, Blocks.STRIPPED_DARK_OAK_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_CRIMSON_STEM, ModItems.STRIPPED_CRIMSON_BARK, Blocks.STRIPPED_CRIMSON_HYPHAE);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_WARPED_STEM, ModItems.STRIPPED_WARPED_BARK, Blocks.STRIPPED_WARPED_HYPHAE);
    }

    private void concreteSlabRecipes(Consumer<RecipeJsonProvider> exporter){
        offerSlabRecipe(exporter, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
        offerSlabRecipe(exporter, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);
    }


    private void concreteStairsRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_STAIRS);
        ModRecipeHelper.offerStairsRecipe(exporter, Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_STAIRS);
    }


    private void dyeRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.MAGENTA_TULIP, Items.MAGENTA_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.LIGHT_BLUE_TULIP, Items.LIGHT_BLUE_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.YELLOW_TULIP, Items.YELLOW_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.LIME_TULIP, Items.LIME_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.GRAY_TULIP, Items.GRAY_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.LIGHT_GRAY_TULIP, Items.LIGHT_GRAY_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.CYAN_TULIP, Items.CYAN_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.PURPLE_TULIP, Items.PURPLE_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.BLUE_TULIP, Items.BLUE_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.BROWN_TULIP, Items.BROWN_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.GREEN_TULIP, Items.GREEN_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModBlocks.BLACK_TULIP, Items.BLACK_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModItems.CHARRED_BONE_MEAL, Items.BLACK_DYE, 3);
    }


    private void compactingRecipes(Consumer<RecipeJsonProvider> exporter){

        ModRecipeHelper.offerCompactingRecipe(exporter, Items.ROTTEN_FLESH, ModBlocks.ROTTEN_FLESH_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, ModItems.CHARRED_BONE_MEAL, ModBlocks.CHARRED_BONE_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.TUBE_CORAL, Blocks.TUBE_CORAL_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.BRAIN_CORAL, Blocks.BRAIN_CORAL_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.BUBBLE_CORAL, Blocks.BUBBLE_CORAL_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.FIRE_CORAL, Blocks.FIRE_CORAL_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.HORN_CORAL, Blocks.HORN_CORAL_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.DEAD_TUBE_CORAL, Blocks.DEAD_TUBE_CORAL_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.DEAD_BRAIN_CORAL, Blocks.DEAD_BRAIN_CORAL_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.DEAD_BUBBLE_CORAL, Blocks.DEAD_BUBBLE_CORAL_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.DEAD_FIRE_CORAL, Blocks.DEAD_FIRE_CORAL_BLOCK.asItem());
        ModRecipeHelper.offerCompactingRecipe(exporter, Items.DEAD_HORN_CORAL, Blocks.DEAD_HORN_CORAL_BLOCK.asItem());
    }


    private void armorRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerArmorRecipeOfTwoMaterials(exporter,
                (ItemTags.PLANKS), (ItemTags.STONE_CRAFTING_MATERIALS),
                "has_planks",
                ModArmor.WOODSTONE_HELMET, ModArmor.WOODSTONE_CHESTPLATE,
                ModArmor.WOODSTONE_LEGGINGS, ModArmor.WOODSTONE_BOOTS);

        ModRecipeHelper.offerArmorRecipeOfDifferentMaterials(exporter,
                Items.BONE, Items.ROTTEN_FLESH, Items.SPIDER_EYE, Items.GUNPOWDER,
                ModArmor.MONSTER_HELMET, ModArmor.MONSTER_CHESTPLATE,
                ModArmor.MONSTER_LEGGINGS, ModArmor.MONSTER_BOOTS);

         ModRecipeHelper.offerArmorRecipeOfTheSameMaterial(exporter,
                 Items.CHAIN,
                 Items.CHAINMAIL_HELMET, Items.CHAINMAIL_CHESTPLATE,
                 Items.CHAINMAIL_LEGGINGS, Items.CHAINMAIL_BOOTS);
    }




}
