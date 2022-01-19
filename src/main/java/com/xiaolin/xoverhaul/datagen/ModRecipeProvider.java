package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.item.ModItems;
import com.xiaolin.xoverhaul.item.ModTools;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipesProvider;
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
    }

    public static String convertMirrored(ItemConvertible from) {
        return RecipesProvider.getItemPath(from) + "_mirrored";
    }

    public static void offerBarkRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input, ItemConvertible output){
        ShapelessRecipeJsonFactory.create(output, 1)
                .input(input).input(ModTools.SCRAPER)
                .criterion(RecipesProvider.hasItem(input), RecipesProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void barkRecipes(Consumer<RecipeJsonProvider> exporter){
        offerBarkRecipe(exporter, Blocks.OAK_LOG, ModItems.OAK_BARK);
        offerBarkRecipe(exporter, Blocks.BIRCH_LOG, ModItems.BIRCH_BARK);
        offerBarkRecipe(exporter, Blocks.SPRUCE_LOG, ModItems.SPRUCE_BARK);
        offerBarkRecipe(exporter, Blocks.JUNGLE_LOG, ModItems.JUNGLE_BARK);
        offerBarkRecipe(exporter, Blocks.ACACIA_LOG, ModItems.ACACIA_BARK);
        offerBarkRecipe(exporter, Blocks.DARK_OAK_LOG, ModItems.DARK_OAK_BARK);
        offerBarkRecipe(exporter, Blocks.CRIMSON_STEM, ModItems.CRIMSON_BARK);
        offerBarkRecipe(exporter, Blocks.WARPED_STEM, ModItems.WARPED_BARK);
        offerBarkRecipe(exporter, Blocks.STRIPPED_OAK_LOG, ModItems.STRIPPED_OAK_BARK);
        offerBarkRecipe(exporter, Blocks.STRIPPED_BIRCH_LOG, ModItems.STRIPPED_BIRCH_BARK);
        offerBarkRecipe(exporter, Blocks.STRIPPED_SPRUCE_LOG, ModItems.STRIPPED_SPRUCE_BARK);
        offerBarkRecipe(exporter, Blocks.STRIPPED_JUNGLE_LOG, ModItems.STRIPPED_JUNGLE_BARK);
        offerBarkRecipe(exporter, Blocks.STRIPPED_ACACIA_LOG, ModItems.STRIPPED_ACACIA_BARK);
        offerBarkRecipe(exporter, Blocks.STRIPPED_DARK_OAK_LOG, ModItems.STRIPPED_DARK_OAK_BARK);
        offerBarkRecipe(exporter, Blocks.STRIPPED_CRIMSON_STEM, ModItems.STRIPPED_CRIMSON_BARK);
        offerBarkRecipe(exporter, Blocks.STRIPPED_WARPED_STEM, ModItems.STRIPPED_WARPED_BARK);
    }


    public static void offerWoodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible log, ItemConvertible bark, ItemConvertible output){
        ShapelessRecipeJsonFactory.create(output, 1)
                .input(log).input(bark)
                .criterion(RecipesProvider.hasItem(log), RecipesProvider.conditionsFromItem(log))
                .offerTo(exporter);
    }

    private void woodRecipes(Consumer<RecipeJsonProvider> exporter){
        offerWoodRecipe(exporter, Blocks.OAK_LOG, ModItems.OAK_BARK, Blocks.OAK_WOOD);
        offerWoodRecipe(exporter, Blocks.BIRCH_LOG, ModItems.BIRCH_BARK, Blocks.BIRCH_WOOD);
        offerWoodRecipe(exporter, Blocks.SPRUCE_LOG, ModItems.SPRUCE_BARK, Blocks.SPRUCE_WOOD);
        offerWoodRecipe(exporter, Blocks.JUNGLE_LOG, ModItems.JUNGLE_BARK, Blocks.JUNGLE_WOOD);
        offerWoodRecipe(exporter, Blocks.ACACIA_LOG, ModItems.ACACIA_BARK, Blocks.ACACIA_WOOD);
        offerWoodRecipe(exporter, Blocks.DARK_OAK_LOG, ModItems.DARK_OAK_BARK, Blocks.DARK_OAK_WOOD);
        offerWoodRecipe(exporter, Blocks.CRIMSON_STEM, ModItems.CRIMSON_BARK, Blocks.CRIMSON_HYPHAE);
        offerWoodRecipe(exporter, Blocks.WARPED_STEM, ModItems.WARPED_BARK, Blocks.WARPED_HYPHAE);
        offerWoodRecipe(exporter, Blocks.STRIPPED_OAK_LOG, ModItems.STRIPPED_OAK_BARK, Blocks.STRIPPED_OAK_WOOD);
        offerWoodRecipe(exporter, Blocks.STRIPPED_BIRCH_LOG, ModItems.STRIPPED_BIRCH_BARK, Blocks.STRIPPED_BIRCH_WOOD);
        offerWoodRecipe(exporter, Blocks.STRIPPED_SPRUCE_LOG, ModItems.STRIPPED_SPRUCE_BARK, Blocks.STRIPPED_SPRUCE_WOOD);
        offerWoodRecipe(exporter, Blocks.STRIPPED_ACACIA_LOG, ModItems.STRIPPED_ACACIA_BARK, Blocks.STRIPPED_ACACIA_WOOD);
        offerWoodRecipe(exporter, Blocks.STRIPPED_DARK_OAK_LOG, ModItems.STRIPPED_DARK_OAK_BARK, Blocks.STRIPPED_DARK_OAK_WOOD);
        offerWoodRecipe(exporter, Blocks.STRIPPED_CRIMSON_STEM, ModItems.STRIPPED_CRIMSON_BARK, Blocks.STRIPPED_CRIMSON_HYPHAE);
        offerWoodRecipe(exporter, Blocks.STRIPPED_WARPED_STEM, ModItems.STRIPPED_WARPED_BARK, Blocks.STRIPPED_WARPED_HYPHAE);
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

    public static CraftingRecipeJsonFactory createStairsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                (output, 4)
                .input('#', input)
                .pattern("#  ").pattern("## ").pattern("###");
    }

    public static CraftingRecipeJsonFactory createMirroredStairsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                (output, 4)
                .input('#', input)
                .pattern("  #").pattern(" ##").pattern("###");
    }

    public static void offerStairsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input, ItemConvertible output){
        createStairsRecipe(input, output)
                .criterion(RecipesProvider.hasItem(input),
                        RecipesProvider.conditionsFromItem(input)).
                offerTo(exporter);

        createMirroredStairsRecipe(input, output)
                .criterion(RecipesProvider.hasItem(input),
                        RecipesProvider.conditionsFromItem(input)).
                offerTo(exporter, convertMirrored(output));


    }
    private void concreteStairsRecipes(Consumer<RecipeJsonProvider> exporter){
        offerStairsRecipe(exporter, Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_STAIRS);
        offerStairsRecipe(exporter, Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_STAIRS);
    }

    public static void offerDyeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input,
                                      ItemConvertible output, int outputCount){
        ShapelessRecipeJsonFactory.create(output, outputCount)
                .input(input)
                .criterion(RecipesProvider.hasItem(input), RecipesProvider.conditionsFromItem(input))
                .offerTo(exporter,
                convertBetween(output, input));

    }

    private void dyeRecipes(Consumer<RecipeJsonProvider> exporter){
        offerDyeRecipe(exporter, ModBlocks.MAGENTA_TULIP, Items.MAGENTA_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.LIGHT_BLUE_TULIP, Items.LIGHT_BLUE_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.YELLOW_TULIP, Items.YELLOW_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.LIME_TULIP, Items.LIME_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.GRAY_TULIP, Items.GRAY_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.LIGHT_GRAY_TULIP, Items.LIGHT_GRAY_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.CYAN_TULIP, Items.CYAN_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.PURPLE_TULIP, Items.PURPLE_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.BLUE_TULIP, Items.BLUE_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.BROWN_TULIP, Items.BROWN_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.GREEN_TULIP, Items.GREEN_DYE, 1);
        offerDyeRecipe(exporter, ModBlocks.BLACK_TULIP, Items.BLACK_DYE, 1);
        offerDyeRecipe(exporter, ModItems.CHARRED_BONE_MEAL, Items.BLACK_DYE, 3);


    }



}
