package com.blocklegend001.onlyexcavators.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

import static com.blocklegend001.onlyexcavators.OnlyExcavators.MOD_ID;

public class KeyBinding {
    public static final KeyMapping.Category ONLYEXCAVATORS_CATEGORY =
            KeyMapping.Category.register(
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "showoutline")
            );

    public static final KeyMapping EXCAVATOR_SHOW_OUTLINE_KEY = new KeyMapping(
            "key.onlyexcavators.showoutline",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_O,
            ONLYEXCAVATORS_CATEGORY
    );

    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(EXCAVATOR_SHOW_OUTLINE_KEY);
    }
}