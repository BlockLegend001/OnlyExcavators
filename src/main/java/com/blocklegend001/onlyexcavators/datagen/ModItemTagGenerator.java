package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.item.ModItems;
import com.blocklegend001.onlyexcavators.utils.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends VanillaItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.WOODEN_EXCAVATORS).add(ModItems.WOODEN_EXCAVATOR.getKey());
        tag(ModTags.Items.STONE_EXCAVATORS).add(ModItems.STONE_EXCAVATOR.getKey());
        tag(ModTags.Items.COPPER_EXCAVATORS).add(ModItems.COPPER_EXCAVATOR.getKey());
        tag(ModTags.Items.IRON_EXCAVATORS).add(ModItems.IRON_EXCAVATOR.getKey());
        tag(ModTags.Items.GOLD_EXCAVATORS).add(ModItems.GOLD_EXCAVATOR.getKey());
        tag(ModTags.Items.LAPIS_EXCAVATORS).add(ModItems.LAPIS_EXCAVATOR.getKey());
        tag(ModTags.Items.REDSTONE_EXCAVATORS).add(ModItems.REDSTONE_EXCAVATOR.getKey());
        tag(ModTags.Items.DIAMOND_EXCAVATORS).add(ModItems.DIAMOND_EXCAVATOR.getKey());
        tag(ModTags.Items.EMERALD_EXCAVATORS).add(ModItems.EMERALD_EXCAVATOR.getKey());
        tag(ModTags.Items.OBSIDIAN_EXCAVATORS).add(ModItems.OBSIDIAN_EXCAVATOR.getKey());
        tag(ModTags.Items.NETHERITE_EXCAVATORS).add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ModTags.Items.LAPIS_EXCAVATORS_REPAIRS).add(Items.LAPIS_LAZULI.builtInRegistryHolder().key());
        tag(ModTags.Items.REDSTONE_EXCAVATORS_REPAIRS).add(Items.REDSTONE.builtInRegistryHolder().key());
        tag(ModTags.Items.EMERALD_EXCAVATORS_REPAIRS).add(Items.EMERALD.builtInRegistryHolder().key());
        tag(ModTags.Items.OBSIDIAN_EXCAVATORS_REPAIRS).add(Items.OBSIDIAN.builtInRegistryHolder().key());

        tag(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.SHOVELS).add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(Tags.Items.TOOLS).add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(Tags.Items.MINING_TOOL_TOOLS).add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());
    }
}

