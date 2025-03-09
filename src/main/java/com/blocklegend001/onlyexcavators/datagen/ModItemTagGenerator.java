package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.ModItems;
import com.blocklegend001.onlyexcavators.utils.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> tagLookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, tagLookupCompletableFuture, OnlyExcavators.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.WOODEN_EXCAVATORS).add(ModItems.WOODEN_EXCAVATOR.get());
        tag(ModTags.Items.STONE_EXCAVATORS).add(ModItems.STONE_EXCAVATOR.get());
        tag(ModTags.Items.IRON_EXCAVATORS).add(ModItems.IRON_EXCAVATOR.get());
        tag(ModTags.Items.GOLD_EXCAVATORS).add(ModItems.GOLD_EXCAVATOR.get());
        tag(ModTags.Items.LAPIS_EXCAVATORS).add(ModItems.LAPIS_EXCAVATOR.get());
        tag(ModTags.Items.REDSTONE_EXCAVATORS).add(ModItems.REDSTONE_EXCAVATOR.get());
        tag(ModTags.Items.DIAMOND_EXCAVATORS).add(ModItems.DIAMOND_EXCAVATOR.get());
        tag(ModTags.Items.EMERALD_EXCAVATORS).add(ModItems.EMERALD_EXCAVATOR.get());
        tag(ModTags.Items.OBSIDIAN_EXCAVATORS).add(ModItems.OBSIDIAN_EXCAVATOR.get());
        tag(ModTags.Items.NETHERITE_EXCAVATORS).add(ModItems.NETHERITE_EXCAVATOR.get());

        tag(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR.get())
                .add(ModItems.STONE_EXCAVATOR.get())
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

