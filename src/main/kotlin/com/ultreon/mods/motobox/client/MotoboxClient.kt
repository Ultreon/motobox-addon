package com.ultreon.mods.motobox.client

import com.mojang.blaze3d.systems.RenderSystem
import com.ultreon.mods.motobox.Motobox
import com.ultreon.mods.motobox.render.MotoboxModels
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.AfterEntities
import net.minecraft.client.model.*
import net.minecraft.client.render.*

@Suppress("unused")
@Environment(EnvType.CLIENT)
object MotoboxClient : ClientModInitializer {
    override fun onInitializeClient() {
        MotoboxModels.init()
        WorldRenderEvents.AFTER_ENTITIES.register(AfterEntities { context: WorldRenderContext ->
            val modelData = ModelData()
            val root = modelData.root
            val bone10 = root.addChild(
                "bone10",
                ModelPartBuilder.create().uv(0, 0).cuboid(-25.5f, 0.75f, 1.0f, 1.0f, 2.0f, 1.0f, Dilation(0.0f))
                    .uv(148, 102).cuboid(-30.0f, -0.5f, -10.0f, 11.0f, 3.0f, 11.0f, Dilation(0.0f))
                    .uv(121, 142).cuboid(-30.0f, 2.5f, -10.0f, 11.0f, 7.0f, 11.0f, Dilation(0.0f))
                    .uv(18, 0).cuboid(7.0f, -1.5f, 5.0f, 1.0f, 6.0f, 6.0f, Dilation(0.0f))
                    .uv(0, 0).cuboid(8.0f, -0.5f, 6.0f, 1.0f, 4.0f, 4.0f, Dilation(0.0f))
                    .uv(0, 76).cuboid(-17.0f, 2.5f, 8.0f, 9.0f, 4.0f, 3.0f, Dilation(0.0f))
                    .uv(76, 18).cuboid(-17.0f, 2.5f, -3.0f, 9.0f, 4.0f, 3.0f, Dilation(0.0f))
                    .uv(114, 102).cuboid(-31.5f, -0.5f, -16.0f, 1.0f, 8.0f, 32.0f, Dilation(0.0f))
                    .uv(80, 31).cuboid(-31.5f, 7.5f, -14.0f, 1.0f, 4.0f, 28.0f, Dilation(0.0f))
                    .uv(76, 0).cuboid(-26.0f, 3.5f, 11.0f, 12.0f, 6.0f, 3.0f, Dilation(0.0f))
                    .uv(0, 36).cuboid(-14.5f, -0.5f, -16.0f, 9.0f, 12.0f, 2.0f, Dilation(0.0f))
                    .uv(78, 48).cuboid(-30.0f, 7.5f, -16.0f, 4.0f, 4.0f, 2.0f, Dilation(0.0f))
                    .uv(82, 76).cuboid(-30.0f, 3.5f, -16.0f, 4.0f, 4.0f, 2.0f, Dilation(0.0f))
                    .uv(138, 10).cuboid(-30.0f, -0.5f, -16.0f, 15.0f, 4.0f, 2.0f, Dilation(0.0f))
                    .uv(10, 83).cuboid(-30.0f, 7.5f, 14.0f, 4.0f, 4.0f, 2.0f, Dilation(0.0f))
                    .uv(70, 88).cuboid(-30.0f, 3.5f, 14.0f, 4.0f, 4.0f, 2.0f, Dilation(0.0f))
                    .uv(138, 16).cuboid(-30.0f, -0.5f, 14.0f, 15.0f, 4.0f, 2.0f, Dilation(0.0f))
                    .uv(0, 50).cuboid(-14.5f, -0.5f, 14.0f, 9.0f, 12.0f, 2.0f, Dilation(0.0f))
                    .uv(138, 0).cuboid(-5.0f, 6.5f, -16.0f, 17.0f, 4.0f, 1.0f, Dilation(0.0f))
                    .uv(138, 5).cuboid(-5.0f, 6.5f, 15.0f, 17.0f, 4.0f, 1.0f, Dilation(0.0f))
                    .uv(0, 137).cuboid(-4.5f, -10.5f, -15.0f, 1.0f, 10.0f, 30.0f, Dilation(0.0f))
                    .uv(89, 142).cuboid(-5.0f, -0.5f, -15.0f, 1.0f, 10.0f, 30.0f, Dilation(0.0f))
                    .uv(0, 2).cuboid(11.5f, -1.5f, -17.0f, 0.0f, 1.0f, 1.0f, Dilation(0.0f))
                    .uv(18, 85).cuboid(11.25f, -3.0f, -21.0f, 1.0f, 2.0f, 4.0f, Dilation(0.0f))
                    .uv(92, 36).cuboid(11.25f, -3.0f, 17.0f, 1.0f, 2.0f, 4.0f, Dilation(0.0f))
                    .uv(2, 2).cuboid(11.5f, -1.5f, 16.0f, 0.0f, 1.0f, 1.0f, Dilation(0.0f))
                    .uv(76, 0).cuboid(-5.25f, -11.0f, -15.25f, 16.0f, 1.0f, 30.0f, Dilation(0.0f))
                    .uv(18, 0).cuboid(10.0f, -5.5f, 15.0f, 2.0f, 5.0f, 0.0f, Dilation(0.0f))
                    .uv(0, 23).cuboid(10.0f, -5.5f, -15.0f, 2.0f, 5.0f, 0.0f, Dilation(0.0f))
                    .uv(148, 116).cuboid(-5.0f, -0.5f, -17.0f, 17.0f, 7.0f, 2.0f, Dilation(0.0f))
                    .uv(0, 23).cuboid(-1.0f, 6.5f, -3.0f, 10.0f, 3.0f, 6.0f, Dilation(0.0f))
                    .uv(70, 76).cuboid(9.0f, 3.5f, -3.0f, 3.0f, 6.0f, 6.0f, Dilation(0.0f))
                    .uv(132, 68).cuboid(9.0f, -0.5f, -15.0f, 3.0f, 4.0f, 30.0f, Dilation(0.0f))
                    .uv(148, 125).cuboid(-5.0f, -0.5f, 15.0f, 17.0f, 7.0f, 2.0f, Dilation(0.0f))
                    .uv(34, 135).cuboid(34.0f, 0.5f, -9.0f, 1.0f, 4.0f, 18.0f, Dilation(0.0f))
                    .uv(82, 82).cuboid(33.0f, 0.5f, -15.5f, 2.0f, 4.0f, 6.0f, Dilation(0.0f))
                    .uv(0, 83).cuboid(33.0f, 0.5f, 9.0f, 2.0f, 4.0f, 6.0f, Dilation(0.0f))
                    .uv(47, 134).cuboid(16.0f, 3.5f, -12.0f, 11.0f, 8.0f, 25.0f, Dilation(0.0f))
                    .uv(0, 0).cuboid(12.0f, -0.5f, -16.0f, 22.0f, 4.0f, 32.0f, Dilation(0.0f))
                    .uv(76, 9).cuboid(-26.0f, 3.5f, -14.0f, 12.0f, 6.0f, 3.0f, Dilation(0.0f))
                    .uv(40, 98).cuboid(-17.0f, 6.5f, -2.0f, 12.0f, 3.0f, 12.0f, Dilation(0.0f))
                    .uv(0, 0).cuboid(-8.0f, -4.5f, -2.0f, 3.0f, 11.0f, 12.0f, Dilation(0.0f))
                    .uv(0, 36).cuboid(-30.0f, 9.5f, -14.0f, 25.0f, 2.0f, 28.0f, Dilation(0.0f))
                    .uv(0, 96).cuboid(-4.0f, -2.5f, -15.0f, 4.0f, 8.0f, 12.0f, Dilation(0.0f))
                    .uv(40, 113).cuboid(-4.0f, 5.5f, 3.0f, 11.0f, 3.0f, 12.0f, Dilation(0.0f))
                    .uv(114, 102).cuboid(-4.0f, -2.5f, 3.0f, 4.0f, 8.0f, 12.0f, Dilation(0.0f))
                    .uv(148, 41).cuboid(-4.0f, 5.5f, -15.0f, 11.0f, 3.0f, 12.0f, Dilation(0.0f))
                    .uv(68, 66).cuboid(-5.0f, 9.5f, -15.0f, 17.0f, 2.0f, 30.0f, Dilation(0.0f))
                    .uv(0, 96).cuboid(12.0f, 3.5f, -16.0f, 4.0f, 7.0f, 32.0f, Dilation(0.0f))
                    .uv(106, 31).cuboid(27.5f, 7.5f, -16.0f, 5.0f, 3.0f, 32.0f, Dilation(0.0f))
                    .uv(72, 98).cuboid(27.5f, 3.5f, -16.0f, 5.0f, 4.0f, 32.0f, Dilation(0.0f)),
                ModelTransform.of(-1.0f, -14.5f, -2.0f, 0.0f, 1.5708f, 0.0f)
            )
            bone10.addChild(
                "cube_r2",
                ModelPartBuilder.create().uv(0, 66)
                    .cuboid(11.8272f, -3.9572f, -14.0f, 21.0f, 2.0f, 28.0f, Dilation(0.0f)),
                ModelTransform.of(-1.0f, -14.5f, -2.0f, 1.5708f, 1.4835f, 1.5708f)
            )
            bone10.addChild(
                "cube_r3",
                ModelPartBuilder.create().uv(0, 66).cuboid(0.5f, -8.6717f, 14.9223f, 10.0f, 9.0f, 1.0f, Dilation(0.0f))
                    .uv(90, 46).cuboid(-5.0f, -9.1832f, 14.1608f, 5.0f, 10.0f, 2.0f, Dilation(0.0f)),
                ModelTransform.of(-1.0f, -14.5f, -2.0f, 0.0f, 1.5708f, -0.0873f)
            )
            bone10.addChild(
                "cube_r4",
                ModelPartBuilder.create().uv(70, 66)
                    .cuboid(0.5f, -8.9332f, -15.6608f, 10.0f, 9.0f, 1.0f, Dilation(0.0f))
                    .uv(78, 36).cuboid(-5.0f, -9.1832f, -16.1608f, 5.0f, 10.0f, 2.0f, Dilation(0.0f)),
                ModelTransform.of(-1.0f, -14.5f, -2.0f, 0.0f, 1.5708f, 0.0873f)
            )
            bone10.addChild(
                "cube_r5",
                ModelPartBuilder.create().uv(148, 4)
                    .cuboid(11.4297f, -7.9888f, -13.75f, 1.0f, 10.0f, 27.0f, Dilation(0.0f)),
                ModelTransform.of(-1.0f, -14.5f, -2.0f, -1.5708f, 1.3526f, -1.5708f)
            )
            bone10.addChild(
                "cube_r6",
                ModelPartBuilder.create().uv(22, 36)
                    .cuboid(11.3588f, -6.6078f, -15.8784f, 1.0f, 10.0f, 2.0f, Dilation(0.0f)),
                ModelTransform.of(-1.0f, -14.5f, -2.0f, -1.6059f, 1.3528f, -1.5182f)
            )
            bone10.addChild(
                "cube_r7",
                ModelPartBuilder.create().uv(22, 48)
                    .cuboid(10.8572f, -7.6556f, 13.8784f, 1.0f, 10.0f, 2.0f, Dilation(0.0f)),
                ModelTransform.of(-1.0f, -14.5f, -2.0f, -1.5125f, 1.44f, -1.6f)
            )
            val bbMain =
                root.addChild("bb_main", ModelPartBuilder.create(), ModelTransform.pivot(0.0f, 24.0f, 0.0f))
            bbMain.addChild(
                "cube_r8",
                ModelPartBuilder.create().uv(11, 199).cuboid(-35.0f, 9.5f, -3.0f, 1.0f, 1.0f, 4.0f, Dilation(0.0f))
                    .uv(1, 200).cuboid(-34.0f, 9.5f, -2.0f, 3.0f, 1.0f, 2.0f, Dilation(0.0f)),
                ModelTransform.of(-1.0f, -14.5f, -2.0f, 0.0f, 1.5708f, 0.0f)
            )
            val textured = TexturedModelData.of(modelData, 256, 256)
            val modelPart = textured.createModel()
            val stack = context.matrixStack()
            stack.push()
            val camPos = context.camera().pos
            RenderSystem.disableCull()
            RenderSystem.setShader { GameRenderer.getPositionColorTexShader() }
            RenderSystem.setShaderTexture(0, Motobox.id("textures/entity/automobile/frame/truck.png"))
            stack.translate(-camPos.x, -camPos.y + 100, -camPos.z)
            stack.scale(1f, -1f, 1f)
            val builder = Tessellator.getInstance().buffer
            builder.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR_TEXTURE)
            RenderSystem.enableBlend()
            RenderSystem.defaultBlendFunc()
            RenderSystem.setShaderColor(1f, 1f, 1f, 1f)
            modelPart.render(stack, builder, LightmapTextureManager.MAX_LIGHT_COORDINATE, OverlayTexture.DEFAULT_UV)
            RenderSystem.enableDepthTest()
            Tessellator.getInstance().draw()
            RenderSystem.disableDepthTest()
            RenderSystem.enableCull()
            RenderSystem.disableBlend()
            stack.pop()
        })
    }
}