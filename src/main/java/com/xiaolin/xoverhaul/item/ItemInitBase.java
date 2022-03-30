package com.xiaolin.xoverhaul.item;

import com.xiaolin.xoverhaul.XOverhaul;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInitBase {

    protected static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(XOverhaul.MOD_ID, name), item);
    }

}
