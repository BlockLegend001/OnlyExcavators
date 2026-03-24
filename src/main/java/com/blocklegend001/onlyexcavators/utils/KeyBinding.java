package com.blocklegend001.onlyexcavators.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

import static com.blocklegend001.onlyexcavators.OnlyExcavators.MOD_ID;

@EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
public class KeyBinding {
    public static final KeyMapping.Category ONLYEXCAVATORS_CATEGORY =
            KeyMapping.Category.register(
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "showoutline")
            );

    public static final KeyMapping SHOW_OUTLINE_KEY =
            new KeyMapping(
                    "key.onlyexcavators.showoutline",
                    InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_O,
                    ONLYEXCAVATORS_CATEGORY
            );

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(SHOW_OUTLINE_KEY);
    }
}
