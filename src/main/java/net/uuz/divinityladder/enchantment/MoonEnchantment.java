package net.uuz.divinityladder.enchantment;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Registry.EnchantmentRegistry;


@Mod.EventBusSubscriber
public class MoonEnchantment extends BaseEnchantment{
    public MoonEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }
    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        Entity entity = event.getSource().getEntity();
        if (entity instanceof Player player){
            int enchantmentLevel = EnchantmentHelper.getEnchantmentLevel(EnchantmentRegistry.MOON, player);
            if (enchantmentLevel > 0){
                Level level = player.level;
                boolean day = level.isDay();
                if (!day){
                    event.setAmount(event.getAmount() + event.getAmount() * 0.1f);
                }
            }
        }
    }
}
