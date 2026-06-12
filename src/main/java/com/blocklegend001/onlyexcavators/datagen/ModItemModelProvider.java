package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;

public class ModItemModelProvider extends ModelProvider {
    public ModItemModelProvider(PackOutput output, String modID) {
        super(output, modID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModel(itemModels, ModItems.WOODEN_EXCAVATOR.get());
        itemModel(itemModels, ModItems.STONE_EXCAVATOR.get());
        itemModel(itemModels, ModItems.COPPER_EXCAVATOR.get());
        itemModel(itemModels, ModItems.IRON_EXCAVATOR.get());
        itemModel(itemModels, ModItems.GOLD_EXCAVATOR.get());
        itemModel(itemModels, ModItems.REDSTONE_EXCAVATOR.get());
        itemModel(itemModels, ModItems.LAPIS_EXCAVATOR.get());
        itemModel(itemModels, ModItems.DIAMOND_EXCAVATOR.get());
        itemModel(itemModels, ModItems.EMERALD_EXCAVATOR.get());
        itemModel(itemModels, ModItems.OBSIDIAN_EXCAVATOR.get());
        itemModel(itemModels, ModItems.NETHERITE_EXCAVATOR.get());
    }

    public void itemModel(ItemModelGenerators itemModels, Item item)
    {
        itemModels.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }
}
