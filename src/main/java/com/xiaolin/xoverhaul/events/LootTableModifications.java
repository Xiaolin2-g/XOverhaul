package com.xiaolin.xoverhaul.events;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import javax.swing.text.html.parser.Entity;

public class LootTableModifications {

    private static final Identifier ENDER_DRAGON_LOOT_TABLE_ID = EntityType.ENDER_DRAGON.getLootTableId();

    public static void register(){

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, identifier, fabricLootSupplierBuilder, lootTableSetter) -> {
            if (ENDER_DRAGON_LOOT_TABLE_ID.equals(identifier)) {


                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .withEntry(ItemEntry.builder(createDamagedElytra())
                                .build());

                fabricLootSupplierBuilder.withPool(poolBuilder.build());
            }
        });



    }

    public static Item createDamagedElytra(){
        Item elytra = (Items.ELYTRA);
        elytra.getDefaultStack().setDamage(431);
        return elytra;
    }

}
