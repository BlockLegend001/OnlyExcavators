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
                    ModItems.WOODEN_EXCAVATOR.get(), ModConfigs.radiusWoodenExcavator.get(),
                ModItems.STONE_EXCAVATOR.get(), ModConfigs.radiusStoneExcavator.get(),
                ModItems.IRON_EXCAVATOR.get(), ModConfigs.radiusIronExcavator.get(),
                ModItems.GOLD_EXCAVATOR.get(), ModConfigs.radiusGoldExcavator.get(),
                ModItems.LAPIS_EXCAVATOR.get(), ModConfigs.radiusLapisExcavator.get(),
                ModItems.REDSTONE_EXCAVATOR.get(), ModConfigs.radiusRedstoneExcavator.get(),
                ModItems.OBSIDIAN_EXCAVATOR.get(), ModConfigs.radiusObsidianExcavator.get(),
                ModItems.DIAMOND_EXCAVATOR.get(), ModConfigs.radiusDiamondExcavator.get(),
                ModItems.EMERALD_EXCAVATOR.get(), ModConfigs.radiusEmeraldExcavator.get(),
                ModItems.NETHERITE_EXCAVATOR.get(), ModConfigs.radiusNetheriteExcavator.get()
            );
        }
        return excavatorRadius;
    }
}