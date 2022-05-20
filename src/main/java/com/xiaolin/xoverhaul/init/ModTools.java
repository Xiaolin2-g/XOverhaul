package com.xiaolin.xoverhaul.init;

import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.item.ItemInitBase;
import com.xiaolin.xoverhaul.item.ScraperItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ModTools extends ItemInitBase {

    public static final Item SCRAPER = registerItem("scraper",
            new ScraperItem(new FabricItemSettings()
                    .maxCount(1)
                    .recipeRemainder(ModTools.SCRAPER)
                    .group(ModItemGroup.XOVERHAUL_TOOLS)));



    public static void registerModTools(){
        XOverhaul.LOGGER.info("Registering Mod Tools for " + XOverhaul.MOD_ID);

    }
}
