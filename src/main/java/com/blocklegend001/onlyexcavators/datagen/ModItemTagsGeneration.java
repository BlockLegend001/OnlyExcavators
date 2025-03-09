package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.item.ModItems;
import com.blocklegend001.onlyexcavators.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsGeneration extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsGeneration(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataOutput, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        getOrCreateTagBuilder(ModTags.Items.WOODEN_EXCAVATOR).add(ModItems.WOODEN_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.STONE_EXCAVATOR).add(ModItems.STONE_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.IRON_EXCAVATOR).add(ModItems.IRON_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.GOLD_EXCAVATOR).add(ModItems.GOLD_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.LAPIS_EXCAVATOR).add(ModItems.LAPIS_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.REDSTONE_EXCAVATOR).add(ModItems.REDSTONE_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.OBSIDIAN_EXCAVATOR).add(ModItems.OBSIDIAN_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.DIAMOND_EXCAVATOR).add(ModItems.DIAMOND_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.EMERALD_EXCAVATOR).add(ModItems.EMERALD_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.NETHERITE_EXCAVATOR).add(ModItems.NETHERITE_EXCAVATOR);

    }
}
