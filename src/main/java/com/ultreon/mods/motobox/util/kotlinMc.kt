package com.ultreon.mods.motobox.util

import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Vec2f
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f
import net.minecraft.util.math.Vec3i
import net.minecraft.util.math.Vector4f

fun vec(x: Float, y: Float, z: Float, w: Float): Vector4f {
    return Vector4f(x, y, z, w)
}

fun vec(x: Double, y: Double, z: Double): Vec3d {
    return Vec3d(x, y, z)
}

fun vec(x: Float, y: Float, z: Float): Vec3f {
    return Vec3f(x, y, z)
}

fun vec(x: Int, y: Int, z: Int): Vec3i {
    return Vec3i(x, y, z)
}

fun vec(x: Float, y: Float): Vec2f {
    return Vec2f(x, y)
}

fun pos(x: Int, y: Int, z: Int): BlockPos {
    return BlockPos(x, y, z)
}

operator fun Vec3d.plus(other: Vec3d): Vec3d {
    return this.add(other)
}
