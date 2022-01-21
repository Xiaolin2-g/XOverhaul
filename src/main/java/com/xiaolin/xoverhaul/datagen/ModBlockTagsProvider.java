package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.util.XOverhaulTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        // getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.ENDER_END_STONE);
        getOrCreateTagBuilder(XOverhaulTags.Blocks.TRIPWIRE_HOOKS).add(Blocks.TRIPWIRE_HOOK);
    }
}
