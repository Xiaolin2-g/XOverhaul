package com.xiaolin.xoverhaul.util.interfaces;

import net.minecraft.block.Block;

public interface BlockStateModelGeneratorInterface {

    void registerSlab(Block baseBlock, Block slabBlock);

    void registerStairs(Block baseBlock, Block stairsBlock);

    void registerWalls(Block baseBlcok, Block wallsBlock);
}
