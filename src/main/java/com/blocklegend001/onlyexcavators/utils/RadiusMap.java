package com.blocklegend001.onlyexcavators.utils;

import com.blocklegend001.onlyexcavators.ModConfigs;
import com.blocklegend001.onlyexcavators.item.ModItems;
import net.minecraft.world.item.Item;

import java.util.Map;

public class RadiusMap {

    public static Map<Item, Integer> excavatorRadius = null;

    public static Map<Item, Integer> getExcavatorRadius() {
        if (excavatorRadius == null) {
            excavatorRadius = Map.of(
                    ModItems.WOODEN_EXCAVATOR.get(), ModConfigs.radiusWoodenExcavator,
                    ModItems.STONE_EXCAVATOR.get(), ModConfigs.radiusStoneExcavator,
                    ModItems.IRON_EXCAVATOR.get(), ModConfigs.radiusIronExcavator,
                    ModItems.GOLD_EXCAVATOR.get(), ModConfigs.radiusGoldExcavator,
                    ModItems.LAPIS_EXCAVATOR.get(), ModConfigs.radiusLapisExcavator,
                    ModItems.REDSTONE_EXCAVATOR.get(), ModConfigs.radiusRedstoneExcavator,
                    ModItems.OBSIDIAN_EXCAVATOR.get(), ModConfigs.radiusObsidianExcavator,
                    ModItems.DIAMOND_EXCAVATOR.get(), ModConfigs.radiusDiamondExcavator,
                    ModItems.EMERALD_EXCAVATOR.get(), ModConfigs.radiusEmeraldExcavator,
                    ModItems.NETHERITE_EXCAVATOR.get(), ModConfigs.radiusNetheriteExcavator
            );
        }
        return excavatorRadius;
    }
}