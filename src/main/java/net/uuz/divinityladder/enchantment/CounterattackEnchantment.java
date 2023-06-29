package net.uuz.divinityladder.enchantment;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class CounterattackEnchantment extends BaseEnchantment{
    public CounterattackEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }

    public int getMinCost(int p_45254_) {
        return 10 + p_45254_ * 7;
    }

    public int getMaxCost(int p_45258_) {
        return 50;
    }

    @Override
    public void doPostHurt(@NotNull LivingEntity player, @NotNull Entity entity, int level){
        float knockback = level * 0.5f;
        if (entity instanceof LivingEntity livingEntity) {
            Vec3 knockbackVec = new Vec3(player.getX() - livingEntity.getX(), 0, player.getZ() - livingEntity.getZ());
            livingEntity.knockback(knockback, knockbackVec.x, knockbackVec.z);
        }
    }
}
