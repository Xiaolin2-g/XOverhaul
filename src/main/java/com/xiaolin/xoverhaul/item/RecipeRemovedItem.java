package com.xiaolin.xoverhaul.item;

import it.unimi.dsi.fastutil.Hash;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class RecipeRemovedItem extends Item {
    public RecipeRemovedItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
       tooltip.add(new TranslatableText("tooltip.xoverhaul.recipe_removed_item_1"));
       tooltip.add(new TranslatableText("tooltip.xoverhaul.recipe_removed_item_2"));

    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        super.onCraft(stack, world, player);

        // Enchantment HashMap
        HashMap<Enchantment, Integer> enchantments = new HashMap<>();

        // Putting an enchantment on the map
        enchantments.put(Enchantments.EFFICIENCY, 1); // Efficiency 1 for testing, can be any enchantment.

        // If the item doesn't have already the enchantments
        if(!stack.getEnchantments().contains(enchantments)){

            // Enchant
            EnchantmentHelper.set(enchantments, stack);
        }

    }
}
