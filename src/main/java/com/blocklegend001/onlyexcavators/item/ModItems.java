package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.custom.Excavator;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OnlyExcavators.MOD_ID);

    public static final RegistryObject<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator",
            () -> new Excavator(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "wooden_excavator")))
                    .repairable(ItemTags.WOODEN_TOOL_MATERIALS)));

    public static final RegistryObject<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator",
            () -> new Excavator(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "stone_excavator")))
                    .repairable(ItemTags.STONE_TOOL_MATERIALS)));

    public static final RegistryObject<Item> COPPER_EXCAVATOR = ITEMS.register("copper_excavator",
            () -> new Excavator(ModToolMaterials.COPPER_EXCAVATOR, 1.5F, -3.0F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "copper_excavator")))
                    .repairable(ItemTags.COPPER_TOOL_MATERIALS)));

    public static final RegistryObject<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator",
            () -> new Excavator(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "iron_excavator")))
                    .repairable(ItemTags.IRON_TOOL_MATERIALS)));

    public static final RegistryObject<Item> GOLD_EXCAVATOR = ITEMS.register("gold_excavator",
            () -> new Excavator(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "gold_excavator")))
                    .repairable(ItemTags.GOLD_TOOL_MATERIALS)));

    public static final RegistryObject<Item> LAPIS_EXCAVATOR = ITEMS.register("lapis_excavator",
            () -> new Excavator(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "lapis_excavator")))
                    .repairable(Items.LAPIS_LAZULI)));

    public static final RegistryObject<Item> REDSTONE_EXCAVATOR = ITEMS.register("redstone_excavator",
            () -> new Excavator(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "redstone_excavator")))
                    .repairable(Items.REDSTONE)));

    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator",
            () -> new Excavator(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "diamond_excavator")))
                    .repairable(ItemTags.DIAMOND_TOOL_MATERIALS)));

    public static final RegistryObject<Item> EMERALD_EXCAVATOR = ITEMS.register("emerald_excavator",
            () -> new Excavator(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "emerald_excavator")))
                    .repairable(Items.EMERALD)));

    public static final RegistryObject<Item> OBSIDIAN_EXCAVATOR = ITEMS.register("obsidian_excavator",
            () -> new Excavator(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().fireResistant()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "obsidian_excavator")))
                    .repairable(Items.OBSIDIAN)));

    public static final RegistryObject<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator",
            () -> new Excavator(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F, new Item.Properties().fireResistant()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "netherite_excavator")))
                    .repairable(ItemTags.NETHERITE_TOOL_MATERIALS)));

    public static void register(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }
}