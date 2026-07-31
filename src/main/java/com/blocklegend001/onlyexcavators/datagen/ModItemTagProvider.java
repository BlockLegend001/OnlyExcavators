package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.item.ModItems;
import com.blocklegend001.onlyexcavators.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    private static List<ResourceKey<Item>> keys(Item... items) {
        return Arrays.stream(items)
                .map(item -> item.builtInRegistryHolder().key())
                .collect(Collectors.toList());
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(ItemTags.DURABILITY_ENCHANTABLE).addAll(keys(ModItems.WOODEN_EXCAVATOR,
                ModItems.STONE_EXCAVATOR,
                ModItems.COPPER_EXCAVATOR,
                ModItems.IRON_EXCAVATOR,
                ModItems.GOLD_EXCAVATOR,
                ModItems.LAPIS_EXCAVATOR,
                ModItems.REDSTONE_EXCAVATOR,
                ModItems.OBSIDIAN_EXCAVATOR,
                ModItems.DIAMOND_EXCAVATOR,
                ModItems.EMERALD_EXCAVATOR,
                ModItems.NETHERITE_EXCAVATOR));

        builder(ItemTags.MINING_LOOT_ENCHANTABLE).addAll(keys(ModItems.WOODEN_EXCAVATOR,
                ModItems.STONE_EXCAVATOR,
                ModItems.COPPER_EXCAVATOR,
                ModItems.IRON_EXCAVATOR,
                ModItems.GOLD_EXCAVATOR,
                ModItems.LAPIS_EXCAVATOR,
                ModItems.REDSTONE_EXCAVATOR,
                ModItems.OBSIDIAN_EXCAVATOR,
                ModItems.DIAMOND_EXCAVATOR,
                ModItems.EMERALD_EXCAVATOR,
                ModItems.NETHERITE_EXCAVATOR));

        builder(ItemTags.VANISHING_ENCHANTABLE).addAll(keys(ModItems.WOODEN_EXCAVATOR,
                ModItems.STONE_EXCAVATOR,
                ModItems.COPPER_EXCAVATOR,
                ModItems.IRON_EXCAVATOR,
                ModItems.GOLD_EXCAVATOR,
                ModItems.LAPIS_EXCAVATOR,
                ModItems.REDSTONE_EXCAVATOR,
                ModItems.OBSIDIAN_EXCAVATOR,
                ModItems.DIAMOND_EXCAVATOR,
                ModItems.EMERALD_EXCAVATOR,
                ModItems.NETHERITE_EXCAVATOR));

        builder(ItemTags.MINING_ENCHANTABLE).addAll(keys(ModItems.WOODEN_EXCAVATOR,
                ModItems.STONE_EXCAVATOR,
                ModItems.COPPER_EXCAVATOR,
                ModItems.IRON_EXCAVATOR,
                ModItems.GOLD_EXCAVATOR,
                ModItems.LAPIS_EXCAVATOR,
                ModItems.REDSTONE_EXCAVATOR,
                ModItems.OBSIDIAN_EXCAVATOR,
                ModItems.DIAMOND_EXCAVATOR,
                ModItems.EMERALD_EXCAVATOR,
                ModItems.NETHERITE_EXCAVATOR));

        builder(ItemTags.SHOVELS).addAll(keys(ModItems.WOODEN_EXCAVATOR,
                ModItems.STONE_EXCAVATOR,
                ModItems.COPPER_EXCAVATOR,
                ModItems.IRON_EXCAVATOR,
                ModItems.GOLD_EXCAVATOR,
                ModItems.LAPIS_EXCAVATOR,
                ModItems.REDSTONE_EXCAVATOR,
                ModItems.OBSIDIAN_EXCAVATOR,
                ModItems.DIAMOND_EXCAVATOR,
                ModItems.EMERALD_EXCAVATOR,
                ModItems.NETHERITE_EXCAVATOR));

        builder(ItemTags.BREAKS_DECORATED_POTS).addAll(keys(ModItems.WOODEN_EXCAVATOR,
                ModItems.STONE_EXCAVATOR,
                ModItems.COPPER_EXCAVATOR,
                ModItems.IRON_EXCAVATOR,
                ModItems.GOLD_EXCAVATOR,
                ModItems.LAPIS_EXCAVATOR,
                ModItems.REDSTONE_EXCAVATOR,
                ModItems.OBSIDIAN_EXCAVATOR,
                ModItems.DIAMOND_EXCAVATOR,
                ModItems.EMERALD_EXCAVATOR,
                ModItems.NETHERITE_EXCAVATOR));

        builder(ConventionalItemTags.TOOLS).addAll(keys(ModItems.WOODEN_EXCAVATOR,
                ModItems.STONE_EXCAVATOR,
                ModItems.COPPER_EXCAVATOR,
                ModItems.IRON_EXCAVATOR,
                ModItems.GOLD_EXCAVATOR,
                ModItems.LAPIS_EXCAVATOR,
                ModItems.REDSTONE_EXCAVATOR,
                ModItems.OBSIDIAN_EXCAVATOR,
                ModItems.DIAMOND_EXCAVATOR,
                ModItems.EMERALD_EXCAVATOR,
                ModItems.NETHERITE_EXCAVATOR));

        builder(ConventionalItemTags.TOOLS).addAll(keys(ModItems.WOODEN_EXCAVATOR,
                ModItems.STONE_EXCAVATOR,
                ModItems.COPPER_EXCAVATOR,
                ModItems.IRON_EXCAVATOR,
                ModItems.GOLD_EXCAVATOR,
                ModItems.LAPIS_EXCAVATOR,
                ModItems.REDSTONE_EXCAVATOR,
                ModItems.OBSIDIAN_EXCAVATOR,
                ModItems.DIAMOND_EXCAVATOR,
                ModItems.EMERALD_EXCAVATOR,
                ModItems.NETHERITE_EXCAVATOR));

        builder(ModTags.Items.LAPIS_EXCAVATORS_REPAIRS).addAll(keys(Items.LAPIS_LAZULI));
        builder(ModTags.Items.REDSTONE_EXCAVATORS_REPAIRS).addAll(keys(Items.REDSTONE));
        builder(ModTags.Items.EMERALD_EXCAVATORS_REPAIRS).addAll(keys(Items.EMERALD));
        builder(ModTags.Items.OBSIDIAN_EXCAVATORS_REPAIRS).addAll(keys(Items.OBSIDIAN));

        builder(ModTags.Items.WOODEN_EXCAVATOR).addAll(keys(ModItems.WOODEN_EXCAVATOR));
        builder(ModTags.Items.STONE_EXCAVATOR).addAll(keys(ModItems.STONE_EXCAVATOR));
        builder(ModTags.Items.COPPER_EXCAVATOR).addAll(keys(ModItems.COPPER_EXCAVATOR));
        builder(ModTags.Items.IRON_EXCAVATOR).addAll(keys(ModItems.IRON_EXCAVATOR));
        builder(ModTags.Items.GOLD_EXCAVATOR).addAll(keys(ModItems.GOLD_EXCAVATOR));
        builder(ModTags.Items.LAPIS_EXCAVATOR).addAll(keys(ModItems.LAPIS_EXCAVATOR));
        builder(ModTags.Items.REDSTONE_EXCAVATOR).addAll(keys(ModItems.REDSTONE_EXCAVATOR));
        builder(ModTags.Items.OBSIDIAN_EXCAVATOR).addAll(keys(ModItems.OBSIDIAN_EXCAVATOR));
        builder(ModTags.Items.DIAMOND_EXCAVATOR).addAll(keys(ModItems.DIAMOND_EXCAVATOR));
        builder(ModTags.Items.EMERALD_EXCAVATOR).addAll(keys(ModItems.EMERALD_EXCAVATOR));
        builder(ModTags.Items.NETHERITE_EXCAVATOR).addAll(keys(ModItems.NETHERITE_EXCAVATOR));
    }
}