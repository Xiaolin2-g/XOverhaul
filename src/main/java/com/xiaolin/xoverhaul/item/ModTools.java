package com.xiaolin.xoverhaul.item;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTools {

    public static final Item SCRAPER = registerItem("scraper",
            new Scraper(new FabricItemSettings()
                    .maxDamage(8)
                    .group(ModItemGroup.XOVERHAUL_TOOLS)));




    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(XOverhaul.MOD_ID, name), item);
    }

    public static void registerModTools(){
        XOverhaul.LOGGER.info("Registering Mod Tools for " + XOverhaul.MOD_ID);

    }
}
