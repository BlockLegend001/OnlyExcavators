package com.blocklegend001.onlyexcavators.event;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.custom.Excavator;
import com.blocklegend001.onlyexcavators.utils.RadiusMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber(modid = OnlyExcavators.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @SubscribeEvent
    public static boolean onExcavatorUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if (!(player instanceof ServerPlayer serverPlayer)) return true;
        if (!(mainHandItem.getItem() instanceof Excavator excavator)) return true;
        if (event.getState().getDestroySpeed(event.getLevel(), event.getPos()) == 0.0F) return true;

        if (HARVESTED_BLOCKS.contains(event.getPos())) return true;

        boolean isSneaking = player.isCrouching() || player.isShiftKeyDown();

        HARVESTED_BLOCKS.add(event.getPos());

        try {
            int radius = isSneaking ? 0 : RadiusMap.getExcavatorRadius().get(mainHandItem.getItem());
            for (BlockPos targetPos : Excavator.getBlocksToBeDestroyed(radius, event.getPos(), serverPlayer)) {
                if (targetPos.equals(event.getPos())) continue;

                if (HARVESTED_BLOCKS.contains(targetPos)) continue;
                if (!excavator.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(targetPos))) continue;

                HARVESTED_BLOCKS.add(targetPos);
                serverPlayer.gameMode.destroyBlock(targetPos);
                HARVESTED_BLOCKS.remove(targetPos);
            }
        } finally {
            HARVESTED_BLOCKS.remove(event.getPos());
        }

        return true;
    }
}