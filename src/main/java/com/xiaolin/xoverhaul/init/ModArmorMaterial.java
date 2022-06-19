package com.xiaolin.xoverhaul.init;

import com.xiaolin.xoverhaul.util.ArmorGlobals;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {


    WOODSTONE(ArmorGlobals.WOODSTONE.NAME, ArmorGlobals.WOODSTONE.DURABILITY_MULTIPLIER,
            ArmorGlobals.WOODSTONE.PROTECTION_ARRAY, ArmorGlobals.WOODSTONE.ENCHANTABILITY,
            ArmorGlobals.WOODSTONE.EQUIP_SOUND, ArmorGlobals.WOODSTONE.ARMOR_TOUGHNESS,
            ArmorGlobals.WOODSTONE.KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(ArmorGlobals.WOODSTONE.REPAIR_INGREDIENT);
    }),

    // Monster

    MONSTER(ArmorGlobals.MONSTER.NAME, ArmorGlobals.MONSTER.DURABILITY_MULTIPLIER,
            ArmorGlobals.MONSTER.PROTECTION_ARRAY, ArmorGlobals.MONSTER.ENCHANTABILITY,
            ArmorGlobals.MONSTER.EQUIP_SOUND, ArmorGlobals.MONSTER.ARMOR_TOUGHNESS,
            ArmorGlobals.MONSTER.KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(ArmorGlobals.MONSTER.REPAIR_INGREDIENT);
    }),

    VILLAGE_CROWN(ArmorGlobals.VILLAGE_CROWN.NAME, ArmorGlobals.VILLAGE_CROWN.DURABILITY_MULTIPLIER,
            ArmorGlobals.VILLAGE_CROWN.PROTECTION_ARRAY, ArmorGlobals.VILLAGE_CROWN.ENCHANTABILITY,
            ArmorGlobals.VILLAGE_CROWN.EQUIP_SOUND, ArmorGlobals.VILLAGE_CROWN.ARMOR_TOUGHNESS,
            ArmorGlobals.VILLAGE_CROWN.KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(ArmorGlobals.VILLAGE_CROWN.REPAIR_INGREDIENT);
    }),



;




    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }


    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
