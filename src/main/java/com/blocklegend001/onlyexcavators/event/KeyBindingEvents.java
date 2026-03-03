package com.blocklegend001.onlyexcavators.event;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(modid = OnlyExcavators.MOD_ID, value = Dist.CLIENT)
public class KeyBindingEvents {

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {

        if (OnlyExcavators.SHOW_OUTLINE_KEY.get().consumeClick()) {

            OnlyExcavators.SHOW_OUTLINE_ENABLED =
                    !OnlyExcavators.SHOW_OUTLINE_ENABLED;

            var mc = Minecraft.getInstance();

            if (mc.player != null) {
                mc.player.sendSystemMessage(
                        Component.literal(
                                "Outline: " +
                                        (OnlyExcavators.SHOW_OUTLINE_ENABLED ? "ON" : "OFF")
                        )
                );
            }
        }
    }
}