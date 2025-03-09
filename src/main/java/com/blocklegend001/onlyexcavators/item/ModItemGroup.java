package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup ONLYEXCAVATORS = Registry.register(Registries.ITEM_GROUP, new Identifier(OnlyExcavators.MOD_ID, "onlyexcavators"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.onlyexcavators.onlyexcavators"))
                    .icon(() -> new ItemStack(ModItems.NETHERITE_EXCAVATOR)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_EXCAVATOR);
                        entries.add(ModItems.STONE_EXCAVATOR);
                        entries.add(ModItems.IRON_EXCAVATOR);
                        entries.add(ModItems.GOLD_EXCAVATOR);
                        entries.add(ModItems.LAPIS_EXCAVATOR);
                        entries.add(ModItems.REDSTONE_EXCAVATOR);
                        entries.add(ModItems.DIAMOND_EXCAVATOR);
                        entries.add(ModItems.EMERALD_EXCAVATOR);
                        entries.add(ModItems.OBSIDIAN_EXCAVATOR);
                        entries.add(ModItems.NETHERITE_EXCAVATOR);
                    }))
                    .build());

    public static void registerItemGroups() {

    }
}