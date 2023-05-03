package net.uuz.divinityladder.enchantment;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class ExecuteEnchantment extends BaseEnchantment {

    public ExecuteEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }
    @Override
    public int getMinCost(int p_45111_) {
        return 20;
    }
    @Override
    public int getMaxCost(int p_45115_) {
        return 50;
    }
    @Override
    public int getMaxLevel() {
        return super.getMaxLevel();
    }

    @Override
    public void doPostAttack(LivingEntity attack, Entity livingEntity, int p_44688_) {
        if (livingEntity instanceof LivingEntity target && attack instanceof Player player) {
            float maxHealth = target.getMaxHealth();
            float currentHealth = target.getHealth();
            if (currentHealth / maxHealth <= 0.05) {
                target.invulnerableTime = 0;
                target.hurt(DamageSource.playerAttack(player), maxHealth * 2);
            }
        }
    }
}
