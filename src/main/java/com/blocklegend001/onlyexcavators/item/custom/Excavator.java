package com.blocklegend001.onlyexcavators.item.custom;

import net.minecraft.block.Block;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.blocklegend001.onlyexcavators.utils.RadiusMap.EXCAVATOR_RADIUS_MAP;

public class Excavator extends Item {

    private static TagKey<Block> shovelMineable;

    public Excavator(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(computeSettings(material, BlockTags.SHOVEL_MINEABLE, settings, attackDamage, attackSpeed));
    }

    private static Item.Settings computeSettings(ToolMaterial material, TagKey<Block> shovelMineable, Item.Settings settings, float attackDamage, float attackSpeed) {
        Excavator.shovelMineable = shovelMineable;
        settings.shovel(wrapMaterial(material, material.durability()), attackDamage, attackSpeed);
        return settings;
    }

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initalBlockPos, ServerPlayerEntity player) {
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20, 0, false);
        if (hit.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHit = (BlockHitResult) hit;

            if(blockHit.getSide() == Direction.DOWN || blockHit.getSide() == Direction.UP) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY(), initalBlockPos.getZ() + y));
                    }
                }
            }

            if(blockHit.getSide() == Direction.NORTH || blockHit.getSide() == Direction.SOUTH) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + y, initalBlockPos.getZ()));
                    }
                }
            }

            if(blockHit.getSide() == Direction.EAST || blockHit.getSide() == Direction.WEST) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        positions.add(new BlockPos(initalBlockPos.getX(), initalBlockPos.getY() + y, initalBlockPos.getZ() + x));
                    }
                }
            }
        }

        return positions;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        int radius = getRadiusForExcavator(stack);
        int width = radius * 2 + 1;

        Text text = Text.literal("Dig area: ")
                .formatted(Formatting.GRAY)
                .append(Text.literal(width + "x1").formatted(Formatting.YELLOW));
        textConsumer.accept(text);

        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }

    private int getRadiusForExcavator(ItemStack stack) {
        if (EXCAVATOR_RADIUS_MAP.containsKey(stack.getItem())) {
            return EXCAVATOR_RADIUS_MAP.get(stack.getItem());
        }
        return 0;
    }

    private static ToolMaterial wrapMaterial(ToolMaterial toolMaterial, int durability) {
        return new ToolMaterial(
                toolMaterial.incorrectBlocksForDrops(),
                durability,
                toolMaterial.speed(),
                toolMaterial.attackDamageBonus(),
                toolMaterial.enchantmentValue(),
                toolMaterial.repairItems()
        );
    }
}