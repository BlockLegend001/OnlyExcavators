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
                    Map.entry(ModItems.WOODEN_EXCAVATOR.get(), ModConfigs.radiusWoodenExcavator.get()),
                    Map.entry(ModItems.STONE_EXCAVATOR.get(), ModConfigs.radiusStoneExcavator.get()),
                    Map.entry(ModItems.COPPER_EXCAVATOR.get(), ModConfigs.radiusCopperExcavator.get()),
                    Map.entry(ModItems.IRON_EXCAVATOR.get(), ModConfigs.radiusIronExcavator.get()),
                    Map.entry(ModItems.GOLD_EXCAVATOR.get(), ModConfigs.radiusGoldExcavator.get()),
                    Map.entry(ModItems.LAPIS_EXCAVATOR.get(), ModConfigs.radiusLapisExcavator.get()),
                    Map.entry(ModItems.REDSTONE_EXCAVATOR.get(), ModConfigs.radiusRedstoneExcavator.get()),
                    Map.entry(ModItems.OBSIDIAN_EXCAVATOR.get(), ModConfigs.radiusObsidianExcavator.get()),
                    Map.entry(ModItems.DIAMOND_EXCAVATOR.get(), ModConfigs.radiusDiamondExcavator.get()),
                    Map.entry(ModItems.EMERALD_EXCAVATOR.get(), ModConfigs.radiusEmeraldExcavator.get()),
                    Map.entry(ModItems.NETHERITE_EXCAVATOR.get(), ModConfigs.radiusNetheriteExcavator.get())
            );
        }
        return excavatorRadius;
    }
}