package com.xiaolin.xoverhaul.item;

import com.xiaolin.xoverhaul.util.GlobalsXOverhaul;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {


    WOODSTONE(GlobalsXOverhaul.WOODSTONE_NAME, GlobalsXOverhaul.WOODSTONE_DURABILITY_MULTIPLIER, GlobalsXOverhaul.WOODSTONE_PROTECTION_ARRAY,
              GlobalsXOverhaul.WOODSTONE_ENCHANTABILITY, GlobalsXOverhaul.WOODSTONE_EQUIP_SOUND,
              GlobalsXOverhaul.WOODSTONE_ARMOR_TOUGHNESS, GlobalsXOverhaul.WOODSTONE_KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(GlobalsXOverhaul.WOODSTONE_REPAIR_INGREDIENT);
    }),

    // Monster

    MONSTER(GlobalsXOverhaul.MONSTER_NAME, GlobalsXOverhaul.MONSTER_DURABILITY_MULTIPLIER, GlobalsXOverhaul.MONSTER_PROTECTION_ARRAY,
            GlobalsXOverhaul.MONSTER_ENCHANTABILITY, GlobalsXOverhaul.MONSTER_EQUIP_SOUND,
            GlobalsXOverhaul.MONSTER_ARMOR_TOUGHNESS, GlobalsXOverhaul.MONSTER_KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(GlobalsXOverhaul.MONSTER_REPAIR_INGREDIENT);
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
