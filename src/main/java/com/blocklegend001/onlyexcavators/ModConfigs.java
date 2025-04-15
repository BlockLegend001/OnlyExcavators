package com.blocklegend001.onlyexcavators;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ModConfigs {
    public static final ForgeConfigSpec.Builder mycfg = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue DurabilityWoodenExcavator = mycfg
            .comment("Durability of the wooden excavator.")
            .defineInRange("DurabilityWoodenExcavator", 302, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityStoneExcavator = mycfg
            .comment("Durability of the stone excavator.")
            .defineInRange("DurabilityStoneExcavator", 650, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityIronExcavator = mycfg
            .comment("Durability of the iron excavator.")
            .defineInRange("DurabilityIronExcavator", 1300, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityGoldExcavator = mycfg
            .comment("Durability of the gold excavator.")
            .defineInRange("DurabilityGoldExcavator", 750, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityLapisExcavator = mycfg
            .comment("Durability of the lapis excavator.")
            .defineInRange("DurabilityLapisExcavator", 1100, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityRedstoneExcavator = mycfg
            .comment("Durability of the redstone excavator.")
            .defineInRange("DurabilityRedstoneExcavator", 1100, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityObsidianExcavator = mycfg
            .comment("Durability of the obsidian excavator.")
            .defineInRange("DurabilityObsidianExcavator", 11200, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityDiamondExcavator = mycfg
            .comment("Durability of the diamond excavator.")
            .defineInRange("DurabilityDiamondExcavator", 8025, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityEmeraldExcavator = mycfg
            .comment("Durability of the emerald excavator.")
            .defineInRange("DurabilityEmeraldExcavator", 9768, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityNetheriteExcavator = mycfg
            .comment("Durability of the netherite excavator.")
            .defineInRange("DurabilityNetheriteExcavator", 13675, 0, Integer.MAX_VALUE);

    public static ForgeConfigSpec SPEC = mycfg.build();

    public static int durabilityWoodenExcavator;
    public static int durabilityStoneExcavator;
    public static int durabilityIronExcavator;
    public static int durabilityGoldExcavator;
    public static int durabilityLapisExcavator;
    public static int durabilityRedstoneExcavator;
    public static int durabilityObsidianExcavator;
    public static int durabilityDiamondExcavator;
    public static int durabilityEmeraldExcavator;
    public static int durabilityNetheriteExcavator;

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig config = CommentedFileConfig.builder(path).sync().autoreload().build();
        config.load();
        spec.setConfig(config);

        durabilityWoodenExcavator = DurabilityWoodenExcavator.get();
        durabilityStoneExcavator = DurabilityStoneExcavator.get();
        durabilityIronExcavator = DurabilityIronExcavator.get();
        durabilityGoldExcavator = DurabilityGoldExcavator.get();
        durabilityLapisExcavator = DurabilityLapisExcavator.get();
        durabilityRedstoneExcavator = DurabilityRedstoneExcavator.get();
        durabilityObsidianExcavator = DurabilityObsidianExcavator.get();
        durabilityDiamondExcavator = DurabilityDiamondExcavator.get();
        durabilityEmeraldExcavator = DurabilityEmeraldExcavator.get();
        durabilityNetheriteExcavator = DurabilityNetheriteExcavator.get();
    }
}
