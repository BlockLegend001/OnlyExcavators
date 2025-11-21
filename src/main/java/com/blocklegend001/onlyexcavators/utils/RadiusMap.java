package com.blocklegend001.onlyexcavators.utils;

import com.blocklegend001.onlyexcavators.config.ModConfigs;
import com.blocklegend001.onlyexcavators.item.ModItems;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;

public class RadiusMap {

    public static final Map<Item, Integer> EXCAVATOR_RADIUS_MAP = new HashMap<>();

    static {
        addItem(ModItems.WOODEN_EXCAVATOR, ModConfigs.RadiusWoodenExcavator);
        addItem(ModItems.STONE_EXCAVATOR, ModConfigs.RadiusStoneExcavator);
        addItem(ModItems.IRON_EXCAVATOR, ModConfigs.RadiusIronExcavator);
        addItem(ModItems.GOLD_EXCAVATOR, ModConfigs.RadiusGoldExcavator);
        addItem(ModItems.LAPIS_EXCAVATOR, ModConfigs.RadiusLapisExcavator);
        addItem(ModItems.REDSTONE_EXCAVATOR, ModConfigs.RadiusRedstoneExcavator);
        addItem(ModItems.OBSIDIAN_EXCAVATOR, ModConfigs.RadiusObsidianExcavator);
        addItem(ModItems.DIAMOND_EXCAVATOR, ModConfigs.RadiusDiamondExcavator);
        addItem(ModItems.EMERALD_EXCAVATOR, ModConfigs.RadiusEmeraldExcavator);
        addItem(ModItems.NETHERITE_EXCAVATOR, ModConfigs.RadiusNetheriteExcavator);

        EXCAVATOR_RADIUS_MAP.forEach((item, radius) ->
                System.out.println("[OnlyExcavators DEBUG] " + item + " radius: " + radius)
        );
    }

    private static void addItem(Item item, int radius) {
        EXCAVATOR_RADIUS_MAP.put(item, Math.max(radius, 1));
    }
}
