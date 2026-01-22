package com.blocklegend001.onlyexcavators.utils;

import com.blocklegend001.onlyexcavators.config.ModConfigs;
import com.blocklegend001.onlyexcavators.item.ModItems;
import net.minecraft.item.Item;

import java.util.Map;

public class RadiusMap {
    public static final Map<Item, Integer> EXCAVATOR_RADIUS_MAP = Map.ofEntries(
            Map.entry(ModItems.WOODEN_EXCAVATOR, ModConfigs.RadiusWoodenExcavator),
            Map.entry(ModItems.STONE_EXCAVATOR, ModConfigs.RadiusStoneExcavator),
            Map.entry(ModItems.COPPER_EXCAVATOR, ModConfigs.RadiusCopperExcavator),
            Map.entry(ModItems.IRON_EXCAVATOR, ModConfigs.RadiusIronExcavator),
            Map.entry(ModItems.GOLD_EXCAVATOR, ModConfigs.RadiusGoldExcavator),
            Map.entry(ModItems.LAPIS_EXCAVATOR, ModConfigs.RadiusLapisExcavator),
            Map.entry(ModItems.REDSTONE_EXCAVATOR, ModConfigs.RadiusRedstoneExcavator),
            Map.entry(ModItems.OBSIDIAN_EXCAVATOR, ModConfigs.RadiusObsidianExcavator),
            Map.entry(ModItems.DIAMOND_EXCAVATOR, ModConfigs.RadiusDiamondExcavator),
            Map.entry(ModItems.EMERALD_EXCAVATOR, ModConfigs.RadiusEmeraldExcavator),
            Map.entry(ModItems.NETHERITE_EXCAVATOR, ModConfigs.RadiusNetheriteExcavator)
    );
}