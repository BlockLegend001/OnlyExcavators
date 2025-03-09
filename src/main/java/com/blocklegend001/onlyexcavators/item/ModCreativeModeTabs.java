package com.blocklegend001.onlyexcavators.item;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;

@Mod.EventBusSubscriber(modid = OnlyExcavators.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab ONLYEXCAVATORS;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ONLYEXCAVATORS = event.registerCreativeModeTab(new ResourceLocation(OnlyExcavators.MOD_ID, "onlyexcavators"),
                builder -> builder.icon(() -> new ItemStack(ModItems.NETHERITE_EXCAVATOR.get()))
                        .title(Component.translatable("itemGroup.onlyexcavators")));
    }
}
