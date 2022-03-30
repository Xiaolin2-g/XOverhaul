package com.xiaolin.xoverhaul.item;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTools extends ItemInitBase{

    public static final Item SCRAPER = registerItem("scraper",
            new ScraperItem(new FabricItemSettings()
                    .maxCount(1)
                    .recipeRemainder(ModTools.SCRAPER)
                    .group(ModItemGroup.XOVERHAUL_TOOLS)));



    public static void registerModTools(){
        XOverhaul.LOGGER.info("Registering Mod Tools for " + XOverhaul.MOD_ID);

    }
}
