package com.xiaolin.xoverhaul.events;

import com.xiaolin.xoverhaul.entity.ModEntities;
import com.xiaolin.xoverhaul.world.gen.biomes.ModBiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;

public class EntitySpawning {

    public static void spawnEntities(){

        // CHAINED MONSTER

        BiomeModifications.addSpawn(
                BiomeSelectors.foundInOverworld(),
                SpawnGroup.MONSTER,
                ModEntities.CHAINED_MONSTER,
                10,
                1,1 );

        BiomeModifications.addSpawn(
                ModBiomeSelectors.foundInTheOverworldExceptUnderground(),
                SpawnGroup.MONSTER,
                ModEntities.LEATHERLING,
                15,
                1,4);
    }
}
