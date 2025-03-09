package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_EXCAVATOR = registerItem("wooden_excavator",
            new WoodenExcavator(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item STONE_EXCAVATOR = registerItem("stone_excavator",
            new StoneExcavator(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item IRON_EXCAVATOR = registerItem("iron_excavator",
            new IronExcavator(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item GOLD_EXCAVATOR = registerItem("gold_excavator",
            new GoldExcavator(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item LAPIS_EXCAVATOR = registerItem("lapis_excavator",
            new LapisExcavator(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item REDSTONE_EXCAVATOR = registerItem("redstone_excavator",
            new RedstoneExcavator(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item DIAMOND_EXCAVATOR = registerItem("diamond_excavator",
            new DiamondExcavator(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item EMERALD_EXCAVATOR = registerItem("emerald_excavator",
            new EmeraldExcavator(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item OBSIDIAN_EXCAVATOR = registerItem("obsidian_excavator",
            new ObsidianExcavator(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item NETHERITE_EXCAVATOR = registerItem("netherite_excavator",
            new NetheriteExcavator(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyExcavators.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnlyExcavators.LOGGER.debug("Registering Mod Items for " + OnlyExcavators.MOD_ID);
    }
}
