package com.blocklegend001.onlyexcavators.utils;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> WOODEN_EXCAVATORS = tag("wooden_excavators");
        public static final TagKey<Item> STONE_EXCAVATORS = tag("stone_excavators");
        public static final TagKey<Item> IRON_EXCAVATORS = tag("iron_excavators");
        public static final TagKey<Item> GOLD_EXCAVATORS = tag("gold_excavators");
        public static final TagKey<Item> LAPIS_EXCAVATORS = tag("lapis_excavators");
        public static final TagKey<Item> REDSTONE_EXCAVATORS = tag("redstone_excavators");
        public static final TagKey<Item> DIAMOND_EXCAVATORS = tag("diamond_excavators");
        public static final TagKey<Item> EMERALD_EXCAVATORS = tag("emerald_excavators");
        public static final TagKey<Item> OBSIDIAN_EXCAVATORS = tag("obsidian_excavators");
        public static final TagKey<Item> NETHERITE_EXCAVATORS = tag("netherite_excavators");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyExcavators.MOD_ID, name));
        }
    }
}
