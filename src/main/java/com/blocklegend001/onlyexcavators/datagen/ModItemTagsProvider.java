package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.item.ModItems;
import com.blocklegend001.onlyexcavators.utils.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends VanillaItemTagsProvider {

    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(ModTags.WOODEN_EXCAVATORS).add(ModItems.WOODEN_EXCAVATOR.get());
        tag(ModTags.STONE_EXCAVATORS).add(ModItems.STONE_EXCAVATOR.get());
        tag(ModTags.COPPER_EXCAVATORS).add(ModItems.COPPER_EXCAVATOR.get());
        tag(ModTags.IRON_EXCAVATORS).add(ModItems.IRON_EXCAVATOR.get());
        tag(ModTags.GOLD_EXCAVATORS).add(ModItems.GOLD_EXCAVATOR.get());
        tag(ModTags.LAPIS_EXCAVATORS).add(ModItems.LAPIS_EXCAVATOR.get());
        tag(ModTags.REDSTONE_EXCAVATORS).add(ModItems.REDSTONE_EXCAVATOR.get());
        tag(ModTags.DIAMOND_EXCAVATORS).add(ModItems.DIAMOND_EXCAVATOR.get());
        tag(ModTags.EMERALD_EXCAVATORS).add(ModItems.EMERALD_EXCAVATOR.get());
        tag(ModTags.OBSIDIAN_EXCAVATORS).add(ModItems.OBSIDIAN_EXCAVATOR.get());
        tag(ModTags.NETHERITE_EXCAVATORS).add(ModItems.NETHERITE_EXCAVATOR.get());

        tag(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR.get())
                .add(ModItems.STONE_EXCAVATOR.get())
                .add(ModItems.COPPER_EXCAVATOR.get())
                .add(ModItems.IRON_EXCAVATOR.get())
                .add(ModItems.GOLD_EXCAVATOR.get())
                .add(ModItems.REDSTONE_EXCAVATOR.get())
                .add(ModItems.LAPIS_EXCAVATOR.get())
                .add(ModItems.DIAMOND_EXCAVATOR.get())
                .add(ModItems.EMERALD_EXCAVATOR.get())
                .add(ModItems.OBSIDIAN_EXCAVATOR.get())
                .add(ModItems.NETHERITE_EXCAVATOR.get());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR.get())
                .add(ModItems.STONE_EXCAVATOR.get())
                .add(ModItems.COPPER_EXCAVATOR.get())
                .add(ModItems.IRON_EXCAVATOR.get())
                .add(ModItems.GOLD_EXCAVATOR.get())
                .add(ModItems.REDSTONE_EXCAVATOR.get())
                .add(ModItems.LAPIS_EXCAVATOR.get())
                .add(ModItems.DIAMOND_EXCAVATOR.get())
                .add(ModItems.EMERALD_EXCAVATOR.get())
                .add(ModItems.OBSIDIAN_EXCAVATOR.get())
                .add(ModItems.NETHERITE_EXCAVATOR.get());

        tag(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR.get())
                .add(ModItems.STONE_EXCAVATOR.get())
                .add(ModItems.COPPER_EXCAVATOR.get())
                .add(ModItems.IRON_EXCAVATOR.get())
                .add(ModItems.GOLD_EXCAVATOR.get())
                .add(ModItems.REDSTONE_EXCAVATOR.get())
                .add(ModItems.LAPIS_EXCAVATOR.get())
                .add(ModItems.DIAMOND_EXCAVATOR.get())
                .add(ModItems.EMERALD_EXCAVATOR.get())
                .add(ModItems.OBSIDIAN_EXCAVATOR.get())
                .add(ModItems.NETHERITE_EXCAVATOR.get());

        tag(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR.get())
                .add(ModItems.STONE_EXCAVATOR.get())
                .add(ModItems.COPPER_EXCAVATOR.get())
                .add(ModItems.IRON_EXCAVATOR.get())
                .add(ModItems.GOLD_EXCAVATOR.get())
                .add(ModItems.REDSTONE_EXCAVATOR.get())
                .add(ModItems.LAPIS_EXCAVATOR.get())
                .add(ModItems.DIAMOND_EXCAVATOR.get())
                .add(ModItems.EMERALD_EXCAVATOR.get())
                .add(ModItems.OBSIDIAN_EXCAVATOR.get())
                .add(ModItems.NETHERITE_EXCAVATOR.get());

        tag(ItemTags.SHOVELS).add(ModItems.WOODEN_EXCAVATOR.get())
                .add(ModItems.STONE_EXCAVATOR.get())
                .add(ModItems.COPPER_EXCAVATOR.get())
                .add(ModItems.IRON_EXCAVATOR.get())
                .add(ModItems.GOLD_EXCAVATOR.get())
                .add(ModItems.REDSTONE_EXCAVATOR.get())
                .add(ModItems.LAPIS_EXCAVATOR.get())
                .add(ModItems.DIAMOND_EXCAVATOR.get())
                .add(ModItems.EMERALD_EXCAVATOR.get())
                .add(ModItems.OBSIDIAN_EXCAVATOR.get())
                .add(ModItems.NETHERITE_EXCAVATOR.get());

        tag(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.WOODEN_EXCAVATOR.get())
                .add(ModItems.STONE_EXCAVATOR.get())
                .add(ModItems.COPPER_EXCAVATOR.get())
                .add(ModItems.IRON_EXCAVATOR.get())
                .add(ModItems.GOLD_EXCAVATOR.get())
                .add(ModItems.REDSTONE_EXCAVATOR.get())
                .add(ModItems.LAPIS_EXCAVATOR.get())
                .add(ModItems.DIAMOND_EXCAVATOR.get())
                .add(ModItems.EMERALD_EXCAVATOR.get())
                .add(ModItems.OBSIDIAN_EXCAVATOR.get())
                .add(ModItems.NETHERITE_EXCAVATOR.get());

        tag(Tags.Items.TOOLS).add(ModItems.WOODEN_EXCAVATOR.get())
                .add(ModItems.STONE_EXCAVATOR.get())
                .add(ModItems.COPPER_EXCAVATOR.get())
                .add(ModItems.IRON_EXCAVATOR.get())
                .add(ModItems.GOLD_EXCAVATOR.get())
                .add(ModItems.REDSTONE_EXCAVATOR.get())
                .add(ModItems.LAPIS_EXCAVATOR.get())
                .add(ModItems.DIAMOND_EXCAVATOR.get())
                .add(ModItems.EMERALD_EXCAVATOR.get())
                .add(ModItems.OBSIDIAN_EXCAVATOR.get())
                .add(ModItems.NETHERITE_EXCAVATOR.get());
    }
}