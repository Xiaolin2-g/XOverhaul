package com.xiaolin.xoverhaul.init;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.item.ItemInitBase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

public class ModSpawnEggs extends ItemInitBase {



    public static final Item CHAINED_MONSTER_SPAWN_EGG = registerItem("chained_monster_spawn_egg",
            new SpawnEggItem(ModEntities.CHAINED_MONSTER, 0x83848A, 0x27282E,
                    new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_SPAWN_EGGS)));

    public static final Item LEATHERLING_SPAWN_EGG = registerItem("leatherling_spawn_egg",
            new SpawnEggItem(ModEntities.LEATHERLING, 0x663300, 0xcccc00,
                    new FabricItemSettings()
                            .group(ModItemGroup.XOVERHAUL_SPAWN_EGGS)));

    public static void registerModSpawnEggs(){
        XOverhaul.LOGGER.info("Registering Mod Spawn Eggs for " + XOverhaul.MOD_ID);

    }
}
