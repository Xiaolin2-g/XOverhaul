package com.xiaolin.xoverhaul.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RecipeRemovedItem extends Item {
    public RecipeRemovedItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
       tooltip.add(new TranslatableText("tooltip.xoverhaul.recipe_removed_item_1"));
       tooltip.add(new TranslatableText("tooltip.xoverhaul.recipe_removed_item_2"));

    }
}
