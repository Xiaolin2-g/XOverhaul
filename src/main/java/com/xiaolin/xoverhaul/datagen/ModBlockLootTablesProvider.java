package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.util.GlobalsXOverhaul;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTablesProvider;
import net.minecraft.block.Block;
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
        crossDrops();
        axisRotatedDrops();
    }

    private void blockDrops(){
        for(Block block : GlobalsXOverhaul.BLOCKS){
            addDrop(block);
        }
    }

    private void slabDrops(){
        for(Block slab : GlobalsXOverhaul.SLABS){
            addDrop(slab, BlockLootTableGenerator::slabDrops);
        }
    }

    private void stairDrops(){
        for(Block stairs : GlobalsXOverhaul.STAIRS){
            addDrop(stairs);
        }
    }

    private void crossDrops(){
        for(Block block : GlobalsXOverhaul.CROSS){
            addDrop(block);
        }
    }

    private void axisRotatedDrops(){
        for(Block block : GlobalsXOverhaul.AXIS_ROTATED){
            addDrop(block);
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
