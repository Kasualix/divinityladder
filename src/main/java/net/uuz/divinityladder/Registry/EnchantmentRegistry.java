package net.uuz.divinityladder.Registry;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Divinityladder;
import net.uuz.divinityladder.enchantment.EagleEyeEnchantment;
import net.uuz.divinityladder.enchantment.MoonEnchantment;
import net.uuz.divinityladder.enchantment.SuckingBloodEnchantment;
import net.uuz.divinityladder.enchantment.SunEnchantment;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnchantmentRegistry {

    public static Enchantment EAGLE_EYE;
    public static Enchantment MOON;
    public static Enchantment SUCKING_BLOOD;
    public static Enchantment SUN;

    @SubscribeEvent
    public static void registerEnchantments(final RegistryEvent.Register<Enchantment> event) {
       event.getRegistry().registerAll(
               EAGLE_EYE = new EagleEyeEnchantment().setRegistryName(Divinityladder.MOD_ID, "eagle_eye"),
               MOON = new MoonEnchantment().setRegistryName(Divinityladder.MOD_ID, "moon"),
               SUCKING_BLOOD = new SuckingBloodEnchantment().setRegistryName(Divinityladder.MOD_ID, "sucking_blood"),
               SUN = new SunEnchantment().setRegistryName(Divinityladder.MOD_ID, "sun")
       );
    }
}
