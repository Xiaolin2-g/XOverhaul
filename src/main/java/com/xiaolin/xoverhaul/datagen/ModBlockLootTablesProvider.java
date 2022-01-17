package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.util.GlobalsXOverhaul;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTablesProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataCache;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ModBlockLootTablesProvider extends FabricBlockLootTablesProvider {
    protected ModBlockLootTablesProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {
        blockDrops();
        slabDrops();
        stairDrops();
    }

    private void blockDrops(){
        for(int i = 0; i < GlobalsXOverhaul.blocks.length; i++){
            addDrop(GlobalsXOverhaul.blocks[i]);
        }
    }

    private void slabDrops(){
        for(int i = 0; i < GlobalsXOverhaul.slabs.length; i++){
            addDrop(GlobalsXOverhaul.slabs[i], BlockLootTableGenerator::slabDrops);
        }
    }

    private void stairDrops(){
        for(int i = 0; i < GlobalsXOverhaul.stairs.length; i++){
            addDrop(GlobalsXOverhaul.stairs[i]);
        }
    }





    @Override
    public void run(DataCache cache) throws IOException {
        super.run(cache);
    }

    @NotNull
    @Override
    public Consumer<BiConsumer<Identifier, LootTable.Builder>> andThen(@NotNull Consumer<? super BiConsumer<Identifier, LootTable.Builder>> after) {
        return super.andThen(after);
    }
}
