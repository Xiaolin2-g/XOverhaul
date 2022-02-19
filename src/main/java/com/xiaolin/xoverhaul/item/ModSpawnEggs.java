package com.xiaolin.xoverhaul.item;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSpawnEggs {

    public static final Item CHAINED_ZOMBIE_SPAWN_EGG = registerItem("chained_zombie_spawn_egg",
            new SpawnEggItem(ModEntities.CHAINED_ZOMBIE, 0x0DA70B, 0x73420E,
                    new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_SPAWN_EGGS)));

    public static Item registerItem(String name, SpawnEggItem spawnEggItem){
        return Registry.register(Registry.ITEM, new Identifier(XOverhaul.MOD_ID, name), spawnEggItem);
    }

    public static void registerModSpawnEggs(){
        XOverhaul.LOGGER.info("Registering Mod Spawn Eggs for " + XOverhaul.MOD_ID);

    }
}
