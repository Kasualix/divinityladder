package net.uuz.divinityladder.Registry;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.effect.BaseEffect;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EffectRegistry {
    public static BaseEffect BROKEN;
    @SubscribeEvent
    public static void registerEnchantments(final RegistryEvent.Register<MobEffect> event){
        event.getRegistry().registerAll(
                BROKEN = new BaseEffect("broken",MobEffectCategory.BENEFICIAL, 0x00FF00)
        );
    }
}
