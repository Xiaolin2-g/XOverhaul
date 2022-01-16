package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementsProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.OnKilledCriterion;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementsProvider extends FabricAdvancementsProvider {
    protected ModAdvancementsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement root = Advancement.Task.create()
                .display(
                        ModBlocks.ENDER_END_STONE,
                        new TranslatableText("advancements.xoverhaul.root.title"),
                        new TranslatableText("advancements.xoverhaul.root.description"),
                        new Identifier("textures/gui/advancements/backgrounds/end.png"),
                        AdvancementFrame.TASK,
                        true, true, false)
                .criterion("killed_something", OnKilledCriterion.Conditions.createPlayerKilledEntity())
                .build(consumer, XOverhaul.MOD_ID + ":xoverhaul/root");

    }
}
