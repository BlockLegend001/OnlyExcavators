package com.blocklegend001.onlyexcavators;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class OnlyExcavatorsClient implements ClientModInitializer {

    public static KeyBinding SHOW_OUTLINE_KEY;
    public static boolean SHOW_OUTLINE_ENABLED = true;

    private static final KeyBinding.Category CATEGORY =
            KeyBinding.Category.create(
                    Identifier.of("onlyexcavators", "showoutline")
            );

    @Override
    public void onInitializeClient() {

        SHOW_OUTLINE_KEY = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        "key.onlyexcavators.showoutline",
                        InputUtil.Type.KEYSYM,
                        GLFW.GLFW_KEY_O,
                        CATEGORY
                )
        );

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (SHOW_OUTLINE_KEY.wasPressed()) {
                SHOW_OUTLINE_ENABLED = !SHOW_OUTLINE_ENABLED;

                if (client.player != null) {
                    client.player.sendMessage(
                            Text.literal("Outline: " + (SHOW_OUTLINE_ENABLED ? "ON" : "OFF")),
                            false
                    );
                }
            }
        });
    }
}