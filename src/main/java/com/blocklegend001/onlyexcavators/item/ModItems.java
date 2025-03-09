package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.ModConfigs;
import com.blocklegend001.onlyexcavators.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.blocklegend001.onlyexcavators.OnlyExcavators.MOD_ID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MOD_ID);

    public static final DeferredItem<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator",
            () -> new Excavator(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F))));
    public static final DeferredItem<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator",
            () -> new Excavator(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F))));
    public static final DeferredItem<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator",
            () -> new Excavator(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F))));
    public static final DeferredItem<Item> GOLD_EXCAVATOR = ITEMS.register("gold_excavator",
            () -> new Excavator(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F))));
    public static final DeferredItem<Item> LAPIS_EXCAVATOR = ITEMS.register("lapis_excavator",
            () -> new LapisExcavator(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F))));
    public static final DeferredItem<Item> REDSTONE_EXCAVATOR = ITEMS.register("redstone_excavator",
            () -> new RedstoneExcavator(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F))));
    public static final DeferredItem<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator",
            () -> new Excavator(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F))));
    public static final DeferredItem<Item> EMERALD_EXCAVATOR = ITEMS.register("emerald_excavator",
            () -> new EmeraldExcavator(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F))));
    public static final DeferredItem<Item> OBSIDIAN_EXCAVATOR = ITEMS.register("obsidian_excavator",
            () -> new ObsidianExcavator(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F))));
    public static final DeferredItem<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator",
            () -> new Excavator(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
