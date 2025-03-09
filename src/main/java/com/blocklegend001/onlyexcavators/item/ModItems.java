package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OnlyExcavators.MOD_ID);

    public static final RegistryObject<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator",
            () -> new Excavator(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F))));
    public static final RegistryObject<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator",
            () -> new Excavator(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F))));
    public static final RegistryObject<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator",
            () -> new Excavator(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F))));
    public static final RegistryObject<Item> GOLD_EXCAVATOR = ITEMS.register("gold_excavator",
            () -> new Excavator(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F))));
    public static final RegistryObject<Item> LAPIS_EXCAVATOR = ITEMS.register("lapis_excavator",
            () -> new LapisExcavator(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F))));
    public static final RegistryObject<Item> REDSTONE_EXCAVATOR = ITEMS.register("redstone_excavator",
            () -> new RedstoneExcavator(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F))));
    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator",
            () -> new Excavator(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F))));
    public static final RegistryObject<Item> EMERALD_EXCAVATOR = ITEMS.register("emerald_excavator",
            () -> new EmeraldExcavator(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F))));
    public static final RegistryObject<Item> OBSIDIAN_EXCAVATOR = ITEMS.register("obsidian_excavator",
            () -> new ObsidianExcavator(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F))));
    public static final RegistryObject<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator",
            () -> new Excavator(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}