package net.uuz.divinityladder.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.client.gui.ForgeIngameGui;
import net.minecraftforge.client.gui.IIngameOverlay;
import net.minecraftforge.client.gui.OverlayRegistry;
import net.uuz.divinityladder.Divinityladder;
import net.uuz.divinityladder.Registry.CapabilityRegistry;
import net.uuz.divinityladder.capability.IShield;

public class ShieldBarRenderer {
    public static IShield SHIELD = null;
    private static final ResourceLocation HUD = Divinityladder.asResource("textures/gui/shield.png");

    private static final Minecraft minecraft = Minecraft.getInstance();
    public static void register()
    {

    }


    public static final IIngameOverlay SHIELD_OVERLAY = OverlayRegistry.registerOverlayAbove(ForgeIngameGui.PLAYER_HEALTH_ELEMENT, "Player Shield", (gui, poseStack, partialTicks, screenWidth, screenHeight) ->
    {
        boolean isMounted = minecraft.player.getVehicle() instanceof LivingEntity;
        if (!isMounted && !minecraft.options.hideGui && gui.shouldDrawSurvivalElements())
        {
            gui.setupOverlayRenderState(true, false);
            render(gui, screenWidth, screenHeight, poseStack);
        }
    });

    public static void render(ForgeIngameGui gui, int screenWidth, int screenHeight, PoseStack poseStack)
    {
        //wtf is a poseStack?

        minecraft.getProfiler().push("shield");
        if (SHIELD == null || minecraft.player.tickCount % 40 == 0)
        {
            SHIELD = minecraft.player.getCapability(CapabilityRegistry.SHIELD).orElse(null);
        }

        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, HUD);

        int shield = SHIELD.getShield();
        int maxShield = SHIELD.getMaxShield();
        int content = maxShield / 10;

        int left = screenWidth / 2 - 10;
        int top = screenHeight - 59;

        if (content < 2){
            int i = maxShield / 2;
            int j = maxShield % 2;
            if (j != 0){
                i++;
            }
            for (int i1 = 0; i1 < i; i1++) {
                int x = left + i1 * 8 - 81;
                gui.blit(poseStack, x, top, 18, 0, 9, 9, 27, 9);
            }

            int i2 = shield / 2;
            int j2 = shield % 2;
            int k = 0;

            for (int i3 = 0; i3 < i2; i3++) {
                int x = left + i3 * 8 - 81;
                gui.blit(poseStack, x, top, 0, 0, 9, 9, 27, 9);
                k = x;
            }
            for (int j3 = 0; j3 < j2; j3++) {
                int x;
                if (k == 0) {
                    x = left + i2 * 8 - 81;
                }else {
                    x = k + 8;
                }
                gui.blit(poseStack, x, top, 9, 0, 9, 9, 27, 9);
            }
        }

        RenderSystem.disableBlend();
        RenderSystem.setShaderTexture(0, GuiComponent.GUI_ICONS_LOCATION);

        minecraft.getProfiler().pop();
    }


}
