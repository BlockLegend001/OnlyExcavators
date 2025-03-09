package com.blocklegend001.onlyexcavators.config;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.mojang.datafixers.util.Pair;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int DurabilityWoodenExcavator;
    public static int DurabilityStoneExcavator;
    public static int DurabilityIronExcavator;
    public static int DurabilityGoldExcavator;
    public static int DurabilityLapisExcavator;
    public static int DurabilityRedstoneExcavator;
    public static int DurabilityObsidianExcavator;
    public static int DurabilityDiamondExcavator;
    public static int DurabilityEmeraldExcavator;
    public static int DurabilityNetheriteExcavator;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(OnlyExcavators.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("DurabilityWoodenExcavator", 302), "Durability of the Wooden Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityStoneExcavator", 650), "Durability of the Stone Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityIronExcavator", 1300), "Durability of the Iron Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityGoldExcavator", 750), "Durability of the Gold Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityLapisExcavator", 1100), "Durability of the Lapis Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityRedstoneExcavator", 1100), "Durability of the Redstone Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityObsidianExcavator", 11200), "Durability of the Obsidian Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityDiamondExcavator", 8025), "Durability of the Diamond Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityEmeraldExcavator", 9768), "Durability of the Emerald Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityNetheriteExcavator", 13675), "Durability of the Netherite Excavator");
    }

    private static void assignConfigs() {
        DurabilityWoodenExcavator = CONFIG.getOrDefault("DurabilityWoodenExcavator", 302);
        DurabilityStoneExcavator = CONFIG.getOrDefault("DurabilityStoneExcavator", 650);
        DurabilityIronExcavator = CONFIG.getOrDefault("DurabilityIronExcavator", 1300);
        DurabilityGoldExcavator = CONFIG.getOrDefault("DurabilityGoldExcavator", 750);
        DurabilityLapisExcavator = CONFIG.getOrDefault("DurabilityLapisExcavator", 1100);
        DurabilityRedstoneExcavator = CONFIG.getOrDefault("DurabilityRedstoneExcavator", 1100);
        DurabilityObsidianExcavator = CONFIG.getOrDefault("DurabilityObsidianExcavator", 11200);
        DurabilityDiamondExcavator = CONFIG.getOrDefault("DurabilityDiamondExcavator", 8025);
        DurabilityEmeraldExcavator = CONFIG.getOrDefault("DurabilityEmeraldExcavator", 9768);
        DurabilityNetheriteExcavator = CONFIG.getOrDefault("DurabilityNetheriteExcavator", 13675);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}
