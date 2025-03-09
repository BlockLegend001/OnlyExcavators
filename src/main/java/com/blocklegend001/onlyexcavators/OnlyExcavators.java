package com.blocklegend001.onlyexcavators;

import com.blocklegend001.onlyexcavators.config.ModConfigs;
import com.blocklegend001.onlyexcavators.item.ModItemGroup;
import com.blocklegend001.onlyexcavators.item.ModItems;
import com.blocklegend001.onlyexcavators.utils.ExcavatorUsageEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnlyExcavators implements ModInitializer {
    public static final String MOD_ID = "onlyexcavators";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModConfigs.registerConfigs();
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        PlayerBlockBreakEvents.BEFORE.register(new ExcavatorUsageEvent());
    }
}