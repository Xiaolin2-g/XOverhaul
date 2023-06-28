package com.xiaolin.xoverhaul.world.gen.generation;

import com.xiaolin.xoverhaul.world.gen.features.ModTreeFeatures;

public class ModTreeGeneration extends com.xiaolin.xiaolib.world.gen.generation.ModTreeGeneration {


    private static void addTreesToBiomes(){

        addToBirchForest(ModTreeFeatures.BIRCH_TREE_FUNGUS_SPAWNED_PLACED_FEATURE.getKey().get());

    }

    public static void generateTrees(){
        addTreesToBiomes();
    }


}
