package com.xiaolin.xoverhaul;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.events.LootTableModifications;
import com.xiaolin.xoverhaul.item.ModArmor;
import com.xiaolin.xoverhaul.item.ModFood;
import com.xiaolin.xoverhaul.item.ModItems;
import com.xiaolin.xoverhaul.item.ModTools;
import com.xiaolin.xoverhaul.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class XOverhaul implements ModInitializer {

	public static final String MOD_ID = "xoverhaul";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModFood.registerModItems();
		ModArmor.registerModItems();
		ModTools.registerModItems();

		ModBlocks.registerModBlocks();

		LootTableModifications.register();

		ModWorldGen.generateModWorldGen();

		LOGGER.info("Hello Fabric world!");
	}
}
