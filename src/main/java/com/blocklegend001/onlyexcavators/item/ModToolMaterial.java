package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.config.ModConfigs;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    WOODEN_EXCAVATOR(0, ModConfigs.DurabilityWoodenExcavator, 2.0F, 0.0F, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE_EXCAVATOR(1, ModConfigs.DurabilityStoneExcavator, 4.0F, 1.0F, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_EXCAVATOR(2, ModConfigs.DurabilityIronExcavator, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    GOLD_EXCAVATOR(0, ModConfigs.DurabilityGoldExcavator, 12.0F, 0.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    LAPIS_EXCAVATOR(2, ModConfigs.DurabilityLapisExcavator, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.LAPIS_LAZULI)),
    REDSTONE_EXCAVATOR(2, ModConfigs.DurabilityRedstoneExcavator, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.REDSTONE)),
    DIAMOND_EXCAVATOR(3, ModConfigs.DurabilityDiamondExcavator, 8.0F, 3.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    EMERALD_EXCAVATOR(4, ModConfigs.DurabilityEmeraldExcavator, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.EMERALD)),
    OBSIDIAN_EXCAVATOR(4, ModConfigs.DurabilityObsidianExcavator, 9.0F, 4.0F, 10, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),
    NETHERITE_EXCAVATOR(4, ModConfigs.DurabilityNetheriteExcavator, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
