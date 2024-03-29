package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xiaolib.datagen.ModRecipeHelper;
import com.xiaolin.xiaolib.util.ModTags;
import com.xiaolin.xiaolib.util.SmeltingGlobals;
import com.xiaolin.xoverhaul.init.*;
import com.xiaolin.xoverhaul.util.DatagenGlobals;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.tag.ItemTags;

import java.util.Map;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        //barkRecipes(exporter);
        woodRecipes(exporter);
        rebarkRecipes(exporter);

        slabRecipes(exporter);
        stairsRecipes(exporter);
        wallsRecipes(exporter);

        dyeRecipes(exporter);

        compactingRecipes(exporter);

        armorRecipes(exporter);
        horseArmorRecipes(exporter);

        smeltingRecipes(exporter);
        cookingRecipes(exporter, "smoking", RecipeSerializer.SMOKING, SmeltingGlobals.STANDARD_SMOKING_TIME);
        cookingRecipes(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, SmeltingGlobals.STANDARD_CAMPFIRE_TIME);

        smallVerticalRecipes(exporter);
        oRecipes(exporter);


        otherRecipes(exporter);
    }

   /* private void barkRecipes(Consumer<RecipeJsonProvider> exporter){
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
    }*/


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
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_JUNGLE_LOG, ModItems.STRIPPED_JUNGLE_BARK, Blocks.STRIPPED_JUNGLE_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_ACACIA_LOG, ModItems.STRIPPED_ACACIA_BARK, Blocks.STRIPPED_ACACIA_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_DARK_OAK_LOG, ModItems.STRIPPED_DARK_OAK_BARK, Blocks.STRIPPED_DARK_OAK_WOOD);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_CRIMSON_STEM, ModItems.STRIPPED_CRIMSON_BARK, Blocks.STRIPPED_CRIMSON_HYPHAE);
        ModRecipeHelper.offerWoodRecipe(exporter, Blocks.STRIPPED_WARPED_STEM, ModItems.STRIPPED_WARPED_BARK, Blocks.STRIPPED_WARPED_HYPHAE);
    }

    private void rebarkRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerRebarking(exporter, Blocks.STRIPPED_OAK_LOG, ModItems.OAK_BARK, Blocks.OAK_LOG);
        ModRecipeHelper.offerRebarking(exporter, Blocks.STRIPPED_BIRCH_LOG, ModItems.BIRCH_BARK, Blocks.BIRCH_LOG);
        ModRecipeHelper.offerRebarking(exporter, Blocks.STRIPPED_SPRUCE_LOG, ModItems.SPRUCE_BARK, Blocks.SPRUCE_LOG);
        ModRecipeHelper.offerRebarking(exporter, Blocks.STRIPPED_JUNGLE_LOG, ModItems.JUNGLE_BARK, Blocks.JUNGLE_LOG);
        ModRecipeHelper.offerRebarking(exporter, Blocks.STRIPPED_ACACIA_LOG, ModItems.ACACIA_BARK, Blocks.ACACIA_LOG);
        ModRecipeHelper.offerRebarking(exporter, Blocks.STRIPPED_DARK_OAK_LOG, ModItems.DARK_OAK_BARK, Blocks.DARK_OAK_LOG);
        ModRecipeHelper.offerRebarking(exporter, Blocks.STRIPPED_CRIMSON_STEM, ModItems.CRIMSON_BARK, Blocks.CRIMSON_STEM);
        ModRecipeHelper.offerRebarking(exporter, Blocks.STRIPPED_WARPED_STEM, ModItems.WARPED_BARK, Blocks.WARPED_STEM);
    }

    private void slabRecipes(Consumer<RecipeJsonProvider> exporter){

        for (Map.Entry<Block, Block> slabs : DatagenGlobals.SLABS.entrySet()) {
            offerSlabRecipe(exporter, slabs.getValue(), slabs.getKey());
        }
    }


    private void stairsRecipes(Consumer<RecipeJsonProvider> exporter){

        for (Map.Entry<Block, Block> stairs : DatagenGlobals.STAIRS.entrySet()) {
            ModRecipeHelper.offerStairsRecipe(exporter, stairs.getKey(), stairs.getValue());
        }
    }

    private void wallsRecipes(Consumer<RecipeJsonProvider> exporter) {

        for (Map.Entry<Block, Block> walls : DatagenGlobals.WALLS.entrySet()) {
            offerWallRecipe(exporter, walls.getValue(), walls.getKey());
        }
    }


    private void dyeRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.MAGENTA_TULIP, Items.MAGENTA_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.LIGHT_BLUE_TULIP, Items.LIGHT_BLUE_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.YELLOW_TULIP, Items.YELLOW_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.LIME_TULIP, Items.LIME_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.GRAY_TULIP, Items.GRAY_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.LIGHT_GRAY_TULIP, Items.LIGHT_GRAY_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.CYAN_TULIP, Items.CYAN_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.PURPLE_TULIP, Items.PURPLE_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.BLUE_TULIP, Items.BLUE_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.BROWN_TULIP, Items.BROWN_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.GREEN_TULIP, Items.GREEN_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModPlants.BLACK_TULIP, Items.BLACK_DYE, 1);
        ModRecipeHelper.offerDyeRecipe(exporter, ModItems.CHARRED_BONE_MEAL, Items.BLACK_DYE, 1);
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

         ModRecipeHelper.offerAnotherOne(exporter,
                 ModItems.LEATHER_ARMOR_PIECE,
                 Items.LEATHER_BOOTS, Items.LEATHER_HELMET,
                 Items.LEATHER_LEGGINGS, Items.LEATHER_CHESTPLATE);

        ModRecipeHelper.offerAnotherOne(exporter,
                ModItems.GOLDEN_ARMOR_SCRAP,
                Items.GOLDEN_BOOTS, Items.GOLDEN_HELMET,
                Items.GOLDEN_LEGGINGS, Items.GOLDEN_CHESTPLATE);
    }

    private void smeltingRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerSmelting(exporter, Items.TROPICAL_FISH, ModFood.COOKED_TROPICAL_FISH);
        ModRecipeHelper.offerSmelting(exporter, ModFood.GOLDEN_POTATO, ModFood.GOLDEN_BAKED_POTATO);
        ModRecipeHelper.offerSmelting(exporter, Items.SHEARS, Items.IRON_NUGGET);
        ModRecipeHelper.offerSmelting(exporter, Blocks.TERRACOTTA, ModBlocks.GLAZED_TERRACOTTA);
    }

    private void cookingRecipes(Consumer<RecipeJsonProvider> exporter, String cooker, CookingRecipeSerializer<?> serializer, int cookingTime){

        RecipeProvider.offerCookingRecipe(exporter, cooker, serializer, cookingTime,
                Items.TROPICAL_FISH, ModFood.COOKED_TROPICAL_FISH, SmeltingGlobals.STANDARD_XP_COOKING);

        RecipeProvider.offerCookingRecipe(exporter, cooker, serializer, cookingTime,
                ModFood.GOLDEN_POTATO, ModFood.GOLDEN_BAKED_POTATO, SmeltingGlobals.STANDARD_XP_COOKING);

    }

    private void horseArmorRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerHorseArmor(exporter, Items.LEATHER, Items.LEATHER_HORSE_ARMOR);
        ModRecipeHelper.offerHorseArmor(exporter, Items.IRON_INGOT, Items.IRON_HORSE_ARMOR);
        ModRecipeHelper.offerHorseArmor(exporter, Items.GOLD_INGOT, Items.GOLDEN_HORSE_ARMOR);
        ModRecipeHelper.offerHorseArmor(exporter, Items.DIAMOND, Items.DIAMOND_HORSE_ARMOR);

        offerShapelessRecipe(exporter, Items.LEATHER, Items.LEATHER_HORSE_ARMOR, null, 2);
        offerShapelessRecipe(exporter, Items.IRON_INGOT, Items.IRON_HORSE_ARMOR, null, 2);
        offerShapelessRecipe(exporter, Items.GOLD_INGOT, Items.GOLDEN_HORSE_ARMOR, null, 2);
        offerShapelessRecipe(exporter, Items.DIAMOND, Items.DIAMOND_HORSE_ARMOR, null, 2);
    }

    private void smallVerticalRecipes(Consumer<RecipeJsonProvider> exporter){
        ModRecipeHelper.offerSmallVertical(exporter, Blocks.GRASS, Blocks.GRASS,
                Blocks.TALL_GRASS, 1, false);

        ModRecipeHelper.offerSmallVertical(exporter, Blocks.FERN, Blocks.FERN,
                Blocks.LARGE_FERN, 1, false);

        ModRecipeHelper.offerSmallVertical(exporter, ItemTags.LOGS, ItemTags.LOGS,
                Items.STICK, "has_logs", 16, true);
    }

    private void oRecipes(Consumer<RecipeJsonProvider> exporter){

        ModRecipeHelper.offerOWithMiddle(exporter, Items.GOLD_NUGGET, Items.WHEAT,
                ModFood.GOLDEN_WHEAT,1, false);

        ModRecipeHelper.offerOWithMiddle(exporter, Items.GOLD_NUGGET, Items.POTATO,
                ModFood.GOLDEN_POTATO,1, false);

        ModRecipeHelper.offerOWithMiddle(exporter, Items.GOLD_NUGGET, Items.POISONOUS_POTATO,
                ModFood.GOLDEN_POISONOUS_POTATO,1, false);

        ModRecipeHelper.offerOWithMiddle(exporter, Items.GOLD_NUGGET, Items.BEETROOT,
                ModFood.GOLDEN_BEETROOT,1, false);

        ModRecipeHelper.offerOWithMiddle(exporter, Items.GOLD_NUGGET, Items.BLACKSTONE,
                Blocks.GILDED_BLACKSTONE,1, false);

        ModRecipeHelper.offerOWithMiddle(exporter, ItemTags.LOGS, ModTags.Items.TRIPWIRE_HOOKS,
                 Blocks.TRAPPED_CHEST, "has_logs",4, true);

        ModRecipeHelper.offerOWithMiddle(exporter, ItemTags.PLANKS, ModTags.Items.TRIPWIRE_HOOKS,
                Blocks.TRAPPED_CHEST, "has_planks",1, true);
    }

    private void sameItemOnTopOfAnotherRecipes(Consumer<RecipeJsonProvider> exporter){
       // ModRecipeHelper.offerSameItemOnTopOfAnother(exporter, Blocks.OAK_SLAB, Blocks.OAK_PLANKS, 1);
    }

    private void otherRecipes(Consumer<RecipeJsonProvider> exporter){
        // Charred Bone Meal
        offerShapelessRecipe(exporter, ModItems.CHARRED_BONE_MEAL, ModItems.CHARRED_BONE, null, 3);

        // Chest from Logs
        ShapedRecipeJsonBuilder.create(Blocks.CHEST, 4)
                .input('#', ItemTags.LOGS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                 .criterion("has_logs", RecipeProvider.conditionsFromTag(ItemTags.LOGS))
                .offerTo(exporter);

        // Cobweb
        ShapedRecipeJsonBuilder.create(Blocks.COBWEB)
                .input('#', Items.STRING)
                .pattern("# #")
                .pattern(" # ")
                .pattern("# #")
                .criterion("has_string", RecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter);

        offerShapelessRecipe(exporter, Items.STRING, Blocks.COBWEB, null, 5);

        // Dispenser
        ShapedRecipeJsonBuilder.create(Blocks.DISPENSER)
                .input('/', Items.STICK)
                .input('S', Items.STRING)
                .input('D', Blocks.DROPPER)
                .pattern(" /S")
                .pattern("/DS")
                .pattern(" /S")
                .criterion("has_dropper", RecipeProvider.conditionsFromItem(Items.DROPPER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(Blocks.DISPENSER)
                .input('/', Items.STICK)
                .input('S', Items.STRING)
                .input('D', Blocks.DROPPER)
                .pattern("S/ ")
                .pattern("SD/")
                .pattern("S/ ")
                .criterion("has_dropper", RecipeProvider.conditionsFromItem(Items.DROPPER))
                .offerTo(exporter, ModRecipeHelper.convertMirrored(Blocks.DISPENSER));

        // Dirty Sand
        ShapelessRecipeJsonBuilder.create(ModBlocks.DIRTY_SAND, 2)
                .input(Blocks.SAND)
                .input(Blocks.DIRT)
                .criterion(RecipeProvider.hasItem(Blocks.SAND),
                        RecipeProvider.conditionsFromItem(Blocks.SAND))
                .offerTo(exporter);

        // Golden Wheat
        ShapedRecipeJsonBuilder.create(ModFood.GOLDEN_BREAD)
                .input('#', ModFood.GOLDEN_WHEAT)
                .pattern("###")
                .criterion(RecipeProvider.hasItem(ModFood.GOLDEN_WHEAT), RecipeProvider.conditionsFromItem(ModFood.GOLDEN_WHEAT))
                .offerTo(exporter);

        // Name Tag
        ShapedRecipeJsonBuilder.create(Items.NAME_TAG)
                .input('#', Items.TRIPWIRE_HOOK)
                .input('P', Items.PAPER)
                .pattern("  #")
                .pattern(" P ")
                .pattern("P  ")
                .criterion(RecipeProvider.hasItem(Items.PAPER), RecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(Items.NAME_TAG)
                .input('#', Items.TRIPWIRE_HOOK)
                .input('P', Items.PAPER)
                .pattern("#  ")
                .pattern(" P ")
                .pattern("  P")
                .criterion(RecipeProvider.hasItem(Items.PAPER), RecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, ModRecipeHelper.convertMirrored(Items.NAME_TAG));

        // Saddle
        ShapedRecipeJsonBuilder.create(Items.SADDLE)
                .input('#', Items.LEATHER)
                .input('T', Items.TRIPWIRE_HOOK)
                .pattern("###")
                .pattern("# #")
                .pattern("T T")
                .criterion(RecipeProvider.hasItem(Items.LEATHER), RecipeProvider.conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);

        offerShapelessRecipe(exporter, Items.LEATHER, Items.SADDLE, null, 1);

        // Scraper

        ShapedRecipeJsonBuilder.create(ModTools.SCRAPER)
                .input('i', Items.IRON_NUGGET)
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .pattern("i  ")
                .pattern(" # ")
                .pattern("/ i")
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(ModTools.SCRAPER)
                .input('i', Items.IRON_NUGGET)
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .pattern("  i")
                .pattern(" # ")
                .pattern("i /")
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, ModRecipeHelper.convertMirrored(ModTools.SCRAPER));

        // Cake Slice

        offerShapelessRecipe(exporter, ModFood.CAKE_SLICE, Items.CAKE, null, 7);

        ModRecipeHelper.offerSevenOfTheSameItem(exporter, ModFood.CAKE_SLICE, Items.CAKE, 1);

        // Elytra

        ModRecipeHelper.offerTwoOfTheSameItem(exporter, ModItems.ELYTRA_WING, Items.ELYTRA, 1);

        // Crying Obsidian

        ModRecipeHelper.offerTwoItemsShapeless(exporter, Blocks.OBSIDIAN, Items.GHAST_TEAR, Blocks.CRYING_OBSIDIAN, 1);

        // Village Crown

        ShapedRecipeJsonBuilder.create(ModArmor.VILLAGE_CROWN)
                .input('G', Items.GOLD_INGOT)
                .input('E', Items.EMERALD)
                .pattern(" G ")
                .pattern("GEG")
                .pattern("GGG")
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

    }
}
