package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.util.GlobalsXOverhaul;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTablesProvider;
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
        for(int i = 0; i < GlobalsXOverhaul.BLOCKS.length; i++){
            addDrop(GlobalsXOverhaul.BLOCKS[i]);
        }
    }

    private void slabDrops(){
        for(int i = 0; i < GlobalsXOverhaul.SLABS.length; i++){
            addDrop(GlobalsXOverhaul.SLABS[i], BlockLootTableGenerator::slabDrops);
        }
    }

    private void stairDrops(){
        for(int i = 0; i < GlobalsXOverhaul.STAIRS.length; i++){
            addDrop(GlobalsXOverhaul.STAIRS[i]);
        }
    }

    private void crossDrops(){
        for(int i = 0; i < GlobalsXOverhaul.CROSS.length; i++){
            addDrop(GlobalsXOverhaul.CROSS[i]);
        }
    }

    private void axisRotatedDrops(){
        for(int i = 0; i < GlobalsXOverhaul.AXIS_ROTATED.length; i++){
            addDrop(GlobalsXOverhaul.AXIS_ROTATED[i]);
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
