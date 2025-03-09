package com.blocklegend001.onlyexcavators;

import com.blocklegend001.onlyexcavators.item.ModCreativeModeTabs;
import com.blocklegend001.onlyexcavators.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(OnlyExcavators.MOD_ID)
public class OnlyExcavators {

    public static final String MOD_ID = "onlyexcavators";
    private static final Logger LOGGER = LogUtils.getLogger();

    public OnlyExcavators() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModeTabs.ONLYEXCAVATORS) {
            event.accept(ModItems.WOODEN_EXCAVATOR.get());
            event.accept(ModItems.STONE_EXCAVATOR.get());
            event.accept(ModItems.IRON_EXCAVATOR.get());
            event.accept(ModItems.GOLD_EXCAVATOR.get());
            event.accept(ModItems.REDSTONE_EXCAVATOR.get());
            event.accept(ModItems.LAPIS_EXCAVATOR.get());
            event.accept(ModItems.DIAMOND_EXCAVATOR.get());
            event.accept(ModItems.EMERALD_EXCAVATOR.get());
            event.accept(ModItems.OBSIDIAN_EXCAVATOR.get());
            event.accept(ModItems.NETHERITE_EXCAVATOR.get());
        }
    }
}

