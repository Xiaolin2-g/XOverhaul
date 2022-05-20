/*
package com.xiaolin.xoverhaul.world.gen;
 */
/*
import com.xiaolin.xoverhaul.init.ModBlocks;
import com.xiaolin.xoverhaul.util.Var;
import net.minecraft.block.Block;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Lazy;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public enum OreType {


    AMETHYST((ModBlocks.AMETHYST_ORE),
            8, 1, 100, 5,
            Var.SAND),

    GOLDEN_PRISMARINE_BRICK(Lazy.of(ModBlocks.GOLDEN_PRISMARINE_BRICK),
            2, 1, 100, 10,
            Var.PRISMARINE),

    FIERY_END_STONE(Lazy.of(ModBlocks.FIERY_END_STONE),
            4, 1, 100, 6,
            Var.END_STONE),

    ENDER_END_STONE(Lazy.of(ModBlocks.ENDER_END_STONE),
            4, 1, 100, 6,
            Var.END_STONE),

    DIRTY_SAND(Lazy.of(ModBlocks.DIRTY_SAND),
            15, 60, 100, 4,
            Var.SAND),

    ENDER_ESSENCE_BLOCK(Lazy.of(ModBlocks.ENDER_ESSENCE_BLOCK),
            5, 50, 100, 6,
            Var.END_STONE),

    SOUL_NETHERRACK(Lazy.of(ModBlocks.SOUL_NETHERRACK),
            150, 5, 125, 20,
            OreFeatureConfig.FillerBlockType.NETHERRACK),

    PURPUR_COBBLESTONE(Lazy.of(ModBlocks.PURPUR_COBBLESTONE),
            50,  50, 100, 2,
            Var.END_STONE);


    ;




    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final RuleTest fillerBlockType;
    private final int veinsPerChunk;


    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk,
            RuleTest fillerBlockType) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
        this.fillerBlockType = fillerBlockType;

    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public RuleTest getFillerBlockType(){
        return fillerBlockType;
    }

    public int getVeinsPerChunk(){
        return veinsPerChunk;
    }


    public static OreType get(Block block){
        for (OreType ore: values()){
            if(block == ore.block){
                return ore;
            }
        }
        return null;
    }
}
*/