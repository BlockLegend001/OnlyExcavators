package com.blocklegend001.onlyexcavators;

import com.blocklegend001.onlyexcavators.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(OnlyExcavators.MOD_ID)
public class OnlyExcavators {

    public static final String MOD_ID = "onlyexcavators";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ONLYEXCAVATORS = CREATIVE_MODE_TABS.register("onlyexcavators", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.onlyexcavators.onlyexcavators"))
            .icon(() -> new ItemStack(ModItems.NETHERITE_EXCAVATOR.get()))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.WOODEN_EXCAVATOR.get());
                output.accept(ModItems.STONE_EXCAVATOR.get());
                output.accept(ModItems.IRON_EXCAVATOR.get());
                output.accept(ModItems.GOLD_EXCAVATOR.get());
                output.accept(ModItems.LAPIS_EXCAVATOR.get());
                output.accept(ModItems.REDSTONE_EXCAVATOR.get());
                output.accept(ModItems.DIAMOND_EXCAVATOR.get());
                output.accept(ModItems.EMERALD_EXCAVATOR.get());
                output.accept(ModItems.OBSIDIAN_EXCAVATOR.get());
                output.accept(ModItems.NETHERITE_EXCAVATOR.get());
            }).build()
    );

    public OnlyExcavators(IEventBus eventBus) {
        ModConfigs.loadConfig();
        NeoForge.EVENT_BUS.register(ModEvents.class);
        ModItems.register(eventBus);
        CREATIVE_MODE_TABS.register(eventBus);
    }
}