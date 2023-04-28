package net.uuz.divinityladder.enchantment;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class SunEnchantment extends Enchantment {
    public SunEnchantment() {
        super(Rarity.RARE,EnchantmentCategory.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    public int getMinCost(int p_45121_) {
        return 10 * p_45121_;
    }

    public int getMaxCost(int p_45123_) {
        return this.getMinCost(p_45123_) + 30;
    }

    @Override
    public float getDamageBonus(int damage, MobType mobType) {
        ClientLevel level = Minecraft.getInstance().level;
        if (level != null) {
            if (level.isDay()) {
                return 12;
            }
        }
        return 0;
    }
}
