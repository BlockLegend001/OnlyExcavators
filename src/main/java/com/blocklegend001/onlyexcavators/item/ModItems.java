package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.custom.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    public static final Item WOODEN_EXCAVATOR = registerItem("wooden_excavator",
            properties -> new Excavator(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F, properties));

    public static final Item STONE_EXCAVATOR = registerItem("stone_excavator",
            properties -> new Excavator(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F, properties));

    public static final Item COPPER_EXCAVATOR = registerItem("copper_excavator",
            properties -> new Excavator(ModToolMaterials.COPPER_EXCAVATOR, 1.5F, -3.0F, properties));

    public static final Item IRON_EXCAVATOR = registerItem("iron_excavator",
            properties -> new Excavator(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F, properties));

    public static final Item GOLD_EXCAVATOR = registerItem("gold_excavator",
            properties -> new Excavator(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F, properties));

    public static final Item LAPIS_EXCAVATOR = registerItem("lapis_excavator",
            properties -> new Excavator(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F, properties));

    public static final Item REDSTONE_EXCAVATOR = registerItem("redstone_excavator",
            properties -> new Excavator(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F, properties));

    public static final Item DIAMOND_EXCAVATOR = registerItem("diamond_excavator",
            properties -> new Excavator(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F, properties));

    public static final Item EMERALD_EXCAVATOR = registerItem("emerald_excavator",
            properties -> new Excavator(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F, properties));

    public static final Item OBSIDIAN_EXCAVATOR = registerItem("obsidian_excavator",
            properties -> new Excavator(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F, properties.fireResistant()));

    public static final Item NETHERITE_EXCAVATOR = registerItem("netherite_excavator",
            properties -> new Excavator(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F, properties.fireResistant()));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, name)))));
    }

    public static void registerModItems() {
        OnlyExcavators.LOGGER.debug("Registering Mod Items for " + OnlyExcavators.MOD_ID);
    }
}