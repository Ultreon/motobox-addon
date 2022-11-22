package com.ultreon.mods.motobox.mixin

import io.github.foundationgames.automobility.entity.AutomobileEntity.Displacement
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.gen.Accessor

@Mixin(Displacement::class)
interface DisplacementAccessor {
    @get:Accessor
    @set:Accessor
    var verticalTarget: Float
    @get:Accessor
    @set:Accessor
    var currAngularX: Float
    @get:Accessor
    @set:Accessor
    var currAngularZ: Float
}