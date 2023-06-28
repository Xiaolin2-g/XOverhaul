package com.xiaolin.xoverhaul.world.gen.generation;

import com.xiaolin.xoverhaul.world.gen.features.ModPlantFeatures;

public class ModPlantGeneration extends com.xiaolin.xiaolib.world.gen.generation.ModPlantGeneration {

    private static void addPlantsToBiomes(){
        addToEnd(ModPlantFeatures.ENDER_FLOWER_PLACED_FEATURE.getKey().get());
        addTulipsToBiomes();
        addToCrimsonForest(ModPlantFeatures.CRIMSON_SPROUTS_PLACED_FEATURE.getKey().get());
        addToBirchForest(ModPlantFeatures.BIRCH_FLOWER_PLACED_FEATURE.getKey().get());
    }

    private static void addTulipsToBiomes(){
        addToFlowerForest(ModPlantFeatures.MAGENTA_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.LIGHT_BLUE_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.YELLOW_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.LIME_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.GRAY_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.LIGHT_GRAY_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.CYAN_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.PURPLE_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.BLUE_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.BROWN_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.GREEN_TULIP_PLACED_FEATURE.getKey().get());
        addToFlowerForest(ModPlantFeatures.BLACK_TULIP_PLACED_FEATURE.getKey().get());
    }

    public static void generatePlants(){
        addPlantsToBiomes();
    }


}
