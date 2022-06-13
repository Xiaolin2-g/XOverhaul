package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.init.ModFood;
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

        tripwireHookTagged();
        hoeTagged();
        swordTagged();

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

    private void tripwireHookTagged(){
        copy(XOverhaulTags.Blocks.TRIPWIRE_HOOKS, XOverhaulTags.Items.TRIPWIRE_HOOKS);
    }

    private void addToHoeTag(Item item){
        getOrCreateTagBuilder(XOverhaulTags.Items.HOES).add(item);
    }

    private void hoeTagged(){
        addToHoeTag(Items.WOODEN_HOE);
        addToHoeTag(Items.STONE_HOE);
        addToHoeTag(Items.GOLDEN_HOE);
        addToHoeTag(Items.IRON_HOE);
        addToHoeTag(Items.DIAMOND_HOE);
        addToHoeTag(Items.NETHERITE_HOE);
    }

    private void addToSwordTag(Item item){
        getOrCreateTagBuilder(XOverhaulTags.Items.SWORDS).add(item);
    }

    private void swordTagged(){
        addToSwordTag(Items.WOODEN_SWORD);
        addToSwordTag(Items.STONE_SWORD);
        addToSwordTag(Items.GOLDEN_SWORD);
        addToSwordTag(Items.IRON_SWORD);
        addToSwordTag(Items.DIAMOND_SWORD);
        addToSwordTag(Items.NETHERITE_SWORD);
    }
}
