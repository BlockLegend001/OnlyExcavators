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
    public static int DurabilityWoodenExcavator = 302;  // Durabilità dell'escavatore di legno
    public static int DurabilityStoneExcavator = 650;   // Durabilità dell'escavatore di pietra
    public static int DurabilityIronExcavator = 1300;    // Durabilità dell'escavatore di ferro
    public static int DurabilityGoldExcavator = 750;     // Durabilità dell'escavatore d'oro
    public static int DurabilityLapisExcavator = 1100;   // Durabilità dell'escavatore di lapislazzuli
    public static int DurabilityRedstoneExcavator = 1100; // Durabilità dell'escavatore di redstone
    public static int DurabilityObsidianExcavator = 11200; // Durabilità dell'escavatore di ossidiana
    public static int DurabilityDiamondExcavator = 8025;  // Durabilità dell'escavatore di diamante
    public static int DurabilityEmeraldExcavator = 9768;   // Durabilità dell'escavatore di smeraldo
    public static int DurabilityNetheriteExcavator = 13675; // Durabilità dell'escavatore di netherite

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

        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(config));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
