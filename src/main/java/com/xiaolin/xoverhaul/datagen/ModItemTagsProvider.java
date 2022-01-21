package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.util.XOverhaulTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.Tag;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
        super(dataGenerator, blockTagProvider);
    }

    @Override
    protected void generateTags() {
        copy(XOverhaulTags.Blocks.TRIPWIRE_HOOKS, XOverhaulTags.Items.TRIPWIRE_HOOKS);
    }
}
