package net.uuz.divinityladder.common;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PlayerCombatTracker {
    private static boolean inCombat = false;
    private static long lastCombatTime = 0;


    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if (event.getSource().getEntity() instanceof Player player) {
            inCombat = true;
            lastCombatTime = player.level.getGameTime();
        }
        if (event.getEntity() instanceof Player player) {
            inCombat = true;
            lastCombatTime = player.level.getGameTime();
        }
    }

    @SubscribeEvent
    public static void onTickPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            return;
        }
        Player player = event.player;
        if (player.level.isClientSide) return;
        long gameTime = player.level.getGameTime();
        if (inCombat && gameTime - lastCombatTime > 100) {
            inCombat = false;
        }
    }

    public static boolean isInCombat() {
        return inCombat;
    }

    public static long getLastCombatTime() {
        return lastCombatTime;
    }
}
