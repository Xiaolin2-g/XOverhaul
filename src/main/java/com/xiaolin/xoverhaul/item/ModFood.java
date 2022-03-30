package com.xiaolin.xoverhaul.item;

import com.xiaolin.xoverhaul.XOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFood extends ItemInitBase{

    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(2.4f).build())
                    .group(ModItemGroup.XOVERHAUL_FOODS)));


    public static final Item GOLDEN_WHEAT = registerItem("golden_wheat",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.XOVERHAUL_FOODS)));


    public static final Item GOLDEN_BREAD = registerItem("golden_bread",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(2.4f).build())
                    .group(ModItemGroup.XOVERHAUL_FOODS)));


    public static final Item GOLDEN_POTATO = registerItem("golden_potato",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).build())
                    .group(ModItemGroup.XOVERHAUL_FOODS)));


    public static final Item GOLDEN_BAKED_POTATO = registerItem("golden_baked_potato",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(7).saturationModifier(2.4f).build())
                    .group(ModItemGroup.XOVERHAUL_FOODS)));


    public static final Item GOLDEN_POISONOUS_POTATO = registerItem("golden_poisonous_potato",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 3 * 20) ,1)
                            .build())
                    .group(ModItemGroup.XOVERHAUL_FOODS)));


    public static final Item COOKED_TROPICAL_FISH = registerItem("cooked_tropical_fish",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(1.2f)
                            .build())
                    .group(ModItemGroup.XOVERHAUL_FOODS)));

    public static final Item CAKE_SLICE = registerItem("cake_slice",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f)
                            .snack()
                            .build())
                    .group(ModItemGroup.XOVERHAUL_FOODS)));

    public static void registerModFood(){
        XOverhaul.LOGGER.info("Registering Mod Food for " + XOverhaul.MOD_ID);

    }
}
