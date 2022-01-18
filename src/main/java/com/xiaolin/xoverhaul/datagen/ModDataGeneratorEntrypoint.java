package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ModDataGeneratorEntrypoint implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        XOverhaul.LOGGER.info("/////////////DATAGEN INITIALIZED//////////////");

        fabricDataGenerator.addProvider(ModRecipeProvider::new);
        fabricDataGenerator.addProvider(ModBlockStateDefinitionProvider::new);
        fabricDataGenerator.addProvider(ModBlockLootTablesProvider::new);
        fabricDataGenerator.addProvider(ModAdvancementsProvider::new);

        ModBlockTagsProvider blockTagsProvider = fabricDataGenerator.addProvider(ModBlockTagsProvider::new);
        fabricDataGenerator.addProvider(new ModItemTagsProvider(fabricDataGenerator, blockTagsProvider));

    }
}
