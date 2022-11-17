package com.ultreon.mods.motobox.mixin;

import com.ultreon.mods.motobox.client.render.frame.MotorbikeFrameModel;
import io.github.foundationgames.automobility.automobile.render.BaseModel;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BaseModel.class)
public class BaseModelMixin {
    @SuppressWarnings("ConstantConditions")
    @Inject(at = @At("HEAD"), method = "render")
    private void motobox$injectRender$1(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha, CallbackInfo ci) {
        if (((Object) this) instanceof MotorbikeFrameModel) {
            matrices.push();
            matrices.translate(0, 7.10 / 16.0, 0);
        }
    }

    @SuppressWarnings("ConstantConditions")
    @Inject(at = @At("RETURN"), method = "render")
    private void motobox$injectRender$2(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha, CallbackInfo ci) {
        if (((Object) this) instanceof MotorbikeFrameModel) {
            matrices.pop();
        }
    }
}
