package com.xiaolin.xoverhaul.datagen;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonObject;
import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.init.ModBlocks;
import com.xiaolin.xoverhaul.init.ModItems;
import com.xiaolin.xoverhaul.init.ModPlants;
import com.xiaolin.xoverhaul.init.ModSpawnEggs;
import com.xiaolin.xoverhaul.util.XOverhaulTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.StoryTabAdvancementGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.predicate.BlockPredicate;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.ItemTags;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import org.lwjgl.system.CallbackI;

import java.util.List;
import java.util.function.Consumer;

public class ModAdvancementsProvider extends FabricAdvancementProvider {
    protected ModAdvancementsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {

    }
}
/*
    private final String killedSomething = "killed_something";

    private final String progression = "progression";
    private final String story = "story";
    private final String end = "end";
    private final String minecraft = "minecraft";

    private final Identifier storyRoot = new Identifier(minecraft + ":story/root");

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {

        Advancement ROOT = createRootAdvancement(consumer,
                ModItems.IRON_CORE, end,
                killedSomething, new TickCriterion().trigger(),
                progression);

        Advancement KILL_LEATHERLING = createProgressionAdvancement(consumer,
                ModSpawnEggs.LEATHERLING_SPAWN_EGG, "kill_leatherling",
                killedSomething, OnKilledCriterion.Conditions.createPlayerKilledEntity(EntityPredicate.Builder.create().type(ModEntities.LEATHERLING)),
                ROOT, null);



        Advancement BENCHMARKING = createStoryAdvancement(consumer,

                Blocks.CRAFTING_TABLE, "benchmarking",
                "inventory_changed", InventoryChangedCriterion.Conditions.items(Blocks.CRAFTING_TABLE),
                root);


        Advancement GETTING_WOOD = createStoryAdvancement(consumer,
                Blocks.OAK_LOG, "getting_wood",
                "inventory_changed", InventoryChangedCriterion.Conditions.items(ItemPredicate.Builder.create().tag(ItemTags.LOGS).build()),
                ROOT);

        Advancement HOT_TOPIC = createStoryAdvancement(consumer,
                Blocks.FURNACE, "hot_topic",
                "inventory_changed", InventoryChangedCriterion.Conditions.items(Blocks.FURNACE),
                ROOT);

        Advancement TIME_TO_FARM = createStoryAdvancement(consumer,
                Items.WOODEN_HOE, "time_to_farm",
                "inventory_changed", InventoryChangedCriterion.Conditions.items(ItemPredicate.Builder.create().tag(XOverhaulTags.Items.HOES).build()),
                ROOT);

        Advancement BAKE_BREAD = createStoryAdvancement(consumer,
                Items.BREAD, "bake_bread",
                "inventory_changed", InventoryChangedCriterion.Conditions.items(Items.BREAD),
                ROOT);

        Advancement THE_LIE = createStoryAdvancement(consumer,
                Items.CAKE, "the_lie",
                "inventory_changed", InventoryChangedCriterion.Conditions.items(Items.CAKE),
                ROOT);

        Advancement TIME_TO_STRIKE = createStoryAdvancement(consumer,
                Items.WOODEN_SWORD, "time_to_strike",
                "inventory_changed", InventoryChangedCriterion.Conditions.items(ItemPredicate.Builder.create().tag(XOverhaulTags.Items.SWORDS).build()),
                ROOT);

    }


    public Advancement createAdvancement(Consumer<Advancement> consumer, ItemConvertible icon, String name,
                                         String namespace, Identifier background,
                                         AdvancementFrame advancementFrame,
                                         boolean showToast, boolean announceToChat, boolean hidden,
                                         String criterion_id, CriterionConditions criterion,
                                         Advancement parent, String tabName, AdvancementRewards rewards) {

        return Advancement.Builder.create()
                .display(icon,
                        new TranslatableText("advancements." + XOverhaul.MOD_ID + "." + name + "." + "title"),
                        new TranslatableText("advancements." + XOverhaul.MOD_ID + "." + name + "." + "description"),
                        background,
                        advancementFrame,
                        showToast, announceToChat, hidden)
                .criterion(criterion_id, criterion)
                .parent(parent)
                .rewards(rewards)
                .build(consumer, namespace + ":" + tabName + "/" + name);
    }

    public Advancement createAdvancement(Consumer<Advancement> consumer, ItemConvertible icon, String name,
                                         String namespace, Identifier background,
                                         AdvancementFrame advancementFrame,
                                         boolean showToast, boolean announceToChat, boolean hidden,
                                         String criterion_id, CriterionConditions criterion,
                                         Identifier parent, String tabName, AdvancementRewards rewards) {

        return Advancement.Builder.create()
                .display(icon,
                        new TranslatableText("advancements." + XOverhaul.MOD_ID + "." + name + "." + "title"),
                        new TranslatableText("advancements." + XOverhaul.MOD_ID + "." + name + "." + "description"),
                        background,
                        advancementFrame,
                        showToast, announceToChat, hidden)
                .criterion(criterion_id, criterion)
                .parent(parent)
                .rewards(rewards)
                .build(consumer, namespace + ":" + tabName + "/" + name);
    }

    // new Identifier("textures/gui/advancements/backgrounds/" + background + ".png"),

    public Advancement createBasicAdvancement(Consumer<Advancement> consumer,
                                              ItemConvertible icon, String name,
                                              String background,
                                              String criterion_id, CriterionConditions criterion,
                                              Advancement parent, String tabName, AdvancementRewards rewards) {
        return createAdvancement(consumer,
                icon, name, XOverhaul.MOD_ID,
                new Identifier("textures/gui/advancements/backgrounds/" + background + ".png"),
                AdvancementFrame.TASK, true, true, false,
                criterion_id, criterion,
                parent, tabName, rewards);
    }


    public Advancement createRootAdvancement(Consumer<Advancement> consumer,
                                             ItemConvertible icon, String background,
                                             String criterion_id, CriterionConditions criterion,
                                             String tabName, AdvancementRewards rewards) {
        return createBasicAdvancement(consumer,
                icon, "root",
                background,
                criterion_id, criterion,
                null, tabName, rewards);

    }

    public Advancement createProgressionAdvancement(Consumer<Advancement> consumer,
                                                    ItemConvertible icon, String name,
                                                    String criterion_id, CriterionConditions criterion,
                                                    Advancement parent, AdvancementRewards rewards){
        return createBasicAdvancement(consumer,
                icon, name,
                null,
                criterion_id, criterion,
                parent, progression, rewards);
    }

    public Advancement createStoryAdvancement(Consumer<Advancement> consumer,
                                              ItemConvertible icon, String name,
                                              String criterion_id, CriterionConditions criterion,
                                              Advancement parent, AdvancementRewards rewards){
        return createBasicAdvancement(consumer,
                icon, name,
                null,
                criterion_id, criterion,
                parent, story, rewards);
    }
*/

