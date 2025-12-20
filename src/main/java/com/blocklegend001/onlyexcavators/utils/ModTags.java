package com.blocklegend001.onlyexcavators.utils;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModTags {
    public static final TagKey<Item> WOODEN_EXCAVATORS = bind("wooden_excavators");
    public static final TagKey<Item> STONE_EXCAVATORS = bind("stone_excavators");
    public static final TagKey<Item> IRON_EXCAVATORS = bind("iron_excavators");
    public static final TagKey<Item> GOLD_EXCAVATORS = bind("gold_excavators");
    public static final TagKey<Item> LAPIS_EXCAVATORS = bind("lapis_excavators");
    public static final TagKey<Item> REDSTONE_EXCAVATORS = bind("redstone_excavators");
    public static final TagKey<Item> DIAMOND_EXCAVATORS = bind("diamond_excavators");
    public static final TagKey<Item> EMERALD_EXCAVATORS = bind("emerald_excavators");
    public static final TagKey<Item> OBSIDIAN_EXCAVATORS = bind("obsidian_excavators");
    public static final TagKey<Item> NETHERITE_EXCAVATORS = bind("netherite_excavators");

    private static TagKey<Item> bind(String string) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyExcavators.MOD_ID, string));  // Usa il tuo namespace
    }

    public static TagKey<Item> create(String namepsace, String path) {
        return create(Identifier.fromNamespaceAndPath(namepsace, path));
    }

    public static TagKey<Item> create(Identifier name) {
        return TagKey.create(Registries.ITEM, name);
    }
}