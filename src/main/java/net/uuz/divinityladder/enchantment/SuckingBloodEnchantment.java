package net.uuz.divinityladder.enchantment;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class SuckingBloodEnchantment extends Enchantment {
    public SuckingBloodEnchantment() {
        super(Rarity.RARE,EnchantmentCategory.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    public int getMinCost(int p_45121_) {
        return 10 * p_45121_;
    }

    public int getMaxCost(int p_45123_) {
        return this.getMinCost(p_45123_) + 30;
    }

    //攻击时吸血
    @Override
    public void doPostAttack(LivingEntity p_40497_, Entity p_40498_, int p_40499_) {
        super.doPostAttack(p_40497_, p_40498_, p_40499_);
        p_40497_.heal(1);
    }
}
