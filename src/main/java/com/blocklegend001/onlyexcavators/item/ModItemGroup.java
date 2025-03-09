package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup ONLYEXCAVATORS;

    public static void registerItemGroups() {
        ONLYEXCAVATORS = FabricItemGroup.builder(new Identifier(OnlyExcavators.MOD_ID, "onlyexcavators"))
                .displayName(Text.translatable("itemGroup.onlyexcavators.onlyexcavators"))
                .icon(() -> new ItemStack(ModItems.NETHERITE_EXCAVATOR)).build();
    }
}
