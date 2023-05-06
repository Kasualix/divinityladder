package net.uuz.divinityladder.Registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Divinityladder;
import net.uuz.divinityladder.capability.IShield;
import net.uuz.divinityladder.capability.Shield;

@Mod.EventBusSubscriber
public class CapabilityRegistry {
    public static final Capability<IShield> SHIELD = CapabilityManager.get(new CapabilityToken<>() {
    });
    @SubscribeEvent
    public static void register(RegisterCapabilitiesEvent event) {
        event.register(IShield.class);
    }

    @SubscribeEvent
    public static void onAttachCapabilitiesEntity(AttachCapabilitiesEvent<Entity> event) {
        Entity object = event.getObject();
        if (object instanceof Player) {
            event.addCapability(new ResourceLocation(Divinityladder.MOD_ID, "shield"), new Shield());
        }
    }
}
