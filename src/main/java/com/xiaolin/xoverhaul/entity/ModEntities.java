package com.xiaolin.xoverhaul.entity;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.entities.BaseHostileEntity;
import com.xiaolin.xoverhaul.entity.entities.ChainedMonsterEntity;
import com.xiaolin.xoverhaul.entity.entities.LeatherlingEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;

public class ModEntities {

    public static final String CHAINED_MONSTER_ID = "chained_monster";
    public static final String LEATHERLING_ID = "leatherling";


    public static final EntityType<ChainedMonsterEntity> CHAINED_MONSTER =
            ModEntities.registerEntity(CHAINED_MONSTER_ID, SpawnGroup.MONSTER,
                    ChainedMonsterEntity::new, 1.95f, 0.6f,
                    SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
                    BaseHostileEntity::canSpawnInSurfaceAndDarkness);

    public static final EntityType<LeatherlingEntity> LEATHERLING =
            ModEntities.registerEntity(LEATHERLING_ID, SpawnGroup.MONSTER,
                    LeatherlingEntity::new, 1.2f, 0.6f,
                    SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
                    BaseHostileEntity::canSpawnInSurface);


    public static EntityType registerEntity(String name, SpawnGroup spawnGroup,
                                            EntityType.EntityFactory entityFactory,
                                            float height, float width,
                                            SpawnRestriction.Location location, Heightmap.Type heightmap,
                                            SpawnRestriction.SpawnPredicate spawnPredicate){

        return Registry.register(Registry.ENTITY_TYPE, new Identifier(XOverhaul.MOD_ID, name),
                FabricEntityTypeBuilder.Living.createMob()
                        .spawnGroup(spawnGroup)
                        .entityFactory(entityFactory)
                        .dimensions(EntityDimensions.fixed(width, height))
                        .spawnRestriction(location, heightmap, spawnPredicate)
                        .build());
    }

    public static void registerModEntities(){
        XOverhaul.LOGGER.info("Registering Mod Entities for " + XOverhaul.MOD_ID);
        registerMobAttributes();
    }

    public static void registerMobAttributes(){
        FabricDefaultAttributeRegistry.register(CHAINED_MONSTER, ChainedMonsterEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(LEATHERLING, LeatherlingEntity.createAttributes());
    }



}
