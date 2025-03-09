package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator fabricDataGenerator) {
        super(fabricDataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOODEN_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LAPIS_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REDSTONE_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_EXCAVATOR, Models.HANDHELD);
    }
}
