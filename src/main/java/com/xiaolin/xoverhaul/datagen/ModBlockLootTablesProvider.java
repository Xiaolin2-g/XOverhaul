package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.block.ModPlants;
import com.xiaolin.xoverhaul.util.DatagenGlobals;
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
        wallsDrops();
        crossDrops();
        axisRotatedDrops();
    }

    private void blockDrops(){
        for(Block block : DatagenGlobals.BLOCKS){
            if(block != ModBlocks.WOODEN_CRATE){
                addDrop(block);
            }
        }
    }

    private void slabDrops(){
        for(Block slab : DatagenGlobals.SLABS.values()){
            addDrop(slab, BlockLootTableGenerator::slabDrops);
        }
    }

    private void stairDrops(){
        for(Block stairs : DatagenGlobals.STAIRS.values()){
            addDrop(stairs);
        }
    }

    private void wallsDrops(){
        for(Block walls : DatagenGlobals.WALLS.values()){
            addDrop(walls);
        }
    }


    private void crossDrops(){
        for(Block block : DatagenGlobals.CROSS){
            if(block != ModPlants.CRIMSON_SPROUTS){
                addDrop(block);
            }
            else{
                addVinePlantDrop(block, block);
            }
        }
    }

    private void axisRotatedDrops(){
        for(Block block : DatagenGlobals.AXIS_ROTATED){
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
