package net.uuz.divinityladder.enchantment;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Registry.EnchantmentRegistry;

@Mod.EventBusSubscriber
public class EagleEyeEnchantment extends Enchantment {

    public EagleEyeEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.ARMOR_HEAD, new EquipmentSlot[]{EquipmentSlot.HEAD});
    }

    public int getMinCost(int p_45121_) {
        return 10 * p_45121_;
    }

    public int getMaxCost(int p_45123_) {
        return this.getMinCost(p_45123_) + 30;
    }

    @SubscribeEvent
    public static void onTickPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
        ListTag enchantmentTags = helmet.getEnchantmentTags();
        enchantmentTags.stream().forEach((tag) -> {
            if (tag instanceof CompoundTag) {
                CompoundTag compoundTag = (CompoundTag) tag;
                if (compoundTag.getString("id").equals(EnchantmentRegistry.EAGLE_EYE.getRegistryName().toString())){
                    player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1, 0, false, false));
                }

            }
        });

    }
}
