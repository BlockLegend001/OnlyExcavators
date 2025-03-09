package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_EXCAVATOR = registerItem("wooden_excavator",
            new Excavator(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "wooden_excavator")))));

    public static final Item STONE_EXCAVATOR = registerItem("stone_excavator",
            new Excavator(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "stone_excavator")))));

    public static final Item IRON_EXCAVATOR = registerItem("iron_excavator",
            new Excavator(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "iron_excavator")))));

    public static final Item GOLD_EXCAVATOR = registerItem("gold_excavator",
            new Excavator(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "gold_excavator")))));

    public static final Item LAPIS_EXCAVATOR = registerItem("lapis_excavator",
            new Excavator(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "lapis_excavator")))));

    public static final Item REDSTONE_EXCAVATOR = registerItem("redstone_excavator",
            new Excavator(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "redstone_excavator")))));

    public static final Item DIAMOND_EXCAVATOR = registerItem("diamond_excavator",
            new Excavator(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "diamond_excavator")))));

    public static final Item EMERALD_EXCAVATOR = registerItem("emerald_excavator",
            new Excavator(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "emerald_excavator")))));

    public static final Item OBSIDIAN_EXCAVATOR = registerItem("obsidian_excavator",
            new Excavator(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "obsidian_excavator")))));

    public static final Item NETHERITE_EXCAVATOR = registerItem("netherite_excavator",
            new Excavator(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, "netherite_excavator")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyExcavators.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnlyExcavators.LOGGER.debug("Registering Mod Items for " + OnlyExcavators.MOD_ID);
    }
}
