package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.item.ModFood;
import com.xiaolin.xoverhaul.util.XOverhaulTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
        super(dataGenerator, blockTagProvider);
    }

    @Override
    protected void generateTags() {
        copy(XOverhaulTags.Blocks.TRIPWIRE_HOOKS, XOverhaulTags.Items.TRIPWIRE_HOOKS);
        slabTagged();
        stairsTagged();
        fishTagged();
        stoneMaterialTagged();
    }

    private void slabTagged(){
        copy(BlockTags.SLABS, ItemTags.SLABS);
    }

    private void stairsTagged(){
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
    }

    private void addToFishesTag(Item item){
        getOrCreateTagBuilder(ItemTags.FISHES).add(item);
    }

    private void fishTagged(){
        addToFishesTag(ModFood.COOKED_TROPICAL_FISH);
    }

    private void addToStoneMaterialsTag(Item item){
        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS).add(item);
        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS).add(item);
    }

    private void stoneMaterialTagged(){
        addToStoneMaterialsTag(Items.DIORITE);
        addToStoneMaterialsTag(Items.GRANITE);
        addToStoneMaterialsTag(Items.ANDESITE);
        addToStoneMaterialsTag(Items.DRIPSTONE_BLOCK);
        addToStoneMaterialsTag(Items.CALCITE);
        addToStoneMaterialsTag(Items.TUFF);
    }
}
