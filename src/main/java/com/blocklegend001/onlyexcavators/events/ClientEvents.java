package com.blocklegend001.onlyexcavators.events;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(modid = OnlyExcavators.MOD_ID, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Pre event) {
        if (Minecraft.getInstance().player != null) {
            ModEvents.isSneaking = Minecraft.getInstance().player.isShiftKeyDown();
        }
    }
}