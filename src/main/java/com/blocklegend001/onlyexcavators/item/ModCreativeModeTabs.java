package com.blocklegend001.onlyexcavators.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab ONLYEXCAVATORS = new CreativeModeTab("onlyexcavators") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_EXCAVATOR.get());
        }
    };
}
