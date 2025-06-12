package com.blocklegend001.onlyexcavators.utils;

import com.blocklegend001.onlyexcavators.config.ModConfigs;
import com.blocklegend001.onlyexcavators.item.ModItems;
import net.minecraft.item.Item;

import java.util.Map;

public class RadiusMap {
    public static final Map<Item, Integer> EXCAVATOR_RADIUS_MAP = Map.of(
            ModItems.WOODEN_EXCAVATOR, ModConfigs.RadiusWoodenExcavator,
            ModItems.STONE_EXCAVATOR, ModConfigs.RadiusStoneExcavator,
            ModItems.IRON_EXCAVATOR, ModConfigs.RadiusIronExcavator,
            ModItems.GOLD_EXCAVATOR, ModConfigs.RadiusGoldExcavator,
            ModItems.LAPIS_EXCAVATOR, ModConfigs.RadiusLapisExcavator,
            ModItems.REDSTONE_EXCAVATOR, ModConfigs.RadiusRedstoneExcavator,
            ModItems.OBSIDIAN_EXCAVATOR, ModConfigs.RadiusObsidianExcavator,
            ModItems.DIAMOND_EXCAVATOR, ModConfigs.RadiusDiamondExcavator,
            ModItems.EMERALD_EXCAVATOR, ModConfigs.RadiusEmeraldExcavator,
            ModItems.NETHERITE_EXCAVATOR, ModConfigs.RadiusNetheriteExcavator
    );
}
