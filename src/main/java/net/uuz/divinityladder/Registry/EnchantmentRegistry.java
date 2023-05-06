package net.uuz.divinityladder.Registry;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.enchantment.*;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnchantmentRegistry {

    private static final EquipmentSlot[] ARMOR_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
    public static BaseEnchantment LIFE_TREE,COUNTER_ATTACK,FRANTIC,CHAOS,EXECUTE,RIVERSIDE_STEAM,EAGLE_EYE,ABSORB_BLOOD,MOON,SUN;


    @SubscribeEvent
    public static void registerEnchantments(final RegistryEvent.Register<Enchantment> event) {
        Enchantment.Rarity rare = Enchantment.Rarity.RARE;

        event.getRegistry().registerAll(
               LIFE_TREE = new LifeTreeEnchantment("life_tree", rare, EnchantmentCategory.ARMOR_CHEST,new EquipmentSlot[]{EquipmentSlot.CHEST}),
               COUNTER_ATTACK = new CounterattackEnchantment("counter_attack",rare,EnchantmentCategory.ARMOR,ARMOR_SLOTS),
               FRANTIC = new FranticEnchantment("frantic",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}),
               EXECUTE = new ExecuteEnchantment("execute",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}),
               RIVERSIDE_STEAM = new RiversideSteamEnchantment("riverside_steam",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}),
               EAGLE_EYE = new EagleEyeEnchantment("eagle_eye",rare,EnchantmentCategory.ARMOR_HEAD, new EquipmentSlot[]{EquipmentSlot.HEAD}),
               ABSORB_BLOOD = new AbsorbBloodEnchantment("absorb_blood",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}),
               MOON = new MoonEnchantment("moon",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}),
               SUN = new SunEnchantment("sun",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND})
       );
    }
}
