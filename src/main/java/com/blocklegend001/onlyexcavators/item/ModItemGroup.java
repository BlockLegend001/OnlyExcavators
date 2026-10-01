package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab ONLYEXCAVATORS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                    Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, "onlyexcavators"),
                    FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_EXCAVATOR))
                            .title(Component.translatable("itemGroup.onlyexcavators.onlyexcavators").withStyle(ChatFormatting.DARK_AQUA))
                            .displayItems((parameters, output) -> {
                        output.accept(ModItems.WOODEN_EXCAVATOR);
                        output.accept(ModItems.STONE_EXCAVATOR);
                        output.accept(ModItems.COPPER_EXCAVATOR);
                        output.accept(ModItems.IRON_EXCAVATOR);
                        output.accept(ModItems.GOLD_EXCAVATOR);
                        output.accept(ModItems.LAPIS_EXCAVATOR);
                        output.accept(ModItems.REDSTONE_EXCAVATOR);
                        output.accept(ModItems.DIAMOND_EXCAVATOR);
                        output.accept(ModItems.EMERALD_EXCAVATOR);
                        output.accept(ModItems.OBSIDIAN_EXCAVATOR);
                        output.accept(ModItems.NETHERITE_EXCAVATOR);
                    }).build());

    public static void registerItemGroups() {

    }
}