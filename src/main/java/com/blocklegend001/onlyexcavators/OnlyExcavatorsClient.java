package com.blocklegend001.onlyexcavators;

import com.blocklegend001.onlyexcavators.utils.ExcavatorOverlayRenderer;
import com.blocklegend001.onlyexcavators.utils.ExcavatorUsageEvent;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.util.ActionResult;

public class OnlyExcavatorsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExcavatorOverlayRenderer.init();
        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if (world.isClient) {
                ExcavatorUsageEvent.isSneaking = player.isSneaking();
            }
            return ActionResult.PASS;
        });
    }
}