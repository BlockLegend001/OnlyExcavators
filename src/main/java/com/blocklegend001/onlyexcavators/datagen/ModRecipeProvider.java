package com.blocklegend001.onlyexcavators.datagen;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider  {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                createShaped(RecipeCategory.TOOLS, ModItems.WOODEN_EXCAVATOR)
                        .pattern(" B ")
                        .pattern("BSB")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('B', ItemTags.LOGS)
                        .criterion(hasItem(Items.OAK_LOG), conditionsFromItem(Items.OAK_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.STONE_EXCAVATOR)
                        .pattern(" B ")
                        .pattern("BSB")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('B', ItemTags.STONE_CRAFTING_MATERIALS)
                        .criterion(hasItem(Items.STONE), conditionsFromItem(Items.COBBLESTONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.IRON_EXCAVATOR)
                        .pattern(" B ")
                        .pattern("bSb")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('B', Items.IRON_INGOT)
                        .input('b', Blocks.IRON_BLOCK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.GOLD_EXCAVATOR)
                        .pattern(" B ")
                        .pattern("bSb")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('B', Items.GOLD_INGOT)
                        .input('b', Blocks.GOLD_BLOCK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.LAPIS_EXCAVATOR)
                        .pattern(" B ")
                        .pattern("bSb")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('B', Items.LAPIS_LAZULI)
                        .input('b', Blocks.LAPIS_BLOCK)
                        .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.REDSTONE_EXCAVATOR)
                        .pattern(" B ")
                        .pattern("bSb")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('B', Items.REDSTONE)
                        .input('b', Blocks.REDSTONE_BLOCK)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DIAMOND_EXCAVATOR)
                        .pattern(" B ")
                        .pattern("bSb")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('B', Items.DIAMOND)
                        .input('b', Blocks.DIAMOND_BLOCK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.EMERALD_EXCAVATOR)
                        .pattern(" B ")
                        .pattern("bSb")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('B', Items.EMERALD)
                        .input('b', Blocks.EMERALD_BLOCK)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_EXCAVATOR)
                        .pattern(" B ")
                        .pattern("bSb")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('B', Items.OBSIDIAN)
                        .input('b', Blocks.OBSIDIAN)
                        .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                        .offerTo(exporter);

                SmithingTransformRecipeJsonBuilder
                        .create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(ModItems.DIAMOND_EXCAVATOR),
                                Ingredient.ofItems(Items.NETHERITE_INGOT),
                                RecipeCategory.TOOLS,
                                ModItems.NETHERITE_EXCAVATOR
                        )
                        .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of(OnlyExcavators.MOD_ID, "netherite_excavator")));
            }
        };
    }

    @Override
    public String getName() {
        return "OnlyExcavators Recipes";
    }
}