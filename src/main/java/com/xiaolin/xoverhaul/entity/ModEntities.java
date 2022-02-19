package com.xiaolin.xoverhaul.entity;

import com.sun.net.httpserver.Filter;
import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.entities.ChainedZombieEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {


    public static final EntityType<ChainedZombieEntity> CHAINED_ZOMBIE =
            ModEntities.registerEntity("chained_zombie", SpawnGroup.MONSTER,
                    ChainedZombieEntity::new, 2, 1);


    public static EntityType registerEntity(String name, SpawnGroup spawnGroup,
                                            EntityType.EntityFactory entityFactory,
                                            float height, float width){

        return Registry.register(Registry.ENTITY_TYPE,
                new Identifier(XOverhaul.MOD_ID, name),
                FabricEntityTypeBuilder.create(
                        spawnGroup, entityFactory)
                        .dimensions(EntityDimensions.fixed(width, height))
                        .build());
    }

    public static void registerModEntities(){
        XOverhaul.LOGGER.info("Registering Mod Entities for " + XOverhaul.MOD_ID);

        registerMobAttributes();

    }

    public static void registerMobAttributes(){
        FabricDefaultAttributeRegistry.register(CHAINED_ZOMBIE, ChainedZombieEntity.createChainedZombieAttributes());
    }
}
