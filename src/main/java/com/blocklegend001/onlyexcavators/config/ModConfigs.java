package com.blocklegend001.onlyexcavators.config;

import com.mojang.datafixers.util.Pair;
import com.blocklegend001.onlyexcavators.OnlyExcavators;

import java.util.logging.Logger;

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

    public static int RadiusWoodenExcavator;
    public static int RadiusStoneExcavator;
    public static int RadiusIronExcavator;
    public static int RadiusGoldExcavator;
    public static int RadiusLapisExcavator;
    public static int RadiusRedstoneExcavator;
    public static int RadiusObsidianExcavator;
    public static int RadiusDiamondExcavator;
    public static int RadiusEmeraldExcavator;
    public static int RadiusNetheriteExcavator;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(OnlyExcavators.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addComment("Excavator Durability Settings");

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

        configs.addComment("Excavator Radius Settings");

        configs.addKeyValuePair(new Pair<>("RadiusWoodenExcavator", 1), "Excavation radius for Wooden Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusStoneExcavator", 1), "Excavation radius for Stone Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusIronExcavator", 1), "Excavation radius for Iron Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusGoldExcavator", 1), "Excavation radius for Gold Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusLapisExcavator", 1), "Excavation radius for Lapis Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusRedstoneExcavator", 1), "Excavation radius for Redstone Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusObsidianExcavator", 1), "Excavation radius for Obsidian Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusDiamondExcavator", 1), "Excavation radius for Diamond Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusEmeraldExcavator", 1), "Excavation radius for Emerald Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusNetheriteExcavator", 1), "Excavation radius for Netherite Excavator (radius 1 = 3×1 area)");
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

        RadiusWoodenExcavator = CONFIG.getOrDefault("RadiusWoodenExcavator", 1);
        RadiusStoneExcavator = CONFIG.getOrDefault("RadiusStoneExcavator", 1);
        RadiusIronExcavator = CONFIG.getOrDefault("RadiusIronExcavator", 1);
        RadiusGoldExcavator = CONFIG.getOrDefault("RadiusGoldExcavator", 1);
        RadiusLapisExcavator = CONFIG.getOrDefault("RadiusLapisExcavator", 1);
        RadiusRedstoneExcavator = CONFIG.getOrDefault("RadiusRedstoneExcavator", 1);
        RadiusObsidianExcavator = CONFIG.getOrDefault("RadiusObsidianExcavator", 1);
        RadiusDiamondExcavator = CONFIG.getOrDefault("RadiusDiamondExcavator", 1);
        RadiusEmeraldExcavator = CONFIG.getOrDefault("RadiusEmeraldExcavator", 1);
        RadiusNetheriteExcavator = CONFIG.getOrDefault("RadiusNetheriteExcavator", 1);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}