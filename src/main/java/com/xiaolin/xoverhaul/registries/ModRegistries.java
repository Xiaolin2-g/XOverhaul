package com.xiaolin.xoverhaul.registries;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.item.ModItems;
import com.xiaolin.xoverhaul.util.FuelGlobals;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;

public class ModRegistries {

    private static final FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;

    public static void registerFuels(){
        XOverhaul.LOGGER.info("Registering fuels for: " + XOverhaul.MOD_ID);

        registerBarkFuel(ModItems.OAK_BARK);
        registerBarkFuel(ModItems.BIRCH_BARK);
        registerBarkFuel(ModItems.SPRUCE_BARK);
        registerBarkFuel(ModItems.JUNGLE_BARK);
        registerBarkFuel(ModItems.ACACIA_BARK);
        registerBarkFuel(ModItems.DARK_OAK_BARK);
        registerBarkFuel(ModItems.CRIMSON_BARK);
        registerBarkFuel(ModItems.WARPED_BARK);
        registerBarkFuel(ModItems.STRIPPED_OAK_BARK);
        registerBarkFuel(ModItems.STRIPPED_BIRCH_BARK);
        registerBarkFuel(ModItems.STRIPPED_SPRUCE_BARK);
        registerBarkFuel(ModItems.STRIPPED_JUNGLE_BARK);
        registerBarkFuel(ModItems.STRIPPED_ACACIA_BARK);
        registerBarkFuel(ModItems.STRIPPED_DARK_OAK_BARK);
        registerBarkFuel(ModItems.STRIPPED_CRIMSON_BARK);
        registerBarkFuel(ModItems.STRIPPED_WARPED_BARK);
    }

    private static void registerBarkFuel(Item item){
        fuelRegistry.add(item, FuelGlobals.BARK_FUEL_TIME);
    }
}
