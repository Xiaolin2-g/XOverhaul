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

public class ModItemTagsProvider extends com.xiaolin.xiaolib.datagen.ModItemTagsProvider {
    public ModItemTagsProvider(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
        super(dataGenerator, blockTagProvider);
    }

    @Override
    protected void generateTags() {

        taggedAsTripwireHook();
        hoeTagged();
        swordTagged();

        taggedAsSlab();
        taggedAsStairs();
        fishTagged();
        stoneMaterialTagged();
    }





    private void fishTagged(){
        addToFishTag(ModFood.COOKED_TROPICAL_FISH);
    }



    private void stoneMaterialTagged(){
        addToStoneMaterialsTag(Items.DIORITE);
        addToStoneMaterialsTag(Items.GRANITE);
        addToStoneMaterialsTag(Items.ANDESITE);
        addToStoneMaterialsTag(Items.DRIPSTONE_BLOCK);
        addToStoneMaterialsTag(Items.CALCITE);
        addToStoneMaterialsTag(Items.TUFF);
    }





    private void hoeTagged(){
        addToHoeTag(Items.WOODEN_HOE);
        addToHoeTag(Items.STONE_HOE);
        addToHoeTag(Items.GOLDEN_HOE);
        addToHoeTag(Items.IRON_HOE);
        addToHoeTag(Items.DIAMOND_HOE);
        addToHoeTag(Items.NETHERITE_HOE);
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
