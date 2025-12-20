package com.blocklegend001.onlyexcavators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModConfigs {
    private static final File CONFIG_FILE = new File("config/onlyexcavators-common.toml");

    // Configurazioni per gli Excavators
    public static int DurabilityWoodenExcavator = 302;
    public static int DurabilityStoneExcavator = 650;
    public static int DurabilityIronExcavator = 1300;
    public static int DurabilityGoldExcavator = 750;
    public static int DurabilityLapisExcavator = 1100;
    public static int DurabilityRedstoneExcavator = 1100;
    public static int DurabilityObsidianExcavator = 11200;
    public static int DurabilityDiamondExcavator = 8025;
    public static int DurabilityEmeraldExcavator = 9768;
    public static int DurabilityNetheriteExcavator = 13675;

    public static int radiusWoodenExcavator = 1;
    public static int radiusStoneExcavator = 1;
    public static int radiusIronExcavator = 1;
    public static int radiusGoldExcavator = 1;
    public static int radiusLapisExcavator = 1;
    public static int radiusRedstoneExcavator = 1;
    public static int radiusObsidianExcavator = 1;
    public static int radiusDiamondExcavator = 1;
    public static int radiusEmeraldExcavator = 1;
    public static int radiusNetheriteExcavator = 1;

    public static void loadConfig() {
        if (!CONFIG_FILE.exists()) {
            saveConfig();
        } else {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                JsonObject config = JsonParser.parseReader(reader).getAsJsonObject();

                DurabilityWoodenExcavator = config.get("DurabilityWoodenExcavator").getAsInt();
                DurabilityStoneExcavator = config.get("DurabilityStoneExcavator").getAsInt();
                DurabilityIronExcavator = config.get("DurabilityIronExcavator").getAsInt();
                DurabilityGoldExcavator = config.get("DurabilityGoldExcavator").getAsInt();
                DurabilityLapisExcavator = config.get("DurabilityLapisExcavator").getAsInt();
                DurabilityRedstoneExcavator = config.get("DurabilityRedstoneExcavator").getAsInt();
                DurabilityObsidianExcavator = config.get("DurabilityObsidianExcavator").getAsInt();
                DurabilityDiamondExcavator = config.get("DurabilityDiamondExcavator").getAsInt();
                DurabilityEmeraldExcavator = config.get("DurabilityEmeraldExcavator").getAsInt();
                DurabilityNetheriteExcavator = config.get("DurabilityNetheriteExcavator").getAsInt();

                radiusWoodenExcavator = config.get("radiusWoodenExcavator").getAsInt();
                radiusStoneExcavator = config.get("radiusStoneExcavator").getAsInt();
                radiusIronExcavator = config.get("radiusIronExcavator").getAsInt();
                radiusGoldExcavator = config.get("radiusGoldExcavator").getAsInt();
                radiusLapisExcavator = config.get("radiusLapisExcavator").getAsInt();
                radiusRedstoneExcavator = config.get("radiusRedstoneExcavator").getAsInt();
                radiusObsidianExcavator = config.get("radiusObsidianExcavator").getAsInt();
                radiusDiamondExcavator = config.get("radiusDiamondExcavator").getAsInt();
                radiusEmeraldExcavator = config.get("radiusEmeraldExcavator").getAsInt();
                radiusNetheriteExcavator = config.get("radiusNetheriteExcavator").getAsInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveConfig() {
        JsonObject config = new JsonObject();

        config.addProperty("DurabilityWoodenExcavator", DurabilityWoodenExcavator);
        config.addProperty("DurabilityStoneExcavator", DurabilityStoneExcavator);
        config.addProperty("DurabilityIronExcavator", DurabilityIronExcavator);
        config.addProperty("DurabilityGoldExcavator", DurabilityGoldExcavator);
        config.addProperty("DurabilityLapisExcavator", DurabilityLapisExcavator);
        config.addProperty("DurabilityRedstoneExcavator", DurabilityRedstoneExcavator);
        config.addProperty("DurabilityObsidianExcavator", DurabilityObsidianExcavator);
        config.addProperty("DurabilityDiamondExcavator", DurabilityDiamondExcavator);
        config.addProperty("DurabilityEmeraldExcavator", DurabilityEmeraldExcavator);
        config.addProperty("DurabilityNetheriteExcavator", DurabilityNetheriteExcavator);

        config.addProperty("radiusWoodenExcavator", radiusWoodenExcavator);
        config.addProperty("radiusStoneExcavator", radiusStoneExcavator);
        config.addProperty("radiusIronExcavator", radiusIronExcavator);
        config.addProperty("radiusGoldExcavator", radiusGoldExcavator);
        config.addProperty("radiusLapisExcavator", radiusLapisExcavator);
        config.addProperty("radiusRedstoneExcavator", radiusRedstoneExcavator);
        config.addProperty("radiusObsidianExcavator", radiusObsidianExcavator);
        config.addProperty("radiusDiamondExcavator", radiusDiamondExcavator);
        config.addProperty("radiusEmeraldExcavator", radiusEmeraldExcavator);
        config.addProperty("radiusNetheriteExcavator", radiusNetheriteExcavator);

        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(config));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}