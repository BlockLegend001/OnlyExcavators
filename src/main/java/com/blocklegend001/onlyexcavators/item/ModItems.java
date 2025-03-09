package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OnlyExcavators.MOD_ID);

    public static final RegistryObject<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator",
            () -> new Excavator(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties().durability(302).attributes(PickaxeItem.createAttributes(Tiers.WOOD, 1.5F, -3.0F))));
    public static final RegistryObject<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator",
            () -> new Excavator(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().durability(650).attributes(PickaxeItem.createAttributes(Tiers.STONE, 1.5F, -3.0F))));
    public static final RegistryObject<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator",
            () -> new Excavator(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().durability(1300).attributes(PickaxeItem.createAttributes(Tiers.IRON, 1.5F, -3.0F))));
    public static final RegistryObject<Item> GOLD_EXCAVATOR = ITEMS.register("gold_excavator",
            () -> new Excavator(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties().durability(750).attributes(PickaxeItem.createAttributes(Tiers.GOLD, 1.5F, -3.0F))));
    public static final RegistryObject<Item> LAPIS_EXCAVATOR = ITEMS.register("lapis_excavator",
            () -> new LapisExcavator(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().durability(1100).attributes(PickaxeItem.createAttributes(Tiers.IRON, 1.5F, -3.0F))));
    public static final RegistryObject<Item> REDSTONE_EXCAVATOR = ITEMS.register("redstone_excavator",
            () -> new RedstoneExcavator(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().durability(1100).attributes(PickaxeItem.createAttributes(Tiers.IRON, 1.5F, -3.0F))));
    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator",
            () -> new Excavator(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties().durability(8025).attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1.5F, -3.0F))));
    public static final RegistryObject<Item> EMERALD_EXCAVATOR = ITEMS.register("emerald_excavator",
            () -> new EmeraldExcavator(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().durability(9768).attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 1.5F, -3.0F))));
    public static final RegistryObject<Item> OBSIDIAN_EXCAVATOR = ITEMS.register("obsidian_excavator",
            () -> new ObsidianExcavator(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties().durability(11200).fireResistant().attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1.5F, -3.0F))));
    public static final RegistryObject<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator",
            () -> new Excavator(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().durability(13675).fireResistant().attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 1.5F, -3.0F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
