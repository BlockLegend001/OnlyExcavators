package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.item.ModItems;
import com.blocklegend001.onlyexcavators.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsGeneration extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsGeneration(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataOutput, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ConventionalItemTags.TOOLS).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ConventionalItemTags.MINING_TOOL_TOOLS).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ModTags.Items.LAPIS_EXCAVATORS_REPAIRS).add(Items.LAPIS_LAZULI);
        valueLookupBuilder(ModTags.Items.REDSTONE_EXCAVATORS_REPAIRS).add(Items.REDSTONE);
        valueLookupBuilder(ModTags.Items.EMERALD_EXCAVATORS_REPAIRS).add(Items.EMERALD);
        valueLookupBuilder(ModTags.Items.OBSIDIAN_EXCAVATORS_REPAIRS).add(Items.OBSIDIAN);

        valueLookupBuilder(ModTags.Items.WOODEN_EXCAVATOR).add(ModItems.WOODEN_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.STONE_EXCAVATOR).add(ModItems.STONE_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.COPPER_EXCAVATOR).add(ModItems.COPPER_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.IRON_EXCAVATOR).add(ModItems.IRON_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.GOLD_EXCAVATOR).add(ModItems.GOLD_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.LAPIS_EXCAVATOR).add(ModItems.LAPIS_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.REDSTONE_EXCAVATOR).add(ModItems.REDSTONE_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.OBSIDIAN_EXCAVATOR).add(ModItems.OBSIDIAN_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.DIAMOND_EXCAVATOR).add(ModItems.DIAMOND_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.EMERALD_EXCAVATOR).add(ModItems.EMERALD_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.NETHERITE_EXCAVATOR).add(ModItems.NETHERITE_EXCAVATOR);
    }
}