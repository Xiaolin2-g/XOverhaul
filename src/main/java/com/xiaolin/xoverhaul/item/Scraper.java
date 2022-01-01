package com.xiaolin.xoverhaul.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Scraper extends Item {
    public Scraper(Settings settings) {
        super(settings);
        settings.recipeRemainder(this);
    }

   /* @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack container = itemStack.copy();
        if(container.hurt(1, random, null)){
            return ItemStack.EMPTY;
        } else {
            return container;
        }
    }*/


}
