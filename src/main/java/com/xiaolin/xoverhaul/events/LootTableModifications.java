package com.xiaolin.xoverhaul.events;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.minecraft.data.server.FishingLootTableGenerator;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import javax.swing.text.html.parser.Entity;

public class LootTableModifications {

    private static final Identifier ENDER_DRAGON_LOOT_TABLE_ID = EntityType.ENDER_DRAGON.getLootTableId();
    private static final Identifier FISHING_JUNk_LOOT_TABLE_ID = new Identifier("minecraft", "gameplay/fishing/junk");

    public static void register(){

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, identifier, fabricLootSupplierBuilder, lootTableSetter) -> {

            if (ENDER_DRAGON_LOOT_TABLE_ID.equals(identifier)) {


                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))

                        .with(ItemEntry.builder(ModItems.ELYTRA_WING));

                fabricLootSupplierBuilder.withPool(poolBuilder.build());
            }

            if (FISHING_JUNk_LOOT_TABLE_ID.equals(identifier)) {

                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootNumberProvider.create(1, 2))

                        .with(ItemEntry.builder(ModBlocks.WOODEN_CRATE));

                fabricLootSupplierBuilder.withPool(poolBuilder.build());
            }

        });



    }



}
