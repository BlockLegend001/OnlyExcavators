package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = OnlyExcavators.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OnlyExcavators.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ONLYEXCAVATORS = CREATIVE_MODE_TABS.register("only_excavators",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_EXCAVATOR.get()))
                    .title(Component.translatable("itemGroup.onlyexcavators"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WOODEN_EXCAVATOR.get());
                        output.accept(ModItems.STONE_EXCAVATOR.get());
                        output.accept(ModItems.IRON_EXCAVATOR.get());
                        output.accept(ModItems.GOLD_EXCAVATOR.get());
                        output.accept(ModItems.REDSTONE_EXCAVATOR.get());
                        output.accept(ModItems.LAPIS_EXCAVATOR.get());
                        output.accept(ModItems.DIAMOND_EXCAVATOR.get());
                        output.accept(ModItems.EMERALD_EXCAVATOR.get());
                        output.accept(ModItems.OBSIDIAN_EXCAVATOR.get());
                        output.accept(ModItems.NETHERITE_EXCAVATOR.get());
                    }))
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

