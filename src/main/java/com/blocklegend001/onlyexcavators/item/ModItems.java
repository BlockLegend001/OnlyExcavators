package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_EXCAVATOR = registerItem("wooden_excavator",
            new WoodenExcavator(ToolMaterials.WOOD, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(302).attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.WOOD, 1.5F, -3.0F))));

    public static final Item STONE_EXCAVATOR = registerItem("stone_excavator",
            new StoneExcavator(ToolMaterials.STONE, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(650).attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.STONE, 1.5F, -3.0F))));

    public static final Item IRON_EXCAVATOR = registerItem("iron_excavator",
            new IronExcavator(ToolMaterials.IRON, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(1300).attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.IRON, 1.5F, -3.0F))));

    public static final Item GOLD_EXCAVATOR = registerItem("gold_excavator",
            new GoldExcavator(ToolMaterials.GOLD, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(750).attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.GOLD, 1.5F, -3.0F))));

    public static final Item LAPIS_EXCAVATOR = registerItem("lapis_excavator",
            new LapisExcavator(ToolMaterials.IRON, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(1100).attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.IRON, 1.5F, -3.0F))));

    public static final Item REDSTONE_EXCAVATOR = registerItem("redstone_excavator",
            new RedstoneExcavator(ToolMaterials.IRON, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(1100).attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.IRON, 1.5F, -3.0F))));

    public static final Item DIAMOND_EXCAVATOR = registerItem("diamond_excavator",
            new DiamondExcavator(ToolMaterials.DIAMOND, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(8025).attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1.5F, -3.0F))));

    public static final Item EMERALD_EXCAVATOR = registerItem("emerald_excavator",
            new EmeraldExcavator(ToolMaterials.NETHERITE, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(9768).attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.5F, -3.0F))));

    public static final Item OBSIDIAN_EXCAVATOR = registerItem("obsidian_excavator",
            new ObsidianExcavator(ToolMaterials.DIAMOND, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(11200).fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1.5F, -3.0F))));

    public static final Item NETHERITE_EXCAVATOR = registerItem("netherite_excavator",
            new NetheriteExcavator(ToolMaterials.NETHERITE, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamage(13675).fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.5F, -3.0F))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OnlyExcavators.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnlyExcavators.LOGGER.debug("Registering Mod Items for " + OnlyExcavators.MOD_ID);
    }
}
