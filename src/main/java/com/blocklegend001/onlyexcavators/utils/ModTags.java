package com.blocklegend001.onlyexcavators.utils;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> WOODEN_EXCAVATOR = createTag("wooden_excavator");
        public static final TagKey<Item> STONE_EXCAVATOR = createTag("stone_excavator");
        public static final TagKey<Item> COPPER_EXCAVATOR = createTag("copper_excavator");
        public static final TagKey<Item> IRON_EXCAVATOR = createTag("iron_excavator");
        public static final TagKey<Item> GOLD_EXCAVATOR = createTag("gold_excavator");
        public static final TagKey<Item> LAPIS_EXCAVATOR = createTag("lapis_excavator");
        public static final TagKey<Item> REDSTONE_EXCAVATOR = createTag("redstone_excavator");
        public static final TagKey<Item> OBSIDIAN_EXCAVATOR = createTag("obsidian_excavator");
        public static final TagKey<Item> DIAMOND_EXCAVATOR = createTag("diamond_excavator");
        public static final TagKey<Item> EMERALD_EXCAVATOR = createTag("emerald_excavator");
        public static final TagKey<Item> NETHERITE_EXCAVATOR = createTag("netherite_excavator");

        public static final TagKey<Item> LAPIS_EXCAVATORS_REPAIRS = createTag("lapis_excavators_repairs");
        public static final TagKey<Item> REDSTONE_EXCAVATORS_REPAIRS = createTag("redstone_excavators_repairs");
        public static final TagKey<Item> EMERALD_EXCAVATORS_REPAIRS = createTag("emerald_excavators_repairs");
        public static final TagKey<Item> OBSIDIAN_EXCAVATORS_REPAIRS = createTag("obsidian_excavators_repairs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, name));
        }
    }
}