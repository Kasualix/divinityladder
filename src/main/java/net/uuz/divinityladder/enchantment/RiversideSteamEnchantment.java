package net.uuz.divinityladder.enchantment;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class RiversideSteamEnchantment extends BaseEnchantment {
    public RiversideSteamEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }

    @Override
    public int getMinCost(int p_45264_) {
        return 15;
    }
    @Override
    public int getMaxCost(int p_45268_) {
        return super.getMinCost(p_45268_) + 50;
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity attack, @NotNull Entity livingEntity, int p_44688_) {
        if (livingEntity instanceof LivingEntity target && attack instanceof Player player) {
            boolean sensitiveToWater = target.isSensitiveToWater();
            if (sensitiveToWater) {
                float maxHealth = target.getMaxHealth();
                target.invulnerableTime = 0;
                target.hurt(DamageSource.playerAttack(player), (float) (maxHealth * 0.01));
            }
        }
    }
}
