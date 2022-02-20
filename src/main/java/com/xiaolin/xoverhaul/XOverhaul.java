package com.xiaolin.xoverhaul;

import com.xiaolin.xoverhaul.block.ModBlocks;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.events.EntitySpawning;
import com.xiaolin.xoverhaul.events.LootTableModifications;
import com.xiaolin.xoverhaul.item.*;
import com.xiaolin.xoverhaul.registries.ModRegistries;
import com.xiaolin.xoverhaul.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
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
		ModFood.registerModFood();
		ModArmor.registerModArmor();
		ModTools.registerModTools();
        ModSpawnEggs.registerModSpawnEggs();

        ModBlocks.registerModBlocks();

		ModRegistries.registerFuels();

		ModEntities.registerModEntities();
		EntitySpawning.spawnEntities();

		LootTableModifications.register();

		ModWorldGen.generateModWorldGen();

		blockRenderLayerMapCutout();

		LOGGER.info("XOverhaul Main Class initialized!");
	}

	private void blockRenderLayerMapCutout(){
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				ModBlocks.ENDER_FLOWER, ModBlocks.MAGENTA_TULIP, ModBlocks.LIGHT_BLUE_TULIP, ModBlocks.YELLOW_TULIP,
				ModBlocks.LIME_TULIP, ModBlocks.GRAY_TULIP, ModBlocks.LIGHT_GRAY_TULIP, ModBlocks.CYAN_TULIP,
				ModBlocks.PURPLE_TULIP, ModBlocks.BLUE_TULIP, ModBlocks.BROWN_TULIP, ModBlocks.GREEN_TULIP,
				ModBlocks.BLACK_TULIP, ModBlocks.CRIMSON_SPROUTS);
	}



}
