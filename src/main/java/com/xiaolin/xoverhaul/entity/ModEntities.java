package com.xiaolin.xoverhaul.entity;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.entity.entities.ChainedMonsterEntity;
import com.xiaolin.xoverhaul.entity.entities.LeatherlingEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final String CHAINED_MONSTER_ID = "chained_monster";
    public static final String LEATHERLING_ID = "leatherling";


    public static final EntityType<ChainedMonsterEntity> CHAINED_MONSTER =
            ModEntities.registerEntity(CHAINED_MONSTER_ID, SpawnGroup.MONSTER,
                    ChainedMonsterEntity::new, 1.95f, 0.6f);

    public static final EntityType<LeatherlingEntity> LEATHERLING =
            ModEntities.registerEntity(LEATHERLING_ID, SpawnGroup.MONSTER,
                    LeatherlingEntity::new, 0.6f, 0.6f);


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
        FabricDefaultAttributeRegistry.register(CHAINED_MONSTER, ChainedMonsterEntity.createChainedMonsterAttributes());
        FabricDefaultAttributeRegistry.register(LEATHERLING, LeatherlingEntity.createLeatherlingAttributes());

    }
}
