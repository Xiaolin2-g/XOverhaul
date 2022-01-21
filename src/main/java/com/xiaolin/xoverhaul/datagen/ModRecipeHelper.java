package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.item.ModTools;
import net.minecraft.data.server.RecipesProvider;
import net.minecraft.data.server.recipe.CraftingRecipeJsonFactory;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonFactory;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonFactory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.Tag;

import java.util.function.Consumer;

public class ModRecipeHelper {

    // Convert

    public static String convertMirrored(ItemConvertible from) {
        return RecipesProvider.getItemPath(from) + "_mirrored";
    }

    // Create

    public static CraftingRecipeJsonFactory createStairsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 4)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###");
    }

    public static CraftingRecipeJsonFactory createStairsRecipe(Tag.Identified<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 4)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###");
    }

    public static CraftingRecipeJsonFactory createMirroredStairsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 4)
                .input('#', input)
                .pattern("  #")
                .pattern(" ##")
                .pattern("###");
    }

    public static CraftingRecipeJsonFactory createMirroredStairsRecipe(Tag.Identified<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 4)
                .input('#', input)
                .pattern("  #")
                .pattern(" ##")
                .pattern("###");
    }

    public static CraftingRecipeJsonFactory createHelmetRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #");
    }

    public static CraftingRecipeJsonFactory createHelmetRecipe(Tag.Identified<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #");
    }

    public static CraftingRecipeJsonFactory createChestplateRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("###")
                .pattern("###");
    }

    public static CraftingRecipeJsonFactory createChestplateRecipe(Tag.Identified<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("###")
                .pattern("###");
    }

    public static CraftingRecipeJsonFactory createLeggingsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #")
                .pattern("# #");
    }

    public static CraftingRecipeJsonFactory createLeggingsRecipe(Tag.Identified<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #")
                .pattern("# #");
    }

    public static CraftingRecipeJsonFactory createBootsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("# #");
    }

    public static CraftingRecipeJsonFactory createBootsRecipe(Tag.Identified<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("# #");
    }

    public static CraftingRecipeJsonFactory createHelmetRecipeOfTwoMaterials(ItemConvertible input,
                                                                             ItemConvertible input_2,
                                                                             ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O#O")
                .pattern("# #");
    }

    public static CraftingRecipeJsonFactory createHelmetRecipeOfTwoMaterials(Tag.Identified<Item> input,
                                                                             Tag.Identified<Item> input_2,
                                                                             ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O#O")
                .pattern("# #");
    }

    public static CraftingRecipeJsonFactory createChestplateRecipeOfTwoMaterials(ItemConvertible input,
                                                                                 ItemConvertible input_2,
                                                                                 ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O O")
                .pattern("#O#")
                .pattern("O#O");
    }

    public static CraftingRecipeJsonFactory createChestplateRecipeOfTwoMaterials(Tag.Identified<Item> input,
                                                                                 Tag.Identified<Item> input_2,
                                                                                 ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O O")
                .pattern("#O#")
                .pattern("O#O");
    }

    public static CraftingRecipeJsonFactory createLeggingsRecipeOfTwoMaterials(ItemConvertible input,
                                                                               ItemConvertible input_2,
                                                                               ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O#O")
                .pattern("# #")
                .pattern("O O");
    }

    public static CraftingRecipeJsonFactory createLeggingsRecipeOfTwoMaterials(Tag.Identified<Item> input,
                                                                               Tag.Identified<Item> input_2,
                                                                               ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O#O")
                .pattern("# #")
                .pattern("O O");
    }

    public static CraftingRecipeJsonFactory createBootsRecipeOfTwoMaterials(ItemConvertible input,
                                                                            ItemConvertible input_2,
                                                                            ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("# #")
                .pattern("O O");
    }

    public static CraftingRecipeJsonFactory createBootsRecipeOfTwoMaterials(Tag.Identified<Item> input,
                                                                            Tag.Identified<Item> input_2,
                                                                            ItemConvertible output) {
        return ShapedRecipeJsonFactory.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("# #")
                .pattern("O O");
    }



    // Offer

    public static void offerBarkRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input, ItemConvertible output){
        ShapelessRecipeJsonFactory.create(output, 1)
                .input(input).input(ModTools.SCRAPER)
                .criterion(RecipesProvider.hasItem(input), RecipesProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }


    public static void offerWoodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible log, ItemConvertible bark, ItemConvertible output){
        ShapelessRecipeJsonFactory.create(output, 1)
                .input(log).input(bark)
                .criterion(RecipesProvider.hasItem(log), RecipesProvider.conditionsFromItem(log))
                .offerTo(exporter);
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

    public static void offerDyeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input,
                                      ItemConvertible output, int outputCount){
        ShapelessRecipeJsonFactory.create(output, outputCount)
                .input(input)
                .criterion(RecipesProvider.hasItem(input), RecipesProvider.conditionsFromItem(input))
                .offerTo(exporter,
                        RecipesProvider.convertBetween(output, input));

    }

    public static void offerCompactingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input,
                                             ItemConvertible output){
        RecipesProvider.offerReversibleCompactingRecipesWithInputItemGroup(exporter, input, output,
                input + "_from_" + output, null);
    }


    public static void offerArmorRecipeOfTheSameMaterial(Consumer<RecipeJsonProvider> exporter,
                                                          ItemConvertible material,
                                                          ItemConvertible helmet,
                                                          ItemConvertible chestplate,
                                                          ItemConvertible leggings,
                                                          ItemConvertible boots){
        createHelmetRecipe(material, helmet)
                .criterion(RecipesProvider.hasItem(material),
                        RecipesProvider.conditionsFromItem(material))
                .offerTo(exporter);

        createChestplateRecipe(material, chestplate)
                .criterion(RecipesProvider.hasItem(material),
                        RecipesProvider.conditionsFromItem(material))
                .offerTo(exporter);

        createLeggingsRecipe(material, leggings)
                .criterion(RecipesProvider.hasItem(material),
                        RecipesProvider.conditionsFromItem(material))
                .offerTo(exporter);

        createBootsRecipe(material, boots)
                .criterion(RecipesProvider.hasItem(material),
                        RecipesProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void offerArmorRecipeOfTheSameMaterial(Consumer<RecipeJsonProvider> exporter,
                                                          Tag.Identified<Item> material,
                                                          String conditions,
                                                          ItemConvertible helmet,
                                                          ItemConvertible chestplate,
                                                          ItemConvertible leggings,
                                                          ItemConvertible boots){
        createHelmetRecipe(material, helmet)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createChestplateRecipe(material, chestplate)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createLeggingsRecipe(material, leggings)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createBootsRecipe(material, boots)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(material))
                .offerTo(exporter);
    }


    public static void offerArmorRecipeOfDifferentMaterials(Consumer<RecipeJsonProvider> exporter,
                                                             ItemConvertible helmet_material,
                                                             ItemConvertible chestplate_material,
                                                             ItemConvertible leggings_material,
                                                             ItemConvertible boots_material,
                                                             ItemConvertible helmet,
                                                             ItemConvertible chestplate,
                                                             ItemConvertible leggings,
                                                             ItemConvertible boots){
        createHelmetRecipe(helmet_material, helmet)
                .criterion(RecipesProvider.hasItem(helmet_material),
                        RecipesProvider.conditionsFromItem(helmet_material))
                .offerTo(exporter);

        createChestplateRecipe(chestplate_material, chestplate)
                .criterion(RecipesProvider.hasItem(chestplate_material),
                        RecipesProvider.conditionsFromItem(chestplate_material))
                .offerTo(exporter);

        createLeggingsRecipe(leggings_material, leggings)
                .criterion(RecipesProvider.hasItem(leggings_material),
                        RecipesProvider.conditionsFromItem(leggings_material))
                .offerTo(exporter);

        createBootsRecipe(boots_material, boots)
                .criterion(RecipesProvider.hasItem(boots_material),
                        RecipesProvider.conditionsFromItem(boots_material))
                .offerTo(exporter);
    }

    public static void offerArmorRecipeOfDifferentMaterials(Consumer<RecipeJsonProvider> exporter,
                                                             Tag.Identified<Item> helmet_material,
                                                             Tag.Identified<Item> chestplate_material,
                                                             Tag.Identified<Item> leggings_material,
                                                             Tag.Identified<Item> boots_material,
                                                             String conditions,
                                                             ItemConvertible helmet,
                                                             ItemConvertible chestplate,
                                                             ItemConvertible leggings,
                                                             ItemConvertible boots){
        createHelmetRecipe(helmet_material, helmet)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(helmet_material))
                .offerTo(exporter);

        createChestplateRecipe(chestplate_material, chestplate)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(chestplate_material))
                .offerTo(exporter);

        createLeggingsRecipe(leggings_material, leggings)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(leggings_material))
                .offerTo(exporter);

        createBootsRecipe(boots_material, boots)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(boots_material))
                .offerTo(exporter);
    }

    public static void offerArmorRecipeOfTwoMaterials(Consumer<RecipeJsonProvider> exporter,
                                                       ItemConvertible material,
                                                       ItemConvertible material_2,
                                                       ItemConvertible helmet,
                                                       ItemConvertible chestplate,
                                                       ItemConvertible leggings,
                                                       ItemConvertible boots){

        createHelmetRecipeOfTwoMaterials(material, material_2, helmet)
                .criterion(RecipesProvider.hasItem(material),
                        RecipesProvider.conditionsFromItem(material)).
                offerTo(exporter);

        createChestplateRecipeOfTwoMaterials(material, material_2, chestplate)
                .criterion(RecipesProvider.hasItem(material),
                        RecipesProvider.conditionsFromItem(material)).
                offerTo(exporter);

        createLeggingsRecipeOfTwoMaterials(material, material_2, leggings)
                .criterion(RecipesProvider.hasItem(material),
                        RecipesProvider.conditionsFromItem(material)).
                offerTo(exporter);

        createBootsRecipeOfTwoMaterials(material, material_2, boots)
                .criterion(RecipesProvider.hasItem(material),
                        RecipesProvider.conditionsFromItem(material)).
                offerTo(exporter);
    }

    public static void offerArmorRecipeOfTwoMaterials(Consumer<RecipeJsonProvider> exporter,
                                                      Tag.Identified<Item> material,
                                                      Tag.Identified<Item> material_2,
                                                      String conditions,
                                                      ItemConvertible helmet,
                                                      ItemConvertible chestplate,
                                                      ItemConvertible leggings,
                                                      ItemConvertible boots){

        createHelmetRecipeOfTwoMaterials(material, material_2, helmet)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createChestplateRecipeOfTwoMaterials(material, material_2, chestplate)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createLeggingsRecipeOfTwoMaterials(material, material_2, leggings)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createBootsRecipeOfTwoMaterials(material, material_2, boots)
                .criterion(conditions,
                        RecipesProvider.conditionsFromTag(material))
                .offerTo(exporter);
    }


}
