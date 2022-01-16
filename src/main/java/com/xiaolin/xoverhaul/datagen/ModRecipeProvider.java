package com.xiaolin.xoverhaul.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipesProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipesProvider {
    public ModRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

    }
}
