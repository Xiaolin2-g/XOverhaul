package com.xiaolin.xoverhaul.world.gen.generation;

import com.xiaolin.xoverhaul.world.gen.features.ModOreFeatures;

public class ModOreGeneration extends com.xiaolin.xiaolib.world.gen.generation.ModOreGeneration {

    private static void addOresToBiomes(){

        addOreToTheEnd(ModOreFeatures.PURPUR_COBBLESTONE_PLACED_FEATURE.getKey().get());

        addOreToSoulSandValley(ModOreFeatures.SOUL_NETHERRACK_PLACED_FEATURE.getKey().get());

        addOreToBeach(ModOreFeatures.DIRTY_SAND_PLACED_FEATURE.getKey().get());
    }


    public static void generateOres(){
        addOresToBiomes();
    }
}
