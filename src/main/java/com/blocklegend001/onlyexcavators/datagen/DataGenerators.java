package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = OnlyExcavators.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(packOutput, lookupProvider, OnlyExcavators.MOD_ID, existingFileHelper);

        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, OnlyExcavators.MOD_ID));
        generator.addProvider(event.includeServer(), new ModRecipeProvider.Runner(packOutput, lookupProvider));
    }
}