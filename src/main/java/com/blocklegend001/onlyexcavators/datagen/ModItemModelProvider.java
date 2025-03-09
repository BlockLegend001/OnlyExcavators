package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, OnlyExcavators.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.WOODEN_EXCAVATOR);
        handheldItem(ModItems.STONE_EXCAVATOR);
        handheldItem(ModItems.IRON_EXCAVATOR);
        handheldItem(ModItems.GOLD_EXCAVATOR);
        handheldItem(ModItems.REDSTONE_EXCAVATOR);
        handheldItem(ModItems.LAPIS_EXCAVATOR);
        handheldItem(ModItems.DIAMOND_EXCAVATOR);
        handheldItem(ModItems.EMERALD_EXCAVATOR);
        handheldItem(ModItems.OBSIDIAN_EXCAVATOR);
        handheldItem(ModItems.NETHERITE_EXCAVATOR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(OnlyExcavators.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(OnlyExcavators.MOD_ID,"item/" + item.getId().getPath()));
    }
}
