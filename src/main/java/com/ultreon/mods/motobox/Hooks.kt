package com.ultreon.mods.motobox

import com.ultreon.mods.motobox.Motobox.id
import com.ultreon.mods.motobox.mixin.DisplacementAccessor
import com.ultreon.mods.motobox.util.vec
import io.github.foundationgames.automobility.automobile.AutomobileFrame
import io.github.foundationgames.automobility.automobile.attachment.rear.RearAttachment
import io.github.foundationgames.automobility.entity.AutomobileEntity
import net.minecraft.entity.Entity
import net.minecraft.util.math.Vec3d

object Hooks {
    fun automobileEntityPassengers(
        truck: AutomobileEntity,
        frame: AutomobileFrame,
        displacement: DisplacementAccessor,
        rearAttachment: RearAttachment,
        passenger: Entity
    ): Boolean {
        if (frame.id == id("truck")) {
            val pos: Vec3d
            if (passenger === truck.firstPassenger) {
                pos = truck.pos.add(0.0, displacement.verticalTarget.toDouble() + passenger.heightOffset, 0.0)
                    .add(
                        vec(-0.5, truck.mountedHeightOffset - 0.3, -0.1)
                            .rotateY(Math.toRadians((180.0f - truck.yaw).toDouble()).toFloat())
                            .rotateX(Math.toRadians((truck.pitch).toDouble()).toFloat())
                            .rotateX(Math.toRadians(-displacement.currAngularX.toDouble()).toFloat())
                            .rotateZ(Math.toRadians(-displacement.currAngularZ.toDouble()).toFloat())
                    )
                passenger.setPosition(pos.x, pos.y, pos.z)
            } else if (truck.passengerList.size >= 2 && passenger == truck.passengerList[1]) {
                pos = truck.pos.add(0.0, displacement.verticalTarget.toDouble() + passenger.heightOffset, 0.0)
                    .add(
                        vec(0.5, truck.mountedHeightOffset - 0.3, -0.1)
                            .rotateY(Math.toRadians((180.0f - truck.yaw).toDouble()).toFloat())
                            .rotateX(Math.toRadians((truck.pitch).toDouble()).toFloat())
                            .rotateX(Math.toRadians(-displacement.currAngularX.toDouble()).toFloat())
                            .rotateZ(Math.toRadians(-displacement.currAngularZ.toDouble()).toFloat())
                    )
                passenger.setPosition(pos.x, pos.y, pos.z)
            } else if (truck.passengerList.size >= 3 && passenger == truck.passengerList[2]) {
                pos = truck.pos.add(0.0, displacement.verticalTarget.toDouble() + passenger.heightOffset, 0.0)
                    .add(
                        vec(-0.25, truck.mountedHeightOffset - 0.3, 0.8)
                            .rotateY(Math.toRadians((180.0f - truck.yaw).toDouble()).toFloat())
                            .rotateX(Math.toRadians((truck.pitch).toDouble()).toFloat())
                            .rotateX(Math.toRadians(-displacement.currAngularX.toDouble()).toFloat())
                            .rotateZ(Math.toRadians(-displacement.currAngularZ.toDouble()).toFloat())
                    )
                passenger.setPosition(pos.x, pos.y, pos.z)
            } else if (truck.hasPassenger(passenger)) {
                pos = truck.pos.add(
                    vec(0.0, displacement.verticalTarget.toDouble(), truck.frame.model().rearAttachmentPos().toDouble() * 0.0625)
                        .rotateY(Math.toRadians((180.0f - truck.yaw).toDouble()).toFloat())
                        .add(0.0, rearAttachment.passengerHeightOffset + passenger.heightOffset - 0.14, 0.0)
                        .add(rearAttachment.scaledYawVec())
                        .rotateX(Math.toRadians(-displacement.currAngularX.toDouble()).toFloat())
                        .rotateZ(Math.toRadians(-displacement.currAngularZ.toDouble()).toFloat())
                )
                passenger.setPosition(pos.x, pos.y, pos.z)
            }
            return true
        }
        return false
    }

    fun hasSpaceForPassengers(
        rearAttachment: RearAttachment,
        passengerList: MutableList<Entity>
    ): Boolean {
        return if (rearAttachment.isRideable) passengerList.size < 4 else passengerList.size < 3
    }

}