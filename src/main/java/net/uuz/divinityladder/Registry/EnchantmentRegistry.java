package net.uuz.divinityladder.Registry;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uuz.divinityladder.Divinityladder;
import net.uuz.divinityladder.enchantment.*;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnchantmentRegistry {

    private static final EquipmentSlot[] ARMOR_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
    //TODO: CHAOS

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Divinityladder.MOD_ID);
    private static final Enchantment.Rarity rare = Enchantment.Rarity.RARE;
    public static final RegistryObject<Enchantment> LIFE_TREE = ENCHANTMENTS.register("", () -> new LifeTreeEnchantment("life_tree", rare, EnchantmentCategory.ARMOR_CHEST,new EquipmentSlot[]{EquipmentSlot.CHEST}));
    public static final RegistryObject<Enchantment> COUNTER_ATTACK = ENCHANTMENTS.register("", () -> new CounterattackEnchantment("counter_attack",rare,EnchantmentCategory.ARMOR,ARMOR_SLOTS));
    public static final RegistryObject<Enchantment> FRANTIC = ENCHANTMENTS.register("", () -> new FranticEnchantment("frantic",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    public static final RegistryObject<Enchantment> EXECUTE = ENCHANTMENTS.register("", () -> new ExecuteEnchantment("execute",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    public static final RegistryObject<Enchantment> RIVERSIDE_STEAM = ENCHANTMENTS.register("", () -> new RiversideSteamEnchantment("riverside_steam",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    public static final RegistryObject<Enchantment> EAGLE_EYE = ENCHANTMENTS.register("", () -> new EagleEyeEnchantment("eagle_eye",rare,EnchantmentCategory.ARMOR_HEAD, new EquipmentSlot[]{EquipmentSlot.HEAD}));
    public static final RegistryObject<Enchantment> ABSORB_BLOOD = ENCHANTMENTS.register("", () -> new AbsorbBloodEnchantment("absorb_blood",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    public static final RegistryObject<Enchantment> MOON = ENCHANTMENTS.register("", () -> new MoonEnchantment("moon",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    public static final RegistryObject<Enchantment> SUN = ENCHANTMENTS.register("", () -> new SunEnchantment("sun",rare,EnchantmentCategory.WEAPON,new EquipmentSlot[]{EquipmentSlot.MAINHAND}));

}
