package com.blocklegend001.onlyexcavators;

import com.blocklegend001.onlyexcavators.item.ModCreativeModeTabs;
import com.blocklegend001.onlyexcavators.item.ModItems;
import com.blocklegend001.onlyexcavators.utils.KeyBinding;
import com.mojang.logging.LogUtils;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.slf4j.Logger;

@Mod(OnlyExcavators.MOD_ID)
public class OnlyExcavators {

    public static final String MOD_ID = "onlyexcavators";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static boolean SHOW_OUTLINE_ENABLED = true;
    
    public OnlyExcavators(FMLJavaModLoadingContext context) {
        var modGroupBus = context.getModBusGroup();
        context.registerConfig(ModConfig.Type.COMMON, ModConfigs.SPEC, "onlyexcavators.toml");
        ModConfigs.loadConfig(ModConfigs.SPEC, FMLPaths.CONFIGDIR.get().resolve("onlyexcavators.toml"));
        ModCreativeModeTabs.register(modGroupBus);
        ModItems.register(modGroupBus);
        FMLCommonSetupEvent.getBus(modGroupBus).addListener(this::setup);

        RegisterKeyMappingsEvent.BUS.addListener(KeyBinding::registerKeys);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event) {
        ModConfigs.loadConfig(ModConfigs.SPEC, FMLPaths.CONFIGDIR.get().resolve("onlyexcavators.toml"));
    }
}