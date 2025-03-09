package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ONLYEXCAVATORS = FabricItemGroupBuilder.build(
            new Identifier(OnlyExcavators.MOD_ID, "onlyexcavators"), () -> new ItemStack(ModItems.NETHERITE_EXCAVATOR));
}
