package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.ModConfigs;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;

import java.util.function.Supplier;

public enum ModToolMaterials implements Tier {

    WOODEN_EXCAVATOR(BlockTags.INCORRECT_FOR_WOODEN_TOOL, () -> ModConfigs.DurabilityWoodenExcavator, 2.0F, 0.0F, 15, () -> Ingredient.of(ItemTags.PLANKS)),
    STONE_EXCAVATOR(BlockTags.INCORRECT_FOR_STONE_TOOL, () -> ModConfigs.DurabilityStoneExcavator, 4.0F, 1.0F, 5, () -> Ingredient.of(Tags.Items.COBBLESTONES)),
    IRON_EXCAVATOR(BlockTags.INCORRECT_FOR_IRON_TOOL, () -> ModConfigs.DurabilityIronExcavator, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.IRON_INGOT)),
    GOLD_EXCAVATOR(BlockTags.INCORRECT_FOR_GOLD_TOOL, () -> ModConfigs.DurabilityGoldExcavator, 12.0F, 0.0F, 22, () -> Ingredient.of(Items.GOLD_INGOT)),
    LAPIS_EXCAVATOR(BlockTags.INCORRECT_FOR_IRON_TOOL, () -> ModConfigs.DurabilityLapisExcavator, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.LAPIS_LAZULI)),
    REDSTONE_EXCAVATOR(BlockTags.INCORRECT_FOR_IRON_TOOL, () -> ModConfigs.DurabilityRedstoneExcavator, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.REDSTONE)),
    DIAMOND_EXCAVATOR(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, () -> ModConfigs.DurabilityDiamondExcavator, 8.0F, 3.0F, 10, () -> Ingredient.of(Items.DIAMOND)),
    EMERALD_EXCAVATOR(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, () -> ModConfigs.DurabilityEmeraldExcavator, 9.0F, 4.0F, 15, () -> Ingredient.of(Items.EMERALD)),
    OBSIDIAN_EXCAVATOR(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, () -> ModConfigs.DurabilityObsidianExcavator, 9.0F, 4.0F, 10, () -> Ingredient.of(Blocks.OBSIDIAN)),
    NETHERITE_EXCAVATOR(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, () -> ModConfigs.DurabilityNetheriteExcavator, 9.0F, 4.0F, 15, () -> Ingredient.of(Items.NETHERITE_INGOT));

    private final TagKey<Block> incorrect;
    private final Supplier<Integer> uses;
    private final float speed;
    private final int damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    ModToolMaterials(TagKey<Block> incorrect, Supplier<Integer> uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.incorrect = incorrect;
        this.uses = uses;
        this.speed = speed;
        this.damage = (int) damage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = ingredient;
    }

    @Override
    public int getUses() {
        return this.uses.get();
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrect;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}
