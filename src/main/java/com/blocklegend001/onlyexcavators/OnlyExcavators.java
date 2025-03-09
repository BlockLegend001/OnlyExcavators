package com.blocklegend001.onlyexcavators;

import com.blocklegend001.onlyexcavators.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnlyExcavators implements ModInitializer {
    public static final String MOD_ID = "onlyexcavators";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
