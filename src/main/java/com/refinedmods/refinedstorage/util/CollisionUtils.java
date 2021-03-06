package com.refinedmods.refinedstorage.util;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;

public final class CollisionUtils {
    private CollisionUtils() {
    }

    public static boolean isInBounds(VoxelShape shape, BlockPos pos, Vector3d hit) {
        AxisAlignedBB aabb = shape.getBoundingBox().offset(pos);

        return hit.x >= aabb.minX
            && hit.x <= aabb.maxX
            && hit.y >= aabb.minY
            && hit.y <= aabb.maxY
            && hit.z >= aabb.minZ
            && hit.z <= aabb.maxZ;
    }
}
