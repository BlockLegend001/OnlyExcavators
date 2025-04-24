package com.blocklegend001.onlyexcavators;

import com.blocklegend001.onlyexcavators.utils.ExcavatorOverlayRenderer;
import net.fabricmc.api.ClientModInitializer;

public class OnlyExcavatorsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExcavatorOverlayRenderer.init();
    }
}