package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.ModConfigs;
import com.blocklegend001.onlyexcavators.utils.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {

    public static final ToolMaterial WOODEN_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            ModConfigs.durabilityWoodenExcavator,
            2,
            0.0F,
            15,
            ItemTags.WOODEN_TOOL_MATERIALS
    );

    public static final ToolMaterial STONE_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            ModConfigs.durabilityStoneExcavator,
            4,
            1.0F,
            5,
            ItemTags.STONE_TOOL_MATERIALS
    );

    public static final ToolMaterial IRON_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.durabilityIronExcavator,
            6,
            2.0F,
            14,
            ItemTags.IRON_TOOL_MATERIALS
    );

    public static final ToolMaterial GOLD_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_GOLD_TOOL,
            ModConfigs.durabilityGoldExcavator,
            12,
            0.0F,
            22,
            ItemTags.GOLD_TOOL_MATERIALS
    );

    public static final ToolMaterial LAPIS_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.durabilityLapisExcavator,
            6,
            2.0F,
            14,
            ModTags.Items.LAPIS_EXCAVATORS_REPAIRS
    );

    public static final ToolMaterial REDSTONE_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.durabilityRedstoneExcavator,
            6,
            2.0F,
            14,
            ModTags.Items.REDSTONE_EXCAVATORS_REPAIRS
    );

    public static final ToolMaterial DIAMOND_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            ModConfigs.durabilityDiamondExcavator,
            8,
            3.0F,
            10,
            ItemTags.DIAMOND_TOOL_MATERIALS
    );

    public static final ToolMaterial EMERALD_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.durabilityEmeraldExcavator,
            9,
            4.0F,
            15,
            ModTags.Items.EMERALD_EXCAVATORS_REPAIRS
    );

    public static final ToolMaterial OBSIDIAN_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.durabilityObsidianExcavator,
            9,
            4.0F,
            10,
            ModTags.Items.OBSIDIAN_EXCAVATORS_REPAIRS
    );

    public static final ToolMaterial NETHERITE_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.durabilityNetheriteExcavator,
            9,
            4.0F,
            15,
            ItemTags.NETHERITE_TOOL_MATERIALS
    );
}