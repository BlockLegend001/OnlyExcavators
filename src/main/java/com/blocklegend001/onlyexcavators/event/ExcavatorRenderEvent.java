package com.blocklegend001.onlyexcavators.event;

import com.blocklegend001.onlyexcavators.OnlyExcavators;
import com.blocklegend001.onlyexcavators.item.custom.Excavator;
import com.blocklegend001.onlyexcavators.utils.ExcavatorOverlayRenderer;
import com.blocklegend001.onlyexcavators.utils.RadiusMap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderHighlightEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;

@Mod.EventBusSubscriber(modid = OnlyExcavators.MOD_ID, value = Dist.CLIENT)
public class ExcavatorRenderEvent {

    @SubscribeEvent
    public static void onRenderHighlight(RenderHighlightEvent.Block event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null || mc.player == null) return;
        if (!OnlyExcavators.SHOW_OUTLINE_ENABLED) return;

        ItemStack heldItem = mc.player.getMainHandItem();
        if (!(heldItem.getItem() instanceof Excavator)) return;

        BlockHitResult blockHit = event.getTarget();
        BlockPos origin = blockHit.getBlockPos();
        Direction side = blockHit.getDirection();

        if (!mc.level.getBlockState(origin).is(BlockTags.MINEABLE_WITH_SHOVEL)) return;

        int range = mc.player.isShiftKeyDown() ? 0 :
                RadiusMap.getExcavatorRadius().get(heldItem.getItem());

        AABB box = getSelectionBox(range, side, origin);

        Camera camera = event.getCamera();
        MultiBufferSource bufferSource = event.getMultiBufferSource();

        VertexConsumer builder = bufferSource.getBuffer(RenderType.lines());

        ExcavatorOverlayRenderer.drawBox(builder, camera.getPosition(), box, 1f, 1f, 1f, 1f);
    }

    private static AABB getSelectionBox(int range, Direction side, BlockPos origin) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, minZ = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE, maxZ = Integer.MIN_VALUE;

        for (int x = -range; x <= range; x++) {
            for (int y = -range; y <= range; y++) {
                BlockPos pos = switch (side.getAxis()) {
                    case Y -> origin.offset(x, 0, y);
                    case X -> origin.offset(0, y, x);
                    case Z -> origin.offset(x, y, 0);
                };
                minX = Math.min(minX, pos.getX());
                minY = Math.min(minY, pos.getY());
                minZ = Math.min(minZ, pos.getZ());
                maxX = Math.max(maxX, pos.getX() + 1);
                maxY = Math.max(maxY, pos.getY() + 1);
                maxZ = Math.max(maxZ, pos.getZ() + 1);
            }
        }
        return new AABB(minX, minY, minZ, maxX, maxY, maxZ);
    }
}