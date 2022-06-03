package com.xiaolin.xoverhaul.datagen;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.init.ModBlocks;
import com.xiaolin.xoverhaul.init.ModPlants;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.CriterionConditions;
import net.minecraft.advancement.criterion.OnKilledCriterion;
import net.minecraft.item.ItemConvertible;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementsProvider extends FabricAdvancementProvider {
    protected ModAdvancementsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    private String killedSomething = "killed_something";

    private String progression = "progression";

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement root = createRootAdvancement(consumer,
                ModBlocks.ENDER_END_STONE, progression, killedSomething,
                OnKilledCriterion.Conditions.createEntityKilledPlayer(), "end");

        Advancement advancement = createProgressionAdvancement(consumer,
                ModPlants.TREE_FUNGUS, "advancement2", killedSomething,
                OnKilledCriterion.Conditions.createEntityKilledPlayer(), root);

    }

    public Advancement createAdvancement(Consumer<Advancement> consumer, ItemConvertible icon, String name, String tabName, String criterion_id, CriterionConditions criterion,
                                         boolean showToast, boolean announceToChat, boolean hidden, Advancement parent, AdvancementFrame advancementFrame, String background) {
        return Advancement.Builder.create()
                .display(icon,
                        new TranslatableText("advancements." + XOverhaul.MOD_ID + "." + name + "." + "title"),
                        new TranslatableText("advancements." + XOverhaul.MOD_ID + "." + name + "." + "description"),
                        new Identifier("textures/gui/advancements/backgrounds/" + background + ".png"),
                        advancementFrame,
                        showToast, announceToChat, hidden)
                .criterion(criterion_id, criterion)
                .parent(parent)
                .build(consumer, XOverhaul.MOD_ID + ":" + tabName + "/" + name);
    }

    public Advancement createBasicAdvancement(Consumer<Advancement> consumer, ItemConvertible icon, String name, String tabName, String criterion_id, CriterionConditions criterion, Advancement parent, String background) {
        return createAdvancement(consumer,
                icon, name, tabName,
                criterion_id, criterion,
                true, true, false,
                parent, AdvancementFrame.TASK, background);
    }

    public Advancement createHiddenAdvancement(Consumer<Advancement> consumer, ItemConvertible icon, String name, String tabName, String criterion_id, CriterionConditions criterion, Advancement parent, String background) {
        return createAdvancement(consumer,
                icon, name, tabName,
                criterion_id, criterion,
                true, true, true,
                parent, AdvancementFrame.TASK, background);
    }

    public Advancement createRootAdvancement(Consumer<Advancement> consumer, ItemConvertible icon, String tabName, String criterion_id, CriterionConditions criterion, String background) {
        return createBasicAdvancement(consumer,
                icon, "root", tabName,
                criterion_id, criterion,
                null, background);

    }

    public Advancement createProgressionAdvancement(Consumer<Advancement> consumer, ItemConvertible icon, String name, String criterion_id, CriterionConditions criterion, Advancement parent){
        return createBasicAdvancement(consumer,
                icon, name, progression,
                criterion_id, criterion,
                parent, "end");
    }


}
