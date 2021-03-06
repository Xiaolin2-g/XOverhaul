package com.xiaolin.xoverhaul.world.gen;

import com.xiaolin.xoverhaul.world.gen.generation.ModPlantGeneration;
import com.xiaolin.xoverhaul.world.gen.generation.ModOreGeneration;
import com.xiaolin.xoverhaul.world.gen.generation.ModSimpleBlockGeneration;
import com.xiaolin.xoverhaul.world.gen.generation.ModTreeGeneration;

public class ModWorldGen {

    public static void generateModWorldGen(){
        ModOreGeneration.generateOres();
        ModPlantGeneration.generatePlants();
        ModTreeGeneration.generateTrees();
        ModSimpleBlockGeneration.generateSimpleBlocks();
    }
}
