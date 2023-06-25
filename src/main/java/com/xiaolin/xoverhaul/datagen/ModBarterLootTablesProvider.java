package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.init.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.DataCache;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ModBarterLootTablesProvider extends SimpleFabricLootTableProvider {

    public ModBarterLootTablesProvider(FabricDataGenerator dataGenerator, LootContextType lootContextType) {
        super(dataGenerator, lootContextType);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(
                LootTables.PIGLIN_BARTERING_GAMEPLAY,
                LootTable.builder().pool(
                        LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).with(ItemEntry.builder
                                (ModBlocks.ENDER_END_STONE))
                )
        );
    }

    @NotNull
    @Override
    public Consumer<BiConsumer<Identifier, LootTable.Builder>> andThen(@NotNull Consumer<? super BiConsumer<Identifier, LootTable.Builder>> after) {
        return super.andThen(after);
    }

    @Override
    public void run(DataCache cache) throws IOException {
        super.run(cache);
    }
}
