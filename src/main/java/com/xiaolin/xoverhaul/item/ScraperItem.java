package com.xiaolin.xoverhaul.item;

import com.xiaolin.xiaolib.item.DontConsumeOnCraftItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ScraperItem extends DontConsumeOnCraftItem {
    public ScraperItem(Settings settings) {
        super(settings);
        // settings.recipeRemainder(this);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("tooltip.xoverhaul.scraper"));
    }
}
