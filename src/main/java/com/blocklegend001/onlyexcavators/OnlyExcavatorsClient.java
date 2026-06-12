package com.blocklegend001.onlyexcavators;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.lwjgl.glfw.GLFW;

public class OnlyExcavatorsClient implements ClientModInitializer {

    public static KeyMapping EXCAVATOR_SHOW_OUTLINE_KEY;
    public static boolean SHOW_OUTLINE_ENABLED = true;

    private static final KeyMapping.Category CATEGORY =
            KeyMapping.Category.register(
                    Identifier.fromNamespaceAndPath("onlyexcavators", "showoutline")
            );

    @Override
    public void onInitializeClient() {

        EXCAVATOR_SHOW_OUTLINE_KEY = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.onlyexcavators.showoutline",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_O,
                        CATEGORY
                )
        );

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (EXCAVATOR_SHOW_OUTLINE_KEY.isDown()) {
                SHOW_OUTLINE_ENABLED = !SHOW_OUTLINE_ENABLED;

                if (client.player != null) {
                    client.player.sendSystemMessage(
                            Component.literal("Outline: " + (SHOW_OUTLINE_ENABLED ? "ON" : "OFF"))
                    );
                }
            }
        });
    }
}