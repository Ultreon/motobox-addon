package com.ultreon.mods.motobox.mixin;

import com.ultreon.mods.motobox.Hooks;
import com.ultreon.mods.motobox.Motobox;
import io.github.foundationgames.automobility.automobile.AutomobileFrame;
import io.github.foundationgames.automobility.automobile.attachment.rear.RearAttachment;
import io.github.foundationgames.automobility.automobile.render.RenderableAutomobile;
import io.github.foundationgames.automobility.entity.AutomobileEntity;
import io.github.foundationgames.automobility.entity.EntityWithInventory;
import net.minecraft.client.model.Model;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AutomobileEntity.class)
public abstract class AutomobileEntityMixin extends Entity implements RenderableAutomobile, EntityWithInventory {
    @Shadow private AutomobileFrame frame;

    @Shadow @Final private AutomobileEntity.Displacement displacement;

    @Shadow private RearAttachment rearAttachment;

    @Shadow private @Nullable Model rearAttachmentModel;

    public AutomobileEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(at = @At("HEAD"), method = "updatePassengerPosition", cancellable = true)
    public void updatePassengerPosition(Entity passenger, CallbackInfo ci) {
        if (Hooks.INSTANCE.automobileEntityPassengers((AutomobileEntity)(Object) this, frame, (DisplacementAccessor)(Object) displacement, rearAttachment, passenger)) {
            ci.cancel();
        }
    }
}
