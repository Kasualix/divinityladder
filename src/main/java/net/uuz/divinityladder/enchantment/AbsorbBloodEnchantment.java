package net.uuz.divinityladder.enchantment;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Registry.EnchantmentRegistry;


@Mod.EventBusSubscriber
public class AbsorbBloodEnchantment extends BaseEnchantment{
    public AbsorbBloodEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        float amount = event.getAmount();
        Entity source = event.getSource().getEntity();
        if (source instanceof Player player) {
            int enchantmentLevel = EnchantmentHelper.getEnchantmentLevel(EnchantmentRegistry.ABSORB_BLOOD.get(), player);
            if (enchantmentLevel > 0) {
                float health = player.getHealth();
                float maxHealth = player.getMaxHealth();
                if (health + amount > maxHealth) {
                    player.heal(amount * 0.1f);
                }
            }
        }
    }
}
