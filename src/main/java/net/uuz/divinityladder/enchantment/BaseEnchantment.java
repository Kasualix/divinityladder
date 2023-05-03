package net.uuz.divinityladder.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.uuz.divinityladder.Divinityladder;

public class BaseEnchantment extends Enchantment {
    public BaseEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(rarity, category, equipmentSlots);
        this.setRegistryName(Divinityladder.MOD_ID, name);
    }
}
