package com.blocklegend001.onlyexcavators.utils;

import com.blocklegend001.onlyexcavators.ModConfigs;
import com.blocklegend001.onlyexcavators.item.ModItems;
import net.minecraft.world.item.Item;

import java.util.Map;

public class RadiusMap {

    public static Map<Item, Integer> excavatorRadius = null;

    public static Map<Item, Integer> getExcavatorRadius() {
        if (excavatorRadius == null) {
            excavatorRadius = Map.ofEntries(
                    Map.entry(ModItems.WOODEN_EXCAVATOR.get(), ModConfigs.radiusWoodenExcavator),
                    Map.entry(ModItems.STONE_EXCAVATOR.get(), ModConfigs.radiusStoneExcavator),
                    Map.entry(ModItems.COPPER_EXCAVATOR.get(), ModConfigs.radiusCopperExcavator),
                    Map.entry(ModItems.IRON_EXCAVATOR.get(), ModConfigs.radiusIronExcavator),
                    Map.entry(ModItems.GOLD_EXCAVATOR.get(), ModConfigs.radiusGoldExcavator),
                    Map.entry(ModItems.LAPIS_EXCAVATOR.get(), ModConfigs.radiusLapisExcavator),
                    Map.entry(ModItems.REDSTONE_EXCAVATOR.get(), ModConfigs.radiusRedstoneExcavator),
                    Map.entry(ModItems.OBSIDIAN_EXCAVATOR.get(), ModConfigs.radiusObsidianExcavator),
                    Map.entry(ModItems.DIAMOND_EXCAVATOR.get(), ModConfigs.radiusDiamondExcavator),
                    Map.entry(ModItems.EMERALD_EXCAVATOR.get(), ModConfigs.radiusEmeraldExcavator),
                    Map.entry(ModItems.NETHERITE_EXCAVATOR.get(), ModConfigs.radiusNetheriteExcavator)
            );
        }
        return excavatorRadius;
    }
}