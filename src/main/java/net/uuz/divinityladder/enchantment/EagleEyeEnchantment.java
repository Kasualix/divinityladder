package net.uuz.divinityladder.enchantment;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Registry.EnchantmentRegistry;

@Mod.EventBusSubscriber
public class EagleEyeEnchantment extends BaseEnchantment{
    public EagleEyeEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }
    @Override
    public int getMinCost(int p_45121_) {
        return 10 * p_45121_;
    }
    @Override
    public int getMaxCost(int p_45123_) {
        return this.getMinCost(p_45123_) + 30;
    }
    @Override
    public int getMaxLevel() {
        return super.getMaxLevel();
    }
    @SubscribeEvent
    public static void onTickPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        int enchantmentLevel = EnchantmentHelper.getEnchantmentLevel(EnchantmentRegistry.EAGLE_EYE, player);
        if (enchantmentLevel > 0) {
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 20, 0, false, false));
        }
    }
}
