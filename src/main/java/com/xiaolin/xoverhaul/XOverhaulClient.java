package com.xiaolin.xoverhaul;

import com.xiaolin.xoverhaul.block.ModPlants;
import com.xiaolin.xoverhaul.client.render.ModRenderers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class XOverhaulClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderers.registerRenderers();
        blockRenderLayerMapCutout();
    }


    private void blockRenderLayerMapCutout(){

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), getCutoutBlocks());
    }


    private Block[] getCutoutBlocks(){
        return new Block[]{
                ModPlants.ENDER_FLOWER,
                ModPlants.MAGENTA_TULIP,
                ModPlants.LIGHT_BLUE_TULIP,
                ModPlants.YELLOW_TULIP,
                ModPlants.LIME_TULIP,
                ModPlants.GRAY_TULIP,
                ModPlants.LIGHT_GRAY_TULIP,
                ModPlants.CYAN_TULIP,
                ModPlants.PURPLE_TULIP,
                ModPlants.BLUE_TULIP,
                ModPlants.BROWN_TULIP,
                ModPlants.GREEN_TULIP,
                ModPlants.BLACK_TULIP,
                ModPlants.CRIMSON_SPROUTS,
                ModPlants.BIRCH_FLOWER
        };
    }
}
