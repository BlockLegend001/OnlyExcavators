package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.Collections;

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
        this.itemModel(itemModels, item, ModelTemplates.FLAT_ITEM);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item, ModelTemplate template)
    {
        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(item);
        ResourceLocation textureLoc = ResourceLocation.fromNamespaceAndPath(itemId.getNamespace(), "item/" + itemId.getPath());
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.LAYER0, textureLoc);
        itemModels.itemModelOutput.accept(item, new BlockModelWrapper.Unbaked(template.create(item, textureMapping, itemModels.modelOutput), Collections.emptyList()));
    }
}