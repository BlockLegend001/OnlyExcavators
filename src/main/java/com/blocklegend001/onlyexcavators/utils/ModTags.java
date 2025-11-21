package com.blocklegend001.onlyexcavators.utils;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> WOODEN_EXCAVATOR = createTag("wooden_excavator");
        public static final TagKey<Item> STONE_EXCAVATOR = createTag("stone_excavator");
        public static final TagKey<Item> IRON_EXCAVATOR = createTag("iron_excavator");
        public static final TagKey<Item> GOLD_EXCAVATOR = createTag("gold_excavator");
        public static final TagKey<Item> LAPIS_EXCAVATOR = createTag("lapis_excavator");
        public static final TagKey<Item> REDSTONE_EXCAVATOR = createTag("redstone_excavator");
        public static final TagKey<Item> OBSIDIAN_EXCAVATOR = createTag("obsidian_excavator");
        public static final TagKey<Item> DIAMOND_EXCAVATOR = createTag("diamond_excavator");
        public static final TagKey<Item> EMERALD_EXCAVATOR = createTag("emerald_excavator");
        public static final TagKey<Item> NETHERITE_EXCAVATOR = createTag("netherite_excavator");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(OnlyExcavators.MOD_ID, name));
        }
    }
}
