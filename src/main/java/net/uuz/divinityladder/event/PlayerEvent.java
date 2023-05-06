package net.uuz.divinityladder.event;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Registry.CapabilityRegistry;
import net.uuz.divinityladder.Registry.EffectRegistry;
import net.uuz.divinityladder.common.PlayerCombatTracker;

@Mod.EventBusSubscriber
public class PlayerEvent {
    @SubscribeEvent
    public static void onPlayerInteractRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level world = event.getWorld();
        InteractionHand hand = event.getHand();
        if (world.isClientSide || hand != InteractionHand.MAIN_HAND) return;
        Player player = event.getPlayer();
        if (!player.isShiftKeyDown()) return;

        player.getCapability(CapabilityRegistry.SHIELD).ifPresent(cap -> {
        });
    }

    @SubscribeEvent
    public static void ShieldCapabilityHurtEvent(LivingHurtEvent event) {
        float amount = event.getAmount();
        Entity entity = event.getEntity();
        if (entity instanceof Player player) {
            player.getCapability(CapabilityRegistry.SHIELD).ifPresent(cap -> {
                if (cap.getShield() > 0) {
                    cap.extractShield(player, amount);
                    event.setCanceled(true);
                }
                if (cap.getShield() <= 0) {
                    player.addEffect(new MobEffectInstance(EffectRegistry.BROKEN, 200, 0, false, false));
                }

            });
        }
    }

    @SubscribeEvent
    public static void ShieldCapabilityRestoreEvent(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            return;
        }
        Player player = event.player;
        if (player.level.isClientSide) return;
        long gameTime = player.level.getGameTime();
        boolean inCombat = PlayerCombatTracker.isInCombat();
        player.getCapability(CapabilityRegistry.SHIELD).ifPresent(cap -> {
            if (player.getEffect(EffectRegistry.BROKEN) == null) {
                if (gameTime % 40 == 0) {
                    if (!inCombat) {
                        cap.receiveShield(player, 1);
                    }
                }
            }
        });
    }

}
